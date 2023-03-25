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
public class EXTRA3 {

    /**
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios, 
     * pasándole un arreglo por parámetro. Después haremos otra función 
     * o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector");
        int N = leer.nextInt();
        
    }
    public static void llenarVector(int N) {
        int [] vector= new int [N];
        for (int i=0; i<N; i++) {
            vector[i]=(int)((Math.random())*10);
        }
    }
}
