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
	 * pedir la altura. Se debe comprobar que la altura sea un n�mero impar mayor o
	 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
	 * 
	 * PENDIENTE
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Introduce la altura de la X a pintar:");
		System.out.print(">");
		int alturaMetida = kboard.nextInt();

		int i = 0;
		int altura = 1;
		int espaciosPorDentro = alturaMetida - 1;
		int espaciosPorFuera = 0;

		if ((alturaMetida < 3) || (alturaMetida % 2 == 0)) {
			System.out.print("Lo siento, los datos son incorrectos");

		} else {
			while (altura < alturaMetida / 2 + 1) { // Eje vertical. altura = 1, 2, 3, 4... Si se introduce el 9, no llega al 5 desde 0. Lo hace 4 veces.

				for (i = 0; i < espaciosPorFuera; i++) {
					System.out.print(" ");			// espacios = 0, 1, 2, 3, 4...
				}
				System.out.print("*");				// línea de asterisco
				
				for (i = 1; i < espaciosPorDentro; i++) {
					System.out.print(" ");			// espacios interiores = altura -2. Decrece 2: 7, 5, 3, 1, No hace nada 
				}									// 
				System.out.print("*");				// línea de asterisco
				System.out.println();
				altura++;
				espaciosPorFuera++;
				espaciosPorDentro -= 2;
			}
			
			espaciosPorFuera = alturaMetida / 2;
			espaciosPorDentro = 0;
			altura = 1;
			while (altura <= alturaMetida / 2 + 1) {
				for (i = 1; i <= espaciosPorFuera; i++) {
					System.out.print(" ");
				}
				System.out.print("*");

				for (i = 1; i < espaciosPorDentro; i++) {
					System.out.print(" ");
				}

				if (altura > 1) {
					System.out.print("*");
				}
				System.out.println();
				altura++;
				espaciosPorFuera--;
				espaciosPorDentro += 2;
			}
		}
	}
}

