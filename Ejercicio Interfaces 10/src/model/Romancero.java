package model;

/**
 * <h2>Clase Romancero para crear Romanceros</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Romancero extends Agrupacion implements Callejera {
	/**
	 * Atributo tematica_carteloon
	 */
	private String tematica_cartelon;

	/**
	 * Método Romancero
	 */
	public Romancero() {

	}

	// Métodos Getters y Setters

	public String getTematica_cartelon() {
		return tematica_cartelon;
	}

	public void setTematica_cartelon(String tematica_cartelon) {
		this.tematica_cartelon = tematica_cartelon;
	}

	/**
	 * Método cantarPresentacion que devuelve: Cantando el romancero
	 * "NombreRomancero"
	 */

	@Override
	public String cantarPresentacion() {
		return "Cantando el romancero " + super.getNombre();
	}

	/**
	 * Método caminitoDelFalla que devuelve: El romancero "NombreRomancero" va
	 * caminito del Falla
	 */
	public String caminitoDelFalla() {
		return "El romancero " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Método hacerTipo que devuelve: El romancero "NombreRomancero" va de
	 * "NombreDisfraz"
	 */

	@Override
	public String hacerTipo() {
		return "El romancero " + super.getNombre() + " va de " + super.getDisfraz();
	}

	// Método toString

	@Override
	public String toString() {
		return "Romancero [getTematica_cartelon()=" + getTematica_cartelon() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", hacerTipo()=" + hacerTipo()
				+ ", amoAescucha()=" + amoAescucha() + "]";
	}

	/**
	 * Método amoAescucha que devuelve: Amo a escuchá el romanero "NombreRomancero"
	 */

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el romanero " + super.getNombre();
	}

}
