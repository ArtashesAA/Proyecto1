package model;

import java.util.Comparator;

/**
 * <h2>Clase ComparaAutorAgrupacion para comparar autores de agrupaciones</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class ComparaAutorAgrupacion implements Comparator<Agrupacion> {

	/**
	 * Método comparador de agrupaciones
	 */
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
