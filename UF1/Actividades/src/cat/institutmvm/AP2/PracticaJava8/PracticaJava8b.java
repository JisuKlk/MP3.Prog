/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava8;

import java.util.Scanner;

/**
 *
 * Nom: Álvaro 
 * Cognoms: Fernández 
 * INS Manuel Vázquez Montalbán 
 * Data d’edició: 30/10/2022 
 * Nom del cicle formatiu: 1 DAW 
 * Nom del mòdul: PG
 *
 */

public class PracticaJava8b {

    private static final int SALIR = 0; 
    private static final String MSG1 = "Cuantos valores quieres introducir?"; 
    private static final String MSG2 = "Inserta un numero"; 
    private static final String MSG3 = "El programa finalizó"; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0, i;
        do {
            System.out.println(MSG1);
            i = sc.nextInt();
        } while (i < SALIR);
        while (count < i) { 
            System.out.println(MSG2);
            count++;
        }
        System.out.println(MSG3);
        sc.close();
    }
}
