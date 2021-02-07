/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio39 {

	/**
	 * Ejercicio 39
	 * Escribe un programa que pida un número entero positivo por teclado y que
	 * muestre a continuación los números desde el 1 al número introducido junto
	 * con su factorial.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduce un número para calcular su factorial: ");
		int numero = s.nextInt();
		int factorial = 0;
		
		for (int i = 1; i <= numero; i++) {
			factorial = numero;
			
			for (int j = 1; j < i; j++) {
				factorial *= j;
			}
			
		}
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
