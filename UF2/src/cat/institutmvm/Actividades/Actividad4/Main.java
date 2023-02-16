/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad4;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
    
    private final static String MSG1 = "Introduce un valor natural";
    private final static String MSG2 = "El valor es natural: ";
    private final static String ERROR = "El valor debe ser natural";
    private final static String LOTTAERRORS = "Te has pasa'o de errores";
    private final static int ENDBYERROR = 3;
    
    public static void main(String[] args) {
        Main validate = new Main();
        int numero = validate.numeroNatural();
        if (numero > 0) {
            System.out.println(MSG2 + numero);
        }
    }

    public int numeroNatural() {
        int numero = 0, contador = 0;
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
                contador++;
            }
        } while (!isNumber && contador < ENDBYERROR);
        if (contador == ENDBYERROR) {
            System.out.println(LOTTAERRORS);
        }
        return numero;
    }
}
