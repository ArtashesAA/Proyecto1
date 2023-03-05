package model;

/**
 * <h2>Clase Cuarteto</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Cuarteto extends AgrupacionOficial implements Callejera {

	/**
	 * Atributo miembros
	 */
	private String miembros;

	/**
	 * Método Cuarteto
	 */

	public Cuarteto() {

	}

	// Métodos Getters y Setters

	public String getMiembros() {
		return miembros;
	}

	public void setMiembros(String miembros) {
		this.miembros = miembros;
	}

	/**
	 * Método cantarPresentacion que devuelve: Cantando el cuarteto "NombreCuarteto"
	 */

	@Override
	public String cantarPresentacion() {

		return "Cantando el cuarteto " + super.getNombre();
	}

	/**
	 * Método hacerTipo que devuelve: El cuarteto "NombreCuarteto" va de
	 * "NombreDisfraz"
	 */

	@Override
	public String hacerTipo() {
		return "El cuarteto " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * Método caminitoDelFalla que devuelve: El cuarteto "NombreCuarteto" va
	 * caminito del Falla
	 */

	public String caminitoDelFalla() {
		return "El cuarteto " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Método amoAescucha que devuelve: Amo a escuchá el cuarteto "NombreCuarteto"
	 */

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el cuarteto " + super.getNombre();
	}

	// Método toString

	@Override
	public String toString() {
		return "Cuarteto [getMiembros()=" + getMiembros() + ", cantarPresentacion()=" + cantarPresentacion()
				+ ", hacerTipo()=" + hacerTipo() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", amoAescucha()="
				+ amoAescucha() + "]";
	}

}
