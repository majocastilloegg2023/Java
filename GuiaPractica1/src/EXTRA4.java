
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
public class EXTRA4 {

    /**
     * @param args the command line arguments
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
     * y se muestre su equivalente en romano.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un número");
        numero = leer.nextInt();
        
        switch (numero){
            case 1:
                System.out.println("I");break;
            case 2:
                System.out.println("II");break;
            case 3:
                System.out.println("III");break;
            case 4:
                System.out.println("IV");break;
            case 5: 
                System.out.println("V");break;
            case 6:
                System.out.println("VI");break;
            case 7:
                System.out.println("VII");break;
            case 8:
                System.out.println("VIII");break;
            case 9:
                System.out.println("IX");break;
            case 10:
                System.out.println("X");break;
            default:
                System.out.println("No tengo un valor para el número ingresado :( ");
         
        }
    }
    
}
