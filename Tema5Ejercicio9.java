/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * Manuel Millón
 *
 */
public class Tema5Ejercicio9 {

	/**
	 * Programa que diga cuántos dígitos tiene un número introducido por teclado.
	 */
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el número para calcular sus dígitos: ");
		int numero = teclado.nextInt();
		int numeroDeDigitos = 1;

		
		while (numero => 10) { // Mientras se cumple la condición
			numero /= 10;     // de la operación, numeroDeDigitos crece 1 desde 1.
			numeroDeDigitos++;
		}
		int numero0 = numero;
		System.out.println(numero0 + " tiene " + numeroDeDigitos + " dígitos.");
	}

}
