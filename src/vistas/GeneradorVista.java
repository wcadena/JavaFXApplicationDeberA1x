/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafxapplicationdebera1x.controlers.GeneradorController;
import javafxapplicationdebera1x.model.Generador;

public class GeneradorVista extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.gc = new GeneradorController();
        primaryStage.setTitle("Registration Form JavaFX Application");

        // Create the registration form grid pane
        GridPane gridPane = createRegistrationGenerador();
        // Add UI controls to the registration form grid pane
        addUIControls(gridPane);
        // Create a scene with registration form grid pane as the root node
        Scene scene = new Scene(gridPane, 800, 500);
        // Set the scene in primary stage	
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }


    private GridPane createRegistrationGenerador() {
        // Instantiate a new Grid Pane
        GridPane gridPane = new GridPane();

        // Position the pane at the center of the screen, both vertically and horizontally
        gridPane.setAlignment(Pos.CENTER);

        // Set a padding of 20px on each side
        gridPane.setPadding(new Insets(40, 40, 40, 40));

        // Set the horizontal gap between columns
        gridPane.setHgap(10);

        // Set the vertical gap between rows
        gridPane.setVgap(10);

        // Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }
    public GeneradorController gc;
    public Generador generador_actual;

    private void addUIControls(GridPane gridPane) {
        // Add Header
        Label headerLabel = new Label("Registration Generator");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Name Label
        Label nameLabel = new Label("Fabricante : ");
        gridPane.add(nameLabel, 0,1);

        // Add Name Text Field
        TextField fabricante = new TextField();
        fabricante.setPrefHeight(40);
        gridPane.add(fabricante, 1,1);


        // Add Email Label
        Label emailLabel = new Label("Modelo : ");
        gridPane.add(emailLabel, 0, 2);

        // Add Email Text Field
        TextField modelo = new TextField();
        modelo.setPrefHeight(40);
        gridPane.add(modelo, 1, 2);

        // Add Password Label
        Label passwordLabel = new Label("Codigo : ");
        gridPane.add(passwordLabel, 0, 3);

        // Add Password Field
        TextField codigo = new TextField();
        codigo.setPrefHeight(40);
        gridPane.add(codigo, 1, 3);

        // Add Submit Button
        Button submitButton = new Button("Crear");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);
        gridPane.add(submitButton, 0, 4, 2, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(20, 0,20,0));

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(fabricante.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a fabricante");
                    return;
                }
                if(modelo.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a modelo");
                    return;
                }
                if(codigo.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a codigo");
                    return;
                }
                javafxapplicationdebera1x.model.Generador Generador = new javafxapplicationdebera1x.model.Generador(1,fabricante.getText(),modelo.getText(),codigo.getText());    
                gc.addGenerador(Generador);
                showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Se creo  el generador" + modelo.getText() + " de " + fabricante.getText());
                System.out.println(gc.lista_generadores);
                
                Label GeneradorLabel = new Label("Generadores : ");
                gridPane.add(GeneradorLabel, 0, 5);

                
                ObservableList<javafxapplicationdebera1x.model.Generador> observableList = FXCollections.observableList( gc.lista_generadores());
                ListView<javafxapplicationdebera1x.model.Generador> itemsz = new ListView<javafxapplicationdebera1x.model.Generador>(observableList);
                itemsz.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<javafxapplicationdebera1x.model.Generador>() {
                    @Override
                    public void changed(ObservableValue<? extends javafxapplicationdebera1x.model.Generador> observable, javafxapplicationdebera1x.model.Generador oldValue, javafxapplicationdebera1x.model.Generador newValue) {
                        System.out.println("--->"+observable.getValue().getCódigo());                        
                        generador_actual = observable.getValue();
                    }
                });
                gridPane.add(itemsz, 1, 5);
            }
        });
    }

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}