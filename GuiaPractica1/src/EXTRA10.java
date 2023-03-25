
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
public class EXTRA10 {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una
     * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
     * El programa debe indicar al usuario si su respuesta es o no correcta.
     * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
     * su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar
     * la función Math.random() de Java.
     * 
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int resultado;
        System.out.println("Adivine el resultado: ");
        resultado = leer.nextInt();
        aleatorio(resultado);
    }
    public static void aleatorio(int resultado){
        Scanner leer= new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int producto=num1*num2;
        int i=1;
        
        while (i<=3){
            i++;
            if (resultado==producto) {
                System.out.println("ADIVINASTE!!! :)");
                break;
            }else{
                System.out.println("Intentalo de nuevo!");
                resultado = leer.nextInt();
            }
        }
        
        
    }
}
