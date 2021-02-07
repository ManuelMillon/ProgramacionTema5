/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio38 {

	/**
	 * Ejercicio 38
	 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
	 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
	 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Introduzca una altura: ");
		int alturaMetida = s.nextInt();
		int altura = 1;
		int espacioVacio= 0;
		int i = 0;
		int relleno = alturaMetida;
		
		if ((alturaMetida < 4) || (alturaMetida %2 == 0)) {
			System.out.println("Altura incorrecta. Debe ser mayor que 3 e impar.");
		} else {
			
			while (altura < (alturaMetida / 2) + 1) {
				for (i = 0; i < espacioVacio; i++) {
					System.out.print(" ");
				}
				for (i = 0; i < relleno; i++) {
					System.out.print("*");
				}			
				System.out.println();
				altura++;
				espacioVacio++;
				relleno -= 2;
				
			}
			espacioVacio = alturaMetida / 2;
			relleno =  1;
			altura = 1;
			while (altura <= (alturaMetida / 2) + 1) {
				for (i = 0; i < espacioVacio; i++) {
					System.out.print(" ");
				}
				for (i = 0; i < relleno; i++) {
					System.out.print("*");
				}
				System.out.println();
				altura++;
				espacioVacio--;
				relleno += 2;
			}
			
		}
	}

}
	
	
	