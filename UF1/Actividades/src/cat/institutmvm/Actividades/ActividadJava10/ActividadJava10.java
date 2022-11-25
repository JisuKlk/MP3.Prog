/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava10;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava10 {

    private final static String MSG1 = "Introduce 2 numeros enteros positivos";
    private final static String MSG2 = "Repito; NUMEROS ENTEROS POSITIVOS";
    private final static int DIV = 2;

    public static void main(String[] args) {
        int n1, n2, aux;
        boolean isEntero1, isEntero2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        isEntero1 = sc.hasNextInt();
        if (isEntero1) {
            n1 = sc.nextInt();
            isEntero2 = sc.hasNextInt();
            if (isEntero2) {
                n2 = sc.nextInt();
                if (n1 > n2) {
                    aux = n1;
                    n1 = n2;
                    n2 = aux;
                }
                while (n1 <= n2) {
                    if (n1 % DIV == 0) {
                        System.out.println(n1);
                        n1++;
                    } else {
                        n1++;
                    }
                }
            } else {
                System.out.println(MSG2);
            }
        } else {
            System.out.println(MSG2);
        }
    }
}