/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad16;

import cat.institutmvm.utils.DataValidation;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */

public class Main {
    
    private final static String DATAINPUT = "Introduce un string";
    
    public static void main(String[] args) {
        DataValidation entrada = new DataValidation();
        String msg;
        Scanner sc = new Scanner(System.in);
        msg = entrada.stringValidation(DATAINPUT, sc);
        System.out.println(msg);
    }
}
