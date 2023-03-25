
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
public class EJ8 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadro de N elementos por lado utilizando el caracter *
     * Por ejemplo si el cuadrado tiene 4 elementos por lado se deberá dibujar
     * lo sigueinte:
     * * * * *
     * *     *
     * *     *
     * * * * *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lado;
        System.out.println("Ingrese un número");
        lado = leer.nextInt();
        
        for (int i=0; i<=lado; i++ ){
            for (int j=0; j<=lado; i++){
                if (i==0 || i==lado){
                    System.out.println(" * ");
                } else {
                    System.out.println(" ");
                }
                
            }
        }
    }
    
}
