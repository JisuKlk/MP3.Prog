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

public class PracticaJava3f {

    private final static int DIV = 2;
    private final static int MAX = 15;
    private final static String MSG1 = "Inserta un numero";
    private final static String MSG2 = "El numero es menor a 15";
    private final static String MSG3 = "El numero es mayor a 15";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        System.out.println(MSG1);
        num1 = sc.nextInt();
        System.out.println(MSG1);
        num2 = sc.nextInt();
        num1 = (num1 % DIV);
        if (num1 * num2 < MAX) {
            System.out.println(MSG2 + " " + num1 * num2);
        } else {
            System.out.println(MSG3 + " " + num1 * num2);
        }
        sc.close();
    }
}