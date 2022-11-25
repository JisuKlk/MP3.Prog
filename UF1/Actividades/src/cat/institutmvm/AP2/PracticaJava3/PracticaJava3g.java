/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava3;

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

public class PracticaJava3g {

    private static final int DIV = 2;
    private static final String MSG1 = "Inserta un numero";
    private static final String MSG2 = "El numero es par";
    private static final String MSG3 = "El numero es impar";

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num = sc.nextInt();
        if (num % DIV == 0) {
            System.out.println(MSG2);
        } else {
            System.out.println(MSG3);
        }
        sc.close();
    }
}
