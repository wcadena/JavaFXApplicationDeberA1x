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

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public intArray getParametros() {
        return parametros;
    }

    public void setParametros(intArray parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "Generador{" + "id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", c\u00f3digo=" + código + ", parametros=" + parametros + '}';
    }
        
    

}
