/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica2;

import java.util.Scanner;

/**
 *
 * @author majoc
 */
public class Ejemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        EsMultiplo(num1,num2);
       
                
    }
    public static void EsMultiplo(int a, int b) {
        int resultado= a%b;
         if (resultado==0) {
             System.out.println(a + " es multiplo de " + b);
         } else {
              System.out.println(a + " NO es multiplo de " + b);
         }
        
    }
    
}
