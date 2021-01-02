6/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio19 {

	/**
	 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
	 * pedir por teclado. El carácter con el que se pinta la pirámide también se
	 * debe pedir por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nivel de la altura deseada en la pirámide: ");
		int alturaDeseada = teclado.nextInt();

		teclado.nextLine();
		System.out.println("Introduzca el carácter de relleno en la pirámide: ");
		String relleno = teclado.nextLine();

		int base = 1;
		int longitudDeLinea = 1;
		int espacios = alturaDeseada - 1;

		while (base <= alturaDeseada) {

			for (int i = 1; i <= espacios; i++)
				;
			{
				System.out.print("");
			}
			for (int i = 1; i <= longitudDeLinea; i++) {
				System.out.print(relleno);
			}

		System.out.println(" ");

		base++;
		espacios--;
		longitudDeLinea += 2;

		}

	}

}
