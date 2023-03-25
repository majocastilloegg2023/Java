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
public class EJ2 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
     * y le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
     * se encuentra el numero y si se encuentra repetido.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        int N = leer.nextInt();
        int [] vector= new int[N];
        int contador=0;
       System.out.println("Ingrese el número que desea buscar");
        int num = leer.nextInt(); 
        
        for (int i=0; i<N; i++) {
            vector[i]=(int)((Math.random())*10);
            //System.out.println(vector[i]);
            if (vector[i]==num) {
                contador += +1;
                System.out.println("Sé encontró " + num + " en la posición " + i);
                
            } 
        }
       
        
        if (contador>=2) {
            System.out.println("El número se repitió " + contador + " veces");
        } else if (contador==1) {
            System.out.println("No se encuentra repetido el número ingresado");
        } else {
            System.out.println("El número ingresado no se encontró");
        }
         
        
        
        
        
        
        
            
    }
    
}
