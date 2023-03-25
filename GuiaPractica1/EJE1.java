/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica1;

import java.util.Scanner;

/**
 *
 * @author majoc
 */
public class GuiaPractica1 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número");
       num = leer.nextInt();
       
       if (num%2==0) {
           System.out.println("El número ingresado " + num + " es PAR");
       } else  {  
           System.out.println("El número ingresado " + num + " es IMPAR");
       }   

    }
    
}
