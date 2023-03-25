
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author majoc
 */
public class Clase3Ejemplos {

    /**
     * @param args the command line arguments
     * EJERCICIO DE IF/ELSE ejemplo guia teorica
     * Implementar un programa que le pida dos números enteros al usuario y
     * determine si ambos o algunos de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new  Scanner(System.in);
        System.out.println("Ingese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        
        if (num1>25){
            System.out.println("El número ingresado " + num1 + " es mayor a 25");
        }
        else if (num2>25){
            System.out.println("El número ingresado " + num2 + " es mayor a 25");   
        }
        else {
           System.out.println("Ninguno de los números ingresados es mayor a 25");
          
    }

                
    }
    
}
