/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2_Temperatura;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Ambiente {

    //Declaro el Arreglo
    double temperaturas[] = new double[5];

    Scanner scan = new Scanner(System.in);

    //Método para guardar las Temperaturas
    void guardarTemperaturas() {
        double datoRecibido;
        System.out.println("Las 5 Temperaturas para registrar");
        for (int i = 0; i < temperaturas.length; i++) {

            //Pido la Temperatura
            System.out.println("Dígite la Temperatura " + (i + 1));
            datoRecibido = scan.nextDouble();

            //La guardó en el Arreglo
            temperaturas[i] = datoRecibido;
        }
        System.out.println("Temperaturas registradas exitosamente!");
    }

    //Método para Hallar el Promedio
    void promediar() {

        //Debo usar un acumulador
        double suma = 0; //Acumulador
        double promedio;
        System.out.println("Promedio de las 5 Temperaturas");
        for (int i = 0; i < temperaturas.length; i++) {
            suma = suma + temperaturas[i];
        }

        //Hallo el Promedio
        promedio = suma / 5;
        System.out.println("El Promedio de las 5 Temperaturas es: " + promedio);
    }

    //Método para Hallar las Temperaturas Mayores a 15°
    void verTemperaturasMayores() {
        System.out.println("Temperaturas mayores a 15 Grados");
        int contador = 0; //Para contar cuántas temperaturas hay mayores a 15 Grados
        for (int i = 0; i < temperaturas.length; i++) {

            //Comparo
            if (temperaturas[i] > 15) {
                contador++;
                System.out.print(temperaturas[i] + " / ");
            }
        }
        System.out.println(); // Para separar las Temperaturas del contador
        System.out.println("Las Temperaturas mayores a 15 Grados son: " + contador);
    }

    //Método para Buscar Temperaturas
    void buscarTemperaturas() {
        System.out.println("Dígite la Temperatura que quiere buscar: ");
        double valorBuscado = scan.nextDouble();

        //Variable para indicar si la temperatura está registrada
        boolean registrado = false;

        //Recorrer el Arreglo para buscar la Temperatura
        for (double elemento : temperaturas) {
            if (elemento == valorBuscado) {
                registrado = true;
                break;
            }
        }

        //Verificar si la Temperatura está registrada o no
        if (registrado) {
            System.out.println("La Temperatura " + valorBuscado + " si está registrada");
        } else {
            System.out.println("La Temperatura " + valorBuscado + " no está registrada");
        }
    }

    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n*********MENU DE OPCIONES*********
                               ******GESTION DE TEMPERATURAS******
                               
                               1. Guardar Temperaturas
                               2. Promediar Temperaturas
                               3. Temperaturas mayores a 15 Grados
                               4. Buscar Temperaturas
                               5. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarTemperaturas();
                    break;
                case 2:
                    this.promediar();
                    break;
                case 3:
                    this.verTemperaturasMayores();
                    break;
                case 4:
                    this.buscarTemperaturas();
                    break;
            }
        } while (opcion > 0 && opcion < 5);
    }
}
