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
public class EJ1 {

    /**
     * @param args the command line arguments
     *  Crea una aplicación que le pida dos números al usuario y este 
     * pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación
     * debe tener una función para cada operación matemática y deben devolver
     * sus resultados para imprimirlo en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("El resultado es: " + (operacion(num1,num2)));
        
    }
    public static int operacion(int num1, int num2){
        Scanner leer = new Scanner(System.in);
        int resultado;
        resultado=0;
        int opcion;
        System.out.println("Que operación desea realizar?");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        
        opcion = leer.nextInt();
        
        switch (opcion) {
            case 1:
                resultado=num1+num2;break;
            case 2:
                resultado=num1-num2;break;
            case 3:
                resultado=num1*num2;break;
            case 4:
                resultado=num1/num2;break;
        }
        return resultado;
    }
}
