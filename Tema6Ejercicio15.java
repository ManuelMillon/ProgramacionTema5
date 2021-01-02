/**
 * 
 */
package paquetetema5;

/**
 * @author Manuel Millón
 *
 */
public class Tema6Ejercicio15 {

	/**
	 * Realiza un generador de melodía con las siguientes condiciones: a) Las notas
	 * deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,la y si.
	 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a
	 * 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…). c) Cada grupo de 4
	 * notas será un compás y estará separado del siguiente compás mediante la barra
	 * vertical “|” (Alt + 1). El final de la melodía se marca con dos barras. d) La
	 * última nota de la melodía debe coincidir con la primera.
	 */

	public static void main(String[] args) {

		int numero = 4 * (int) (Math.random() * 7) + 1;
		String nota = "";
		String primeraNota = "";

		for (int contadorNota = 1; contadorNota <= numero; contadorNota++) {
			switch (numero) {
			case 1:
				nota = "Do";
				break;
			case 2:
				nota = "Re";
				break;
			case 3:
				nota = "Mi";
				break;
			case 4:
				nota = "Fa";
				break;
			case 5:
				nota = "Sol";
				break;
			case 6:
				nota = "La";
				break;
			case 7:
				nota = "Si";
				break;
			default:
			}
			System.out.print(nota + "|");

			if (contadorNota == 1) {
			primeraNota = nota;
		}
			if (contadorNota == numero)
			nota = primeraNota;
			System.out.print(nota + " ");
			} 
			else if (contadorNota % 4 == 0) {
			System.out.println("| ");
			}
		}
	}
}
