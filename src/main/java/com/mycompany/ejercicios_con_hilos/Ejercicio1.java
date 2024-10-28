/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_con_hilos;

/**
 *
 * @author aam
 */
public class Ejercicio1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Número: " + i);
                Thread.sleep(1000); // Pausa de 1 segundo
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ejecutar() {
        Ejercicio1 hilo = new Ejercicio1();
        hilo.start(); // Inicia el hilo
    }
}
