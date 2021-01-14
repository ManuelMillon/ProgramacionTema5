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
	 * Ejercicio 21 Realiza un programa que vaya pidiendo números hasta que se
	 * introduzca un numero negativo y nos diga cuantos números se han introducido,
	 * la media de los impares y el mayor de los pares. El número negativo sólo se
	 * utiliza para indicar el final de la introducción de datos pero no se incluye
	 * en el cómputo.
	 */
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		System.out.println("Introduce números para sacar el número de datos introducidos,");
		System.out.println("la media, el mayor de los pares y el mayor de los impares.");
		System.out.print("Termina la secuencia al escribir un número negativo: ");
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
		 
		System.out.println("El número introducido más alto es " + maximo);
		System.out.println("El número introducido más bajo es " + minimo);
		System.out.println("El número de impares introducidos es " + contadorImpar);
		System.out.println("El número de pares introducidos es " + contadorPar);
		System.out.println("El total de números introducidos es " + contadorReal);
		System.out.println("La media es " + ((double) suma - (double) numeroNegativo)/ (double) contador);

	}

}
