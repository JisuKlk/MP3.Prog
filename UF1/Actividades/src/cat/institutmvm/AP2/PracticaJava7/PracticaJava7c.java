/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava7;

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

public class PracticaJava7c {

    private static final int SIZE = 100;
    private static final int DIV = 2;

    public static void main(String[] args) {
        int num = 1;
        while (num <= SIZE) {
            if (num % DIV == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}