package model;

public class Cuarteto extends AgrupacionOficial implements Callejera{
	
	private String miembros;
	
	public Cuarteto() {
		
	}
	


	public String getMiembros() {
		return miembros;
	}


	public void setMiembros(String miembros) {
		this.miembros = miembros;
	}


	@Override
	public String cantarPresentacion() {

		return "Cantando el cuarteto " + super.getNombre();
	}


	@Override
	public String hacerTipo() {
		return "El cuarteto " + super.getNombre() + " va de " + super.getDisfraz();
	}

	public String caminitoDelFalla() {
		return "El cuarteto " + super.getNombre() + " va caminito del Falla";
	}



	@Override
	public String amoAescucha() {
		return "Amo a escuchá el cuarteto " + super.getNombre();
	}



	@Override
	public String toString() {
		return "Cuarteto [getMiembros()=" + getMiembros() + ", cantarPresentacion()=" + cantarPresentacion()
				+ ", hacerTipo()=" + hacerTipo() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", amoAescucha()="
				+ amoAescucha() + "]";
	}
	

	
	
	
	
}
