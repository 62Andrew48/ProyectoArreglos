/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup.trabajadores;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Trabajador {

    //Declaro el Arreglo
    int cedulas[] = new int[5];

    Scanner scan = new Scanner(System.in);

    //Método para guardar las Cédulas de los Trabajadores
    void registrarCedulas() {
        int datoRecibido;
        System.out.println("Las 5 Cedulas de los Trabajadores");
        for (int i = 0; i < cedulas.length; i++) {

            //Pido la Cédula
            System.out.println("Dígite la Cédula del Trabajador" + (i + 1));
            datoRecibido = scan.nextInt();

            //La guardó en el Arreglo
            cedulas[i] = datoRecibido;
        }
        System.out.println("Cédulas registradas exitosamente!");
    }

    //Método para Listar las Cédulas
    void listarCedulas() {
        int i = 0;
        for (int j = 0; j < cedulas.length; j++) {
            System.out.println("Leyendo la Cédula del Trabajador " + (1 + i++));
            System.out.println(cedulas[j]);
        }
    }
    
    //Método para Buscar la Cédula Registrada
    void buscarCedulas() {
        System.out.println("Dígite la Cédula que desea buscar");
        int valorBuscado = scan.nextInt();
        
        //Variable para indicar si la Cédula está registrada
        boolean cedularegistrada = false;
        
        //Recorre el Arreglo para buscar la Cédula
        for (int elemento : cedulas) {
            if (elemento == valorBuscado) {
                cedularegistrada = true;
                break;
            }
        }
        
        //Verifica si la Cédula está registrada o no
        if (cedularegistrada) {
            System.out.println("La Cédula " + valorBuscado + " si está registrada");
        } else if (cedularegistrada) {
            System.out.println("La Cédula " + valorBuscado + " no está registrada");
        }
    }

    //Menu
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                           \n******MENU DE OPCIONES******
                           ****GESTION DE CEDULAS****
                           
                           1. Registrar Cedulas
                           2. Listar Cedulas
                           3. Buscar Cedula
                           4. Salir
                           Opcion""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.registrarCedulas();
                    break;
                case 2:
                    this.listarCedulas();
                    break;
                case 3:
                    this.buscarCedulas();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
