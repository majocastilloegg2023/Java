/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica2;

import java.util.Scanner;

/**
 *
 * @author majoc
 */
public class GuiaPractica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase; 
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        int longitud = frase.length();
        System.out.println(codificar(frase,longitud));
    }
    public static String codificar (String frase,int longitud) {
        String frase2; 
        frase2="";
        
        for (int i=0; i < (longitud); i++) {
            String letra= frase.substring(i, i+1);
            
            switch (letra.toLowerCase()) {
                case "a":
                    frase2=frase2.concat("@");
                    break;
                case "e":
                    frase2=frase2.concat("#");
                    break;
                case "i":
                    frase2=frase2.concat("$");
                    break;
                case "o":
                    frase2=frase2.concat("%");
                    break;
                case "u":
                    frase2=frase2.concat("*");
                    break;
                default:
                    frase2=frase2.concat(letra);
                    break;
            }
        }
        return frase2;
    }
}
