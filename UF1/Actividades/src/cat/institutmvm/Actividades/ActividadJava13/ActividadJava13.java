/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava13;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava13 {

    private final static String MSG1 = "Introduzca 2 valores";
    private final static String MSG2 = "Pulse 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir";
    private final static String MSG3 = "Has salido del programa";
    private final static String MSG4 = "El resultado es: ";
    private final static String MSG5 = "Puede elegir otra accion o salir del programa pulsando 0";
    private final static int SUMAR = 1;
    private final static int RESTAR = 2;
    private final static int MULTIPLICAR = 3;
    private final static int DIVIDIR = 4;
    private final static int SALIR = 0;

    public static void main(String[] args) {
        int num1, num2, choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(MSG2);
        choice = sc.nextInt();
        switch (choice) {
            case SUMAR:
                choice = num1 + num2;
                break;
            case RESTAR:
                choice = num1 - num2;
                break;
            case MULTIPLICAR:
                choice = num1 * num2;
                break;
            case DIVIDIR:
                choice = num1 / num2;
                break;  
        }
        System.out.println(MSG4 + choice);
        System.out.println(MSG5);
        choice = sc.nextInt();
        while (choice != SALIR) {
            switch (choice) {
                case SUMAR:
                    choice = num1 + num2;
                    break;
                case RESTAR:
                    choice = num1 - num2;
                    break;
                case MULTIPLICAR:
                    choice = num1 * num2;
                    break;
                case DIVIDIR:
                    choice = num1 / num2;
                    break;
                case SALIR:
                    choice = SALIR;
                    break;
            }
            System.out.println(MSG4 + choice);
            choice = SALIR;
        }
    }
}
