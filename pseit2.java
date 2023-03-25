
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
public class pseit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio1, precio2, precio3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio del arroz de VEA");
        precio1 = leer.nextDouble();
        System.out.println("Ingrese el precio del arroz de Hiper");
        precio2 = leer.nextDouble();
        System.out.println("Ingrese el precio del arroz del Nataly");
        precio3 = leer.nextDouble();
        System.out.println("El promedio del precio del arroz es: " + (precio1+precio2+precio3)/3 );
    }
    
}
