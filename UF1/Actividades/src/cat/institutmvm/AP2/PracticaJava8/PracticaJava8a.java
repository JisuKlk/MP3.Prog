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

public class PracticaJava8a {

    private static final int SALIDA = 0;
    private static final String MSG1 = "Introduce un valor, si quiere salir, escriba \"0\"";
    private static final String MSG2 = "El numero agregado es:";
    private static final String MSG3 = "El programa finalizó";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (num != SALIDA) {
            do {
                System.out.println(MSG1 + " ");
                num = sc.nextInt();
            } while (num < SALIDA);
            System.out.println(MSG2 + " " + num);
        }
        System.out.println(MSG3);
        sc.close();
    }
}