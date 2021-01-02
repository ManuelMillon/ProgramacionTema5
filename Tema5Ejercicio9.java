/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * Manuel Mill�n
 *
 */
public class Tema5Ejercicio9 {

	/**
	 * Programa que diga cu�ntos d�gitos tiene un n�mero introducido por teclado.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el n�mero para calcular sus d�gitos: ");
		int numero = teclado.nextInt();
		int numeroDeDigitos = 1;

		
		while (numero => 10) { // Mientras se cumple la condici�n
			numero /= 10;     // de la operaci�n, numeroDeDigitos crece 1 desde 1.
			numeroDeDigitos++;
		}
		int numero0 = numero;
		System.out.println(numero0 + " tiene " + numeroDeDigitos + " d�gitos.");
	}

}
