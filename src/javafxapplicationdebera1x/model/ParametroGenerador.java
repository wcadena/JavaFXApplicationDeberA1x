/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author wcade
 */
public class ParametroGenerador {
    static final int MINIMO_RANDOM  = -50; 
    static final int MAXIMO_RANDOM = 150; 
    static final int PRINCIPAL  = 999999911; 
    static final int DATO_SEC = 999999922; 
    private int id;
    private String nombre;
    private int is_principal;//este valor indica si es el modelo de todo {1} osea este es el que indica como van los parametros y este va a ser el q tenga el ultimo valor , para todos los demas sera {0}
    private int rango_minimo;
    private int rango_maximo;
    private int valor_actual;
    private Alarma tipo_alarma;
    private Date created_at;
    private Date update_at;
    private Date delete_at;
    private ArrayList<EventoParametro> historico;

    /**
     * Aumenta datos de generador, usar este para principal o modelo
     * 
     * @param id
     * @param nombre
     * @param is_principal
     * @param rango_minimo
     * @param rango_maximo
     * @param valor_actual
     * @param tipo_alarma
     */
    public ParametroGenerador(int id, String nombre, int is_principal, int rango_minimo, int rango_maximo, int valor_actual, Alarma tipo_alarma) {
        this.id = id;
        this.nombre = nombre;
        this.is_principal = is_principal;
        this.rango_minimo = rango_minimo;
        this.rango_maximo = rango_maximo;
        this.valor_actual = valor_actual;
        this.tipo_alarma = tipo_alarma;
        this.created_at = new Date();
        this.historico = new ArrayList<EventoParametro>();
        this.historico.add(new EventoParametro(valor_actual,this.created_at));                
    }
    /**
     * Aumenta datos de generador como registro
     * 
     * @param id
     * @param nombre
     * @param is_principal
     * @param rango_minimo
     * @param rango_maximo
     * @param valor_actual
     * @param tipo_alarma
     */
    public ParametroGenerador(int id, String nombre, int rango_minimo, int rango_maximo, int valor_actual, Alarma tipo_alarma) {
        this.id = id;
        this.nombre = nombre;
        this.is_principal = ParametroGenerador.DATO_SEC;
        this.rango_minimo = rango_minimo;
        this.rango_maximo = rango_maximo;
        this.valor_actual = valor_actual;
        this.tipo_alarma = tipo_alarma;
        this.created_at = new Date();
        this.historico = new ArrayList<EventoParametro>();
        this.historico.add(new EventoParametro(valor_actual,this.created_at));                
    }
    
    public void generarEventoParametro(){
        EventoParametro e = new EventoParametro();
        this.update_at = e.getCreated_at();
        this.valor_actual =e.getValor();
        this.historico.add(e);
    }
    public void generarEventoParametro(int valor){
        EventoParametro e = new EventoParametro();
        e.setValor(valor);
        this.update_at = e.getCreated_at();
        this.valor_actual =e.getValor();
        this.historico.add(e);
    }
    public double alteracionMedia(){
        int n =0;
        intArray valores_históricos = new intArray(this.historico.size());
        for (EventoParametro ep : this.historico) {
            n++;
            valores_históricos.add(ep.getValor());
        }
        double promedio_valores_históricos =valores_históricos.promedio();
        double semisuma = this.semisuma(this.rango_maximo, this.rango_minimo);
        return (promedio_valores_históricos-semisuma)/semisuma;
        
        
    }
    private double semisuma(int max, int min) {
        return ((max + min) / 2.0);
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public int getIs_principal() {
        return is_principal;
    }

    /**
     *
     * @param is_principal
     */
    public void setIs_principal(int is_principal) {
        this.is_principal = is_principal;
    }

    /**
     *
     * @return
     */
    public int getRango_minimo() {
        return rango_minimo;
    }

    /**
     *
     * @param rango_minimo
     */
    public void setRango_minimo(int rango_minimo) {
        this.rango_minimo = rango_minimo;
    }

    /**
     *
     * @return
     */
    public int getRango_maximo() {
        return rango_maximo;
    }

    /**
     *
     * @param rango_maximo
     */
    public void setRango_maximo(int rango_maximo) {
        this.rango_maximo = rango_maximo;
    }

    /**
     *
     * @return
     */
    public int getValor_actual() {
        return valor_actual;
    }

    /**
     *
     * @param valor_actual
     */
    public void setValor_actual(int valor_actual) {
        this.valor_actual = valor_actual;
    }

    /**
     *
     * @return
     */
    public Alarma getTipo_alarma() {
        return tipo_alarma;
    }

    /**
     *
     * @param tipo_alarma
     */
    public void setTipo_alarma(Alarma tipo_alarma) {
        this.tipo_alarma = tipo_alarma;
    }

    /**
     *
     * @return
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     *
     * @param created_at
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     *
     * @return
     */
    public Date getUpdate_at() {
        return update_at;
    }

    /**
     *
     * @param update_at
     */
    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    /**
     *
     * @return
     */
    public Date getDelete_at() {
        return delete_at;
    }

    /**
     *
     * @param delete_at
     */
    public void setDelete_at(Date delete_at) {
        this.delete_at = delete_at;
    }

    @Override
    public String toString() {
        String historico ="";
        for (EventoParametro ep : this.historico) {
            historico += ep.toString()+"\n";
        }
        return "ParametroGenerador{" + "id=" + id + ", nombre=" + nombre + ", is_principal=" + is_principal + ", rango_minimo=" + rango_minimo + ", rango_maximo=" + rango_maximo + ", valor_actual=" + valor_actual + ", tipo_alarma=" + tipo_alarma + ", created_at=" + created_at + ", update_at=" + update_at + ", delete_at=" + delete_at + ", historico=\n{" + historico + "}}";
    }

    
    
}
