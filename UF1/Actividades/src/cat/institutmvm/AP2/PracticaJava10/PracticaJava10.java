/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.AP2;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class PracticaJava10 {

    private final static int TOP = 3;
    private final static int MAX = 100;
    private final static int MIN = 1;
    private final static String MSG1 = "Introduce el número";
    private final static String MSG2 = "El número introducido es: ";

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, count = 0;
        do {
            System.out.println(MSG1);
            numero = sc.nextInt();
            count++;
        } while (numero < MIN || numero > MAX && count < TOP);
        System.out.println(MSG2 + numero);
    }
}
