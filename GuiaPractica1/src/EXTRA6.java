
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
public class EXTRA6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas
     * que se encuentran por debajo de 1.60mts y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       float altura,acumulador1, acumulador2;
       int N, contador1, contador2;
       acumulador1=0;
       acumulador2=0;
       contador1=0; contador2=0;
        System.out.println("Ingrese la cantidad de alturas a ingresar");
        N = leer.nextInt();
        
        System.out.println("Ingrese las alturas");
        
        for (int i=1; i<=N; i++){
            altura= leer.nextFloat();
            
            if (altura<1.60){
                contador1=contador1+1;
                acumulador1=acumulador1+altura;
            }else{
                contador2=contador2+1;
                acumulador2=acumulador2+altura;
            }
        }
        System.out.println("El promedio de alturas que se encuentra por debajo del 1.60 es: " + (acumulador1/contador1));
        System.out.println("El promedio de alturas que se encuentra por encima del 1.60 es: " + (acumulador2/contador2));
    }
    
}
