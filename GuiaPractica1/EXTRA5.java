
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
public class EXTRA5 {

    /**
     * @param args the command line arguments
     * Una obra social tiene tres clases de socios:
     * ° Los socios tipo A abonan una cuota mayor, pero tiene un 50% de
     * descuento en todos los tipos de tratamientos.
     * ° Los socios tipo B abonan una cuota moderada y tienen un 35% de
     * descuentos para los mismos tratamientos que los socios del tipo A.
     * ° Los socios que menos aportan, los de tipo C, no reciben desucentos sobre
     * dichos tratamientos.
     * ° Solicite una letra (caracter) que represente la clase de un socio y luego
     * un valor real que represente el costo del tratamiento (previo al descuento) y determine
     * el importe en efectivo a pagar por dicho socio. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String socio;
        int costo;
        System.out.println("Ingrese el tipo de socio: ");
        socio = leer.next();
        System.out.println("Ingrese el monto del tratamiento: ");
        costo = leer.nextInt();
        
        switch (socio){
            case "A":
                System.out.println("El monto a pagar con descuento es de: " + (costo-costo*0.5));break;
            case "B":
                System.out.println("El monto a pagar con descuento es de: " + (costo-costo*0.35));break;
            case "C":
                System.out.println("Su categoria no tiene descuento");break;
            default:
                System.out.println("Tipo de socio ingresado INCORRECTO");
                
        }
        
    }
    
}
