
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
public class EXTRA2 {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones necesarias
     * para que: B tome el valor de C, C tome el valor A, A tome el valor de D 
     * y D tome el valor de B. Mostrar los valores iniciales y los valores finales
     * de cada variable. Utilizar solo una variable auxiliar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A=1,B=2,C=3,D=4; 
        int aux;
        System.out.println("VALORES INCIALES");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
        
        aux=C;
        C=A;
        A=D;
        D=B;
        B=aux;
        
         System.out.println("VALORES FINALES");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }
    
}
