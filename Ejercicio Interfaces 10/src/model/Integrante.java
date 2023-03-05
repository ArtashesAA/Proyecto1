package model;

/**
 * <h2>Clase Integrante</h2>
 * 
 * @author Artashes
 * @since 05-03-2023
 *
 */

public class Integrante {

	/**
	 * Atributo estático numeroParticipante que se inicializa en 0
	 */
	private static Integer numeroParticipante = 0;

	/**
	 * Atributo numero
	 */
	private Integer numero;

	/**
	 * Atributo nombre
	 */
	private String nombre;

	/**
	 * Atributo edad
	 */
	private Integer edad;

	/**
	 * Atributo localidad
	 */
	private String localidad;

	/**
	 * Método Integrante que aumenta en una unidad el atributo numeroParticipante
	 * cada vez que se ejecuta
	 */

	public Integrante() {
		numeroParticipante++;
	}

	// Métodos Getters y Setters

	public static Integer getNumeroParticipante() {
		return numeroParticipante;
	}

	public static void setNumeroParticipante(Integer numeroParticipante) {
		Integrante.numeroParticipante = numeroParticipante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getNumero() {
		return numero;
	}

	// Método toString

	@Override
	public String toString() {
		return "Integrante [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getLocalidad()="
				+ getLocalidad() + ", getNumero()=" + getNumero() + "]";
	}

}
