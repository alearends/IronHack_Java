/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_con_hilos.ejercicio2;

/**
 *
 * @author aam
 */
public class Ejercicio2 {
        public void ejecutar() {
        Thread hilo1 = new Thread(new SumaHilo(3, 5));
        Thread hilo2 = new Thread(new SumaHilo(10, 20));
        Thread hilo3 = new Thread(new SumaHilo(7, 8));

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
