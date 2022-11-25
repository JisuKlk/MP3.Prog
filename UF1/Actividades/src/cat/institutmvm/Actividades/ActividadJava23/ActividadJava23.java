/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava23;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava23 {

    //・ ═══════『 ヾ(•ω•`)o・Constantes con los Integers 』═══════ //
    private final static int SIZE = 2;
    private final static int MINEDAD = 0;
    private final static int MAXEDAD = 99;

    //・ ═══════『 (●'◡'●)・Constantes con los mensajes del sistema 』═══════ //
    private final static String BIENVENIDA = "Bienvenido a la base de datos MVM, introduzca sus datos.";
    private final static String MSG1 = "Introduzca su edad, debe ser un numero entero";
    private final static String MSG2 = "Introduzca su sexo: \nH para hombre\nM para mujer";
    private final static String MSG3 = "Introduzca su salario con decimales";
    private final static String MSG4 = "Es usted un becario?";
    private final static String ERRORENTERO = "Error en los datos, debe ser un numero entero!";

    public static void main(String[] args) {

        //・ ═══════『 (●'◡'●)・Preparamos el scanner 』═══════ //
        Scanner sc = new Scanner(System.in);

        //・ ═══════『 (~˘▾˘)~・Declaramos las arrays 』═══════ //
        int[] arrayEdad = new int[SIZE];
        char[] arraySexo = new char[SIZE];
        float[] arraySalario = new float[SIZE];
        boolean[] arrayBecario = new boolean[SIZE];

        //・ ═══════『 (~˘▾˘)~・Declaramos el resto de variables 』═══════ //
        boolean isValidate;       //・ Usamos booleanos para comprovar si el numero es entero, si es cierto/falso o si es decimal! ・//
        System.out.println(BIENVENIDA);     //・ Ps printamos el sistema de bienvenida, k va a ser si no ¬_¬ ・//

        //・ ═══════『 (~˘▾˘)~・EMPEZAMOS BUCLE! 』═══════ //
        for (int i = 0; i < arrayEdad.length; i++) {
            do {
                System.out.println(MSG1);
                isValidate = sc.hasNextInt();     //・ El booleano comprueba que el numero es entero, si no lo es, salta al else
                if (isValidate) {     //・ Si es entero, tira pa' dentro
                    arrayEdad[i] = sc.nextInt();      //・ Aquí pilla el numero y lo mete en la variable ◔ ⌣ ◔
                } else {        //・ (Aqui salta si no es entero! Da error... toca probar de nuevo!)
                    System.out.println(ERRORENTERO);
                    sc.next();
                }
            } while (!isValidate || arrayEdad[i] < MINEDAD || arrayEdad[i] > MAXEDAD);        //・ Y aquí la condición para que el bucle se repita si está fuera de los rangos

            do {
                System.out.println(MSG2);
                isValidate = sc.hasNext();     //・ El booleano comprueba que el numero es entero, si no lo es, salta al else
                if (isValidate) {     //・ Si es entero, tira pa' dentro
                    arraySexo[i] = sc.next().charAt(0);      //・ Aquí pilla el numero y lo mete en la variable ◔ ⌣ ◔
                    if (arraySexo[i] == 'H' || arraySexo[i] == 'M') {
                        arraySexo[i] = Character.toLowerCase(arraySexo[i]);
                    }
                } else {        //・ (Aqui salta si no es entero! Da error... toca probar de nuevo!)
                    System.out.println(ERRORENTERO);
                    sc.next();
                } //System.out.println(arraySexo[i]);       //Print test para comprobar por donde entra el codigo
            } while (!isValidate && (arraySexo[i] != 'h' || arrayEdad[i] != 'm'));        //・ Y aquí la condición para que el bucle se repita si está fuera de los rangos

            do {
                System.out.println(MSG1);
                isValidate = sc.hasNextInt();     //・ El booleano comprueba que el numero es entero, si no lo es, salta al else
                if (isValidate) {     //・ Si es entero, tira pa' dentro
                    arrayEdad[i] = sc.nextInt();      //・ Aquí pilla el numero y lo mete en la variable ◔ ⌣ ◔
                } else {        //・ (Aqui salta si no es entero! Da error... toca probar de nuevo!)
                    System.out.println(ERRORENTERO);
                    sc.next();
                }
            } while (!isValidate || arrayEdad[i] < MINEDAD || arrayEdad[i] > MAXEDAD);        //・ Y aquí la condición para que el bucle se repita si está fuera de los rangos



        }
    }
}
