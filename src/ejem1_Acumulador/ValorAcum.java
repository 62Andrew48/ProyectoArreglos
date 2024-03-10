/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejem1_Acumulador;

/**
 *
 * @author ANDRES GARCES
 */
public class ValorAcum {

    //Declaro el Arreglo
    int lista[] = {1, 2, 3, 4, 5};

    void Acumulador() {
        int acumulador = 0; //Declaramos e Inicializamos el Acumulador

        for (int i = 0; i < lista.length; i++) {
            System.out.println(acumulador + " + " + lista[i] + " = ");
            acumulador = acumulador + lista[i]; //Incrementamos el Acumulador
            System.out.println(acumulador);
            System.out.println();
        }

        //Al finalizar el programa, el acumulador nos da el valor de la suma
        System.out.println("La suma es: " + acumulador);
    }
}
