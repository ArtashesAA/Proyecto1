package controller;


import java.util.Arrays;
import java.util.Comparator;

import model.Agrupacion;

public class COAC{
	int num_agrupaciones;
	private Agrupacion[] agrupaciones;
	
	
	public boolean inscribir_agrupacion(Agrupacion agrupacion) {
		num_agrupaciones++;
		boolean added = false;
		
		
		for (int i = 0; i < num_agrupaciones; i++) {
			if (agrupaciones[i] == null) {
				agrupaciones[i] = agrupacion;
				added = true;
				break;
			}
		}
		return added;
	}
	
	public boolean eliminar_agrupacion(Agrupacion agrupacion) {
		num_agrupaciones--;
		boolean deleted = false;
		
		for (int i = 0; i < num_agrupaciones; i++) {
			if (agrupaciones[i] != null && agrupaciones[i].equals(agrupacion)) {
				agrupaciones[i]=null;
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	public void ordenar_por_puntos() {
		
	}
	
	public void ordenar_por_nombre() {
		Arrays.sort(agrupaciones);
	}

	public void ordenar_por_autor() {
	}

	public void ordenar_por_autor_musica_letra() {
	
	}


	

	
}
