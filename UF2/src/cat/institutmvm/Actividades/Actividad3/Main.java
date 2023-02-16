/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad3;

import java.util.Scanner;


/**
 *
 * @author alumne_1r
 */
public class Main {
    private final static int CUOTA = 6;
    private final static float PRECIOMINIMO = 0.1f;
    private final static float PRECIOMAXIMO = 0.3f;
    private final static String MSG1 = "¿Cuantos litros has consumido este mes?";
    private final static String FACTURA = "Factura: ";
    private final static String ERRORNEGATIVO = "¿Como vas a consumir litros negativos?";
    private final static String ERRORENTERO = "Error en los datos";

    public static void main(String[] args) {
        Main validate = new Main();
        int numero = validate.numeroPositivo();
        if (numero < 0) {
            System.out.println(ERRORNEGATIVO);
        } else {
            if (numero <= 50) {
                System.out.println(FACTURA + CUOTA);
            }
            if (numero > 50 && numero <= 200) {
                System.out.println(FACTURA + (CUOTA + numero * PRECIOMINIMO));
            }
            if (numero > 200) {
                System.out.println(FACTURA + (CUOTA + numero * PRECIOMAXIMO));
            }
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
                System.out.println(ERRORENTERO);
                sc.next();
            }
        } while (!isNumber);
        return numero;
    }
}
