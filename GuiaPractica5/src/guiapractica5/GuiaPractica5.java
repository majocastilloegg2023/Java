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
public class GuiaPractica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String vector[]=new String [5];
        String nombre;
             
        for (int i=0; i<5; i++) {
            vector[i]= nombre=leer.next();
        }
        for (int i=0; i<5; i++) {
            System.out.println("Nombre ingresado en la posición " + i + " es: " + vector[i]);
        }
    }
    
}
