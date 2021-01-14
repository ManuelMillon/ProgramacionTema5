/**
 * 
 */
package paquetetema5;

import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio21 {

	/**
	 * Ejercicio 21 Realiza un programa que vaya pidiendo n�meros hasta que se
	 * introduzca un numero negativo y nos diga cuantos n�meros se han introducido,
	 * la media de los impares y el mayor de los pares. El n�mero negativo s�lo se
	 * utiliza para indicar el final de la introducci�n de datos pero no se incluye
	 * en el c�mputo.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Introduce n�meros para sacar el n�mero de datos introducidos,");
		System.out.println("la media, el mayor de los pares y el mayor de los impares.");
		System.out.print("Termina la secuencia al escribir un n�mero negativo: ");
		int numeroIntroducido = 1; 
		int numeroPar = 0;
		int numeroImpar = 0;
		int maximo = 1;
		int minimo = 1;
		int contadorPar = 0;
		int contadorImpar = 0;
		int contador = 0;
		int suma = 0;
		int numeroNegativo = 0;


		do {
			numeroIntroducido = Integer.parseInt(kboard.nextLine());
			
			if (numeroIntroducido <0 ) {
				numeroNegativo = numeroIntroducido; 
			}
			
			if ((numeroIntroducido % 2) == 1) { 
				contadorImpar++;
				} else if ((numeroIntroducido % 2) == 0) {
						contadorPar++;
					}
				

			if (numeroIntroducido < minimo) {
				minimo = numeroIntroducido;
			}
			if (numeroIntroducido > maximo) {
				maximo = numeroIntroducido;
			}
			contador++;
			suma += numeroIntroducido;
			
		} while (numeroIntroducido >= 0) ;
		int contadorReal = contador -1;
		 
		System.out.println("El n�mero introducido m�s alto es " + maximo);
		System.out.println("El n�mero introducido m�s bajo es " + minimo);
		System.out.println("El n�mero de impares introducidos es " + contadorImpar);
		System.out.println("El n�mero de pares introducidos es " + contadorPar);
		System.out.println("El total de n�meros introducidos es " + contadorReal);
		System.out.println("La media es " + ((double) suma - (double) numeroNegativo)/ (double) contador);

	}

}
