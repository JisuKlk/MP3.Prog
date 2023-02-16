package cat.institutmvm.proyecto;

import java.util.Scanner;

import cat.institutmvm.utils.DataValidation;

public class Main {
    
    // ・ ═══════『 ヾ(•ω•`)o・ Constantes con los valores maximos y minimos del sorteo y el máximo de errores 』═══════ ・//
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
    private final static int NO = 0;
    private final static int SI = 1;
    private final static int RANDOM = 5000;
    
    // ・ ═══════『 (●'◡'●)・ Constantes con los mensajes del sistema 』═══════ ・//
    private final static String BIENVENIDA = "Bienvenido al sistema de sorteos!\nSiga las instrucciones.\n";
    private final static String SELECTOR = "Cuantos clientes quieres introducir?.";
    private final static String MSG1 = "\nIntroduzca su identificador";
    private final static String MSG2 = "Introduzca su edad";
    private final static String MSG3 = "Introduzca su tipo de venta, pulse 0 para venta libre, pulse 1 para pensionista, pulse 2 si tiene carnet joven, pulse 3 si es socio";
    private final static String MSG4 = "Introduzca el importe de su compra ";
    private final static String MSG5 = "Introduzca su telefono";
    private final static String MSG7 = "  ID\t\tEDAD\t\tTIPO\t\tIMPORTE\t\tTELEFONO\t\tNÚM.SORT";
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
    private final static String MSG18 = "Quieres realizar el sorteo? (si = 1, no = 0)";
    private final static String MSG19 = "El número premiado es el: ";
    private final static String MSG20 = "No hay ningún ganador :C\nEl número ganador és: ";
    private final static String DATOS = "\nDatos de los clientes:\n";
    private final static String DESPEDIDA = "Ha finalizado el programa, muchas gracias";
    private final static String TIPOVENTA = "venta libre";
    private final static String TIPOPENSION = "pensionista";
    private final static String TIPOCARNETJOVEN = "carnet joven";
    private final static String TIPOSOCIO = "socio";
    private final static String ERROR = "Error en los datos!";
    private final static String MUCHOSERRORES = "Demasiados errores, intentelo de nuevo más tarde";
    private final static String SEPARADOR = "___________________________________________________________________________________________________";

    public static void main(String[] args) {

        //・ ═══════『 (~˘▾˘)~・ Se declaran las variables básicas, el scanner y... ¡los métodos! 』═══════ ・//
        DataValidation inputInteger = new DataValidation();
        DataValidation auxiliar = new DataValidation();
        Scanner sc = new Scanner(System.in);
        int numeroClientes = 0, contador = 0, consultarTipo = 0, consultarResumen = 0, consultarSorteo = 0, libre = 0, pension = 0, joven = 0, socio = 0, ok = 0, media = 0, premio = 0, total = 0;                                                                        //・ El numeroClientes hace de tamaño variable para las arrays indicada más abajo, el contador ps cuenta errores lol
        boolean libreBooleano = false, pensionBooleano = false, jovenBooleano = false, socioBooleano = false, salir = false, rangeBoolean = false, validator, warning = false;                                                                                                                     //・ Booleanos, para comprobar si el numero es entero, etc. 
        System.out.println(BIENVENIDA);                                                                                             //・ Ps printamos el sistema de bienvenida, k va a ser si no ¬_¬

        //・ ═══════『 ￣へ￣・ Loop en el que he valida si el numero es entero en el cual he gasté como media hora en la segunda entrega (¡pero ahora en un metodo!) 』═══════ ・/
        numeroClientes = inputInteger.integerValidation(sc, SELECTOR, ERROR);
        
        //・ ═══════『 （￣︶￣）↗ ・ Se declaran las arrays que contendrán los datos de cada cliente, incluyendo, la nueva array para los números randoms 』═══════ ・//
        int[] arrayId = new int[numeroClientes];
        int[] arrayEdad = new int[numeroClientes];
        int[] arrayTipo = new int[numeroClientes];
        int[] arrayImporte = new int[numeroClientes];
        int[] arrayTlf = new int[numeroClientes];
        int[] arrayRnd = new int [numeroClientes];
        
        // ・ ═══════『 (●'◡'●)・Bucle 'for' que rellena TODAS las arrays』═══════ ・//
        for (int i = 0; i < arrayTlf.length; i++) {
            contador = 0;
            if (contador < ENDBYERRORS) {
                do {
                    arrayId[i] = inputInteger.integerValidation(sc, MSG1, ERROR);                                       //・ Metodo que valida el número 
                    rangeBoolean = auxiliar.rangeValidation(arrayId[i], MINID, MAXID);           
                    if (rangeBoolean == false) {                                                                                           //・ Si esta fuera de los limites indicados en las constantes... ERROR! ᕙ(⇀‸↼‶)ᕗ
                        System.out.println(ERROR);
                        contador++;                                                                                                             //・ Si da error, el contador aumenta, ya que solo permitimos 3 errores en el codigo! ⚆ _ ⚆
                    }
                } while (!rangeBoolean && contador < ENDBYERRORS);                                                     //・ Y aquí la condición para que el bucle se repita si está fuera de los rangos
            } else if (!warning) {                                                                                                              //・ Este elseif, hace que una vez te pases de errores, te avise, al avisarte, el 'warning' pasa a ser true, por lo que no te volverá a repetir el mismo mensaje
                System.out.println(MUCHOSERRORES);
                warning = true;
                numeroClientes = numeroClientes - 1;                                                                               //・ Más tarde, el programa te muestra el número de registros, si un registro queda invalido, se borra del registro, no se resta infinitamente gracias al 'warning'
            }
            if (contador < ENDBYERRORS) {
                do {
                        arrayEdad[i] = inputInteger.integerValidation(sc, MSG2, ERROR);
                        rangeBoolean = auxiliar.rangeValidation(arrayEdad[i], MINEDAD, MAXEDAD);
                        if (rangeBoolean == false) {
                            System.out.println(ERROR);
                            contador++;
                        }
                } while (!rangeBoolean && contador < ENDBYERRORS);
            } else if (!warning) {
                System.out.println(MUCHOSERRORES);
                warning = true;
                numeroClientes = numeroClientes - 1;
            }
            if (contador < ENDBYERRORS) {
                do {
                    arrayTipo[i] = inputInteger.integerValidation(sc, MSG3, ERROR);
                    rangeBoolean = auxiliar.rangeValidation(arrayTipo[i], MINTIPO, MAXTIPO);
                    if (rangeBoolean == false) {
                        System.out.println(ERROR);
                        contador++;
                    }
                    switch (arrayTipo[i]) {                                                                                                         //・ Aquí tenemos 4 opciones, por lo que usamos un switch, si el usuario pone un 0, saltará "LIBRE", pq arriba en constantes está marcado así (si pone algo que no es de entre 1-4, salta error por los limitadores de arriba ≧☉_☉≦)
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
                } while (!rangeBoolean && contador < ENDBYERRORS);
            } else if (!warning) {
                System.out.println(MUCHOSERRORES);
                warning = true;
                numeroClientes = numeroClientes - 1;
            }
            if (contador < ENDBYERRORS) {
                do {
                    arrayImporte[i] = inputInteger.integerValidation(sc, MSG4, ERROR);
                    rangeBoolean = auxiliar.rangeValidation(arrayEdad[i], MINIMPORTE, MAXIMPORTE);
                    if (rangeBoolean == false) {
                        System.out.println(ERROR);
                        contador++;
                    }
                } while (!rangeBoolean && contador < ENDBYERRORS);
            } else if (!warning) {
                System.out.println(MUCHOSERRORES);
                warning = true;
                numeroClientes = numeroClientes - 1;
            }
            if (contador < ENDBYERRORS) {
                do {
                    arrayTlf[i] = inputInteger.integerValidation(sc, MSG5, ERROR);
                    rangeBoolean = auxiliar.rangeValidation(arrayTlf[i], MINTLF, MAXTLF);
                    if (rangeBoolean == false) {
                        System.out.println(ERROR);
                        contador++;
                    }
                } while (!rangeBoolean && contador < ENDBYERRORS);
                arrayRnd[i] = inputInteger.randomNumberGenerator(RANDOM);
            } else if (!warning) {
                System.out.println(MUCHOSERRORES);
                warning = true;
                numeroClientes = numeroClientes - 1;
            }
        }
        System.out.println(DATOS);
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
                System.out.print("\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i] + "\t\t" + arrayRnd[i] + "\n");
            }
        }
        System.out.println(SEPARADOR);
        System.out.println("\n" + MSG13 + numeroClientes + "\n");
        System.out.println("\n");
        do {
            consultarTipo = inputInteger.integerValidation(sc, MSG8, ERROR);
            salir = inputInteger.rangeValidation(consultarTipo, NO, SI);
        } while (!salir);                                                                                        //・ Como arriba hemos dicho que "salir = false", y solo cambiará a true cuando el numero sea 1 o 0, el bucle no parará hasta que se valide de forma correcta
        if (consultarTipo == 1) {
            salir = false;
            do {
                consultarTipo =  inputInteger.integerValidation(sc, MSG9, ERROR);
                salir = inputInteger.rangeValidation(consultarTipo, MINTIPO, MAXTIPO);
                for (int i = 0; i < arrayTlf.length; i++) {
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
            } while (!salir);
            for (int i = 0; i < arrayTlf.length; i++) {
                for (int j = i + 1; j < arrayTlf.length; j++) {
                    if (arrayEdad[i] > arrayEdad[j]) {
                        int auxiliarCambio = arrayEdad[i];
                        arrayEdad[i] = arrayEdad[j];
                        arrayEdad[j] = auxiliarCambio;
                        auxiliarCambio = arrayId[i];
                        arrayId[i] = arrayId[j];
                        arrayId[j] = auxiliarCambio;
                        auxiliarCambio = arrayTipo[i];
                        arrayTipo[i] = arrayTipo[j];
                        arrayTipo[j] = auxiliarCambio;
                        auxiliarCambio = arrayImporte[i];
                        arrayImporte[i] = arrayImporte[j];
                        arrayImporte[j] = auxiliarCambio;
                        auxiliarCambio = arrayTlf[i];
                        arrayTlf[i] = arrayTlf[j];
                        arrayTlf[j] = auxiliarCambio;
                    }
                }
            }
            for (int i = 0; i < arrayTlf.length; i++) {
                validator = inputInteger.rangeValidation(arrayTlf[i], MINTLF, MAXTLF);
                if (validator) {
                    if (arrayTipo[i] == consultarTipo) {
                        System.out.println(MSG7);
                        i = 100;
                        ok = 1;
                    }
                }
            }
            if (ok == 0) {
                for (int i = 0; i < arrayTlf.length; i++) {
                    validator = false;
                    validator = inputInteger.rangeValidation(arrayTlf[i], MINTLF, MAXTLF);
                    if (validator) {
                        if (arrayTipo[i] != consultarTipo) {
                            System.out.println(MSG11);
                            i = 100;
                        }
                    }
                }
            }
            for (int i = 0; i < arrayTlf.length; i++) {
                if (arrayTipo[i] == consultarTipo) {
                    validator = false;
                    validator = inputInteger.rangeValidation(arrayTlf[i], MINTLF, MAXTLF);
                    if (validator) {
                        switch (arrayTipo[i]) {
                            case 0:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Libre" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i] + "\t\t" + arrayRnd[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                                case 1:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Pension" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i] + "\t\t" + arrayRnd[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                                case 2:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Joven" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i] + "\t\t" + arrayRnd[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                                case 3:
                                    System.out.println(" " + arrayId[i] + "\t\t" + arrayEdad[i] + "\t\t" + "Socio" + "\t\t" + arrayImporte[i] + "\t\t" + arrayTlf[i] + "\t\t" + arrayRnd[i]);
                                    System.out.println(SEPARADOR);
                                    break;
                        }
                    }
                }
            }
        }
        salir = false;
        System.out.println("\n");
        do {
            consultarResumen = inputInteger.integerValidation(sc, MSG12, ERROR);
            validator = inputInteger.rangeValidation(consultarResumen, NO, SI);
        } while (!validator);
        System.out.println("\n");
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
        System.out.println("\n");
        validator = false;
        do {
            consultarSorteo = inputInteger.integerValidation(sc, MSG18, ERROR);
            validator = inputInteger.rangeValidation(consultarSorteo, NO, SI);
        } while (!validator);
        if (consultarSorteo == 1) { 
            premio = inputInteger.randomNumberGenerator(RANDOM);
            validator = false;
            for (int i = 0; i < arrayRnd.length; i++) {
                if (arrayRnd[i] == premio) {
                    System.out.println(MSG19 + arrayId[i]);
                    validator = true;
                }
            }
            if (!validator) {
                System.out.println(MSG20 + premio);
            }
        } else {
            System.out.println(DESPEDIDA);
        }
    }
}