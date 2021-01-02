/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio12 {

	/**
	 * Escribe un programa que muestre los n primeros t�rminos de la
	 * serie de Fibonacci. El primer t�rmino de la serie de Fibonacci
	 * es 0, el segundo es 1 y el resto se calcula sumando los dos
	 * anteriores, por lo que tendr�amos que los t�rminos son 0, 1, 1,
	 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El n�mero n se debe
	 * introducir por teclado.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				
		System.out.print("Escriba la cantidad de n�meros de Fibonacci que desee: ");
		int numeroIntroducido = teclado.nextInt();
				

		switch (numeroIntroducido) {
		case 1: 
			System.out.print("0");
			break;
		case 2:
			System.out.print("0 1");
			break;
			default:
				System.out.print("0 1");
				int n1 = 0;
				int n2 = 1;
				int aux;
				while (numeroIntroducido > 2) {
					aux = n1;
					n1 = n2;
					n2 = aux + n2;
					System.out.print(" " + n2);
					numeroIntroducido--;
				}
				
		}
		System.out.println();
	}

}
