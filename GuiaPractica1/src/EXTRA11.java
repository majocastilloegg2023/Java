
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
public class EXTRA11 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero y devuelva el número de
     * dígitos que componen ese número. Por ejemplo, si introducimos el número 
     * 12345, el programa deberá devolver 5. Calcular la cantidad de digitos matemáticamente
     * utilizando el operador división. Nota: recordar que las variables de tipo entero
     * truncan los números o resultados.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println(cifras(num));
    }
    public static int cifras(int num){
        int u;
        int i=0;
        while (num>0) {
          i++;
          u=num%10;
          num=num/10;
        }
       return(i);
    } 
}
