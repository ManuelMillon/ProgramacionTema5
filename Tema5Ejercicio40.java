/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio40 {

	/**
	 * Ejercicio 40 Realiza un programa que pinte por pantalla un rombo hueco hecho
	 * con asteriscos. El programa debe pedir la altura. Se debe comprobar que la
	 * altura sea un número impar mayor o igual a 3, en caso contrario se debe
	 * mostrar un mensaje de error.
	 * 
	 * NO INICIADO
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Introduce la altura del rombo a pintar:");
		System.out.print(">");
		int alturaMetida = kboard.nextInt();

		int espaciosPorFuera = alturaMetida / 2;
		int espaciosPorDentro = 0;
		int altura = 1;
		int i = 0;

		if ((alturaMetida < 3) || (alturaMetida % 2 == 0)) {
			System.out.print("Lo siento, los datos son incorrectos");

		} else {
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
			i = 0;
			altura = 0;
			espaciosPorDentro = alturaMetida - 3;
			espaciosPorFuera = 1;

			while (altura < alturaMetida / 2) { 
				
				for (i = 1; i <= espaciosPorFuera; i++) {
					System.out.print(" "); 
				}
				System.out.print("*"); 

				for (i = 1; i < espaciosPorDentro; i++) {
					System.out.print(" "); 
				} 
				if (altura < alturaMetida / 2 - 1) {
					System.out.println("*");
				}

				altura++;
				espaciosPorFuera++;
				espaciosPorDentro -= 2;
			}
		}
	}

}