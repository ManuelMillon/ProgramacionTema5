/**
 * 
 */
package paquetetema5;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio18 {

	/**
	 * Escribe un programa que obtenga los n�meros enteros comprendidos entre dos
	 * n�meros introducidos por teclado y validados como distintos, el programa debe
	 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
	 * 7.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Introduce el primer n�mero: ");
		int numero1 = Integer.parseInt(kboard.nextLine());
		System.out.print("Introduce el segundo n�mero: ");
		int numero2 = Integer.parseInt(kboard.nextLine());
		
		for (int i = numero1; i <= numero2; i += 7) {
			System.out.println( i );
		}
	}

}
