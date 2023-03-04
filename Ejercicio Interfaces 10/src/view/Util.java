package view;

import java.util.Scanner;

public class Util {
	static Scanner teclado = new Scanner(System.in);

	public static int leerInt(String texto) {

		System.out.print(texto);
		int num = teclado.nextInt();

		return num;
	}

	public static String leerString(String texto1) {

		System.out.print(texto1);
		String texto = teclado.next();

		return texto;
	}

	public static void escribir(String string) {
		System.out.println(string);

	}
}
