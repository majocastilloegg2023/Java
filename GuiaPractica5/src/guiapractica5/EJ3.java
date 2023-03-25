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
public class EJ3 {

    /**
     * @param args the command line arguments
     * Recorrer un vector de N enteros contabilizando cuántos números 
     * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector");
        int N = leer.nextInt();
        int [] vector = new int [N];
        String vectorCadena;
        int contador1=0, contador2=0 , contador3=0 , contador4=0 ,contador5=0;
        int num;
        
        for (int i=0; i<N; i++) {
            //vector[i]=(int)((Math.random())*10000);
            vector[i]= num=leer.nextInt();
            vectorCadena=String.valueOf(vector[i]);
            
            switch (vectorCadena.length()){
                case 1:
                    contador1 += +1;break;
                case 2:
                    contador2 += +1;break;
                case 3:
                    contador3 += +1;break;
                case 4:
                    contador4 += +1;break;
                case 5:
                    contador5 += +1;break;
            }
        }
           System.out.println("Cantidad de números de 1 dígito: " + contador1);    
           System.out.println("Cantidad de números de 2 dígito: " + contador2);
           System.out.println("Cantidad de números de 3 dígito: " + contador3);
           System.out.println("Cantidad de números de 4 dígito: " + contador4);
           System.out.println("Cantidad de números de 5 dígito: " + contador5);
    } 
    
}
