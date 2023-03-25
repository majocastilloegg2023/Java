
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
public class EJ7 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositvo RS232, este tipo de dispositvo
     * lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen
     * que ser de un máximo de 5 caracteres de largo, el primer caracter tiene que ser X y
     * el último tiene que ser O.
     * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
     * "&&&&&" marca el final de los envios (llamemosla FDE), y toda secuencia distinta de FDE, que
     * no respete el formato se considera incorrecta.
     * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
     * e incorrectas recibidas. Para resolver el ejercicio deberá investigar como se utilizan las siguientes
     * funciones de java. Substring(), Legth(), equals()
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String FDE="&&&&&";
        String cadena;
        int bandera=0;
       int contador1=0; //contador de cadenas correctas
       int contador2=0; //contador de cadenas incorrectas
               
        do {
            System.out.println("Ingrese la cadena");
            cadena = leer.nextLine();
            int longitud=cadena.length();
            String primera=cadena.substring(0,1);
            //System.out.println(primera);
            String ultima=cadena.substring(longitud-1,longitud);
            //System.out.println(ultima);
            if (cadena.equals(FDE)){
                bandera=1; 
            }
            if (longitud <= 5 && primera.equals("X") && ultima.equals("O")){
                contador1=contador1+1;            
            } else {
                contador2=contador2+1;
            }
            
        } while (bandera==0);
        System.out.println("Cantidad de lecturas correctas: " + contador1);
        System.out.println("Cantidad de lecturas incorrectas: " + contador2);
        
    }
    
}
