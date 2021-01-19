/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio7 {

	/**
	 * Ejercicio7. Realiza el control de acceso a una caja fuerte. La combinaci�n
	 * ser� un n�mero de 4 cifras. El programa nos pedir� la combinaci�n para
	 * abrirla. Si no acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la
	 * combinaci�n� y si acertamos se nos dir� �La caja fuerte se ha abierto
	 * satisfactoriamente�. Tendremos cuatro oportunidades para abrir la caja
	 * fuerte.
	 */
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int intentos = 4;
		int claveIntroducida;
		boolean acierto = false;

		do {
			System.out.print("Por favor, introduzca la clave de 4 d�gitos de la caja fuerte: ");
			claveIntroducida = n.nextInt(); 

			if (claveIntroducida == 0666) {  //OJO. Si el n�mero empezase por cero, el int o el double se comer�an el primero cero y siempre dar�a error.
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
