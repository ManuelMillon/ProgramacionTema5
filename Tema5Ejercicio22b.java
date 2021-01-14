/**
 * 
 */
package paquetetema5;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio22b {

	/**
	 * Ejercicio 22 Muestra por pantalla todos los números primos entre 2 y 100,
	 * ambos incluidos.
	 */
	public static void main(String[] args) {

		int numero = 2;
		int i = 2;
		do {

			if ((numero % i) != 0) {
				System.out.println(i);
			}

			numero++;
			i++;
		} while (numero < 101);
	
	}

}
