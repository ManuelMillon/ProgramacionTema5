/**
 * 
 */
package tema5Ejercicios;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Tema5Ejercicio10 {

	/**
	 * Escribe un programa que calcule la media de un conjunto de números positivos
	 * introducidos por teclado. A priori, el programa no sabe cuántos números se
	 * introducirán. El usuario indicará que ha terminado de introducir los datos
	 * cuando meta un número negativo.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce números para calcular su media. Un número negativo cierra el bucle: "); 
		double i = 0;
		int numerosIntroducidos = 0;
		double mediaCalculada;
				
		do {
			i = Integer.parseInt(teclado.nextLine());
			if (i < 0) {
				System.out.println("Fin del bucle.");
			}			
			mediaCalculada = i /  numerosIntroducidos;
			numerosIntroducidos ++;
		} while (i < 0);
		
		
		
	}

}
