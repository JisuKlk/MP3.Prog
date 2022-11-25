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

public class PracticaJava3c {

    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final String MSG1 = "Inserta un numero:";
    private static final String MSG2 = "El numero introducido es positivo y menor¡ que 100";
    private static final String MSG3 = "El numero introducido es negativo o mayor a 100";
    private static final String MSG4 = "El numero es neutro";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num = sc.nextInt();
        if (num != 0) {
            if (num > MIN && num < MAX) {
                System.out.println(MSG2);
            } else {
                System.out.println(MSG3);
            }
        } else {
            System.out.println(MSG4);
        }
        sc.close();
    }
}
