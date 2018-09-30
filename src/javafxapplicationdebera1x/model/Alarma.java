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
    private int id;
    private String nombre_alarma;
    private int tipo_alarma;
    private String interface_hardware;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_alarma() {
        return nombre_alarma;
    }

    public void setNombre_alarma(String nombre_alarma) {
        this.nombre_alarma = nombre_alarma;
    }

    public int getTipo_alarma() {
        return tipo_alarma;
    }

    public void setTipo_alarma(int tipo_alarma) {
        this.tipo_alarma = tipo_alarma;
    }

    public String getInterface_hardware() {
        return interface_hardware;
    }

    public void setInterface_hardware(String interface_hardware) {
        this.interface_hardware = interface_hardware;
    }

    @Override
    public String toString() {
        return "Alarma{" + "id=" + id + ", nombre_alarma=" + nombre_alarma + ", tipo_alarma=" + tipo_alarma + ", interface_hardware=" + interface_hardware + '}';
    }
    
}
