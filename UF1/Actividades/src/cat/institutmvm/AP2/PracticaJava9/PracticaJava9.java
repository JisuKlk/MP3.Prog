/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava9;

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

public class PracticaJava9 {

    private final static String MSG_1 = "Inserta un valor";
    private final static String MSG_2 = "La media es:";

    public static void main(String[] args) {

        int contador = 0;
        float media = 0, valor = 1;
        Scanner sc = new Scanner(System.in);
        while (valor != 0) {
            System.out.println(MSG_1);
            valor = sc.nextFloat();
            contador++;
            media += valor;
        }
        System.out.println(MSG_2 + " " + media / contador);
        sc.close();
    }
}
