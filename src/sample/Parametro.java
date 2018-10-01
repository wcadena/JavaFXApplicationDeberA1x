package sample;

public class Parametro extends Alarma {

   public String Nombre_P;
   private int Max_P;
   private int Min_P;
   private int Actual_P;
   private String TipoA_P;
   //IntArray2 p1 = new IntArray2();
   intArray p2 = new intArray();



   public Parametro(){


   }

    public Parametro(String nombre_P, int max_P, int min_P, int actual_P) {

        Nombre_P = nombre_P;
        Max_P = max_P;
        Min_P = min_P;
        Actual_P = actual_P;
    }

    /*_____________________________________________________________________________________*/



    public String getNombre_P() {
        return Nombre_P;
    }

    public void setNombre_P(String nombre_P) {
        Nombre_P = nombre_P;
    }

    public int getMax_P() {
        return Max_P;
    }

    public void setMax_P(int max_P) {
        Max_P = max_P;
    }

    public int getMin_P() {
        return Min_P;
    }

    public void setMin_P(int min_P) {
        Min_P = min_P;
    }

    public int getActual_P() {
        return Actual_P;
    }

    public void setActual_P(int actual_P) {
        Actual_P = actual_P;
    }

    public String getTipoA_P() {
        return TipoA_P;
    }

    public void setTipoA_P(String tipoA_P) {
        TipoA_P = tipoA_P;
    }

    public intArray getP2() {
        return p2;
    }

    public void setP2(intArray p1) {
        this.p2 = p2;
    }



}
