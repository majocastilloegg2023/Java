
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
public class EXTRA8 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es
     * múltiplo de cinco debe detener la lectura y mostrar la cantidad de números 
     * leidos, la cantidad de números pares y la cantidad de números impares.
     * Al igual que en el ejercicio anterior los números negativos no deben 
     * sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        esMultiplo();
    }
    public static void esMultiplo() {
        Scanner leer = new Scanner(System.in);
        int num,contador,contador1,contador2;
        contador=0;
        contador1=0;
        contador2=0;
        //num=0;
        System.out.println("Ingresar números");
        num = leer.nextInt();
        
        while (num%5!=0) {
            //num = leer.nextInt();
            if (num>0) {
                contador=contador+1;
            }else{
                break;
            }
            
            if (num%2==0){
                contador1=contador1+1;
            }else{
                contador2=contador2+1;
            }
            
           num = leer.nextInt();
        }
        System.out.println("La cantidad de números ingresados: " +contador);
        System.out.println("La cantidad de números pares ingresados: " +contador1);
        System.out.println("La cantidad de números impares ingresados: " +contador2);
    }
        
}
