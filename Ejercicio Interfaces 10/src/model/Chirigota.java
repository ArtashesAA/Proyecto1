package model;

public class Chirigota extends AgrupacionOficial implements Callejera {

	private String numero_cuples;

	public Chirigota() {

	}

	public String getNumero_cuples() {
		return numero_cuples;
	}

	public void setNumero_cuples(String numero_cuples) {
		this.numero_cuples = numero_cuples;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la chirigota " + super.getNombre();
	}

	public String caminitoDelFalla() {
		return "El chirigota " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String hacerTipo() {
		return "El chirigota " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá la chirigota " + super.getNombre();
	}

	@Override
	public String toString() {
		return "Chirigota [getNumero_cuples()=" + getNumero_cuples() + ", cantarPresentacion()=" + cantarPresentacion()
				+ ", caminitoDelFalla()=" + caminitoDelFalla() + ", hacerTipo()=" + hacerTipo() + ", amoAescucha()="
				+ amoAescucha() + "]";
	}

}
