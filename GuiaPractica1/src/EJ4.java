
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
public class EJ4 {

    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra y valide si la primera
     * letra de esa frase es una A. Si la primera es una A se deberá de imprimir un mensaje
     * por pantalla que diga CORRECTO, en caso contrario, se deberá imprimir INCORRECTO.
     * Nota: investigar la funcion Substring y equals() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine(); 
        String subcadena = frase.substring(0, 1);
        System.out.println(subcadena);
        if (subcadena.equals("A")){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }
    
}
