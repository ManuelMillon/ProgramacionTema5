/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio25 {

	/**
	 * Ejercicio 25
	 * Realiza un programa que pida un número por teclado y que luego muestre ese
	 * número al revés.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int numeroIntroducido = kboard.nextInt();
		int numero = numeroIntroducido;
		int numeroVuelto = 0;
		while (numero > 0) {
			numeroVuelto = (numero % 10);
			numero /= 10;
			System.out.print(numeroVuelto);
		}
		System.out.println();


	}

}
