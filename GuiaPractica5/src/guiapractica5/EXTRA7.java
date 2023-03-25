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
public class EXTRA7 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        int n = leer.nextInt();
        int [] vector = new int [n];
        int suma=0;
        for (int i=0; i<n; i++) {
            if (i==0) {
                suma += +1;
                vector[i]=suma;
            } else if (i==1) {
                vector[i]=suma;
            } else {
                    vector[i]=vector[i-1]+vector[i-2];
                    }
        }
        
        for (int i=0; i<n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        
    }
    
}
