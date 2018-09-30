/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.model;

/**
 *
 * @author wcade
 */
public class Generador {
    private int id;
    private String fabricante;
    private  String modelo;
    private String código;
    private intArray parametros;

    /**
     * Crea un generador, no usa id automatico por le momento.
     * @param id
     * @param fabricante
     * @param modelo
     * @param código
     * @param parametros
     */
    public Generador(int id, String fabricante, String modelo, String código, intArray parametros) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.código = código;
        this.parametros = parametros;
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
    public intArray getParametros() {
        return parametros;
    }

    /**
     *
     * @param parametros
     */
    public void setParametros(intArray parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "Generador{" + "id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", c\u00f3digo=" + código + ", parametros=" + parametros + '}';
    }
        
    

}
