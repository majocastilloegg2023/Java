/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica5;

import java.util.Scanner;

/**
 *
 * @author majoc
 */
public class EXTRA4 {

    /**
     * @param args the command line arguments
     * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
     * por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado 
     * cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
     * Primer trabajo práctico evaluativo 10%
      Segundo trabajo práctico evaluativo 15%
      Primer Integrador 25%
      Segundo integrador 50%
      * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
      * Al final del programa los profesores necesitan obtener por pantalla la cantidad de 
      * aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double [] vector = new double [3];
        int contador1=0;
        int contador2=0;
                
        
        for (int i=0; i<3; i++) {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo");
            int nota1 = leer.nextInt();
            System.out.println("Ingrese la nota del segundo trabajo práctico evaluativo");
            int nota2 = leer.nextInt();
            System.out.println("Ingrese la nota del primer integrador");
            int nota3 = leer.nextInt();
            System.out.println("Ingrese la nota del segundo integrador");
            int nota4 = leer.nextInt();
            
            double notaProm=nota1*0.1+nota2*0.15+nota3*0.25+nota4*0.5;
            vector[i]=notaProm;
            
             if (vector[i]>=7){
               contador1 += +1;
            } else {
                contador2 += +1;
            }
        }
        
        //for (int i=0; i<3; i++) {
            //if (vector[i]>=7){
               //contador1 += +1;
           // } else {
                //contador2 += +1;
           // }
       // }
        
        System.out.println("La cantidad de alumnos aprobados: " + contador1);
        System.out.println("La cantidad de alumnos desaprobados: " + contador2);
    }
    
}
