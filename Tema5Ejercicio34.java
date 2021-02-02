/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio34 {

	/**
	 * Ejercicio 34 
	 * 
	 * Escribe un programa que pida dos números por teclado y que luego
	 * mezcle en dos números diferentes los dígitos pares y los impares. Se van
	 * comprobando los dígitos de la siguiente manera: primer dígito del primer
	 * número, primer dígito del segundo número, segundo dígito del primer número,
	 * segundo dígito del segundo número, tercer dígito del primer número… Para
	 * facilitar el ejercicio, podemos suponer que el usuario introducirá dos
	 * números de la misma longitud y que siempre habrá al menos un dígito par y uno
	 * impar. Usa long en lugar de int donde sea necesario para admitir números
	 * largos.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un primer número: ");
		long numero1 = s.nextLong();
		System.out.println("Introduce un segundo número: ");
		long numero2 = s.nextLong();
		
		long numeroa = numero1;
		long numerob = numero2;
		long volteado1 = 0;
		long longitud = 0;
		
		if (numeroa == 0) {
			longitud = 1;
		}
		
		while (numeroa > 0) {
			volteado1 = (volteado1 * 10) + (numeroa % 10);
			numeroa /=10;
			longitud++;
			}
		
		System.out.println(volteado1);
		
		numerob = numero2;
		long volteado2 = 0;
		while(numerob > 0) {
			volteado2 = (volteado2 * 10) + (numerob % 10);
			numerob /= 10;
		}
		System.out.println(volteado2);

		long resultadosPares = 0;
		long resultadosImpares = 0;
		int digito1;
		int digito2;
		
		for (int i = 0; i < longitud; i++) {
			digito1 = (int) (volteado1 % 10);
			
			if ((digito1 % 2) == 0) {
				resultadosPares = (resultadosPares * 10) + digito1;
			} else {
				resultadosImpares = (resultadosImpares * 10) + digito1;
			}
			volteado1 /= 10;
			
			digito2 = (int) (volteado2 % 10);
			
			if ((digito2 % 2) == 0) {
				resultadosPares = (resultadosPares * 10) + digito2;
			} else {
				resultadosImpares = (resultadosImpares * 10) + digito2;
			}
			
			volteado2 /= 10;
		}
		
		System.out.println("El número formado por los pares es: " + resultadosPares);
		System.out.println("El número formado por los impares es: " + resultadosImpares);
	}
}