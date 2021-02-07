/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio36 {

	/**
	 * Ejercicio 36
	 * Escribe un programa que diga si un número introducido por teclado es o no
	 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
	 * programa debe aceptar números de cualquier longitud siempre que lo permita
	 * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
	 * long en lugar de int ya que el primero admite números más largos.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduce un número para ver si es capicúa: ");
		int numeroIntroducido = s.nextInt();
		int numero = numeroIntroducido;
		int volteado = 0;
		
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /=10;
		}
			
		if (volteado == numeroIntroducido) {
			System.out.println("El número " + numeroIntroducido + " es capicúa.");
		} else {
			System.out.println("El número " + numeroIntroducido + " NO es capicúa.");
		}

	}

}
