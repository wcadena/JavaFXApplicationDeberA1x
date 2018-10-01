package sample;


import java.util.ArrayList;

public class Generador extends Parametro {


    private String Fabricante_G;
    private String Modelo_G;
    private String Codigo_G;
    private int countp;
    public Parametro[] pp = new Parametro[100];

    ArrayList<Parametro> pars = new ArrayList<>();

    public Parametro[] getPp() {
        return pp;
    }

    public void setPp(Parametro[] pp) {
        this.pp = pp;
    }




    public Generador(String fabricante_G, String modelo_G, String codigo_G) {
        Fabricante_G = fabricante_G;
        Modelo_G = modelo_G;
        Codigo_G = codigo_G;
    }

    public Generador(String nombre_P, int max_P, int min_P, int actual_P,String fabricante_G, String modelo_G, String codigo_G) {
        super(nombre_P, max_P, min_P, actual_P);
        Fabricante_G = fabricante_G;
        Modelo_G = modelo_G;
        Codigo_G = codigo_G;
    }


    //    public Generador(String fabricante_G, String modelo_G, String codigo_G) {
//        Fabricante_G = fabricante_G;
//        Modelo_G = modelo_G;
//        Codigo_G = codigo_G;
//    }
//
//    public Generador(String nombre_P, int max_P, int min_P, int actual_P, String fabricante_G, String modelo_G, String codigo_G) {
//        super(nombre_P, max_P, min_P, actual_P);
//        Fabricante_G = fabricante_G;
//        Modelo_G = modelo_G;
//        Codigo_G = codigo_G;
//    }
//
//    public Generador(String alarma_a, String nombre_P, int max_P, int min_P, int actual_P, String fabricante_G, String modelo_G, String codigo_G) {
//        super(alarma_a, nombre_P, max_P, min_P, actual_P);
//        Fabricante_G = fabricante_G;
//        Modelo_G = modelo_G;
//        Codigo_G = codigo_G;
//    }

    public Generador(){
    }


    public Parametro[] llenar(int param,String nombre_P, int max_P, int min_P, int actual_P) {

        int count = 0;
        if (count < param) {
            pp[count] = new Parametro(nombre_P,max_P,min_P,actual_P);
        }
        count++;
        return pp;
    }



    /*_____________________________________________________________________________________________*/

  public String getFabricante_G() {
        return Fabricante_G;
    }

    public void setFabricante_G(String Fabricante_G) {
        Fabricante_G = Fabricante_G;
    }

    public String getModelo_G() {
        return Modelo_G;
    }

    public void setModelo_G(String Modelo_G) {
        Modelo_G = Modelo_G;
    }

    public String getCodigo_G() {
        return Codigo_G;
    }

    public void setCodigo_G(String Codigo_G) {
        Codigo_G = Codigo_G;
    }

    public String toStringp()
    {
        String String;

        String = getCodigo_G() + getModelo_G() + getFabricante_G();

        return String;
    }

    public String toString()
    {
        String String;

        String = getNombre_P() + " " + Integer.toString(getMax_P()) + " " + Integer.toString(getMin_P()) + " "+ Integer.toString(getActual_P()) + " "  + getFabricante_G() + " " + getModelo_G() + " " + getCodigo_G();

        return String;
    }

}
