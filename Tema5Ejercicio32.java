/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio32 {

	/**
	 * Ejercicio 32
	 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
	 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
	 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
	 * números largos.
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		long numero= s.nextLong();
		long volteado = 0;
		int longitud = 0;
		if (numero == 0) {
			longitud = 1;
		}
		
		
		while  (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /=10;
			longitud++;
		}
		System.out.print("Dígitos pares: ");
			
		int digito = 0;
		int sumaPares = 0;
		for (int i = 0; i < longitud; i++) {
			digito = (int) (volteado %10);
			if ((digito % 2) == 0) {
				System.out.print(digito + " ");
				sumaPares += digito;
				}
				volteado /= 10;
				}

				System.out.println("\nSuma de los dígitos pares: " + sumaPares);
		
		
		
	}

}
