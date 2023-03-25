
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
public class EJ5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y 
     * a continuación solicite números al usuario hasta que la suma de los números
     * introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num1; 
        int acumulador=0;
        System.out.println("Ingrese un límite positivo");
        num = leer.nextInt();
        System.out.println("Introduzca números");
        do {
            num1 = leer.nextInt();
           if (num1<0) {
               break;
           } else  {
               acumulador=acumulador+num1;  
           }
        } while (acumulador<=num);
        System.out.println("La sumatoria de los números ingresados es " + acumulador + " y es mayor a " + num);
    }
    
}
