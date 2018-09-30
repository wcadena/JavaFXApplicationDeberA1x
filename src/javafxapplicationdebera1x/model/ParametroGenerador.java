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
}
