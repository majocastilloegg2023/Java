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
public class EXTRA6 {

    /**
     * @param args the command line arguments
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
     * a medida que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño 
     * de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será 
     * seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios 
     * no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n=20;
        String palabra;
        String [][] matriz = new String [n][n];
        
        boolean [] vector = new boolean [n];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                matriz[i][j]= String.valueOf((int)((Math.random())*10));
                System.out.print("[" + matriz[i][j]+ "]");
            }
            System.out.println("");
        }
        
        
        for (int i=0; i<5; i++){
            int ubicacion1;
            int ubicacion2;
            
           do {  
               System.out.println("Ingrese una palabra");
            palabra = leer.next();
            
            ubicacion1=(int)((Math.random())*n);
            
            if (i==0) {
                vector [ubicacion1] = true;
            } else {
                do {
                    ubicacion1=(int)((Math.random())*n);
                } while (vector [ubicacion1] == true) ;
            }
           
            ubicacion2=(int)((Math.random())*(n-palabra.length()));
    
           } while (palabra.length()>5 || palabra.length()<3);
           
           for (int j=0; j<n;j++){
               for (int k=0; k<n; k++){
                   if (k<palabra.length()){
                       matriz[ubicacion1][ubicacion2+k]=palabra.substring(k,k+1);
                       
                   }
               }
           }
               
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ matriz[i][j]+"]");
                
            }
            System.out.println("");
            
        }
     
    }
}
           
    
   


