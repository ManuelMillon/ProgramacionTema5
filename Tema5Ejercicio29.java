/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio29 {

	/**
	 * Escribe un programa que muestre por pantalla todos los números enteros
	 * positivos menores a uno leído por teclado que no sean divisibles entre otro
	 * también leído de igual forma.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Pon un número por teclado: ");
		int primerNumeroMetido = kboard.nextInt();
		
		System.out.print("Pon otro número por teclado: ");
		int segundoNumeroMetido = kboard.nextInt();
		

		for (int i = primerNumeroMetido; i > 0; i--) {

			if ((i % segundoNumeroMetido) != 0) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
