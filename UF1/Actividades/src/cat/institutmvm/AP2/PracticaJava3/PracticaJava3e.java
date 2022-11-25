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

public class PracticaJava3e {

    private final static int MAX = 50;
    private final static int MIN = 25;
    private final static String MSG1 = "Inserta un numero";
    private final static String MSG2 = "El numero esta entre 25 y 50";
    private final static String MSG3 = "El numero no esta entre 25 y 50";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num = sc.nextInt();
        if (num <= MAX && num >= MIN) {
            System.out.println(MSG2);
        } else {
            System.out.println(MSG3);
        }
        sc.close();
    }
}