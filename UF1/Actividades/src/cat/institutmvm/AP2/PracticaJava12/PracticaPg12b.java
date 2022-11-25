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
public class PracticaPg12b {

    private final static int DOBLE = 2;
    private final static int TRIPLE = 3;
    private final static String MSG1 = "Introduce un número entero";
    private final static String MSG2 = "El doble es:";
    private final static String MSG3 = "El triple es:";

    public static void main(String[] args) {
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        numero = sc.nextInt();
        System.out.println(MSG2 + " " + numero * DOBLE);
        System.out.println(MSG3 + " " + numero * TRIPLE);
    }
}
