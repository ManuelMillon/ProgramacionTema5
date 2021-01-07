/**
 * 
 */
package tema5Ejercicios;
import java.util.Scanner;
/**
 * @author Propietario
 *
 */
public class Tema5Ejercicio9 {

	/**
	 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
	 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
	 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
	 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
	 * esta manera, la única limitación en el número de dígitos la establece el tipo de
	 * dato que se utilice (int o long).
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Introduce un número para saber su cantidad de dígitos: ");
		int i = kboard.nextInt();
		int numeroDeDigitos=1;
		int numeroIntroducido;
		numeroIntroducido = i;

		while (i > 0) {
			System.out.println(i);
			i /= 10;
		numeroDeDigitos++;
		}
		System.out.println("El número " + numeroIntroducido + " tiene " + numeroDeDigitos + " dígitos.");
	}

}
