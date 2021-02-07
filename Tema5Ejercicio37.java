/**
 * 
 */
package paquetetema5;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Usuario
 *
 *         Ejercicio 37 Realiza un conversor del sistema decimal al sistema de
 *         “palotes”
 */
public class Tema5Ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		int numero = s.nextInt();

		int aux = numero;
		int contadorDigitos = 0;
		int numeroAlReves = 0;

		while (aux > 0) { // Doy la vuelta al número.
			numeroAlReves = ((numeroAlReves * 10) + (aux % 10));
			aux /= 10;
			contadorDigitos++;
		}
		int cifra = 0; // Creo la variable que creará los palotes.

		for (int i = 0; i < contadorDigitos; i++) {
			cifra = numeroAlReves % 10; // Digo el número de palotes a crear por número.
			numeroAlReves /= 10;
			for (int j = 0; j < cifra; j++) { //
				System.out.print("|");
			}
			if (i < contadorDigitos - 1) { // Separa los números con guiones cuando se imprimen todos los palotes.
				System.out.print("-"); // de cada dígito.
			}
		}

	}

}
