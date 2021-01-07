/**
 * 
 */
package tema5Ejercicios;
import java.util.Scanner;
/**
 * @author Manuel Millón. 
 *
 */
public class Tema5Ejercicio14 {

	/**
	 * Escribe un programa que pida una base y un exponente (entero positivo) 
	 * y que calcule la potencia.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.print("Teclea la base: ");
		double base = kboard.nextInt();
		System.out.print("Teclea el exponente: ");
		double exponente = kboard.nextInt();
		double ecuacion = Math.pow(base, exponente);
		
		System.out.println("La base " + base + " con el exponente " + exponente + " es igual a " + ecuacion);
	}

}
