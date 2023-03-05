package controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import model.Agrupacion;
import model.AgrupacionOficial;

/**
 * 
 * <h2>Clase Controller COAC
 * <h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class COAC {

	/**
	 * Atributo numero de agrupaciones
	 */
	int num_agrupaciones;

	/**
	 * Atributo array de agrupaciones
	 */
	public static Agrupacion[] agrupaciones;

	/**
	 * Atributo array de agrupaciones oficiales
	 */
	public AgrupacionOficial[] agrupacionesOficiales;

	/**
	 * 
	 * @param agrupacion
	 * @return
	 *         <ul>
	 *         <li>true:Si se ha podido inscribir la agrupacion en el array</li>
	 *         <li>false:Si no se ha podido inscribir la agrupacion en el array</li>
	 *         </ul>
	 */

	public boolean inscribir_agrupacion(Agrupacion agrupacion) {
		num_agrupaciones++;
		boolean added = false;

		for (int i = 0; i < num_agrupaciones; i++) {
			if (agrupaciones[i] == null) {
				agrupaciones[i] = agrupacion;
				added = true;
				break;
			}
		}
		return added;
	}

	/**
	 * 
	 * @param agrupacion
	 * @return
	 *         <ul>
	 *         <li>true:Si se ha podido eliminar la agrupacion en el array</li>
	 *         <li>false:Si no se ha podido eliminar la agrupacion en el array</li>
	 *         </ul>
	 */

	public boolean eliminar_agrupacion(Agrupacion agrupacion) {
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i] != null && agrupaciones[i].getNombre().equals(agrupacion.getNombre())) {
				agrupaciones[i] = null;
				return true;
			}
		}

		return false;
	}

	/**
	 * Método para ordenar por puntos
	 */

	public void ordenar_por_puntos() {
		for (int i = 0; i < agrupacionesOficiales.length; i++) {
			for (int j = i + 1; j < agrupaciones.length; j++) {
				if (agrupacionesOficiales[i].getPuntosObtenidos() < agrupacionesOficiales[j].getPuntosObtenidos()) {
					AgrupacionOficial temp = (AgrupacionOficial) agrupacionesOficiales[i];
					agrupacionesOficiales[i] = agrupacionesOficiales[j];
					agrupacionesOficiales[j] = temp;
				}
			}
		}
	}

	/**
	 * Método para ordenar por nombre
	 */

	public void ordenar_por_nombre() {
		for (int i = 0; i < agrupaciones.length; i++) {
			for (int j = i + 1; j < agrupaciones.length; j++) {
				if (agrupaciones[i].getNombre().compareTo(agrupaciones[j].getNombre()) > 0) {
					Agrupacion temp = agrupaciones[i];
					agrupaciones[i] = agrupaciones[j];
					agrupaciones[j] = temp;
				}
			}
		}
	}

	/**
	 * Método para ordenar por autor
	 */

	public void ordenar_por_autor() {
		for (int i = 0; i < agrupaciones.length; i++) {
			for (int j = i + 1; j < agrupaciones.length; j++) {
				if (agrupaciones[i].getAutor().compareTo(agrupaciones[j].getAutor()) > 0) {
					Agrupacion temp = agrupaciones[i];
					agrupaciones[i] = agrupaciones[j];
					agrupaciones[j] = temp;
				}
			}
		}
	}

	/**
	 * Método para listar el array de agrupaciones
	 */

	public void verAgrupacionesConcurso() {
		System.out.println("Agrupaciones del concurso:");

		// Mostrar información de cada agrupación en el array
		for (int i = 0; i < agrupaciones.length; i++) {
			Agrupacion agrupacion = agrupaciones[i];
			System.out.println("Nombre: " + agrupacion.getNombre() + ", Disfraz: " + agrupacion.getDisfraz()
					+ ", Autor: " + agrupacion.getAutor());
		}
	}

}
