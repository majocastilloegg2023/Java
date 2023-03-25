
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
public class EXTRA1 {

    /**
     * @param args the command line arguments
     * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
     * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
     * su equivalente; 1 día, 2 horas.
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double minutos, horas, dias;
        System.out.println("Ingrese cantidad de minutos");
        minutos = leer.nextDouble();
        System.out.println("CONVERSIÓN");
        dias=Math.floor(minutos/1440);
        System.out.println("Días: " + dias);
        horas=(minutos/1440)-dias;
        System.out.println("Horas: " + (horas*24));
    }
    
}
