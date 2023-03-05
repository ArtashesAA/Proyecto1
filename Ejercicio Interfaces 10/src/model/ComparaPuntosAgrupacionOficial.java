package model;

import java.util.Comparator;

/**
 * <h2>Clase ComparaPuntosAgrupacionOficial para comparar los puntos de las
 * agrupaciones oficiales</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class ComparaPuntosAgrupacionOficial implements Comparator<AgrupacionOficial> {

	/**
	 * Método compare, que compara los puntos obtenidos por las agrupaciones
	 * oficiales.
	 */
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {

		return o1.getPuntosObtenidos().compareTo(o2.getPuntosObtenidos());
	}

}
