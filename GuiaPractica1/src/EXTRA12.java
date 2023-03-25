
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
public class EXTRA12 {

    /**
     * @param args the command line arguments
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestra
     * numeros del 0-0-0 al 9-9-9, con la particularidad que cada vez que 
     * aparezca un 3 lo sustituya por una E, por ejemplo:
     * 0-0-0    0-1-2
     * 0-0-1    0-1-E
     * 0-0-2
     * 0-0-E
     * 0-0-4
     * 
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        numCadena();
        
    }
    public static void numCadena () {
        String iCadena, jCadena, kCadena;
        String numCadena="";
        
        for (int i=0; i<=9; i++) {
            iCadena=String.valueOf(i);
            if (iCadena.equals("3")) {
                iCadena="E";
            }
            numCadena=numCadena.concat(iCadena+ "-");
            for (int j=0; j<=9; j++){
                jCadena=String.valueOf(j);
                if (jCadena.equals("3")){
                    jCadena= "E";
                }
                numCadena=numCadena.concat(jCadena + "-");
                for (int k=0; k<=9; k++){
                    kCadena=String.valueOf(k);
                    if (kCadena.equals("3")) {
                        kCadena= "E";
                    }
                    numCadena=numCadena.concat(kCadena);
                    System.out.println(numCadena);
                    System.out.println(" ");
                }
            }
        }
    }
}
