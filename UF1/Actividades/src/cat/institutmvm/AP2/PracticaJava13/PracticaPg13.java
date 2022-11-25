/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.PrimeraParte;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class PracticaPg13 {

    private final static String MSG1 = "Introduce un número natural";
    private final static String MSG2 = "La media es:";
    private final static String MSG3 = "Eso no es un número natural! Prueba de nuevo...";
    private final static String MSG4 = "Número correcto";
    private final static int SIZE = 3;

    public static void main(String[] args) {
        int num, count, avg = 0;
        Scanner sc = new Scanner(System.in);

        for (count = 0; count < SIZE; count++) {
            do {
                System.out.println(MSG1);
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println(MSG3);
                } else {
                    System.out.println(MSG4);
                }
            } while (num < 0);
            avg += num;
        }
        System.out.println(MSG2 + " " + avg / count);
    }
}