/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author majoc
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
     * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
     * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int [][] matrizA= new int [4][4];
        int [][] matrizB= new int [4][4];
        int num;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matrizA[i][j]= (int)((Math.random())*10);
                System.out.print(" "+ matrizA[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matrizB[j][i]=matrizA[i][j];
            }
        }
        
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.print(" "+ matrizB[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    
}
