
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
public class EJ3 {

    /**
     * @param args the command line arguments
     * Realizar un programa que solo permita introducir solo frases o palabras
     * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
     * deberá de imprimir un mensaje por pantalla que diga "CORRECTO" en caso contrario,
     * se deberá imprimir "INCORRECTO". Nota: investigar la función Lenght() en Java.
  
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String frase = leer.nextLine();
       int longitud= (frase.length());
        //System.out.println(longitud);
       if (longitud==8){
           System.out.println("CORRECTO");
       } else {
           System.out.println("INCORRECTO");
       }
       
    }
    
}
