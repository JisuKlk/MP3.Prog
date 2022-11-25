/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package PracticaJava1;

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

public class PracticaJava1d {

    private final static int SIZE = 10;
    private final static String MSG = "**********";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.println(MSG);
        }
        sc.close();
    }
}