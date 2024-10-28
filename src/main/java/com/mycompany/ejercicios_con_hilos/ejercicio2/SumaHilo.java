/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_con_hilos.ejercicio2;

/**
 *
 * @author aam
 */
public class SumaHilo implements Runnable {
        private int num1, num2;

    public SumaHilo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void run() {
        int suma = num1 + num2;
        System.out.println("Suma de " + num1 + " y " + num2 + " es: " + suma);
    }
}
