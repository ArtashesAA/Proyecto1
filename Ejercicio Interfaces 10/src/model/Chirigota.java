package model;

/**
 * <h2>Clase Chirigota</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Chirigota extends AgrupacionOficial implements Callejera {

	/**
	 * Atributo numero de cuples
	 */
	private String numero_cuples;

	/**
	 * Método Chirigota
	 */
	public Chirigota() {

	}

	// Métodos Getters y Setters

	public String getNumero_cuples() {
		return numero_cuples;
	}

	public void setNumero_cuples(String numero_cuples) {
		this.numero_cuples = numero_cuples;
	}

	/**
	 * Método cantarPresentacion
	 */

	@Override
	public String cantarPresentacion() {
		return "Cantando la chirigota " + super.getNombre();
	}

	/**
	 * Método caminitoDelFalla
	 */

	public String caminitoDelFalla() {
		return "El chirigota " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Método hacerTipo
	 */

	@Override
	public String hacerTipo() {
		return "El chirigota " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * Método amoAescucha
	 */

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la chirigota " + super.getNombre();
	}

	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return "Chirigota [getNumero_cuples()=" + getNumero_cuples() + ", cantarPresentacion()=" + cantarPresentacion()
				+ ", caminitoDelFalla()=" + caminitoDelFalla() + ", hacerTipo()=" + hacerTipo() + ", amoAescucha()="
				+ amoAescucha() + "]";
	}

}
