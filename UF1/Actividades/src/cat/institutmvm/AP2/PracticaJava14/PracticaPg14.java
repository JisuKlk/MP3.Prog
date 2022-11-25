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
public class PracticaPg14 {

    private static final String MSG1 = "Escribe un número entre el 1 y el 10";
    private static final String MSG2 = "Número incorrecto! Prueba de nuevo...";
    private static final String MSG3 = "Número correcto!";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG1);
            num = sc.nextInt();
            if (num < 1 || num > 10) {
                System.out.println(MSG2);
            } else {
                System.out.println(MSG3);
            }
        } while (num < 1 || num > 10);
    }
}