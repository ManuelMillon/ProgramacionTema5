/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio20b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Introduce la altura de la pirámide: ");
		int alturaIntroducida = kboard.nextInt();
		System.out.println("Ahora el carácter de relleno de la pirámide: ");
		String relleno = kboard.next();
		int bordeExterior = alturaIntroducida - 1;
		int espacioInterior = 0;
		int altura = 1;
		
		while (altura < alturaIntroducida) {
			for (int i = 1; i < bordeExterior; i++) {
				System.out.print(" ");
			}
			System.out.print(relleno);
			
			for (int i = 1; i < espacioInterior; i++) {
				System.out.print(" ");
			}
			System.out.print(relleno);
			System.out.println();
			altura++;
			bordeExterior--;
			espacioInterior += 2;
			
		}
		for (int i = 1; i < alturaIntroducida * 2; i++)
			System.out.println(relleno);

		
		
		
		

	}

}
