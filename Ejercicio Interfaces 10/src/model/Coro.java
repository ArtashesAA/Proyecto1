package model;

public class Coro extends AgrupacionOficial{

	
	private int bandurrias;
	private int guitarras;
	
	public Coro() {
		
	}
	
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

	@Override
	public String cantarPresentacion() {
		return "Cantando el coro " + super.getNombre();
	}

	public String caminitoDelFalla() {
		return "El coro " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String hacerTipo() {
		return "El coro " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String toString() {
		return "Coro [getBandurrias()=" + getBandurrias() + ", getGuitarras()=" + getGuitarras()
				+ ", cantarPresentacion()=" + cantarPresentacion() + ", caminitoDelFalla()=" + caminitoDelFalla()
				+ ", hacerTipo()=" + hacerTipo() + "]";
	}

	

	
	
	
	
	
}
