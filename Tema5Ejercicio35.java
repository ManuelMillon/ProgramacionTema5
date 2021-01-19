/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio35 {

	/**
	 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
	 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
	 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Introduce la altura de la X a pintar:");
		System.out.println(">");
		int alturaMetida = kboard.nextInt();
		int altura = 1;
		int espaciosInternos = alturaMetida - 1;
		int espaciosExternos = 0;

		if ((alturaMetida < 3) || (alturaMetida % 2 == 0)) {
			System.out.print("Error. Introduzca datos correctos");
		} else {
			while (altura < alturaMetida / 2 + 1) {
				for (int i = 1; i < espaciosExternos; i++) {
					System.out.print(" ");
				}

				System.out.print("*");

				for (int i = 1; i < espaciosInternos; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();

				altura++;
				espaciosInternos = -2;
				espaciosExternos++;

			}

			espaciosInternos = 0;
			espaciosExternos = alturaMetida/2;
			altura = 1;

			while (altura <= alturaMetida / 2 + 1) {
				for (int i = 1; i <= espaciosExternos; i++)
					System.out.print(" ");
				}
			
				System.out.print("*");

				for (int i = 1; i < espaciosInternos; i++) {
					System.out.print(" ");
				}
				
				if(altura>1) {
				System.out.print("*");
				}
				
				System.out.println();
				
				altura++;
				espaciosExternos--;
				espaciosInternos += 2;
			
		}
	}
}