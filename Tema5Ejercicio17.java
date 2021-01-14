/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio17 {

	/**
	 * Realiza un programa que sume los 100 n�meros siguientes a un n�mero entero
	 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
	 * es correcto (que es un n�mero positivo).
	 */
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Introduce un n�mero para sacar los 100 siguientes: ");
		int numeroIntroducido = Integer.parseInt(kboard.nextLine());
		
		if (numeroIntroducido <= 0) {
			System.out.println("El n�mero introducido es negativo.");
		} else {
			for (int i = (numeroIntroducido + 1); i <= (numeroIntroducido + 100); i++) {
			System.out.println("La suma es de " + i + ".");
			}
		}

	}

}
