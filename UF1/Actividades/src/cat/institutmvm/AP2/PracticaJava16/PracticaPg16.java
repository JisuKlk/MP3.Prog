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
public class PracticaPg16 {

    private static final String MSG1 = "Escribe un número natural";
    private static final String MSG2 = "Número incorrecto! Prueba de nuevo...";
    private static final String MSG3 = "Número correcto!";
    private static final int SIZE = 3;

    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG1);
            num = sc.nextInt();
            if (num < 0) {
                System.out.println(MSG2);
            } else {
                System.out.println(MSG3 + " " + num);
            }
            count++;
        } while (num < 0 && count < 3);
    }
}
