/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio16b {

	/**
	 * Escribe un programa que diga si un número introducido por teclado es o no
	 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
	 * unidad.Con FOR.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		boolean primo = true;
		System.out.print("Introduce un número para ver si es primo: ");
		int numeroIntroducido = kboard.nextInt(); 
		for (int i = 2; i < numeroIntroducido; i++) {
			if (numeroIntroducido % i == 0) {
				primo = false;
			}
		}
		if (primo == true) {
			System.out.println("El número " + numeroIntroducido + " es primo.");
		} else {
			System.out.println("El número " + numeroIntroducido + " no es primo.");
		}


	}

}
