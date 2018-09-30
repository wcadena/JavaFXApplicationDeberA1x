/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wcade
 */
public class JavaFXApplicationDeberA1x extends Application {
    private StackPane rootPanel;
    @Override
    public void start(Stage primaryStage) {
        rootPanel = new StackPane();                
        Scene scene = new Scene(rootPanel, 600, 550);        
        primaryStage.setTitle("Sistema de Generadores");
        primaryStage.setScene(scene);
        primaryStage.show();  
        this.inicializa_elementos();
        
        
    }
    
    public void inicializa_elementos(){
        //inicio boton inicializa un boton y lo instancia
        Button btn = new Button();
        btn.setText("Comenzar todo'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Carga un generador");
            }
        });
        this.rootPanel.getChildren().add(btn);                
        //fin boton
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
