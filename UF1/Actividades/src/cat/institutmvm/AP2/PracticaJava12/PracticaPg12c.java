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
public class PracticaPg12c {

    private final static String MSG1 = "Introduce tres nombres enteros";
    private final static String MSG2 = "La suma de los 2 primeros valores es mayor al tercer valor";
    private final static String MSG3 = "La suma de los 2 primeros valores es menor al tercer valor";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3 = 0;
        System.out.println(MSG1);
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();
        if (numero1 + numero2 > numero3) {
            System.out.println(MSG2);
        } else {
            System.out.println(MSG3);
        }
    }
}