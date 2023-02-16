/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad18;

import cat.institutmvm.utils.DataValidation;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
    private final static String DATAINPUT = "Introduce un string";
    private final static String DATAINPUT2 = "Que carácter quieres buscar?";
    
    public static void main(String[] args) {
        DataValidation inputString = new DataValidation();
        DataValidation inputChar = new DataValidation();
        String msg;
        char data;
        Scanner sc = new Scanner(System.in);
        msg = inputString.stringValidation(DATAINPUT, sc);
        //System.out.println(msg);
        data = inputChar.charValidation(DATAINPUT2, sc);
    }
}
