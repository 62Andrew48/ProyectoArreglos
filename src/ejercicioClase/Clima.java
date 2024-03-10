/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioClase;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Clima {
    
    //Declaro el Arreglo
    double temperaturas[] = new double[5];

    Scanner in = new Scanner(System.in);

    //Método para guardar las Temperatuas de Lunes a Viernes
    void guardarTemperaturas() {
        double datoRecibido;
        System.out.println("Temperaturas Lunes a Viernes");
        for (int i = 0; i < temperaturas.length; i++) {
            
            //Pido la Temperatura
            System.out.println("Digite la Temperatura " + (i + 1));
            datoRecibido = in.nextDouble();

            //La guardó en el Arreglo
            temperaturas[i] = datoRecibido;
        }
        System.out.println("Datos Registrados exitosamente!");
    }

    //Método para Leer el Arreglo
    void leer_1Temperaturas() {
        System.out.println("Leyendo las Temperaturas (Lunes /.../ Viernes)");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " / ");
        }
        System.out.println();
    }

    //Metodo para hallar el Promedio
    void promediar() {

        //Debo usar un Acumulador
        double suma = 0; //Acumulador
        double promedio;
        System.out.println("Promedio de las Temperaturas de Lun a Vie");
        for (int i = 0; i < temperaturas.length; i++) {
            suma = suma + temperaturas[i];
        }

        //Hallo el Promedio
        promedio = suma / 5;
        System.out.println("El Promedio es: " + promedio);
    }

    //Método para hallar las Temperaturas Mayores a 22°C
    void verTemperaturasMayores() {
        System.out.println("Temperaturas Mayores a 22 Grados");
        for (int i = 0; i < temperaturas.length; i++) {
            
            //Comparo
            if (temperaturas[i] > 22) {
                System.out.print(temperaturas[i] + " / ");
            }
        }
        System.out.println();
    }

    //Menu
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                           \n************MENU DE OPCIONES************
                           ****GESTION DE TEMPERATURAS(LUN-VIE)****
                           
                           1. Guardar Temperaturas
                           2. Leer Datos
                           3. Promedio Temperaturas
                           4. Temperaturas Mayores a 20 Grados
                           5. Salir
                           Opcion:""");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarTemperaturas();
                    break;
                case 2:
                    this.leer_1Temperaturas();
                    break;
                case 3:
                    this.promediar();
                    break;
                case 4:
                    this.verTemperaturasMayores();
                    break;
            }
        } while (opcion > 0 && opcion < 5);
    }
}
