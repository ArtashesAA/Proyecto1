package model;

import java.util.Comparator;

/**
 * <h2>Clase ComparaAutorMusicaAgrupacion para comparar los autores de la musica
 * de agrupaciones</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class ComparaAutorMusicaAgrupacion implements Comparator<Agrupacion> {

	/**
	 * Método compare que compara el autor de la música, y si son iguales, compara
	 * el autor de las letras
	 */

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {

		int num = o1.getAutor_musica().compareTo(o2.getAutor_musica());
		if (num == 0) {
			num = o1.getAutor_letras().compareTo(o2.getAutor_letras());
		}

		return num;

	}

}
