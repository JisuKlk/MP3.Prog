/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava22;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava22 {

    private final static int SIZE = 20;
    private final static String MSG1 = "Introduce 20 valores";
    private final static String MSG2 = "Introduce un número";
    private final static String MSG3 = "El número está en la array";
    private final static String ERROR = "El número no es entero!";

    public static void main(String[] args) {
        int busqueda = 0;
        int[] arrayInt = new int[SIZE];
        Scanner sc = new Scanner(System.in);
        boolean isEntero, isEntero2;
        System.out.println(MSG1);
        for (int i = 0; i < arrayInt.length; i++) {
            do {
                isEntero = sc.hasNextInt();
                if (isEntero) {
                    arrayInt[i] = sc.nextInt();
                } else {
                    sc.next();
                    System.out.println(ERROR);
                }
            } while (!isEntero);
        }
        System.out.println(MSG2);
        isEntero2 = sc.hasNextInt();
        if (isEntero2) {
            busqueda = sc.nextInt();
        } else {
            System.out.println(ERROR);
        }

        for (int i = 0; i < arrayInt.length; i++) {
//            System.out.println(arrayInt[i]);
            if (arrayInt[i] == busqueda) {
                System.out.println(MSG3);
            }
        }
    }
}