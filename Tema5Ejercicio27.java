/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio27 {

	/**
	 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
	 * entre 1 y un número leído por teclado.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Escribe un número para sumar y contar los múltiplos de 3: ");

		int numeroMetido = kboard.nextInt();
		int contador = 0;
		int i = 1;
		int suma = 0;

		for (i = 1; i <= numeroMetido; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
				contador++;
				suma += i;
			}
		}

		System.out.println("El número de múltiplos del número introducido es " + contador);
		System.out.println("La suma de estos número es es de " + suma);

	}

}