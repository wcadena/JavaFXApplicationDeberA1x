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
public class EventoRun extends Thread{
    private int data;

    public void run(){
        ask_for_data(new Runnable(){
            public void run(){
                on_data();
            }
        });
    }

    public void on_data(){
        System.out.println("Async callback: " + data);
    }

    public void ask_for_data(final Runnable callback){
        System.out.println("2");
        Runnable r = new Runnable(){
            public void run(){
                data = get_data();
                new Thread(callback).start();
            }
        };
        new Thread(r).start();
    }

    public int get_data(){
        try{
            Thread.sleep(1000);
        } catch (Exception e) {};
        return 42;
    }

    public static void main(String[] args) {
        EventoRun d = new EventoRun();
        d.start();
    }
}
