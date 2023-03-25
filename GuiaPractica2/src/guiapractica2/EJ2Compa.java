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
public class EJ2Compa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args) {
		printPersonas();
	}
	
	public static void printPersonas() {
		String nombre,opc;
		int edad;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		do {
			System.out.println("Ingrese el nombre de la persona y su edad");
			nombre = sc.next();
			edad = sc.nextInt();
			nombre.concat(" ");
			System.out.println("Nombre de la persona: "+nombre);
			if(edad>18) {
				System.out.println("Es mayor de edad: SI");
			}else {
				System.out.println("Es mayor de edad: NO");
			}
			System.out.println("Quiere seguir mostrando personas");
			opc = sc2.nextLine();
			if(opc.equalsIgnoreCase("No")) {
				System.out.println("Hasta luego");
			}else if(opc.equalsIgnoreCase("Si")) {
					System.out.println("Continue...");
			
			}

			
		}while(!opc.equalsIgnoreCase("No"));
	}
    
}
