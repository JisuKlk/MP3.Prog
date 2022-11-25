/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava4;

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

public class PracticaJava4a {

    private static final int MIN = 1;
    private static final int MAX = 12;
    private static final String MSG1 = "Introduce un mes (con numeros del 1 al 12, donde 1 es Enero y 12 Diciembre)";
    private static final String MSG2 = "Recuerda introducir un numero del 1 al 12!";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num = sc.nextInt();
        if (num < MIN || num > MAX) {
            System.out.println(MSG2);
        }
        if (num == 1) {
            System.out.println("Enero");
        } else if (num == 2) {
            System.out.println("Febrero");
        } else if (num == 3) {
            System.out.println("Marzo");
        } else if (num == 4) {
            System.out.println("Abril");
        } else if (num == 5) {
            System.out.println("Mayo");
        } else if (num == 6) {
            System.out.println("Junio");
        } else if (num == 7) {
            System.out.println("Julio");
        } else if (num == 8) {
            System.out.println("Agosto");
        } else if (num == 9) {
            System.out.println("Septiembre");
        } else if (num == 10) {
            System.out.println("Octubre");
        } else if (num == 11) {
            System.out.println("Noviembre");
        } else if (num == 12) {
            System.out.println("Diciembre");
        }
        sc.close();
    }
}