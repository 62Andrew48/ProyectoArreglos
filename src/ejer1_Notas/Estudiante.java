/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_Notas;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Estudiante {

    //Declaro el Arreglo
    double notas[] = new double[5];

    Scanner scan = new Scanner(System.in);

    //Método para guardar las Notas de los Estudiantes
    void guardarNotas() {
        double datoRecibido;
        System.out.println("Notas de los 5 Estudiantes");
        for (int i = 0; i < notas.length; i++) {

            //Pido la Nota
            System.out.println("Dígite la nota del Estudiante " + (i + 1));
            datoRecibido = scan.nextDouble();

            //La guardó en el Arreglo
            notas[i] = datoRecibido;
        }
        System.out.println("Notas registradas exitosamente!");
    }

    //Método para Leer las Notas de los Estudiantes
    void leerNotas() {
        int i = 0; //Contador
        for (int j = 0; j < notas.length; j++) {
            System.out.println("Leyendo la Nota del Estudiante " + (1 + i++));
            System.out.println(notas[j]);
        }
    }

    //Método para Hallar el Promedio
    void promediar() {

        //Debo usar un Acumulador
        double suma = 0; //Acumulador
        double promedio;
        System.out.println("Promedio de las Notas de los Estudiantes");
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        //Hallo el Promedio
        promedio = suma / 5;
        System.out.println("El Promedio de las Notas es: " + promedio);
    }

    //Método para Hallar las Notas mayores a 3
    void verNotasMayores() {
        System.out.println("Notas mayores a 3");
        for (int i = 0; i < notas.length; i++) {

            //Comparo
            if (notas[i] > 3.0) {
                System.out.print(notas[i] + " / ");
            }
        }
    }

    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n ********MENU DE OPCIONES********
                               *********GESTION DE NOTAS**********
                               
                               1. Guardar Notas
                               2. Leer Notas
                               3. Promedio Notas
                               4. Notas mayores a 3
                               5. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarNotas();
                    break;
                case 2:
                    this.leerNotas();
                    break;
                case 3:
                    this.promediar();
                    break;
                case 4:
                    this.verNotasMayores();
                    break;
            }
        } while (opcion > 0 && opcion < 5);
    }
}
