/**
 * 
 */
package tema5Ejercicios;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio8 {

	/**
	 * Ejercicio 8
	 * Muestra la tabla de multiplicar de un número introducido por teclado.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Introduce el número que quieras para sacar su tabla: ");
		int numero = kboard.nextInt();
		
		for (int i = 0; i <  11; i ++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
			}
		


		

	}

}
