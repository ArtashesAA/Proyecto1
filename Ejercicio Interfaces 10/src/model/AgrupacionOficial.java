package model;

/**
 * <h2>Clase AgrupacionOficial para crear agrupaciones oficiales</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public abstract class AgrupacionOficial extends Agrupacion {

	/**
	 * Atributo puntosObtenidos
	 */
	private Integer puntosObtenidos;
	/**
	 * Atributo array de componente
	 */
	private Integrante[] componente;

	/**
	 * Método AgrupacionOficial
	 */

	public AgrupacionOficial() {

	}

	/**
	 * Método AgrupacionOficial que recibe parámetro
	 */

	public AgrupacionOficial(int totalIntegrantes) {

	}

	/**
	 * Método abstract caminitoDelFalla
	 */

	public abstract String caminitoDelFalla();

	// Métodos Getters y Setters

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	/**
	 * 
	 * @param integrante
	 * @return
	 *         <ul>
	 *         <li>true:Si se ha podido insertar un integrante en el array</li>
	 *         <li>false:Si no se ha podido insertar un integrante en el array</li>
	 *         </ul>
	 */

	public boolean insertarIntegrante(Integrante integrante) {
		boolean added = false;

		for (int i = 0; i < componente.length; i++) {
			if (componente[i] == null) {
				this.componente[i] = integrante;
				added = true;
				break;
			}
		}
		return added;
	}

	/**
	 * 
	 * @param integrante
	 * @return
	 *         <ul>
	 *         <li>true:Si se ha podido eliminar un integrante del array</li>
	 *         <li>false:Si no se ha podido eliminar un integrante del array</li>
	 *         </ul>
	 */

	public boolean eliminarIntegrante(Integrante integrante) {
		boolean deleted = false;
		for (int i = 0; i < componente.length; i++) {
			if (componente[i] != null && this.componente[i].equals(integrante)) {
				componente[i] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// Método toString

	@Override
	public String toString() {
		return "AgrupacionOficial [caminitoDelFalla()=" + caminitoDelFalla() + ", getPuntosObtenidos()="
				+ getPuntosObtenidos() + "]";
	}

}
