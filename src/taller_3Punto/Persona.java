/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_3Punto;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {
    
    //Declaro el Arreglo
    int edades[] = new int[10];
    
    Scanner scan = new Scanner(System.in);
    
    //Método para guardar las Edades de las 10 Personas
    void guardarEdades() {
        int datoRecibido;
        System.out.println("Edades de las 10 Personas");
        for (int i = 0; i < edades.length; i++) {
            
            //Pido la Edad
            System.out.println("Dígite la Edad de la Persona " + (i + 1));
            datoRecibido = scan.nextInt();
            
            //La guardó en el Arreglo
            edades[i] = datoRecibido;
        }
        System.out.println("Edades registradas exitosamente!");
    }
    
    //Método para hallar el promedio
    void promediar() {
        
        //Debo usar un Acumulador
        int suma = 0;
        int promedio;
        System.out.println();
        System.out.println("Promedio de las Edades, de las 10 personas");
        for (int i = 0; i < edades.length; i++) {
            suma = suma + edades[i];
        }
        
        //Hallo el Promedio
        promedio = suma / edades.length;
        System.out.println("El Promedio es: " + promedio);
    }
}
