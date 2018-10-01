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
import javafxapplicationdebera1x.controlers.GeneradorController;
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
        iniciliza_alarmas();
        iniciliza_generadores();//se coloca aca para hacer las simulaciones sin tener q presionar el boton de acccion
        
    }
    public Generador a1,a2,a3,a4;
    public void iniciliza_generadores(){
        //primero llena el parametro con su alarma
        ParametroGenerador pa_a1_modelo = new ParametroGenerador(1,"A1-Base",0,100,0,this.al1 );
        //llena el generador con ese parametro
        this.a1 = new Generador(1,"Panasonic","Modelo1","CFGSY78B-1",pa_a1_modelo);
        //generador 2
        ParametroGenerador pa_a2_modelo = new ParametroGenerador(1,"A1-Base",20,80,0,this.al3 );
        this.a2 = new Generador(1,"Sanyo","Modelo1","CFGSY78B-1",pa_a2_modelo);
        //generador 3
        ParametroGenerador pa_a3_modelo = new ParametroGenerador(1,"A1-Base",30,750,0,this.al2 );
        this.a3 = new Generador(1,"Sony","Modelo1","CFGSY78B-1",pa_a3_modelo);
        //generador 4
        ParametroGenerador pa_a4_modelo = new ParametroGenerador(1,"A1-Base",30,750,0,this.al1 );
        this.a4 = new Generador(1,"Panasonic","Modelo1","CFGSY78B-1",pa_a4_modelo);
        
        System.out.println("Inicializando Generadores");
        System.out.println("--->a1"+a1);
        System.out.println("--->a2"+a2);
        System.out.println("--->a3"+a3);
        System.out.println("--->a4"+a4);
        System.out.println("Crea Matriz de Generadores");
        GeneradorController gc = new GeneradorController(a1);
        gc.addGenerador(a2);
        gc.addGenerador(a3);
        gc.addGenerador(a4);
        System.out.println("se cargan los generadores");
        System.out.println("___________________________________");
        for (Generador gen : gc.lista_generadores) {
            System.out.print(gen.getCódigo() + "\t");
            System.out.print(gen.getModelo() + "\t");
            System.out.println("");
        }
        System.out.println("___________________________________");
        this.arranca_monitor(1000, 10, a1);
        System.out.println(a1);
                
    }
    /**
     * 
     * @param tiempo //1000 para un minuto 
     * @param interacciones // numero de simulaciones
     */
    public void arranca_monitor(int tiempo, int interacciones, Generador generador_a_iterar){        
        for(ParametroGenerador pa:generador_a_iterar.getParametros()){
            for(int i = 0; i < interacciones; i++)
            {
                pa.generarEventoParametro();
            }                
        }        
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
                System.out.println("Carga un generadores x1");
                //iniciliza_generadores();
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
