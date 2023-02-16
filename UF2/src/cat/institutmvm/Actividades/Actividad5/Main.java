/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad5;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
    private final static int ENDBYERROR = 3;
    private final static int MINNUM = 1;
    private final static int MAXNUM = 10;
    private final static String MSG1 = "Introduce un número entre el 1 y el 10";
    private final static String MSG2 = "El valor está dentro del rango: ";
    private final static String MSG3 = "El valor NO está dentro del rango";
    private final static String ERROR = "Numero no entero";
    private final static String LOTTAERRORS = "Te has pasa'o de errores";
    
    public static void main(String[] args) {
        Main validate = new Main();
        int numero = validate.numeroNatural();
        if (numero >= MINNUM && numero <= MAXNUM) {
            System.out.println(MSG2 + numero);
        }
    }

    public int numeroNatural() {
        int numero = 0, contador = 0;
        boolean isNumber;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(MSG1);
            isNumber = sc.hasNextInt();
            if (isNumber) {
                do {
                    if (numero >= MINNUM && numero <= MAXNUM) {
                        numero = sc.nextInt();
                    } else {
                        System.out.println(MSG3);
                        contador++;
                        sc.next();
                    }
                } while (numero < MINNUM || numero > MAXNUM && contador < ENDBYERROR);
            } else {
                System.out.println(ERROR);
                sc.next();
                contador++;
            }
        } while (!isNumber && contador < ENDBYERROR);
        if (contador == ENDBYERROR) {
            System.out.println(LOTTAERRORS);
        }
        return numero;
    }
}
