/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.model;

import java.util.ArrayList;

/**
 *
 * @author wcade
 */
public class Generador {
    private int id;
    private String fabricante;
    private  String modelo;
    private String código;
    private ArrayList<ParametroGenerador> parametros;

    public Generador(int id, String fabricante, String modelo, String código) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.código = código;
        this.parametros = new ArrayList<ParametroGenerador>();
    }
    /**
     * Crea un generador, no usa id automatico por le momento.
     * @param id
     * @param fabricante
     * @param modelo
     * @param código
     * @param parametros
     */
    public Generador(int id, String fabricante, String modelo, String código, ParametroGenerador parametros) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.código = código;
        this.parametros = new ArrayList<ParametroGenerador>();
        this.parametros.add(parametros);
    }
    public void addParametro(ParametroGenerador parametros){
        this.parametros.add(parametros);
    }
    public static int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
    public Alarma darAlarmaRandom(){
        int random_alarma = this.randomWithRange(1, 3);
        switch (random_alarma) {
            case 1:
                return new Alarma(1,"Alarma 1", Alarma.TIPO1,"Interface 1" );
            case 2:
                return new Alarma(2,"Alarma 2", Alarma.TIPO2,"Interface 2" );
            case 3:
                return new Alarma(2,"Alarma 3", Alarma.TIPO3,"Interface 3" );  
        }
        return new Alarma(2,"Alarma 4", Alarma.TIPO4,"Interface 4" );  
    }
    /**
     * Crea una simulacion
     */
    public void creaMonitorRandom(){
        int id_proximo = this.parametros.size()+1;
        ParametroGenerador modelo = this.parametros.get(0);//saca el primer PArametro modelo
        ParametroGenerador pg = new ParametroGenerador(id_proximo, "Modelo_" + this.randomWithRange(1, 4), 
                modelo.getRango_minimo(),modelo.getRango_maximo(),
                this.randomWithRange(modelo.getRango_minimo(),modelo.getRango_maximo()),
                this.darAlarmaRandom()
                );
        this.parametros.add(pg);
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     *
     * @param fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getCódigo() {
        return código;
    }

    /**
     *
     * @param código
     */
    public void setCódigo(String código) {
        this.código = código;
    }

    /**
     *
     * @return
     */
    public ArrayList<ParametroGenerador> getParametros() {
        return parametros;
    }

    /**
     *
     * @param parametros
     */
    public void setParametros(ArrayList<ParametroGenerador> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        String parametros ="";
        for (ParametroGenerador par : this.getParametros()) {
            parametros += par.toString()+"\n";
        }
        return "Generador{" + "id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", c\u00f3digo=" + código + ", parametros={\n" + parametros + "}}";
    }
        
    

}
