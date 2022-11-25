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

public class PracticaJava3l {

    private final static int CUOTA = 6;
    private final static int LITRO = 50;
    private final static int LITRO2 = 200;
    private final static float MIN = (float) 0.1;
    private final static float MAX = (float) 0.3;
    private final static String MSG1 = "Inserta los litros de agua";
    private final static String MSG2 = "El agua cuesta";

    public static void main(String[] args) {
        int litros;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        litros = sc.nextInt();
        if (litros <= LITRO) {
            System.out.println(MSG2 + " " + litros * CUOTA);

        } else if (LITRO < litros && litros <= LITRO2) {
            System.out.println(MSG2 + " " + litros * CUOTA * MIN);

        } else {
            System.out.println(MSG2 + " " + litros * CUOTA * MAX);
        }
        sc.close();
    }
}