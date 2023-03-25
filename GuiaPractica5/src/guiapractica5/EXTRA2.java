/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica5;

import java.util.Scanner;

/**
 *
 * @author majoc
 */
public class EXTRA2 {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales 
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vectorA = new int [10];
        int [] vectorB = new int [10];
        
        for (int i=0; i<10; i++) {
            vectorA[i]= (int) ((Math.random())*10);
        }
        
        for (int i=0; i<10; i++) {
            System.out.print("["+vectorA[i]+"]");
        }
        System.out.println("");
        
        for (int i=0; i<10; i++) {
            vectorB[i]= (int)((Math.random())*10);
        }
        
        for (int i=0; i<10; i++) {
            System.out.print("["+ vectorB[i]+ "]");
        }
        
        System.out.println("");
        
        
        for (int i=0; i<10;i++){
            if (vectorA[i] != vectorB[i]) {
                System.out.println("Los vectores NO son IGUALES!");
                break;
            } else {
                System.out.println("Los vectores SON IGUALES!");
            }
        }
        
    }
    
}
