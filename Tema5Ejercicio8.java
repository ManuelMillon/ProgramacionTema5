/**
 * 
 */
package paquetetema5;
import java.util.Scanner;
/**
 * @author Manuel Mill�n
 *
 */
public class Tema5Ejercicio8 {

	/**
	 * Ejercicio 8. Muestra la tabla de multiplicar de un n�mero introducido
	 * por teclado
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un n�mero para hacer su tabla de multiplicar");
		int numero = teclado.nextInt();
		
		for (int i = 0; i <=10 ; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
	}

}
}