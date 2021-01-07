/**
 * 
 */
package tema5Ejercicios;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio15 {

	/**
	 * Escribe un programa que dados dos números, uno real (base) y un entero
	 * positivo (exponente), saque por pantalla todas las potencias con base el
	 * numero dado y exponentes entre uno y el exponente introducido. No se deben
	 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
	 * 5, se deberán mostrar 21, 22, 23, 24 y 25.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.print("Introduzca un número real como base: ");
		double base = kboard.nextDouble();
		System.out.print("Introduzca un múmero entero como exponente: ");
		int exponenteFinal = kboard.nextInt();

		for (int i = 1; i <= exponenteFinal; i++) {
			int potencia = 1;
			int exponente = i;
			for (int j = 0; j < exponente; j++) {
				potencia *= base;
			}
			System.out.println(base + "^" + i + " = " + potencia);
		}

	}

}
