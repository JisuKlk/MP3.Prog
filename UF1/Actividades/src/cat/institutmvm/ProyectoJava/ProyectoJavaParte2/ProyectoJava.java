/*
 * Click nbfs://・nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://・nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cat.institutmvm.ProyectoJava.ProyectoJavaParte2;

import java.util.Scanner;

public class ProyectoJava {

    // ・ ═══════『 ヾ(•ω•`)o・Constantes con los valores maximos y minimos del sorteo y el máximo de errores 』═══════ ・//
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

    // ・ ═══════『 (●'◡'●)・Constantes con los mensajes del sistema 』═══════ ・//
    private final static String BIENVENIDA = "Bienvenido al sistema de sorteos!\nSiga las instrucciones.\n";
    private final static String SELECTOR = "Cuantos clientes quieres introducir?.";
    private final static String MSG1 = "\nIntroduzca su identificador";
    private final static String MSG2 = "Introduzca su edad";
    private final static String MSG3 = "Introduzca su tipo de venta, pulse 0 para venta libre, pulse 1 para pensionista, pulse 2 si tiene carnet joven, pulse 3 si es socio";
    private final static String MSG4 = "Introduzca el importe de su compra ";
    private final static String MSG5 = "Introduzca su telefono";
    private final static String MSG7 = "  ID\t\tEDAD\t\tTIPO\t\tIMPORTE\t\tTELEFONO";
    private final static String MSG8 = "¿Quieres consultar por tipo de cliente? (si = 1, no = 0)";
    private final static String MSG9 = "¿Que tipo de cliente?";
    private final static String MSG10 = "Los datos son de tipo ";
    private final static String MSG11 = "No hay registros que mostrar";
    private final static String MSG12 = "¿Quieres un resumen estadístico? (si = 1, no = 0)";
    private final static String MSG13 = "Numero de registros: ";
    private final static String MSG14 = "La media de edad es: ";
    private final static String MSG15 = "Número de clientes por tipo";
    private final static String MSG16 = "Histograma: ";
    private final static String MSG17 = "Importe total acumulado: ";
    private final static String DESPEDIDA = "Ha finalizado el programa, muchas gracias";
    private final static String TIPOVENTA = "venta libre";
    private final static String TIPOPENSION = "pensionista";
    private final static String TIPOCARNETJOVEN = "carnet joven";
    private final static String TIPOSOCIO = "socio";
    private final static String ERROR = "Error en los datos!";
    private final static String MUCHOSERRORES = "Demasiados errores, intentelo de nuevo más tarde";
    private final static String SEPARADOR = "___________________________________________________________________________";

    public static void main(String[] args) {

        //・ ═══════『 (~˘▾˘)~・ Se declaran las variables básicas y el scanner 』═══════ ・//
        Scanner sc = new Scanner(System.in);
        int numeroClientes = 0, contador = 0, consultarTipo = 0, consultarResumen = 0, libre = 0, pension = 0, joven = 0, socio = 0, ok = 0, media = 0, total = 0;                                                                           //・ El numeroClientes hace de tamaño variable para las arrays indicada más abajo, el contador ps cuenta errores lol
        boolean isEntero, libreBooleano = false, pensionBooleano = false, jovenBooleano = false, socioBooleano = false, salir = false;                                                                                                                     //・ Booleanos, para comprobar si el numero es entero, etc. 
        System.out.println(BIENVENIDA);                                                                                 //・ Ps printamos el sistema de bienvenida, k va a ser si no ¬_¬
        
        //・ ═══════『 ￣へ￣・Loop en el que he valida si el numero es entero en el cual he gastado como media hora 』═══════ ・//
        do {
            System.out.println(SELECTOR);
            isEntero = sc.hasNextInt();
            if (isEntero) {
                numeroClientes = sc.nextInt();
            } else {
                System.out.println(ERROR);
                sc.next();
            }   
        } while (isEntero == false);

        //・ ═══════『 （￣︶￣）↗ ・ Se declaran las arrays que contendrán los datos de cada cliente 』═══════ ・//
        int[] arrayId = new int[numeroClientes];
        int[] arrayEdad = new int[numeroClientes];
        int[] arrayTipo = new int[numeroClientes];
        int[] arrayImporte = new int[numeroClientes];
        int[] arrayTlf = new int[numeroClientes];
        
        //・ ═══════『 (►__◄)・ Otro bucle para validar y meter valores en la array 』═══════ ・//
        for (int i = 0; i < arrayId.length; i++) {                                                              //・ Empieza el bucle
            do {        
                System.out.println(MSG1);
                isEntero = sc.hasNextInt();                                                                     //・ El booleano comprueba que el numero es entero, si no lo es, salta al else
                if (isEntero) {                                                                                          //・ Si es entero, tira pa' dentro
                    arrayId[i] = sc.nextInt();                                                                      //・ Aquí pilla el numero y lo mete en la variable ◔ ⌣ ◔
                    if (arrayId[i] < MINID || arrayId[i] > MAXID) {                                        //・ Si esta fuera de los limites indicados en las constantes... ERROR! ᕙ(⇀‸↼‶)ᕗ
                        System.out.println(ERROR);
                        contador++;                                                                                     //・ Si da error, el contador aumenta, ya que solo permitimos 3 errores en el codigo! ⚆ _ ⚆
                    }
                } else {                                                                                                      //・ (Aqui salta si no es entero! Da error... toca probar de nuevo!)
                    System.out.println(ERROR);
                    sc.next();
                }
            } while ((!isEntero || arrayId[i] < MINID || arrayId[i] > MAXID) && contador < ENDBYERRORS);        //・ Y aquí la condición para que el bucle se repita si está fuera de los rangos

            if (contador < ENDBYERRORS) {                                                                       //・ Recordamos que el programa solo funcionará si el usuario no pasa del limite de errores, por tanto, a todo le añadimos un if para comprobar si se ha pasado y parar el programa ಠ⌣ಠ
                contador = 0;
                do {                                                                                                             //・ Esto ya se repite sin más, para todas las arrays, por lo que no comentaré cada de esta
                    System.out.println(MSG2);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        arrayEdad[i] = sc.nextInt();
                        if (arrayEdad[i] < MINEDAD || arrayEdad[i] > MAXEDAD) {
                            System.out.println(ERROR);
                            contador++;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }
                } while ((!isEntero || arrayEdad[i] < MINEDAD || arrayEdad[i] > MAXEDAD) && contador < ENDBYERRORS);
            }
            if (contador < ENDBYERRORS) {
                contador = 0;
                do {
                    System.out.println(MSG3);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        arrayTipo[i] = sc.nextInt();
                        if (arrayTipo[i] < MINTIPO || arrayTipo[i] > MAXTIPO) {
                            System.out.println(ERROR);
                            contador++;
                        }
                        switch (arrayTipo[i]) {                                                                     //・ Aquí tenemos 4 opciones, por lo que usamos un switch, si el usuario pone un 0, saltará "LIBRE", pq arriba en constantes está marcado así (si pone algo que no es de entre 1-4, salta error por los limitadores de arriba ≧☉_☉≦)
                            case LIBRE:
                                arrayTipo[i] = LIBRE;
                                break;
                            case PENSIONISTA:
                                arrayTipo[i] = PENSIONISTA;
                                break;
                            case CARNETJOVEN:
                                arrayTipo[i] = CARNETJOVEN;
                                break;
                            case SOCIO:
                                arrayTipo[i] = SOCIO;
                                break;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }

                } while ((!isEntero || arrayTipo[i] < MINTIPO || arrayTipo[i] > MAXTIPO) && contador < ENDBYERRORS);
            }
            if (contador < ENDBYERRORS) {
                contador = 0;
                do {
                    System.out.println(MSG4);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        arrayImporte[i] = sc.nextInt();
                        if (arrayImporte[i] < MINIMPORTE || arrayImporte[i] > MAXIMPORTE) {
                            System.out.println(ERROR);
                            contador++;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }
                } while ((!isEntero || arrayImporte[i] < MINIMPORTE || arrayImporte[i] > MAXIMPORTE) && arrayImporte[i] < ENDBYERRORS);
            }
            if (contador < ENDBYERRORS) {
                contador = 0;
                do {
                    System.out.println(MSG5);
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        arrayTlf[i] = sc.nextInt();
                        if (arrayTlf[i] < MINTLF || arrayTlf [i]> MAXTLF) {
                            System.out.println(ERROR);
                            contador++;
                        }
                    } else {
                        System.out.println(ERROR);
                        sc.next();
                    }
                } while ((!isEntero || arrayTlf[i] < MINTLF || arrayTlf[i] > MAXTLF) && contador < ENDBYERRORS);
            }
            if (contador == 3) {                                                                                    //・ Si se pasan de fallos, salta este mensajito tan majo de aquí que te indica que eres bobo :D
                System.out.println(MUCHOSERRORES);
            } else {
                System.out.println("\nID: " + arrayId[i] + "\nEdad: " + arrayEdad[i] + "\nTipo de Venta: " + arrayTipo[i] + "\nImporte: " + arrayImporte[i] + "\nTelefono: " + arrayTlf[i]);        //・ Y aquí al final, te devuelve los datos que has puesto, fin (✿´‿`)
            }
        }

        System.out.println("\nDatos de los clientes:\n");
        System.out.println(SEPARADOR + "\n");
        System.out.println(MSG7);
            for (int i = 0; i < arrayEdad.length; i++) {
                if (arrayEdad[i] > MINEDAD && arrayEdad[i] < MAXEDAD) {
                    System.out.print("  " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t");
                    switch (arrayTipo[i]) {                                                                         //・ En este switch vamos a almacenar cuantos clientes son de X tipo
                        case 0:
                            System.out.print("Libre");
                            libre++;
                            libreBooleano = true;
                            break;
                        case 1:
                            System.out.print("Pension");
                            pension++;
                            pensionBooleano = true;
                            break;
                        case 2:
                            System.out.print("Joven");
                            joven++;
                            jovenBooleano = true;
                            break;
                        case 3:
                            System.out.print("Socio");
                            socio++;
                            socioBooleano = true;
                            break;
                    }
                    System.out.print("\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i] + "\n");
                }
            }
            System.out.println(SEPARADOR);
            System.out.println("\n" + MSG13 + numeroClientes + "\n");
            System.out.println("\n" + MSG8);
            salir = false;
            do {
                isEntero = sc.hasNextInt();
                if (isEntero) {
                    consultarTipo = sc.nextInt();
                    if (consultarTipo == 1 || consultarTipo == 0) {                                         //・ Aqui validamos si el cliente quiere o no salir del programa, si el numero es 1 o 0, lo pilla, si no, error
                        salir = true;
                    } else {
                        System.out.println(ERROR);                                                                //・ Si el numero no es 1 o 0, o no es entero, te va a dar error!
                    }
                } else {
                    sc.next();
                    System.out.println(ERROR);
                }
            } while (salir != true);                                                                                        //・ Como arriba hemos dicho que "salir = false", y solo cambiará a true cuando el numero sea 1 o 0, el bucle no parará hasta que se valide de forma correcta
            if (consultarTipo == 1) {
                System.out.println(MSG9);
                salir = false;
                do {
                    isEntero = sc.hasNextInt();
                    if (isEntero) {
                        consultarTipo = sc.nextInt();
                        for (int i = 0; i < arrayEdad.length; i++) {
                            switch (consultarTipo) {
                                case 0:
                                    System.out.println(MSG10 + TIPOVENTA);
                                    System.out.println(SEPARADOR + "\n");
                                    salir = true;                                    
                                    break;
                                case 1:
                                    System.out.println(MSG10 + TIPOPENSION);
                                    System.out.println(SEPARADOR + "\n");
                                    salir = true;                                    
                                    break;
                                case 2:
                                    System.out.println(MSG10 + TIPOCARNETJOVEN);
                                    System.out.println(SEPARADOR + "\n");
                                    salir = true;                                    
                                    break;
                                case 3:
                                    System.out.println(MSG10 + TIPOSOCIO);
                                    System.out.println(SEPARADOR + "\n");
                                    salir = true;                                    
                                    break;
                                default:
                                    System.out.println(ERROR);
                                    break;
                            }
                            i = 100;
                        }
                    } else {
                        sc.next();
                        System.out.println(ERROR);
                    }
                } while (salir != true);
                for (int i = 0; i < arrayEdad.length; i++) {                                                                                                //・ En este bucle, se van a re-ordenar los valores según el tipo de cliente
                    for (int k = i + 1; k < arrayEdad.length; k++) {
                        if (arrayEdad[i] > arrayEdad[k]) {
                            int auxiliarCambio = arrayEdad[i];
                            arrayEdad[i] = arrayEdad[k];
                            arrayEdad[k] = auxiliarCambio;
                            auxiliarCambio = arrayId[i];
                            arrayId[i] = arrayId[k];
                            arrayId[k] = auxiliarCambio;
                            auxiliarCambio = arrayTipo[i];
                            arrayTipo[i] = arrayTipo[k];
                            arrayTipo[k] = auxiliarCambio;
                            auxiliarCambio = arrayImporte[i];
                            arrayImporte[i] = arrayImporte[k];
                            arrayImporte[k] = auxiliarCambio;
                            auxiliarCambio = arrayTlf[i];
                            arrayTlf[i] = arrayTlf[k];
                            arrayTlf[k] = auxiliarCambio;
                        }
                    }
                }
                for (int i = 0; i < arrayEdad.length; i++) {                                                                                                //・ Comprueba si está dentro
                    if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                        if (arrayTipo[i] == consultarTipo) {
                            System.out.println(MSG7);
                            i = 100;
                            ok = 1;
                        }
                    }
                }
                if (ok == 0) {
                    for (int i = 0; i < arrayEdad.length; i++) {                                                                                                //・ Aqui te avisa de si no hay registros
                        if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                            if (arrayTipo[i] != consultarTipo) {
                                System.out.println(MSG11);
                                i = 100;
                            }
                        }
                    }
                }
                for (int i = 0; i < arrayEdad.length; i++) {                                                                                                        //・ Te printará exactamente lo que quieras, si el tipo es 0, irá al case 0 y te printará el tipo "Libre"
                    if (arrayTipo[i] == consultarTipo) {
                        if (arrayTlf[i] > MINTLF && arrayTlf[i] < MAXTLF) {
                            switch (arrayTipo[i]) {
                                case 0:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Libre" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                                case 1:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Pension" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                                case 2:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Joven" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                                case 3:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Socio" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                            }
                        }
                    }
                }
            } else {
                    System.out.println(DESPEDIDA);
            }
            salir = false;                                                                                                                                                              //・ Marcamos "salir" como falso de nuevo, ya que antes se marca como verdadero, debemos poner que es falso así lo podemos reutilizar (o cambiar el while a un == true y en el if lo marcamos como false, pero yo lo he preferido así pq considero que está mas ordenado)
            System.out.println("\n" + MSG12 + "\n");
            do {
                isEntero = sc.hasNextInt();
                if (isEntero) {
                    consultarResumen = sc.nextInt();
                    if (consultarResumen == 1 || consultarResumen == 0) {                                                                                        //・ Solo te pilla 0 o 1, que usaremos para saber si el cliente quiere o no, el resumen
                        salir = true;
                    } else {
                        System.out.println(ERROR);
                    }
                } else {
                    sc.next();
                    System.out.println(ERROR);
                }
            } while (salir != true);
            if (consultarResumen == 1) {
                System.out.println(MSG13 + arrayEdad.length);
                for (int i = 0; i < arrayEdad.length; i++) {
                    media = media + arrayEdad[i];                                                                                                                       //・ Hace media de usuarios
                }
                System.out.println(MSG14 + media/numeroClientes + " años");                                                                          //・ Printa la media
                System.out.println(MSG15 + "\n");
                if (libreBooleano == true) {
                    System.out.println(TIPOVENTA + ":" + " " + libre);
                }
                if (pensionBooleano == true) {
                    System.out.println(TIPOPENSION + ":" + " " + pension);
                }
                if (jovenBooleano == true) {
                    System.out.println(TIPOCARNETJOVEN + ":" + " " + joven);
                }
                if (socioBooleano == true) {
                    System.out.println(TIPOSOCIO + ":" + " " + socio);
                }
                System.out.println(MSG16);
                if (libre != 0) {
                    System.out.print(TIPOVENTA);                                                                                                                         //・ Printa el histograma
                    for (int i = 0; i < arrayEdad.length; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (pension != 0) {
                    System.out.print(TIPOPENSION);
                    for (int i = 0; i < pension; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (joven != 0) {
                    System.out.print(TIPOCARNETJOVEN);
                    for (int i = 0; i < joven; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                if (socio != 0) {
                    System.out.print(TIPOSOCIO);
                    for (int i = 0; i < socio; i++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 0; i < arrayEdad.length; i++) {
                    total = total + arrayImporte[i];
                }
                System.out.println("\n" + MSG17 + total);
            } 
            else {
                System.out.println(DESPEDIDA);                                                                                                                          //・ Printa un mensaje de despedida, indicando que se ha finalizado el programa
            }
    }
}