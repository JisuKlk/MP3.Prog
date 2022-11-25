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

public class PracticaJava3k {

    private static final String MSG1 = "Inserta un numero";
    private static final String MSG2 = "Si es multiplo";
    private static final String MSG3 = "No es multiply";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num1 = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        if (num1 > num2) {
            if (num1 % num2 == 0) {
                System.out.println(MSG2);
            } else {
                System.out.println(MSG3);
            }
        } else {
            if (num2 % num1 == 0) {
                System.out.println(MSG2);
            } else {
                System.out.println(MSG3);
            }
        }
        sc.close();
    }
}
