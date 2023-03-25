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
public class EJ2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e
     * imprima los datos de las personas ingresadas por teclado e indique
     * si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle
     * al usuario si quere seguir mostrando personas y frenar cuando el usuario ingrese 
     * la palabra No.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de datos");
        n = leer.nextInt();
       
        datos(n);
        
    }
    public static void datos(int n) {
        Scanner leer = new Scanner(System.in);
        String nombre,respuesta;
        //respuesta="si";
        String cadenaDato,edadCadena;
        cadenaDato="";
        int edad, i;
        i=0;
              
        while (i<n){
            i=i+1;
            System.out.println("Ingrese nombre");
            nombre=leer.nextLine();
            cadenaDato=cadenaDato.concat(nombre);
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            edadCadena=String.valueOf(edad);
            cadenaDato=cadenaDato.concat(" " + edad);
            if(edad<18){
                cadenaDato=cadenaDato.concat(" Menor de edad");
                
            }else{
                cadenaDato=cadenaDato.concat(" Mayor de edad");
            }
            System.out.println(cadenaDato);
            System.out.println("Quiere seguir ingresando datos?");
            respuesta= leer.next();
            
            if (!respuesta.equals("Si")) {
                break;
            }
            cadenaDato="";
        }
    }
}
