/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio17 {

	/**
	 * Realiza un programa que sume los 100 números siguientes a un número entero
	 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
	 * es correcto (que es un número positivo).
	 */
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Introduce un número para sacar los 100 siguientes: ");
		int numeroIntroducido = Integer.parseInt(kboard.nextLine());
		
		if (numeroIntroducido <= 0) {
			System.out.println("El número introducido es negativo.");
		} else {
			for (int i = (numeroIntroducido + 1); i <= (numeroIntroducido + 100); i++) {
			System.out.println("La suma es de " + i + ".");
			}
		}

	}

}
