package model;

public class Integrante {

	private static Integer numeroParticipante = 0;
	private Integer numero;
	private String nombre;
	private Integer edad;
	private String localidad;

	public Integrante() {
		numeroParticipante++;
	}

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

	@Override
	public String toString() {
		return "Integrante [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getLocalidad()="
				+ getLocalidad() + ", getNumero()=" + getNumero() + "]";
	}

}
