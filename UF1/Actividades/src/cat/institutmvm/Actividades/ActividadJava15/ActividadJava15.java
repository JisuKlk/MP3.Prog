/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava15;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava15 {

    private final static int TRIPLE = 3;
    private final static String MSG1 = "Introduce 3 numeros enteros";
    private final static String MSG2 = "El resultado de la suma es: ";
    private final static String MSG3 = "Los 3 numeros son iguales, el valor triple de la suma es: ";
    private final static String ERROR = "DIJE NUMERO ENTERO WN";

    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0;
        boolean isEntero;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        isEntero = sc.hasNextInt();
        if (isEntero) {
            num1 = sc.nextInt();
            isEntero = sc.hasNextInt();
            if (isEntero) {
                num2 = sc.nextInt();
                isEntero = sc.hasNextInt();
                if (isEntero) {
                    num3 = sc.nextInt();
                } else {
                    System.out.println(ERROR);
                    sc.next();
                }
            } else {
                System.out.println(ERROR);
                sc.next();
            }
        } else {
            System.out.println(ERROR);
            sc.next();
        }
        if (num1 == num2 || num2 == num3) {
            System.out.println(MSG3 + (num1 + num2 + num3) * TRIPLE);
        } else {
            System.out.println(MSG2 + (num1 + num2 + num3));
        }
    }
}