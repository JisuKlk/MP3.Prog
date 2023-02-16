/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.Actividades.Actividad15;

//import cat.institutmvm.utils.DataValidation;

/**
 *
 * @author alumne_1r
 */
public class Main {
    
    public static void main(String[] args) {
        boolean washable = false, delicate = false, fastWash = false, wool = false, white = false;
        int revolution = 0, washTime = 0;
        //DataValidation woolRevolution = new DataValidation();
        
        if (washable) {
            if (delicate && fastWash) {
                if (wool) {
                    revolution = 400;
                } else {
                    revolution = 600;
                }
            } else {
                if (white) {
                    revolution = 1200;
                } else {
                    revolution = 1000;
                }
            }
            if (revolution < 600) {
                washTime = 45;
            } else {
                if (revolution < 1000) {
                    washTime = 60;
                } else {
                    washTime = 90;
                }
            }
            System.out.println("Revolucions: " + revolution + "\nTemps: " + washTime);
        } else {
            System.out.println("MIRA LA ETIQUETA MANCOO");
        }
    }
}
