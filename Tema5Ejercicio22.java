/**
 * 
 */
package paquetetema5;

/**
 * @author Usuario
 *
 */
public class Tema5Ejercicio22 {

	/**
	 * Ejercicio 22
	 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
	 */
	public static void main(String[] args) {
		boolean primo = true;
		int numero;
		for (numero  = 2; numero < 101; numero++) {
			primo = true;
			for (int i = 2; i < numero; i++) {
				if ((numero % i ) == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.print(numero + " || ");
				}
		}
		
	}

}
