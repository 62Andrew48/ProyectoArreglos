/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adicional;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Trabajador {
    
    //Declaro el Arreglo
    int cedulas[] = new int[5];
    
    Scanner scan = new Scanner(System.in);
    
    //Método para Guardar las Cédulas
    void guardarCedulas() {
        int datoRecibido;
        System.out.println("Las 5 Cédulas de los Trabajadores");
        for (int i = 0; i < cedulas.length; i++) {
            
            //Pido la Cédula
            System.out.println("Dígite la Cédula " + (i + 1));
            datoRecibido = scan.nextInt();
            
            //La guardó en el Arreglo
            cedulas[i] = datoRecibido;
        }
        System.out.println("Cédulas registradas exitosamente!");
    }
    
    //Método para Mostrar las Cédulas de los Trabajadores
    void mostrarCedulas() {
        int i = 0; //Contador
        for (int j = 0; j < cedulas.length; j++) {
            System.out.println("Mostrando la Cédula del Trabajador " + (1 + i++));
            System.out.println(cedulas[j]);
        }
    }
    
    //Método para Buscar la Cédula de un Trabajador
    void buscarCedula() {
        
        //Pido la Cédula a Buscar
        System.out.print("Dígite la Cédula a Buscar: ");
        int datoBuscar = scan.nextInt();
        
        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < cedulas.length; i++) {
            
            //Comparo
            if (datoBuscar == cedulas[i]) {
                bandera = true;
            }
        }
        
        //Revisó la bandera
        if (bandera == true)
            System.out.println("Cédula Encontrada");
        else
            System.out.println("Cédula No Encontrado");
    }
    
    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               **GESTIÓN DE CÉDULAS**
                               
                               1. Registrar Cédulas
                               2. Mostrar Cédulas
                               3. Buscar Cédula
                               4. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarCedulas();
                    break;
                case 2:
                    this.mostrarCedulas();
                    break;
                case 3:
                    this.buscarCedula();
                    break;
            }
        } while(opcion > 0 && opcion < 4);
    }
}
