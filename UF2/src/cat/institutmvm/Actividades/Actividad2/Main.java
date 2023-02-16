/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad2;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
    
    private final static String MSG1 = "Introduce un número";
    private final static String MSG2 = "El número indicado es positivo: ";
    private final static String MSG3 = "También es menor que 100";
    private final static String MSG4 = "NO es menor que 100";
    private final static String ERROR = "Eso... no es número";

    public static void main(String[] args) {
        Main validate = new Main();
        int numero = validate.numeroPositivo();
        if (numero < 0) {
            System.out.println(MSG2);
        } else {
            System.out.println(MSG3);
        }
    }

    public int numeroPositivo() {
        int numero = 0;
        boolean isNumber;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG1);
            isNumber = sc.hasNextFloat();
            if (isNumber) {
                numero = sc.nextInt();
            } else {
                System.out.println(ERROR);
                sc.next();
            }
        } while (!isNumber);
        return numero;
    }
}
