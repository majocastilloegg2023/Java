
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
public class EjemploFor {

    /**
     * @param args the command line arguments
     * Realizar un programa que lea 4 números comprendidos entre 1 y  20 e imprimir
     * el número ingrado seguido de tantos asteriscos como indique su valor. Por ejemplo
     * 5 *****
     * 3 ***
     * 11 ***********
     * 2 **
     */
    public static void main(String[] args) {
        int num,acumulador;
        acumulador=0;       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 números comprendidos entre el 1 y 20, por favor");
               
        for (int i=1; i<=4; i++){
            num = leer.nextInt();
            if (num>0 && num<20){
                System.out.print(num);
                for (int j=0; j<num; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
                
            }else {
                i=i-1;
                System.out.println("Ingrese un número entre el 1 y 20, por favor");
            }
                
        }
        
    }
    
}
