/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio28 {

	/**
	 * Escribe un programa que calcule el factorial de un n�mero entero le�do por
	 * teclado.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Escribe un n�mero para calcular su factorial: ");
		int numeroMetido = kboard.nextInt();
		int contador = 1;
		for (int i = numeroMetido; i > 0; i--) {
			contador *= i; 
		}
		System.out.print(contador);
	}

}
