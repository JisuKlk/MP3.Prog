/*
 * Click nbfs://・nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://・nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.ProyectoJava.ProyectoJavaParte1;

import java.util.Scanner;

public class ProjectoJava {

    //・ ═══════『 ヾ(•ω•`)o・Constantes con los valores maximos y minimos del sorteo y el máximo de errores 』═══════ //
    private final static int MINID = 111;
    private final static int MAXID = 999;
    private final static int MINEDAD = 14;
    private final static int MAXEDAD = 120;
    private final static int MINTIPO = 0;
    private final static int MAXTIPO = 3;
    private final static int MINIMPORTE = 0;
    private final static int MAXIMPORTE = 1000;
    private final static int MINTLF = 111111111;
    private final static int MAXTLF = 999999999;
    private final static int LIBRE = 0;
    private final static int PENSIONISTA = 1;
    private final static int CARNETJOVEN = 2;
    private final static int SOCIO = 3;
    private final static int ENDBYERRORS = 3;

    //・ ═══════『 (●'◡'●)・Constantes con los mensajes del sistema 』═══════ //
    private final static String BIENVENIDA = "Bienvenido al sistema de sorteos!\nSiga las instrucciones.\n";
    private final static String MSG1 = "Introduzca su identificador";
    private final static String MSG2 = "Introduzca su edad";
    private final static String MSG3 = "Introduzca su tipo de venta, pulse 0 para venta libre, pulse 1 para pensionista, pulse 2 si tiene carnet joveN, pulse 3 si es socio";
    private final static String MSG4 = "Introduzca el importe de su compra ";
    private final static String MSG5 = "Introduzca su telefono";
    private final static String ERROR = "Error en los datos!";
    private final static String MUCHOSERRORES = "Demasiados errores, intentelo de nuevo más tarde";

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int id = 0, edad = 0, tipo = 0, importe = 0, tlf = 0, contador = 0;     //・ Se declaran las varables (~˘▾˘)~
            boolean isEntero;       //・ Un booleano para comprovar si el numero es entero!
            System.out.println(BIENVENIDA);     //・ Ps printamos el sistema de bienvenida, k va a ser si no ¬_¬

            do {        //・ Empieza el bucle jeje
                System.out.println(MSG1);
                isEntero = sc.hasNextInt();     //・ El booleano comprueba que el numero es entero, si no lo es, salta al else
                if (isEntero) {     //・ Si es entero, tira pa' dentro
                    id = sc.nextInt();      //・ Aquí pilla el numero y lo mete en la variable ◔ ⌣ ◔
                    if (id < MINID || id > MAXID) {     //・ Si esta fuera de los limites indicados en las constantes... ERROR! ᕙ(⇀‸↼‶)ᕗ
                        System.out.println(ERROR);
                        contador++;     //・ Si da error, el contador aumenta, ya que solo permitimos 3 errores en el codigo! ⚆ _ ⚆
                    }

                } else {        //・ (Aqui salta si no es entero! Da error... toca probar de nuevo!)
                    System.out.println(ERROR);
                    sc.next();
                }

            } while ((!isEntero || id < MINID || id > MAXID) && contador < ENDBYERRORS);        //・ Y aquí la condición para que el bucle se repita si está fuera de los rangos

            if (contador < ENDBYERRORS) {       //・ Recordamos que el programa solo funcionará si el usuario no pasa del limite de errores, por tanto, a todo le añadimos un if para comprobar si se ha pasado y parar el programa ಠ⌣ಠ
                contador = 0;
                do {        //・ Esto ya se repite sin más, si no entiendes algo, mira los comentarios de arriba
                    System.out.println(MSG2);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        edad = sc.nextInt();
                        if (edad < MINEDAD || edad > MAXEDAD) {
                            System.out.println(ERROR);
                            contador++;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }
                } while ((!isEntero || edad < MINEDAD || edad > MAXEDAD) && contador < ENDBYERRORS);
            }
            if (contador < ENDBYERRORS) {
                contador = 0;
                do {
                    System.out.println(MSG3);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        tipo = sc.nextInt();
                        if (tipo < MINTIPO || tipo > MAXTIPO) {
                            System.out.println(ERROR);
                            contador++;
                        }
                        switch (tipo) {     //・ Aquí tenemos 4 opciones, por lo que usamos un switch, si el usuario pone un 0, saltará "LIBRE", pq arriba en constantes está marcado así (si pone algo que no es de entre 1-4, salta error por los limitadores de arriba ≧☉_☉≦)
                            case LIBRE:
                                tipo = LIBRE;
                                break;
                            case PENSIONISTA:
                                tipo = PENSIONISTA;
                                break;
                            case CARNETJOVEN:
                                tipo = CARNETJOVEN;
                                break;
                            case SOCIO:
                                tipo = SOCIO;
                                break;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }

                } while ((!isEntero || tipo < MINTIPO || tipo > MAXTIPO) && contador < ENDBYERRORS);
            }

            if (contador < ENDBYERRORS) {
                contador = 0;
                do {
                    System.out.println(MSG4);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        importe = sc.nextInt();
                        if (importe < MINIMPORTE || importe > MAXIMPORTE) {
                            System.out.println(ERROR);
                            contador++;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }
                } while ((!isEntero || importe < MINIMPORTE || importe > MAXIMPORTE) && importe < ENDBYERRORS);
            }
            if (contador < ENDBYERRORS) {
                contador = 0;
                do {
                    System.out.println(MSG5);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        tlf = sc.nextInt();
                        if (tlf < MINTLF || tlf > MAXTLF) {
                            System.out.println(ERROR);
                            contador++;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }
                } while ((!isEntero || tlf < MINTLF || tlf > MAXTLF) && contador < ENDBYERRORS);
            }
            if (contador == 3) {        //・ Si se pasan de fallos, salta este mensajito tan majo de aquí que te indica que eres bobo :D
                System.out.println(MUCHOSERRORES);
            } else {
                System.out.println("\nID: " + id + "\nEdad: " + edad + "\nTipo de Venta: " + tipo + "\nImporte: " + importe + "\nTelefono: " + tlf); //・ Y aquí al final, te devuelve los datos que has puesto, fin (✿´‿`)
            }
        }
    }
}
