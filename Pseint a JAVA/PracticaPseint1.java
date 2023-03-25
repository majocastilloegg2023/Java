
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
public class PracticaPseint1 {

    /**
     * @param args
     * Conocido el número en mátematica Pi pedir al usuario que ingrese
     * el valor del radio de una circunferencia y calcular y mostrar por pantalla
     * el área y perimetro
     */
    public static void main(String[] args) {
        
        double radio, area, perimetro;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio = leer.nextInt();
        area = Math.PI * Math.pow(radio,2);
        perimetro = 2*radio*Math.PI;
        System.out.println("El area es: " + area) ;
        System.out.println("El perimetro es: " + perimetro);
        
    
        
             
    }
    
}
