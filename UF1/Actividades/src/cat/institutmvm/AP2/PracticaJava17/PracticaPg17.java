/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaJava17;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class PracticaPg17 {
    private final static int MAX = 20;
    public static void main(String[] args) {
        int canvi = 0;
        int[] arrayInt = new int[MAX];
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce los valores");
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = sc.nextInt();
        }
        for (int i = 0; i >= arrayInt.length; i++) {
            for (int j = 0; j < arrayInt.length; j++) {
                if (arrayInt[i] > arrayInt[j]) {
                    canvi = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = canvi;                   
                }
            }
        }
        System.out.println("mostramos los valores en orden descendiente");
        for (int i = 19; i < arrayInt.length; i--) {
            System.out.println(arrayInt[i]);
        }
    }
}
