/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz_A;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Persona {

    int documento[] = new int[3];

    Scanner scan = new Scanner(System.in);

    void registrarDocumento() {
        int datoRecibido;
        for (int i = 0; i < documento.length; i++) {
            System.out.println("Dígite el Documento de la Persona: " + (i + 1));
            datoRecibido = scan.nextInt();
            documento[i] = datoRecibido;
        }
        System.out.println("Documentos registrados exitosamente!");
    }

    void listarDocumento() {
        System.out.println("Leyendo los Documentos de las Personas");
        for (int i = 0; i < documento.length; i++) {
            System.out.print(documento[i] + " / ");
        }
        System.out.println();
    }

    void actualizarDocumento() {
        System.out.print("Dígite el Documento a Actualizar: ");
        int numeroDocumento = scan.nextInt();
        scan.nextLine(); // Limpiar el buffer del teclado
        
        boolean encontrado = false;
        for (int i = 0; i < documento.length; i++) {
            if (documento[i] == numeroDocumento) {
                System.out.print("Dígite el nuevo Documento a Registrar: ");
                int nuevoNumeroDocumento = scan.nextInt();
                scan.nextLine(); // Limpiar el buffer del teclado
                documento[i] = nuevoNumeroDocumento;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El Documento no está registrado");
        } else {
            System.out.println("Documento actualizado correctamente");
        }
    }
    
    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               \n**MENÚ DE OPCIONES**
                               **GESTIÓN DOCUMENTO**
                               
                               1. Registrar Documento
                               2. Listar Documento
                               3. Actualizar Documento
                               4. Salir
                               
                               Opción:""");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    this.registrarDocumento();
                    break;
                case 2:
                    this.listarDocumento();
                    break;
                case 3:
                    this.actualizarDocumento();
                    break;
            }
        } while (opcion > 0 && opcion < 4);
    }
}
