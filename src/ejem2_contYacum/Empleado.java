/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejem2_contYacum;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Empleado {

    Scanner scan = new Scanner(System.in);
    double[] sueldos;

    // Método para ingresar la longitud del arreglo y declarar el arreglo
    void longArreglo() {
        System.out.println("Ingrese la longitud del arreglo: ");
        int longitud = scan.nextInt();
        sueldos = new double[longitud];
    }

    // Método para guardar los sueldos de los empleados
    void guardarSueldos() {
        System.out.println("Ingrese los sueldos de los empleados");
        for (int i = 0; i < sueldos.length; i++) {
            System.out.print("Sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scan.nextDouble();
        }
        System.out.println("Sueldos registrados exitosamente!");
    }

    //Método para hallar el mayor y menor sueldo
    void mayorYmenor() {
        if (sueldos == null || sueldos.length == 0) {
            System.out.println("No se han ingresado sueldos todavía.");
            return;
        }

        double mayor = sueldos[0];
        double menor = sueldos[0];
        for (int i = 1; i < sueldos.length; i++) {
            if (sueldos[i] > mayor) {
                mayor = sueldos[i];
            }
            if (sueldos[i] < menor) {
                menor = sueldos[i];
            }
        }
        System.out.println();
        System.out.println("El sueldo mayor es: " + mayor);
        System.out.println("El sueldo menor es: " + menor);
    }
    
    //Método para hallar el Promedio
    void promediar() {
        
        //Debo usar un Acumulador
        double suma = 0;
        double promedio;
        System.out.println();
        System.out.println("Promedio de los Sueldos de los Empleados");
        for (int i = 0; i < sueldos.length; i++) {
            suma = suma + sueldos[i];
        }
        
        //Hallo el promedio
        promedio = suma / sueldos.length;
        System.out.println("El Promedio es: " + promedio);
    }
}
