/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava18;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava18 {

    private final static String MSG = "Introduce 2 numeros";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, aux;
        System.out.println(MSG);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println(num1 + " y " + num2);
    }
}
