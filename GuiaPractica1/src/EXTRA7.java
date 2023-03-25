
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
public class EXTRA7 {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
     * y el promedio de n números (n>0). El valor de n se solicitara al principio
     * del programa y los números serán introducidos por el usuario. Realice dos versiones
     * del programa, una usando el bucle ''while'' y otra con el bucle ''do-while''.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, num, acumulador,max,min,suma; 
        suma=0;
        acumulador=1;
        System.out.println("Ingrese la cantidad de números a introducir");
        n = leer.nextInt();
        System.out.println("Ingrese los valores");
        num = leer.nextInt();
        max=0;
        min=0;
        
        while (acumulador < n) {
            acumulador=acumulador+1;
            suma=suma+num;
            if (num>max){
                max=num;
            }
            if (min==0){
                min=num;
            }
            if (num <= min) {
                min=num;
            }  
           
            num = leer.nextInt();
            
        }
        System.out.println("El máximo número de los ingresados es: " + max);
        System.out.println("El mínimo número de los ingresados es: " + min);
        System.out.println("El promedio de los números ingresados es: " +(suma/n));
    }
    
}
