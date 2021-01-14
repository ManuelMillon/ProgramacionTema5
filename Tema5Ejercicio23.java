/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio23 {

	/**
	 * Escribe un programa que permita ir introduciendo una serie indeterminada
	 * de números mientras su suma no supere el valor 10000. Cuando esto último
	 * ocurra, se debe mostrar el total acumulado, el contador de los números
	 * introducidos y la media.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		System.out.println(" Introduce números hasta superar los 10.000: ");
		
		int numeroIntroducido = 0; 
		int contador = 0;
		int suma = 0;


		do {
			numeroIntroducido = Integer.parseInt(kboard.nextLine());

			contador++;
			suma += numeroIntroducido;
			
		} while (suma <=10000) ;
		
		double contadorReal = ((double) suma / (double) contador);
		 
		System.out.println("La suma de números introducidos es " + suma);
		System.out.println("El total de números introducidos es " + contador);
		System.out.println("La media es " + contadorReal);
	}

}
