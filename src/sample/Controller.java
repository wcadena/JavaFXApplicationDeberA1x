package sample;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;


public class Controller {

    @FXML
    private TextField txtNGen;
    @FXML
    private TextField txtFab;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtMax;
    @FXML
    private TextField txtMin;
    @FXML
    private TextField txtVactual;
    @FXML
    private TextField txtalarma;
    @FXML
    private Button btnNGen;
    @FXML
    private Button btnllenarD;
    @FXML
    private TabPane tbpane;
    @FXML
    private Button btnAuto;
    @FXML
    private Button btnstop;
    @FXML
    private TextArea txtainfo;
    @FXML
    private ImageView imgalarm;
    @FXML
    private TextField txtparam;
    @FXML
    private Button btnparam;



    /*__________________________________________________________________________________________________________*/
    int i;
    int n_a;
    //Generador[] a = new Generador[2];
    Generador[] a = new Generador[100];
    int count = 0;
    int count_a = 0;
    int random;
    Timer timer = new Timer();
    Alarma [] Alarmas = new Alarma[3];
    int param;




    /*__________________________________________________________________________________________________________*/
    public int NGeneradores()
    {

        i =  Integer.parseInt(txtNGen.getText());
        System.out.println(i);System.out.println(a);
        tbpane.getSelectionModel().select(1);
        return i;
    }
    @FXML
    public Generador[] llenar() {
        if (count < i) {
            a[count] = new Generador(txtFab.getText(), txtModelo.getText(), txtCodigo.getText());
        }
        if(count == i-1){
            tbpane.getSelectionModel().select(2);
            File file = new File("neutral.jpg");
            Image image = new Image(file.toURI().toString());
            imgalarm.setImage(image);
        }
            System.out.println(count);
            System.out.println(a[count].toString());
            count++;
            count_a++;



            return a;
        }

    public Parametro[] llenarp() {

        a[0].pars.add( new Parametro("hola",2,2,2));

        //val = new Parametro(txtNombre.getText(), Integer.parseInt(txtMax.getText()), Integer.parseInt(txtMin.getText()), Integer.parseInt(txtVactual.getText()));

        System.out.println(a[0].pars.toString());
        //System.out.println(a[0].pars.get(1));
        System.out.println(a[0].pars.get(0));
        return a;


    }


    @FXML
    public void clear() {
        txtFab.clear();
        txtModelo.clear();
        txtCodigo.clear();
        txtNombre.clear();
        txtMax.clear();
        txtMin.clear();
        txtVactual.clear();

    }
    @FXML
    public int Random()
    {

        timer.schedule( new TimerTask() {
            public void run() {

                int v=0;
                for (int q=0;q<i;q++){
                    random = (int) ((Math.random() * ((a[q].getMax_P()*2 - a[q].getMax_P()*(-1)) + 1)) + a[q].getMax_P()*(-1));
                    a[q].setActual_P(random);

                    txtainfo.appendText("El generador de Fabricante: " + a[q].getFabricante_G()+"\n");
                    txtainfo.appendText("De modelo: " + a[q].getModelo_G()+"\n");
                    txtainfo.appendText("De codigo: " + a[q].getCodigo_G()+ "\n");
                    txtainfo.appendText("Esta Generando: " + a[q].getActual_P() + "kWh" + "\n" +"\n");
                    //System.out.println("Actual del generador "+ q + " es igual a: " + a[q].getActual_P());
                   // txtainfo.appendText("Actual del generador "+ q + " es igual a: " + a[q].getActual_P() + "\n");
                   // System.out.println(random+"gen" + q);
                    if (q>=i){
                        q=0;
                    }
                    File filen = new File("neutral.jpg");
                    Image imagen = new Image(filen.toURI().toString());
                    if (a[q].getActual_P() >= a[q].getMax_P() && a[q].getActual_P() <= a[q].getMax_P()*1.5) {

                        a[q].p2.add(a[q].getActual_P());
                        System.out.println("Cuidado");
                        File file = new File("yellow.gif");
                        Image image = new Image(file.toURI().toString());
                        imgalarm.setImage(image);
//                        try {
//                            Thread.sleep(10000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        imgalarm.setImage(imagen);

                    } else if (a[q].getActual_P() >= a[q].getMax_P()*1.5) {

                        a[q].p2.add(a[q].getActual_P());
                        System.out.println("Peligro");
                        File file = new File("red.gif");
                        Image image = new Image(file.toURI().toString());
                        imgalarm.setImage(image);
//                        try {
//                            Thread.sleep(10000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        imgalarm.setImage(imagen);

                    } else if (a[q].getActual_P() <= a[q].getMin_P()) {

                        a[q].p2.add(a[q].getActual_P());
                        System.out.println("Bajo Poder");
                        File file = new File("green.gif");
                        Image image = new Image(file.toURI().toString());
                        imgalarm.setImage(image);
//                        try {
//                            Thread.sleep(10000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
                        imgalarm.setImage(imagen);

                    }


                }
            }
        }, 0, 60*100);

        return random;

    }

    @FXML
    public void analize()
    {

        timer.schedule( new TimerTask() {
            public void run() {
                int v=0;
                for (int q=0;q<i;q++){
                a[q].setActual_P(random);

                if(a[q].getActual_P() > a[q].getMax_P())
                {
                    a[q].p2.add(a[q].getActual_P());
                    System.out.println("      "+a[q].p2.getLength());
                }
                    if (q>=i){
                        q=0;
                    }
                }
            }
        }, 0, 60*100);

    }

    @FXML
    public void stop() {
        timer.cancel();
        System.out.println("getp2 "+a[0].getP2());
        System.out.println("getcount "+a[0].p2.getCount());
        System.out.println("getlength "+a[0].p2.getLength());
        System.out.println("getdata "+a[0].p2.print());
        System.out.println("getmax "+a[0].p2.getMax());
        System.out.println("getmin "+a[0].p2.getMin());
        System.out.println("suma "+a[0].p2.suma());
        System.out.println("promedio "+a[0].p2.promedio());

    }




    @FXML
    private void initialize()
    {

        btnNGen.setOnAction((event) -> {
            NGeneradores();

        });
        btnllenarD.setOnAction(event -> {
            llenar();
            clear();

        });
        btnAuto.setOnAction(event -> {
           Random();


        });
        btnstop.setOnAction(event -> {
          stop();

        });

        btnparam.setOnAction(event -> {
            llenarp();

        });







    }

}
