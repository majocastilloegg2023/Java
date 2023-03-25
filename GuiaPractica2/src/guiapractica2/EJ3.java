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
public class EJ3 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que a través de una función nos convierta una 
     * cantidad de euros introducida por teclado a otra moneda, estas pueden
     * ser dolares, yenes o libras. La función tendrá como parametros, la cantidad
     * de euros y la moneda a convertir que será una cadena, esteno no devolverá ningún
     * valor y mostrará un mensaje indicando el cambio. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        System.out.println("Ingrese cantidad de euros");
        euros = leer.nextDouble();
        String respuesta;
        System.out.println("CAMBIAR A:");
        System.out.println("Dolares");
        System.out.println("Yenes");
        System.out.println("Libras");
        respuesta = leer.next();
        cambio(euros, respuesta);
              
        
    }
    public static void cambio(double euros, String respuesta){
        
       switch (respuesta.toLowerCase()){
           case "dolares":
               System.out.println("A cambio dolar: "+ euros*1.28611);break;
           case "libras":
               System.out.println("A cambio libra: "+ euros*0.86);break;
           case "yenes":
               System.out.println("A cambio yenes: "+ euros*129.852);break;
           default:
               System.out.println("No tengo respuesta :(");break;
       }
        
    }
    
}
