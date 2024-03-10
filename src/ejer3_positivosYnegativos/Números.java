/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3_positivosYnegativos;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Números {

    //Declaro el Arreglo
    int numeros[] = new int[6];

    Scanner scan = new Scanner(System.in);

    //Método para guardar los Números
    void guardarNumeros() {
        int datoRecibido;
        System.out.println("Los 6 Numeros para Registrar");
        for (int i = 0; i < numeros.length; i++) {

            //Pido el Número
            System.out.println("Dígite el Número " + (i + 1));
            datoRecibido = scan.nextInt();

            //La guardó en el Arreglo
            numeros[i] = datoRecibido;
        }
        System.out.println("Números registrados exitosamente!");
    }

    //Método para hallar los Números Positivos y Negativos
    void posiYnega() {
        int contador_Posi = 0; //Para contar cuántos Números Positivos hay
        int contador_Nega = 0; //Para contar cuántos Números Negativos hay
        for (int i = 0; i < numeros.length; i++) {
            
            //Comparar
            if (numeros[i] > 0) {
                contador_Posi++;
                System.out.println("El Número " + numeros[i] + " es Positivo");
            } else if (numeros[i] < 0) {
                contador_Nega++;
                System.out.println("El Número " + numeros[i] + " es Negativo");
            }
        }
        System.out.println(); //Para separar los Números de los contadores
        System.out.println("Hay: " + contador_Posi + " Números Positivos en el Arreglo");
        System.out.println("Hay: " + contador_Nega + " Números Negativos en el Arreglo");
    }
}
