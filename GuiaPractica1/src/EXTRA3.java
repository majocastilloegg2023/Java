
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
public class EXTRA3 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cual se ingrese una letra y se detecte
     * si se trata de una vocal. Caso contrario mostrar un mensaje. 
     * Nota: investigar la función equals() de la clase String.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("U")) {
            System.out.println("La letra ingresada es una VOCAL");
        } else {
            System.out.println("La letra ingresada NO es una VOCAL");
        }
    }
    
}
