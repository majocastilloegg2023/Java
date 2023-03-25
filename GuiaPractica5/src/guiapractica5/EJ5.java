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
public class EJ5 {

    /**
     * @param args the command line arguments
     * Realice un programa que compruebe si una matriz dada es antisimétrica. 
     * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
     * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
     * de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int [][] matrizA= new int [4][4];
        int [][] matrizB= new int [4][4];
        int num, contador=0;
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matrizA[i][j]= (int)((Math.random())*30-15);
                System.out.print(" "+ matrizA[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
       
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matrizB[j][i]= matrizA[i][j]*(-1);
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (matrizB[j][i] == matrizA[i][j]*(-1)) {
                    contador += +1;
                }
            }
        }
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(" "+ matrizB[i][j]+ " ");
            }
            System.out.println("");
        }
        
        if (contador==16) {
            System.out.println("LA MATRIZ ES ANTISIMETRICA ");
            
        } else {
            System.out.println("LA MATRIZ NO ES ANTISIMETRICA");
        }
    }
    
}
