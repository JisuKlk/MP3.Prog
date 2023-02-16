/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad1;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {

    private final static String MSG1 = "Introduce un número";
    private final static String MSG2 = "El número indicado es negativo: ";
    private final static String MSG3 = "El número introducido NO es negativo: ";
    private final static String MSG4 = "Error en los datos";

    public static void main(String[] args) {
        Main validate = new Main();
        float numero = validate.numero();
        if (numero < 0) {
            System.out.println(MSG2);
        } else {
            System.out.println(MSG3);
        }
    }

    public float numero() {
        float numero = 0;
        boolean isNumber;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG1);
            isNumber = sc.hasNextFloat();
            if (isNumber) {
                numero = sc.nextFloat();
            } else {
                System.out.println(MSG4);
                sc.next();
            }
        } while (!isNumber);
        return numero;
    }
}
