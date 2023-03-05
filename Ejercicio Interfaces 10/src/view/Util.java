package view;

import java.util.Scanner;

/**
 * <h2>Clase Util donde se guardan todos los métodos relacionados con
 * Scanner</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Util {
	/**
	 * Declaración de Scanner teclado
	 */
	static Scanner teclado = new Scanner(System.in);

	/**
	 * 
	 * @param texto
	 * @return Devuelve un valor entero. Muestra el texto y espera a que se
	 *         introduzca un valor entero
	 */
	public static int leerInt(String texto) {

		System.out.print(texto);
		int num = teclado.nextInt();

		return num;
	}

	/**
	 * 
	 * @param texto1
	 * @return Devuelve una cadena. Muestra el texto y espera a que se introduzca
	 *         una cadena
	 */
	public static String leerString(String texto1) {

		System.out.print(texto1);
		String texto = teclado.next();

		return texto;
	}

	/**
	 * 
	 * @param string Simplifica el System.out.println
	 */
	public static void escribir(String string) {
		System.out.println(string);

	}
}
