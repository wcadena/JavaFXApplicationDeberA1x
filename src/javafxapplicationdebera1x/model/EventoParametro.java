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
public class EventoParametro {
    private int valor;
    private Date created_at;
    

    public EventoParametro(int valor, Date created_at) {
        this.valor = valor;
        this.created_at = created_at;
    
    }

    
    public EventoParametro() {        
        this.valor = Generador.randomWithRange(ParametroGenerador.MINIMO_RANDOM, ParametroGenerador.MAXIMO_RANDOM);
        this.created_at = new Date();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "EventoParametro{" + "valor=" + valor + ", created_at=" + created_at + '}';
    }
            
    }
