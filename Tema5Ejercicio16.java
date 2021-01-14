/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * Manuel Millón
 *
 */
public class Tema5Ejercicio16 {

	/**
	 * Escribe un programa que diga si un número introducido por teclado es o no
	 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
	 * unidad.
	 */

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Introduce un número para ver si es primo: ");
		int numero = Integer.parseInt(kboard.nextLine());
		int contador = 2;
		boolean primo = true;

		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
			primo = false;
			contador++;
		}
		if  (primo == false){
			System.out.println("El número " + numero + " no es primo");			
		} else {
			System.out.println("El número " + numero + " es primo");	
		}
		
		

	}

}
