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
import javafxapplicationdebera1x.model.Alarma;
import javafxapplicationdebera1x.model.Generador;
import javafxapplicationdebera1x.model.ParametroGenerador;

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
        ParametroGenerador pa_a1_modelo = new ParametroGenerador(1,"A1-Base",0,100,0,this.al1 );
        Generador a1 = new Generador(1,"Panasonic","Modelo1","CFGSY78B-1",pa_a1_modelo);
        System.out.println("---->"+a1);
        
    }
    public Alarma al1;
    public Alarma al2;
    public Alarma al3;
    public void iniciliza_alarmas(){
        this.al1 = new Alarma(1,"Alarma 1", Alarma.TIPO1,"Interface 1" );
        this.al2 = new Alarma(2,"Alarma 2", Alarma.TIPO2,"Interface 2" );
        this.al3 = new Alarma(2,"Alarma 3", Alarma.TIPO3,"Interface 3" );        
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
