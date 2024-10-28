/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_con_hilos;

import java.util.Scanner;

// Importar los ejercicios en sus paquetes correspondientes
import com.mycompany.ejercicios_con_hilos.Ejercicio1;
import com.mycompany.ejercicios_con_hilos.ejercicio2.Ejercicio2;







/**
 *
 * @author aam
 */

public class MenuPrincipal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Ejecutar Ejercicio 1: Hilo básico que imprime números");
            System.out.println("2. Ejecutar Ejercicio 2: Múltiples hilos que suman valores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    new Ejercicio1().ejecutar();
                    break;
                case 2:
                    new Ejercicio2().ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
