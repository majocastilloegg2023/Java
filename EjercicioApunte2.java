/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.apunte.pkg2;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class EjercicioApunte2 {

    /**
     * escribir un programa que pida tu nombre, lo guarde en una 
     * variable y lo muestre por pantalla.
     * @param args
     */
    public static void main(String[] args) {
       String nombre;
       Scanner leer = new Scanner(System.in);
        System.out.println("Como es tu nombre?");
        nombre = leer.next();
        System.out.println("Hola " + nombre);
    }
    
}
