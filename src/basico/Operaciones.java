/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author ANDRES GARCES
 */
public class Operaciones {
    
    //Declaro el Arreglo
    int numeros[] = new int[4];

    //Metodo
    void escribirDatosBasicos() {
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        System.out.println("Arreglo escrito con Datos Estaticos");
    }

    void leer_1Arreglo() {
        System.out.println("Posicion 0 = " + numeros[0]);
        System.out.println("Posicion 1 = " + numeros[1]);
        System.out.println("Posicion 2 = " + numeros[2]);
        System.out.println("Posicion 3 = " + numeros[3]);
        System.out.println();
    }

    //Metodo 2 para escribir
    void escribir_2(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 2 * i;
        }
        System.out.println("Arreglo escrito con Datos Dinamicos");
    }
    
    void leer_3(){
        System.out.println("Leyendo el Arreglo escrito de Forma Dinamica");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + " = " + numeros[i]);
        }
    }
}//Fin Clase
