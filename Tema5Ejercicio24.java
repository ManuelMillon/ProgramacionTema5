/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio24 {

	/**
	 * Ejercicio 24
	 * Escribe un programa que lea un número n e imprima una pirámide de números
	 * con n filas como en la siguiente figura:
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(kboard.next());

		int altura = 1;
		int i = 0;
		int j= 0;
		int espaciosPorDelante = alturaIntroducida - 1;

		while (altura < alturaIntroducida) {
			for (i = 1; i <= espaciosPorDelante; i++) {
				System.out.print(" ");
			}
			// pinta el primer bucle de relleno
			for (i = 1; i <= altura; i++) {
				System.out.print(i);
			}
			
			// pinto el segundo bucle de relleno
			for (j = alturaIntroducida -1; j < 0; j--) {
				System.out.print(j);
			}
			
			System.out.println();
			altura++;
			espaciosPorDelante--;
		} 
		// base de la pirámide
		for (i = 1; i < altura * 2; i++) {
			System.out.print(i);
		}
		for (j = i -1; j < 0; j--) {
			System.out.print(j);
		}
	}
}

	


