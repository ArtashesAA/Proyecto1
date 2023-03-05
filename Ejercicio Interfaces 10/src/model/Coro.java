package model;

/**
 * <h2>Clase Coro para crear Coros</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Coro extends AgrupacionOficial {

	/**
	 * Atributo bandurrias
	 */
	private int bandurrias;
	/**
	 * Atributo guitarras
	 */
	private int guitarras;

	/**
	 * Método Coro
	 */

	public Coro() {

	}

	// Métodos Getters Y Setters

	public int getBandurrias() {
		return bandurrias;
	}

	public void setBandurrias(int bandurrias) {
		this.bandurrias = bandurrias;
	}

	public int getGuitarras() {
		return guitarras;
	}

	public void setGuitarras(int guitarras) {
		this.guitarras = guitarras;
	}

	/**
	 * Método cantarPresentacion que devuelve: Cantando el coro "NombreCoro"
	 */

	@Override
	public String cantarPresentacion() {
		return "Cantando el coro " + super.getNombre();
	}

	/**
	 * Método caminitoDelFalla que devuelve: El coro "NombreCoro" va caminito del
	 * Falla
	 */

	public String caminitoDelFalla() {
		return "El coro " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Método hacerTipo que devuelve: El coro "NombreCoro" va de "NombreDisfraz"
	 */

	@Override
	public String hacerTipo() {
		return "El coro " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return "Coro [getBandurrias()=" + getBandurrias() + ", getGuitarras()=" + getGuitarras()
				+ ", cantarPresentacion()=" + cantarPresentacion() + ", caminitoDelFalla()=" + caminitoDelFalla()
				+ ", hacerTipo()=" + hacerTipo() + "]";
	}

}
