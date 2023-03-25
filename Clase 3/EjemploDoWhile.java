
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
public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea 20 números.Si el número leído es igual a cero 
     * se debe salir del bucle y mostrar el mensaje "Se capturó el número cero". El programa
     * deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número
     * es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int acumulador=0;
        int contador=0;
        do {
            System.out.println("Ingrese un número");
            num1 = leer.nextInt();
           acumulador=acumulador+1;
           if (num1>0) {
               contador=contador+num1;
           }
           else if (num1 == 0){
                System.out.println("Se capturó un número cero"); 
                break;
            }     
        } while (acumulador!=20);
         
      System.out.println("La sumatoria de los números ingresados es " + contador);   
       
    }
    
}
