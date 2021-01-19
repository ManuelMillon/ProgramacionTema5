/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio33 {

	/**
	 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
	 * El programa pedirá la altura. Fíjate que el programa inserta un espacio y
	 * pinta dos asteriscos menos en la base para simular la curvatura de las
	 * esquinas inferiores.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Introduce la altura de la u:");
		System.out.print(">");
		int altura = kboard.nextInt();
		int espacio = altura - 2;

		do {
			
			for (int i = 0; i < altura-1; i++) {
							
				System.out.print("*");

				for (int j = 1; j <= espacio; j++) {
					System.out.print(" ");
			}
				System.out.println("*");
			}

		} while (altura < 1);

		System.out.print(" ");

		for (int n = 0; n <= espacio -1; n++) {
			System.out.print("*");
		}

	}

}
