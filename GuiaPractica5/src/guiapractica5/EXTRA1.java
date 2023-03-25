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
public class EXTRA1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos 
     * de un vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos");
        int N = leer.nextInt();
        int [] vector = new int [N];
        System.out.println("Ingrese los números que desea introducir en el vector");
        int suma=0;
        
        for (int i=0; i<N; i++){
            int num = leer.nextInt();
            vector[i]= num;
            suma=suma+vector[i];
        }
        System.out.println("La suma de todos los números del vector es: " + suma);
        
    }
    
}
