/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.ActividadJava16;

import cat.institutmvm.*;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class ActividadJava16 {
    
    private final static float CONVERSOR = 2.54F;
    private final static String MSG1 = "Introduce los centimetros";
    private final static String MSG2 = "En pulgadas son: ";
    private final static String ERROR = "Datos incorrectos...";
    
    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG1);
        num = sc.nextFloat();
        System.out.println(MSG2 + (CONVERSOR / num));
    }
}