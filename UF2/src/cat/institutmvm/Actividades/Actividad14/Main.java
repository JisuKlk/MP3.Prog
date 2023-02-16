/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad14;
import cat.institutmvm.utils.DataValidation;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Main {
    private final static String DATAINPUT = "Introduce a number";
    private final static String MSG1 = "The number is on the list! It's: ";
    private final static String MSG2 = "The number isn't on the list!";
    private final static String MSG3 = "You don't trust me at all uh?, ok, here's the whole list, check it by yourself then:";
    private final static String FINALMSG1 = "Your number is: ";
    private final static String FINALMSG2 = ", see? I was right";
    private final static String ERROR = "You have an error there, try again!";
    private final static int SIZE = 10;
    
    public static void main(String[] args) {
        int value;
        boolean found = false;
        int[] arrayRandom = new int [SIZE];
        DataValidation entrada = new DataValidation();
        DataValidation math = new DataValidation();
        DataValidation search = new DataValidation();
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = math.randomNumberGenerator(200);
        }
        
        value = entrada.integerValidation(sc, DATAINPUT, ERROR);
        
        int i = 0;
        while ((i < arrayRandom.length) && !found) {
            found = search.valueSearch(arrayRandom[i], value);
            i++;
        }
        
        if (found) {
            System.out.println(MSG1 + value + "\n" + MSG3);
            for (i = 0; i < arrayRandom.length; i++) {
                System.out.println(arrayRandom[i]);
            }
        } else {
            System.out.println(MSG2 + "\n" + MSG3);
            for (i = 0; i < arrayRandom.length; i++) {
                System.out.println(arrayRandom[i]);
            }
        }
        System.out.println(FINALMSG1 + value + FINALMSG2);
    }
}
