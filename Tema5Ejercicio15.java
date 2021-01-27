/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número para ver sus potencias: ");
		int n = s.nextInt();
		int m = 0;
		for (int i = 0; i < 6; i++) {
			m = (int) Math.pow(n, i);
			System.out.print(m + " | ");
		}

	}

}
