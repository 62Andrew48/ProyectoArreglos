/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author ANDRES GARCES
 */
public class Métodos {
    
    //Declaro el Arreglo (1)
    int NombreArreglo[] = new int[4];
    
    Scanner scan = new Scanner(System.in);
    
    //Método para Guardar Datos
    void guardarDatos() {
        int datoRecibido;
        System.out.println("Las 5 Cédulas de los Trabajadores");
        for (int i = 0; i < NombreArreglo.length; i++) {
            
            //Pido la Cédula
            System.out.println("Dígite la Cédula " + (i + 1));
            datoRecibido = scan.nextInt();
            
            //La guardó en el Arreglo
            NombreArreglo[i] = datoRecibido;
        }
        System.out.println("Cédulas registradas exitosamente!");
    }
    
    //Método para Mostrar los Datos
    void mostrarDatos() {
        int i = 0; //Contador
        for (int j = 0; j < NombreArreglo.length; j++) {
            System.out.println("Mostrando la Cédula del Trabajador " + (1 + i++));
            System.out.println(NombreArreglo[j]);
        }
    }
    
    //Método para Buscar 1 Dato Númerico
    void buscarDatoNum() {
        
        //Pido la Cédula a Buscar
        System.out.print("Dígite la Cédula a Buscar: ");
        int datoBuscar = scan.nextInt();
        
        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < NombreArreglo.length; i++) {
            
            //Comparo
            if (datoBuscar == NombreArreglo[i]) {
                bandera = true;
            }
        }
        
        //Revisó la bandera
        if (bandera == true)
            System.out.println("Cédula Encontrada");
        else
            System.out.println("Cédula No Encontrado");
    }
    
    //Método para Actualizar 1 Dato
    void actualizarDato() {
        System.out.print("Dígite el Documento a Actualizar: ");
        int numeroDocumento = scan.nextInt();
        scan.nextLine(); // Limpiar el buffer del teclado
        
        boolean encontrado = false;
        for (int i = 0; i < NombreArreglo.length; i++) {
            if (NombreArreglo[i] == numeroDocumento) {
                System.out.print("Dígite el nuevo Documento a Registrar: ");
                int nuevoNumeroDocumento = scan.nextInt();
                scan.nextLine(); // Limpiar el buffer del teclado
                NombreArreglo[i] = nuevoNumeroDocumento;
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
    
    //Método de Rango de Datos
    void rangoDatos() {
        int contador = 0;
        System.out.println("Los Saldos que están dentro del rango de 1M y 2M son:");
        for (int i = 0; i < NombreArreglo.length; i++) {
            if (NombreArreglo[i] >= 1000000 && NombreArreglo[i] <= 2000000) {
                contador++;
                System.out.print(NombreArreglo[i] + " / ");
            }
        }
        System.out.println();
        System.out.println("Los Saldos que están en el rango de 1M y 2M son: " + contador);
        System.out.println();
    }
    
    //Método para Hallar el Promedio
    void promediar() {

        //Debo usar un Acumulador
        double suma = 0; //Acumulador
        double promedio;
        System.out.println("Promedio de las Notas de los Estudiantes");
        for (int i = 0; i < NombreArreglo.length; i++) {
            suma = suma + NombreArreglo[i];
        }

        //Hallo el Promedio
        promedio = suma / NombreArreglo.length;
        System.out.println("El Promedio de las Notas es: " + promedio);
    }
    
    //Método para Hallar los Datos mayores a X(Número)
    void verNotasMayores() {
        System.out.println("Notas mayores a 2");
        for (int i = 0; i < NombreArreglo.length; i++) {

            //Comparo
            if (NombreArreglo[i] > 2.0) {
                System.out.print(NombreArreglo[i] + " / ");
            }
        }
    }
    
    //Método para hallar los Números Positivos y Negativos
    void posiYnega() {
        int contador_Posi = 0; //Para contar cuántos Números Positivos hay
        int contador_Nega = 0; //Para contar cuántos Números Negativos hay
        for (int i = 0; i < NombreArreglo.length; i++) {
            
            //Comparar
            if (NombreArreglo[i] > 0) {
                contador_Posi++;
                System.out.println("El Número " + NombreArreglo[i] + " es Positivo");
            } else if (NombreArreglo[i] < 0) {
                contador_Nega++;
                System.out.println("El Número " + NombreArreglo[i] + " es Negativo");
            }
        }
        System.out.println(); //Para separar los Números de los contadores
        System.out.println("Hay: " + contador_Posi + " Números Positivos en el Arreglo");
        System.out.println("Hay: " + contador_Nega + " Números Negativos en el Arreglo");
    }
    
    //Método para saber cuál es el menor y mayor Dato
    void menorYmayor() {

        //Inicializar las variables menor y mayor con el primer Dato del Arreglo
        double menor = NombreArreglo[0];
        double mayor = NombreArreglo[0];

        for (int i = 1; i < NombreArreglo.length; i++) {

            //Comparo
            if (NombreArreglo[i] < menor) {
                menor = NombreArreglo[i];
            } else if (NombreArreglo[i] > mayor) {
                mayor = NombreArreglo[i];
            }
        }
        System.out.println();
        System.out.println("El Menor Dato es: " + menor);
        System.out.println("El Mayor Dato es: " + mayor);
    }
    
    //Declaro el Arreglo (2)
    String NombreArreglo2[] = new String[4];
    
    //Método para Buscar 1 Dato Alfabético
    void buscarDatoAlfa() {
        
        //Pido el Apellido a Buscar
        System.out.print("Dígite el Apellido a Buscar: ");
        String datoBuscar = scan.next();
        
        boolean bandera = false; //Variable Auxiliar
        for (int i = 0; i < NombreArreglo2.length; i++) {
            
            //Comparo
            if (datoBuscar.equals(NombreArreglo2[i])) {
                bandera = true;
            }
        }
        
        //Revisó la bandera
        if (bandera == true)
            System.out.println("Apellido Encontrado");
        else
            System.out.println("Apellido No Encontrado");
    }
}
