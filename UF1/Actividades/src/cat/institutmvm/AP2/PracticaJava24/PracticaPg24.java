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
public class PracticaPg24 {

    private final static int SIZE = 8;
    private final static int PASS = 5;
    private final static int MIN = 0;
    private final static int MAX = 10;
    private final static String NOVALUE ="literally 0 lmao";
    private final static String MSG1 = "Welcome to the MVM marks system";
    private final static String MSG2 = "Enter a note between 0 and 10!";
    private final static String MSG3 = "The average of passed students is: ";
    private final static String MSG4 = "While the average of failed students is: ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int averagePass = 0, averageFail = 0, pass = 0;
        int[] grades = new int[SIZE];
        System.out.println(MSG1);
        for (int i = 0; i < SIZE; i++) {
            do {
                System.out.println(MSG2);
                grades[i] = sc.nextInt();
            } while (grades[i] < MIN || grades[i] > MAX);
        }
        for (int i = 0; i < SIZE; i++) {
            if (grades[i] >= PASS) {
                pass++;
                averagePass += grades[i];
            } else {
                averageFail += grades[i];
            }
        }
        if (pass != 0) {
            System.out.println(MSG3 + averagePass / pass);
        } else {
            System.out.println(MSG3 + NOVALUE);
        }
        if (SIZE - pass != 0) {
            System.out.println(MSG4 + averageFail / (SIZE - pass));
        } else {
            System.out.println(MSG4 + NOVALUE);
        }
    }
}