/**
 * 
 */
package tema5Ejercicios;

import java.util.Scanner;

/**
 * @author Propietario
 *
 */
public class Tema5Ejercicio7 {

	/**
	 * Realiza el control de acceso a una caja fuerte. La combinación será un
	 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
	 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
	 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
	 * Tendremos cuatro oportunidades para abrir la caja fuerte.
	 */
	
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int numeroIntroducido;
		int oportunidades = 3;
		boolean password = false;

		do {
			System.out.print("Mete el número secreto de la caja fuerte: ");
			numeroIntroducido = kboard.nextInt();
			if (numeroIntroducido == 1234) {
				password = true;
			} else  {
				System.out.println("Error. Te quedan " + oportunidades + " oportunidades."); 
			}
			oportunidades --;
		} while  ((oportunidades > 0) && (!password));
		
		if (password) {
			System.out.println("Caja fuerte abierta");
		} else {
			System.out.println("Game Over.");
		}
		
	
	}

}
