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
	 * Escribe un programa que muestre, cuente y sume los m�ltiplos de 3 que hay
	 * entre 1 y un n�mero le�do por teclado.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Escribe un n�mero para sumar y contar los m�ltiplos de 3: ");

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

		System.out.println("El n�mero de m�ltiplos del n�mero introducido es " + contador);
		System.out.println("La suma de estos n�mero es es de " + suma);

	}

}