/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.apellidos;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {

    //Declaro el Arreglo
    String apellidos[] = new String[4];

    Scanner scan = new Scanner(System.in);

    //Método para guardar los Apellidos
    void registrarApellidos() {
        String dato = null; //Inicializar
        System.out.println("REGISTRANDO APELLIDOS");
        for (int i = 0; i < apellidos.length; i++) {
            String apellido = apellidos[i];
            System.out.println("Ingrese el Apellido: " + (i +1));
            apellidos[i] = dato;
            dato = scan.next();

            //Guardó en el Arreglo
            apellidos[i] = dato;
        }
    }//Cierra el Método
    
    //Método para Listar Apellidos
    void listar() {
        System.out.println("LISTANDO APELLIDOS");
        for (int i = 0; i < apellidos.length; i++) {
            
            //Use: "print" sin salto de línea y "/" para separar
            System.out.print(apellidos[i] + " / ");
        }
    }
    
    //Método para Buscar el Apellido
    void buscarApellido() {
        System.out.println("BUSCAR POR APELLIDOS");
        
        //Pido el Apellido a Buscar
        System.out.print("Dígite el Apellido a Buscar: ");
        String datoBuscar = scan.next();
        
        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < apellidos.length; i++) {
            
            //Comparo
            if (datoBuscar.equals(apellidos[i])) {
                bandera = true;
            }
        }//Cierra el for
        
        //Revisó la bandera
        if (bandera == true)
            System.out.println("Encontrado!!");
        else
            System.out.println("No Encontrado!!");
    }
    
    //Menú
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n****MENU OPCIONES****
                               **GESITON DE APELLIDOS**
                               
                               1. Registrar Apellidos
                               2. Listar Apellidos
                               3. Buscar Apellidos
                               4. Salir
                               
                               Opcion:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.registrarApellidos();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.buscarApellido();
                    break;
            }
        } while(opcion > 0 && opcion < 4);
    }
}
