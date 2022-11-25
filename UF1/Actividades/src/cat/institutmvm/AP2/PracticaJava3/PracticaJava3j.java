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

public class PracticaJava3j {

    private static final String MSG1 = "Inserta un numero";
    private static final String MSG2 = "El valor maximo es";

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num1 = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        System.out.println(MSG1);
        num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(MSG2 + " " + num1);
            } else {
                System.out.println(MSG2 + " " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println(MSG2 + " " + num2);
            } else {
                System.out.println(MSG2 + " " + num3);
            }
        }
        sc.close();
    }
}
