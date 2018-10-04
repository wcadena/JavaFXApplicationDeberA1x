/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationdebera1x.controlers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javafxapplicationdebera1x.model.Generador;

/**
 *
 * @author wcade
 */
public class GeneradorController {

    public List<Generador>  lista_generadores;

    public GeneradorController() {
        List<Generador>  lista_generadores = new ArrayList<Generador>();
              
        this.lista_generadores = lista_generadores;
    }
    public GeneradorController(ArrayList<Generador> lista_generadores) {
        this.lista_generadores = lista_generadores;
    }
    public GeneradorController(Generador generador) {
        List<Generador>  lista_generadores = new ArrayList<Generador>();
        lista_generadores.add(generador);        
        this.lista_generadores = lista_generadores;
    }
    
    /**
     *
     * @return
     */
    public List<Generador> lista_generadores(){
        return this.lista_generadores;
    }
    public void addGenerador(Generador generador){
        this.lista_generadores.add(generador);
    }
    
}
