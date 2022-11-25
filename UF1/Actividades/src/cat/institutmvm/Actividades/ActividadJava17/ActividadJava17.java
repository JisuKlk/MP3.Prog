package cat.institutmvm.Actividades.ActividadJava17;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumne_1r
 */
public class ActividadJava17 {
    
    private final static int CONVERSOR = 1048576;
    private final static String MSG1 = "Introduce los MB";
    private final static String MSG2 = "En bytes son: ";
    private final static String ERROR = "Datos incorrectos...";
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num = sc.nextInt();
        System.out.println(MSG2 + (CONVERSOR * num));
    }
}