/**
 * 
 */
package tema5Ejercicios;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio11 {

	/**
	 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
	 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Mete un número para calcular el cuadrado y el cubo de los 5 siguientes: ");
		int numero = teclado.nextInt();
		for (int i = numero; i < numero + 5; i++) {
			System.out.println((i + 1) + " || " + (i + 1) * (i + 1) + " || " + (i + 1) * (i + 1) * (i + 1));
		}

	}

}
