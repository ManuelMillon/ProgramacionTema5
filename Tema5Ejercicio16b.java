/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio16b {

	/**
	 * Escribe un programa que diga si un n�mero introducido por teclado es o no
	 * primo. Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la
	 * unidad.Con FOR.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		boolean primo = true;
		System.out.print("Introduce un n�mero para ver si es primo: ");
		int numeroIntroducido = kboard.nextInt(); 
		for (int i = 2; i < numeroIntroducido; i++) {
			if (numeroIntroducido % i == 0) {
				primo = false;
			}
		}
		if (primo == true) {
			System.out.println("El n�mero " + numeroIntroducido + " es primo.");
		} else {
			System.out.println("El n�mero " + numeroIntroducido + " no es primo.");
		}


	}

}
