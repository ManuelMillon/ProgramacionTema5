/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio30 {

	/**
	 * Ejercicio 30
	 * Realiza una programa que calcule las horas transcurridas entre dos horas de
	 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
	 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
	 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
	 * los datos correctamente y que el segundo día es posterior al primero.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		
		for                                                                                                   
		System.out.print("Introduce el primer número del día de la semana: ");
		int primerDia = kboard.nextInt();
		System.out.print("Introduce la hora del primer día: ");
		int horaPrimera = kboard.nextInt();
		System.out.print("Introduce el segundo número del día de la semana: ");
		int segundoDia = kboard.nextInt();
		System.out.println("Introduce la hora del segundo día");
		int segundaHora = kboard.nextInt();
		

		switch (primerDia) {
		case 1:
			precio = precio - (precio / 10);
			System.out.println("Eres socio");
			break;
		case "no":
			precio = precio;
			System.out.println("No eres socio");
			break;
		default:
		}

	}

}
