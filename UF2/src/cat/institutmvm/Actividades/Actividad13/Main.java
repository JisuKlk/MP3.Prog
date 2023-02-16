/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad13;

/**
 *
 * @author alumne_1r
 */


import java.util.Scanner;

public class Main {
    
    private final static String WELCOME = "Welcome!";
    private final static String MSG1 = "Give me a number";
    private final static String MSG2 = "Definetly, the first number is smaller than the second one!";
    private final static String MSG3 = "Nope, it seems that the second number is smaller than the first one!";
    private final static String MSG4 = "The first number is bigger than the second number, but smaller than the third one!";
    private final static String MSG5 = "The first number is the biggest, too bad!";
    private final static String ERROR = "Woah! you got some errors there, try again!";

    public static void main(String[] args) {
        System.out.println(WELCOME);
        Main method = new Main();      
        int num1 = method.validarNumeroEntero();
        int num2 = method.validarNumeroEntero();
        int num3 = method.validarNumeroEntero();
        if (num1 < num2) {
            System.out.println(MSG2);
        } else {
            System.out.println(MSG3);
        }
        if (num2 < num3) {
            if (num1 > num2 && num1 < num3) {
                System.out.println(MSG4);
            }
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(MSG5);
        }
    }

    public int validarNumeroEntero() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean isInteger;
        do {                                                        
            System.out.println(MSG1);
            isInteger = sc.hasNextInt();
            if (isInteger) {
                num = sc.nextInt();
            } else {
                System.out.println(ERROR);
                sc.next();
            }   
        } while (isInteger == false);
        return num;
    }
}
