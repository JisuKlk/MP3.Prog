/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava5;

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

public class PracticaJava5 {

    private static final int CASO1 = 4;
    private static final int CASO2 = 100;
    private static final int CASO3 = 400;
    private static final String MSG1 = "Inserta una fecha";
    private static final String MSG2 = "Es bisiesto";
    private static final String MSG3 = "No es bisiesto";

    public static void main(String[] args) {
        int año = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        año = sc.nextInt();
        if (año % CASO1 == 0) {
            if (año % CASO2 == 0) {
                if (año % CASO3 == 0) {
                    System.out.println(año + " " + MSG2);
                } else {
                    System.out.println(año + " " + MSG3);
                }
            } else {
                System.out.println(año + " " + MSG2);
            }
        } else {
            System.out.println(año + " " + MSG3);
        }
        sc.close();
    }
}