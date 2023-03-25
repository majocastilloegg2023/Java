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
public class EJ4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado y con una 
     * función se lo pasamos por parámetro para que nos indique si es o no
     * un número primo, debe devolver true si es primo, sino false.
     * Un número primo es aquel que solo puede dividirse entre 1 y si mismo.
     * Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
     * 17 es primo. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int numero;
        System.out.println("Ingrese un número");
        numero = leer.nextInt();
        System.out.println(EsPrimo(numero));
    }
    public static boolean EsPrimo(int numero){
        int contador;
        contador=0;
        
        for (int i=1; i<= numero; i++){
            if (numero%i==0){
                contador=contador+1;
            }
        }
        if (contador>2) {
            return false;
        }
        return true;
    }
}
