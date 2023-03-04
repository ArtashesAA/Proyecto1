package model;

public abstract class AgrupacionOficial extends Agrupacion {

	private Integer puntosObtenidos;
	private Integrante[] componente;

	public AgrupacionOficial() {

	}

	public AgrupacionOficial(int totalIntegrantes) {

	}

	public abstract String caminitoDelFalla();

	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}

	public boolean insertarIntegrante(Integrante integrante) {
		boolean added = false;

		for (int i = 0; i < componente.length; i++) {
			if (componente[i] == null) {
				this.componente[i] = integrante;
				added = true;
				break;
			}
		}
		return added;
	}

	public boolean eliminarIntegrante(Integrante integrante) {
		boolean deleted = false;
		for (int i = 0; i < componente.length; i++) {
			if (componente[i] != null && this.componente[i].equals(integrante)) {
				componente[i] = null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	@Override
	public String toString() {
		return "AgrupacionOficial [caminitoDelFalla()=" + caminitoDelFalla() + ", getPuntosObtenidos()="
				+ getPuntosObtenidos() + "]";
	}

}
