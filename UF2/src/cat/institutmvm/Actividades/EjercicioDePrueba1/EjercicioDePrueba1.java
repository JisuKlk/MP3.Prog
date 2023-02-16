/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.EjercicioDePrueba1;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class EjercicioDePrueba1 {

    private final static String MSG1 = "Introduce un número natural";
    private final static String MSG2 = "El número indicado es natural: ";
    private final static String MSG3 = "El número introducido NO es natural";
    private final static String MSG4 = "Directamente no es un numero entero";

    public static void main(String[] args) {
        EjercicioDePrueba1 validate = new EjercicioDePrueba1();
        System.out.println(MSG2 + validate.numeroNatural());
    }

    public int numeroNatural() {
        int numero = 0;
        boolean isEntero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG1);
            isEntero = sc.hasNextInt();
            if (isEntero) {
                numero = sc.nextInt();
                if (numero >= 1) {
                    sc.close();
                } else {
                    System.out.println(MSG3);
                }
            } else {
                System.out.println(MSG4);
                sc.next();
            }
        } while (numero < 1);
        return numero;
    }
}