package model;

public class Romancero extends Agrupacion implements Callejera {
	private String tematica_cartelon;

	public Romancero() {

	}

	public String getTematica_cartelon() {
		return tematica_cartelon;
	}

	public void setTematica_cartelon(String tematica_cartelon) {
		this.tematica_cartelon = tematica_cartelon;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando el romancero " + super.getNombre();
	}

	public String caminitoDelFalla() {
		return "El romancero " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String hacerTipo() {
		return "El romancero " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String toString() {
		return "Romancero [getTematica_cartelon()=" + getTematica_cartelon() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", hacerTipo()=" + hacerTipo()
				+ ", amoAescucha()=" + amoAescucha() + "]";
	}

	@Override
	public String amoAescucha() {
		return "Amo a escuchá el romanero " + super.getNombre();
	}

}
