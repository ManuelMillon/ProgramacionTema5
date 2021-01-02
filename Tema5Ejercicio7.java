/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio7 {

	/**
	 * Ejercicio7. Realiza el control de acceso a una caja fuerte. La combinación
	 * será un número de 4 cifras. El programa nos pedirá la combinación para
	 * abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
	 * combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto
	 * satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja
	 * fuerte.
	 */
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int intentos = 4;
		int claveIntroducida;
		boolean acierto = false;

		do {
			System.out.print("Por favor, introduzca la clave de 4 dígitos de la caja fuerte: ");
			claveIntroducida = n.nextInt(); 

			if (claveIntroducida == 0666) {  //OJO. Si el número empezase por cero, el int o el double se comerían el primero cero y siempre daría error.
				acierto = true;
			} else {
				System.out.println("Error. Vuelva a intentarlo ");
			}

			intentos--;

		} while ((intentos > 0) && (!acierto));

		if (acierto) {
			System.out.println("Caja fuerte abierta");
		} else {
			System.out.println("Caja fuerte bloqueada permanentemente");

		}

	}

}
