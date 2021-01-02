/**
 * 
 */
package paquetetema5;

/**
 * @author Manuel Mill�n
 *
 */
public class Tema6Ejercicio15 {

	/**
	 * Realiza un generador de melod�a con las siguientes condiciones: a) Las notas
	 * deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,la y si.
	 * b) Una melod�a est� formada por un n�mero aleatorio de notas mayor o igual a
	 * 4, menor o igual a 28 y siempre m�ltiplo de 4 (4, 8, 12�). c) Cada grupo de 4
	 * notas ser� un comp�s y estar� separado del siguiente comp�s mediante la barra
	 * vertical �|� (Alt + 1). El final de la melod�a se marca con dos barras. d) La
	 * �ltima nota de la melod�a debe coincidir con la primera.
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
