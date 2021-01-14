/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio20 {

	/**
	 * Igual que el ejercicio anterior pero esta vez se debe pintar una pir�mide
	 * hueca.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Por favor, introduzca la altura de la pir�mide: ");
		int alturaIntroducida = kboard.nextInt();
		System.out.print("Introduzca el car�cter de relleno: ");
		String relleno = kboard.next();
		int altura = 1;
		int i = 0;
		int espaciosPorDelante = alturaIntroducida - 1;
		int espaciosInternos = 0;
		while (altura < alturaIntroducida) {
			for (i = 1; i <= espaciosPorDelante; i++) {
				System.out.print(" ");
			}
			// pinta la l�nea
			System.out.print(relleno);
			
			// espacios interiores
			for (i = 1; i < espaciosInternos; i++) {
				System.out.print(" ");
			}
			// pinta otra vez la l�nea tras los espacios interiores
			if (altura > 1) {
				System.out.print(relleno);
			}
			System.out.println();
			altura++;
			espaciosPorDelante--;
			espaciosInternos += 2;
		} 
		
			// base de la pir�mide
		for (i = 1; i < altura * 2; i++) {
			System.out.print(relleno);
		}
	}
}
