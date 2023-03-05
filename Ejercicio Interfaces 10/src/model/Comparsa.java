package model;

/**
 * <h2>Clase Comparsa</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Comparsa extends AgrupacionOficial {

	/**
	 * Atributo empresa_atrezzo
	 */
	private String empresa_atrezzo;

	/**
	 * Método Comparsa
	 */
	public Comparsa() {

	}

	/**
	 * Métodos Getters y Setters
	 */
	public String getEmpresa_atrezzo() {
		return empresa_atrezzo;
	}

	public void setEmpresa_atrezzo(String empresa_atrezzo) {
		this.empresa_atrezzo = empresa_atrezzo;
	}

	/**
	 * Método cantarPresentacion que devuelve: Cantando la comparsa "NombreComparsa"
	 */

	@Override
	public String cantarPresentacion() {
		return "Cantando la comparsa " + super.getNombre();
	}

	/**
	 * Método caminitoDelFalla que devuelve: La comparsa "NombreComparsa" va
	 * caminito del Falla
	 */

	public String caminitoDelFalla() {
		return "La comparsa " + super.getNombre() + " va caminito del Falla";
	}

	/**
	 * Método hacerTipo que devuelve: La comparsa "NombreComparsa" va de
	 * "NombreDisfraz"
	 */

	@Override
	public String hacerTipo() {
		return "La comparsa " + super.getNombre() + " va de " + super.getDisfraz();
	}

	/**
	 * Métodos toString
	 */

	@Override
	public String toString() {
		return "Comparsa [getEmpresa_atrezzo()=" + getEmpresa_atrezzo() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", hacerTipo()=" + hacerTipo()
				+ "]";
	}

}
