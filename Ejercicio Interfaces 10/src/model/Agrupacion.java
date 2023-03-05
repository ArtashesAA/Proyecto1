package model;

import java.util.Comparator;

/**
 * <h2>Clase Agrupacion para crear agrupaciones</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public abstract class Agrupacion implements Comparator<Agrupacion> {
	/**
	 * Atributo nombre
	 */
	private String nombre;
	/**
	 * Atributo autor
	 */
	private String autor;
	/**
	 * Atributo autor de la musica
	 */
	private String autor_musica;
	/**
	 * Atributo autor de la letra
	 */
	private String autor_letras;
	/**
	 * Atributo disfraz
	 */
	private String disfraz;

	/**
	 * Método agrupación
	 */

	public Agrupacion() {

	}

	/**
	 * Método Agrupación con todos los parámetros
	 * 
	 * @param nombre
	 * @param autor
	 * @param autor_musica
	 * @param autor_letras
	 * @param disfraz
	 */

	public Agrupacion(String nombre, String autor, String autor_musica, String autor_letras, String disfraz) {

		this.nombre = nombre;
		this.autor = autor;
		this.autor_musica = autor_musica;
		this.autor_letras = autor_letras;
		this.disfraz = disfraz;
	}

	// Métodos getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor_musica() {
		return autor_musica;
	}

	public void setAutor_musica(String autor_musica) {
		this.autor_musica = autor_musica;
	}

	public String getAutor_letras() {
		return autor_letras;
	}

	public void setAutor_letras(String autor_letras) {
		this.autor_letras = autor_letras;
	}

	public String getDisfraz() {
		return disfraz;
	}

	public void setDisfraz(String disfraz) {
		this.disfraz = disfraz;
	}

	/**
	 * Método abstracto cantarPresentacion
	 */

	public abstract String cantarPresentacion();

	/**
	 * Método abstracto hacerTipo
	 */

	public abstract String hacerTipo();

	/**
	 * Método comaparador de agrupaciones
	 */

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return "Agrupacion [getNombre()=" + getNombre() + ", getAutor()=" + getAutor() + ", getAutor_musica()="
				+ getAutor_musica() + ", getAutor_letras()=" + getAutor_letras() + ", getDisfraz()=" + getDisfraz()
				+ "]";
	}

}
