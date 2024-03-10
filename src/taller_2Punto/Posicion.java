/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_2Punto;

/**
 *
 * @author ANDRES GARCES
 */
public class Posicion {

    //Declaro el Arreglo de tamaño 8
    int cifra[] = new int[8];

    void inicialización() {
        for (int i = 0; i < cifra.length; i++) {
            cifra[i] = 10; // Inicializar todas las posiciones en 10
        }

        // Asignar 20 a las posiciones 0 y 7 del Arreglo
        cifra[0] = 20;
        cifra[7] = 20;
    }

    void leyendo() {
        // Imprimir el contenido del arreglo de forma organizada
        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < cifra.length; i++) {
            System.out.println("Posición " + i + ": " + cifra[i]);
        }
    }
}
