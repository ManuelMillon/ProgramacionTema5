/**
 * 
 */
package paquetetema5;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio31 {

	/**
	 * Ejercicio 31 Realiza un programa que pinte la letra L por pantalla hecha con
	 * asteriscos. El programa pedirá la altura. El palo horizontal de la L tendrá
	 * una longitud de la mitad (división entera entre 2) de la altura más uno.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println("Introduce una altura para hacer una L");
		System.out.print("> ");
		int altura = kboard.nextInt();

		for (int i = 1; i < altura; i++) {
			System.out.println("*");
		}

		for (int i = 0; i < altura / 2 + 1; i++) {
			System.out.print("* ");

		}
		
		
		

	}

}
