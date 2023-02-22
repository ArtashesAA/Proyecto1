package model;

import java.util.Comparator;

public abstract class Agrupacion implements Comparator<Agrupacion>{
	private String nombre;
	private String autor;
	private String autor_musica;
	private String autor_letras;
	private String disfraz;
	
	public Agrupacion() {
		
	}

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

	public abstract String cantarPresentacion();
	
	public abstract String hacerTipo();
	
	
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}
	
	@Override
	public String toString() {
		return "Agrupacion [getNombre()=" + getNombre() + ", getAutor()=" + getAutor() + ", getAutor_musica()="
				+ getAutor_musica() + ", getAutor_letras()=" + getAutor_letras() + ", getDisfraz()=" + getDisfraz()
				+ "]";
	}
	
	
}
