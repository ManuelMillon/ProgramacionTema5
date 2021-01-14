/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * Manuel Mill�n
 *
 */
public class Tema5Ejercicio16 {

	/**
	 * Escribe un programa que diga si un n�mero introducido por teclado es o no
	 * primo. Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la
	 * unidad.
	 */

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Introduce un n�mero para ver si es primo: ");
		int numero = Integer.parseInt(kboard.nextLine());
		int contador = 2;
		boolean primo = true;

		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
			primo = false;
			contador++;
		}
		if  (primo == false){
			System.out.println("El n�mero " + numero + " no es primo");			
		} else {
			System.out.println("El n�mero " + numero + " es primo");	
		}
		
		

	}

}
