/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz_B;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {
    
    double saldo[] = new double[3];
    
    Scanner scan = new Scanner(System.in);
    
    void registrarSaldos() {
        double datoRecibido;
        for (int i = 0; i < saldo.length; i++) {
            System.out.println("Dígite el Saldo de la Persona " + (i + 1));
            datoRecibido = scan.nextDouble();
            saldo[i] = datoRecibido;
        }
        System.out.println("Saldos registrados exitosamente!");
    }
    
    void listarSaldos() {
        System.out.println("Leyendo los Saldos de las Personas");
        for (int j = 0; j < saldo.length; j++) {
            System.out.print(saldo[j] + " / ");
        }
        System.out.println();
    }
    
    void rangoSaldos() {
        int contador = 0;
        System.out.println("Saldos que están dentro del rango de 1M y 2M");
        for (int i = 0; i < saldo.length; i++) {
            if (saldo[i] >= 1000000 && saldo[i] <= 2000000) {
                contador++;
                System.out.print(saldo[i] + " / ");
            }
        }
        System.out.println();
        System.out.println("Los Saldos que están en el rango de 1M y 2M son: " + contador);
        System.out.println();
    }
    
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               **GESTIÓN DE SALDOS**
                               
                               1. Registrar Saldos
                               2. Listar Saldos
                               3. Rango de Saldos
                               4. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.registrarSaldos();
                    break;
                case 2:
                    this.listarSaldos();
                    break;
                case 3:
                    this.rangoSaldos();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
