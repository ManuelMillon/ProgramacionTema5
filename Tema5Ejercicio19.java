6/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio19 {

	/**
	 * Realiza un programa que pinte una pir�mide por pantalla. La altura se debe
	 * pedir por teclado. El car�cter con el que se pinta la pir�mide tambi�n se
	 * debe pedir por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nivel de la altura deseada en la pir�mide: ");
		int alturaDeseada = teclado.nextInt();

		teclado.nextLine();
		System.out.println("Introduzca el car�cter de relleno en la pir�mide: ");
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
