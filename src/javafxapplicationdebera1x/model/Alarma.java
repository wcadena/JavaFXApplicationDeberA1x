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
public class Alarma {
    
    /**
     * los tipos de alarmas soportados
     */
    public static final int TIPO1  = 779999911; 
    public static final int TIPO2  = 779999922; 
    public static final int TIPO3  = 779999933; 
    public static final int TIPO4  = 779999944; 
    //fin de alarmas soportadas
    private int id;
    private String nombre_alarma;
    private int tipo_alarma;
    private String interface_hardware;

    /**
     *
     * @param id
     * @param nombre_alarma
     * @param tipo_alarma
     * @param interface_hardware
     */
    public Alarma(int id, String nombre_alarma, int tipo_alarma, String interface_hardware) {
        this.id = id;
        this.nombre_alarma = nombre_alarma;
        this.tipo_alarma = tipo_alarma;
        this.interface_hardware = interface_hardware;
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
    public String getNombre_alarma() {
        return nombre_alarma;
    }

    /**
     *
     * @param nombre_alarma
     */
    public void setNombre_alarma(String nombre_alarma) {
        this.nombre_alarma = nombre_alarma;
    }

    /**
     *
     * @return
     */
    public int getTipo_alarma() {
        return tipo_alarma;
    }

    /**
     *
     * @param tipo_alarma
     */
    public void setTipo_alarma(int tipo_alarma) {
        this.tipo_alarma = tipo_alarma;
    }

    /**
     *
     * @return
     */
    public String getInterface_hardware() {
        return interface_hardware;
    }

    /**
     *
     * @param interface_hardware
     */
    public void setInterface_hardware(String interface_hardware) {
        this.interface_hardware = interface_hardware;
    }

    @Override
    public String toString() {
        return "Alarma{" + "id=" + id + ", nombre_alarma=" + nombre_alarma + ", tipo_alarma=" + tipo_alarma + ", interface_hardware=" + interface_hardware + '}';
    }
    
}
