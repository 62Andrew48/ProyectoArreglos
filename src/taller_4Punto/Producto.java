/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_4Punto;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Producto {

    //Declaro el Arreglo
    double precios[] = new double[5];

    Scanner scan = new Scanner(System.in);

    //Método para guardar los Precios de los Productos
    void guardarPrecios() {
        double datoRecibido;
        System.out.println("Precio de los 5 Productos");
        for (int i = 0; i < precios.length; i++) {

            //Pido el Precio
            System.out.println("Dígite el Precio del Producto " + (i + 1));
            datoRecibido = scan.nextDouble();

            //La guardó en el Arreglo
            precios[i] = datoRecibido;
        }
        System.out.println("Precios registrados exitosamente!");
    }

    //Método para saber cuál es el menor y mayor Precio del Producto
    void menorYmayor() {

        //Inicializar las variables menor y mayor con el primer Precio del Arreglo
        double menor = precios[0];
        double mayor = precios[0];

        for (int i = 1; i < precios.length; i++) {

            //Comparo
            if (precios[i] < menor) {
                menor = precios[i];
            } else if (precios[i] > mayor) {
                mayor = precios[i];
            }
        }
        System.out.println();
        System.out.println("El Menor Precio es: " + menor);
        System.out.println("El Mayor Precio es: " + mayor);
    }
}
