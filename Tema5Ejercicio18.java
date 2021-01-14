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
	 * Escribe un programa que obtenga los números enteros comprendidos entre dos
	 * números introducidos por teclado y validados como distintos, el programa debe
	 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
	 * 7.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int numero1 = Integer.parseInt(kboard.nextLine());
		System.out.print("Introduce el segundo número: ");
		int numero2 = Integer.parseInt(kboard.nextLine());
		
		for (int i = numero1; i <= numero2; i += 7) {
			System.out.println( i );
		}
	}

}
