/**
 * 
 */
package tema5Ejercicios;
import java.util.Scanner;
/**
 * @author Propietario
 *
 */
public class Tema5Ejercicio13 {

	/**
	 * Escribe un programa que lea una lista de diez números y determine cuántos
	 * son positivos, y cuántos son negativos.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		int i = 0;
		do {
		System.out.print("Escribe un número para ver si es negativo o positivo: ");
		int numero = kboard.nextInt();
		
		if (numero < 0) {
			System.out.println("El numero " + numero + " es negativo.");
		} 
		if (numero > 0) {
			System.out.println("El numero " + numero + " es positivo.");
		}
		if (numero == 0) {
			System.out.println("El cero no es ni positivo ni negativo.");
		}
		i++;
		} while (i <10);
	}

}
