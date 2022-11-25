/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava6;

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

public class PractivaJava6a {

    private static final int CASO1 = 4;
    private static final int CASO2 = 100;
    private static final int CASO3 = 400;
    private static final int CASO4 = 8;
    private static final int DIV = 2;
    private static final String MSG1 = "Inserta una fecha:";
    private static final String MSG2 = "Inserta un mes:";
    private static final String MSG3 = "El mes tiene:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;
        do {
            System.out.println(MSG1);
            año = sc.nextInt();
        } while (año < 0);
        do {
            System.out.println(MSG2);
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);
        if (mes < CASO4 && mes % DIV != 0) {
            dia = 31;
            System.out.println(MSG3 + " " + dia + "dias");
        } else if (mes == 2) {
            if (año % CASO1 == 0) {
                if (año % CASO2 == 0) {
                    if (año % CASO3 == 0) {
                        dia = 29;
                        System.out.println(MSG3 + " " + dia + "dias");
                    } else {
                        dia = 28;
                        System.out.println(MSG3 + " " + dia + "dias");
                    }
                } else {
                    dia = 29;
                    System.out.println(MSG3 + " " + dia + "dias");
                }
            } else {
                dia = 28;
                System.out.println(MSG3 + " " + dia + "dias");
            }
        } else {
            if (CASO4 < mes && DIV != 0) {
                dia = 31;
                System.out.println(MSG3 + " " + dia + "dias");
            } else {
                dia = 30;
                System.out.println(MSG3 + " " + dia + "dias");
            }
        }
        sc.close();
    }
}