package model;

public class Comparsa extends AgrupacionOficial {

	private String empresa_atrezzo;

	public Comparsa() {

	}

	public String getEmpresa_atrezzo() {
		return empresa_atrezzo;
	}

	public void setEmpresa_atrezzo(String empresa_atrezzo) {
		this.empresa_atrezzo = empresa_atrezzo;
	}

	@Override
	public String cantarPresentacion() {
		return "Cantando la comparsa " + super.getNombre();
	}

	public String caminitoDelFalla() {
		return "La comparsa " + super.getNombre() + " va caminito del Falla";
	}

	@Override
	public String hacerTipo() {
		return "La comparsa " + super.getNombre() + " va de " + super.getDisfraz();
	}

	@Override
	public String toString() {
		return "Comparsa [getEmpresa_atrezzo()=" + getEmpresa_atrezzo() + ", cantarPresentacion()="
				+ cantarPresentacion() + ", caminitoDelFalla()=" + caminitoDelFalla() + ", hacerTipo()=" + hacerTipo()
				+ "]";
	}

}
