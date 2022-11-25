/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava12;

import cat.institutmvm.*;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava12 {
    
    private final static String MSG1 = "Introduce 1 numero entero";
    private final static String MSG2 = "Repito; NUMERO ENTERO";

    public static void main(String[] args) {
        int num, count, acumulador = 0;
        boolean isEntero;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        isEntero = sc.hasNextInt();
        if (isEntero) {
            num = sc.nextInt();
            for (count = 0; count < num; count++) {
                    acumulador += count;
                if (acumulador <= num) {
                    System.out.println(count);
                }
            }
        } else {
            System.out.println(MSG2);
        }
    }
}
