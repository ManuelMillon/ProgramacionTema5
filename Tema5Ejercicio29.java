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
	 * Escribe un programa que muestre por pantalla todos los n�meros enteros
	 * positivos menores a uno le�do por teclado que no sean divisibles entre otro
	 * tambi�n le�do de igual forma.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Pon un n�mero por teclado: ");
		int primerNumeroMetido = kboard.nextInt();
		
		System.out.print("Pon otro n�mero por teclado: ");
		int segundoNumeroMetido = kboard.nextInt();
		

		for (int i = primerNumeroMetido; i > 0; i--) {

			if ((i % segundoNumeroMetido) != 0) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
