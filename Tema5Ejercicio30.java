/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio30 {

	/**
	 * Ejercicio 30 Realiza una programa que calcule las horas transcurridas entre
	 * dos horas de dos días de la semana. No se tendrán en cuenta los minutos ni
	 * los segundos. El día de la semana se puede pedir como un número (del 1 al 7)
	 * o como una cadena (de lunes a domingo). Se debe comprobar que el usuario
	 * introduce los datos correctamente y que el segundo día es posterior al
	 * primero.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		boolean datoCorrecto = true;
		int primerDia = 0;
		int horaPrimera = 0;
		int segundoDia = 0;
		int horaSegunda = 0;
		int horasPrimerDia = 0;
		int horasSegundoDia = 0;
		do {
			System.out.print("Introduce el primer número del día de la semana: ");
			primerDia = kboard.nextInt();
			System.out.print("Introduce la hora del primer día: ");
			horaPrimera = kboard.nextInt();
			System.out.print("Introduce el segundo número del día de la semana: ");
			segundoDia = kboard.nextInt();
			System.out.println("Introduce la hora del segundo día");
			horaSegunda = kboard.nextInt();
			switch (primerDia) {
			case 1:
				horasPrimerDia = 0;
				break;
			case 2:
				horasPrimerDia = 24;
				break;
			case 3:
				horasPrimerDia = 48;
				break;
			case 4:
				horasPrimerDia = 72;
				break;
			case 5:
				horasPrimerDia = 96;
				break;
			case 6:
				horasPrimerDia = 120;
				break;
			case 7:
				horasPrimerDia = 144;
				break;
			default:
			}
			switch (segundoDia) {
			case 1:
				horasSegundoDia = 0;
				break;
			case 2:
				horasSegundoDia = 24;
				break;
			case 3:
				horasSegundoDia = 48;
				break;
			case 4:
				horasSegundoDia = 72;
				break;
			case 5:
				horasSegundoDia = 96;
				break;
			case 6:
				horasSegundoDia = 120;
				break;
			case 7:
				horasSegundoDia = 144;
				break;
			default:
			}
			datoCorrecto = true;
			if ((primerDia > 8) || (segundoDia > 8) || (horaPrimera > 23) || (horaSegunda > 23)) {
				System.out.println("La hora introducida es incorrecta. Inténtelo de nuevo: ");
				datoCorrecto = false;
			}
		} while (!datoCorrecto);
		int horasTotales = (horasSegundoDia + horaSegunda) - (horasPrimerDia + horaPrimera);
		System.out.println("En total restan " + horasTotales + " horas entre en primer día y el segundo.");
	}
}