/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.PrimeraParte;

import java.util.Scanner;

/**
 *
 * @author Álvaro Fernández
 */
public class PracticaPg12a {

    private final static int DIV = 2;
    private final static String MSG1 = "Introduce la altura del triangulo en cm";
    private final static String MSG2 = "Introduce la base del triangulo en cm";
    private final static String MSG3 = "El area del triangulo es:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0, base = 0;
        System.out.println(MSG1);
        altura = sc.nextInt();
        System.out.println(MSG2);
        base = sc.nextInt();
        System.out.println(MSG3 + " " + altura * base / DIV + "cm");
    }
}
