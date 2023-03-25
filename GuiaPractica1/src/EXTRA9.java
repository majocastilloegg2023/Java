
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
public class EXTRA9 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        resta(num1,num2);
    }
    public static void resta(int num1,int num2){
        int resto, cociente;
        resto=num1;
        cociente=0;
        
        while (resto>=num2) {
            resto=resto-num2;
            cociente++;
        }
        System.out.println("Dado que " +resto + " es menor que " + num2 + " entonces: el residuo es "+ resto+ " y el cociente es: " + cociente);
                
    }
}
