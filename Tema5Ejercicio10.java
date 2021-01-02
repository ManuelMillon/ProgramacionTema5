/**
 * 
 */
package paquetetema5;
import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;
/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio10 {

	/**
	 * Escribe un programa que calcule la media de un conjunto de números positivos
	 * introducidos por teclado. A priori, el programa no sabe cuántos números se
	 * introducirán. El usuario indicará que ha terminado de introducir los datos
	 * cuando meta un número negativo.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double numeros = 0;
		double numeroIntroducido = 0;
		double suma = 0;
		
		System.out.println("Introduce los números para calcular su media: ");
		System.out.print("Introduce los números para calcular su media pulsando enter. Acabe con un negativo: ");

		
		while (numeroIntroducido >= 0) {
			numeroIntroducido = teclado.nextDouble();
			numeros++;
			suma += numeroIntroducido;
		}
		System.out.println("");
		
		
	}

}
