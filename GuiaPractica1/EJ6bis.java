
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
public class EJ6 {

    /**
     * @param args the command line arguments
     * Realizar un programa que pida dos números enteros positivos
     * por teclado y muestre por pantalla el siguiente menú: El usuario deberá ejegir
     * una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
     * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
     * si el usuario selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el sigueinte 
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona
     * el caracter S se sale del programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opcion, bandera;
        bandera=0;
        System.out.println("Ingrese dos números enteros positivos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("MENÚ");
        System.out.println("1.Sumar"
                + " " +
                " 2.Restar"
                + " " +
                "3.Multiplicar"
                + " " +
                "4.Dividir"
                + " " +
                "5.Salir");
        //System.out.println("Elija opción:");
            
        do {
            System.out.println("Elija la opcion");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La suma de los números ingresados es: " + (num1+num2)); break;
                case 2: 
                    System.out.println("La resta de los números ingresados es: " + (num1-num2)); break;
                case 3:
                    System.out.println("La multiplicación de los números ingresados es: " + (num1*num2)); break;
                case 4:
                    System.out.println("La división de los números ingresados es: " + (num1/num2)); break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String resp;
                    resp = leer.next();
                    if (resp.equals("S")) {
                        break;
                    } else {
                        opcion=0;
                    }
            }
            
        } while (opcion != 5 );
    }
    
}
