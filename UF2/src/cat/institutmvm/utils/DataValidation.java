    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alumne_1r
 */
public class DataValidation {
    
    public int integerValidation(Scanner sc, String dataInput, String error) {
        boolean isInteger;
        int value = 0;
        System.out.println(dataInput);
        do {
            isInteger = sc.hasNextInt();
            if (isInteger) {
                value = sc.nextInt();
            } else {
                System.out.println(error);
                sc.next();
            }
        } while (isInteger == false);
        return value;
    }

    public int randomNumberGenerator(int bound) {
        var rnd = new Random();
        return rnd.nextInt(bound + 1);
    }
    
    public boolean valueSearch(int num, int comp) {
        boolean found = false;
        if (num == comp) {
            found = true;
        } return found;
    }
    
    public String stringValidation(String dataInput, Scanner sc) {
        String msg;
        System.out.println(dataInput);
        msg = sc.next();
        return msg;
    }
    
    public char charAtValidation(String dataInput, Scanner sc, int charAt) {
        char msg;
        System.out.println(dataInput);
        msg = sc.next().charAt(charAt);
        return msg;
    }
    
    public char charValidation(String dataInput, Scanner sc) {
        char msg;
        System.out.println(dataInput);
        msg = sc.next().charAt(0);
        return msg;
    }

    public boolean rangeValidation(int num, int min, int max) {
        return (num<min || num>max)? false : true;
    }

    

    // Recursividad
    public int factorialRec (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRec(n-1);
        }
    }

    public int sumaRecusirva (int n) {
        if (1 == n) {
            return 1;
        } else {
            return n + sumaRecusirva(n-1);
        }
    }

    public void printarRecursiva (int n) {
        if (n == 0) {
            System.out.println("");
        } else {
            printarRecursiva(n-1);
        }
    }

    public void printarRecursivaInversa (int n) {
        if (n == 0) {
            System.out.println(""); 
        } else {
            System.out.println(n);
            printarRecursivaInversa(n-1);
        }
    }
}