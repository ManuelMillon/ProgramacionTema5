/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio31b {

	/**
	 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
	 * programa pedir� la altura. El palo horizontal de la L tendr� una longitud de la
	 * mitad (divisi�n entera entre 2) de la altura m�s uno.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("Dame la altura de la L:");
		System.out.print(">");
		int alturaIntroducida = kboard.nextInt();
		int i = 0;
		do {
			System.out.println("*");
			i++;
		} while (i<alturaIntroducida);
		
		int j = 0;
		do {
			System.out.print("* ");
			j++;
		} while (j < alturaIntroducida/2 + 1);
		

	}

}
