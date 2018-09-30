/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.model;

import java.util.Date;

/**
 *
 * @author wcade
 */
public class ParametroGenerador {
    private String nombre;
    private int is_principal;//este valor indica si es el modelo de todo {1} osea este es el que indica como van los parametros y este va a ser el q tenga el ultimo valor , para todos los demas sera {0}
    private int rango_minimo;
    private int rango_maximo;
    private int valor_actual;
    private Alarma tipo_alarma;
    private Date created_at;
    private Date update_at;
    private Date delete_at;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIs_principal() {
        return is_principal;
    }

    public void setIs_principal(int is_principal) {
        this.is_principal = is_principal;
    }

    public int getRango_minimo() {
        return rango_minimo;
    }

    public void setRango_minimo(int rango_minimo) {
        this.rango_minimo = rango_minimo;
    }

    public int getRango_maximo() {
        return rango_maximo;
    }

    public void setRango_maximo(int rango_maximo) {
        this.rango_maximo = rango_maximo;
    }

    public int getValor_actual() {
        return valor_actual;
    }

    public void setValor_actual(int valor_actual) {
        this.valor_actual = valor_actual;
    }

    public Alarma getTipo_alarma() {
        return tipo_alarma;
    }

    public void setTipo_alarma(Alarma tipo_alarma) {
        this.tipo_alarma = tipo_alarma;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Date getDelete_at() {
        return delete_at;
    }

    public void setDelete_at(Date delete_at) {
        this.delete_at = delete_at;
    }

    @Override
    public String toString() {
        return "ParametroGenerador{" + "nombre=" + nombre + ", is_principal=" + is_principal + ", rango_minimo=" + rango_minimo + ", rango_maximo=" + rango_maximo + ", valor_actual=" + valor_actual + ", tipo_alarma=" + tipo_alarma + ", created_at=" + created_at + ", update_at=" + update_at + ", delete_at=" + delete_at + '}';
    }
    
}
