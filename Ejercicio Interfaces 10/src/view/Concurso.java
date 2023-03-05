package view;

import java.util.Arrays;
import java.util.Comparator;

import model.Agrupacion;
import model.Chirigota;
import model.Coro;
import model.Cuarteto;

public class Concurso {

	public static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");

			switch (opc) {
			case 1 -> asignaPuntos();

			case 2 -> listarTodas();
			case 3 -> Chirigotas();
			case 4 -> Coros();
			case 5 -> Cuartetos();

			case 7 -> ordenarPorNombre();
			case 8 -> ordenarPorAutor();
			case 9 -> ordenarPorAutorMusica();
			}

		} while (opc != 0);
	}

	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("  1. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  2. Listar todos.");
		Util.escribir("  3. Listar Chirigotas.");
		Util.escribir("  4. Listar Coros.");
		Util.escribir("  5. Listar Cuartetos.");
		Util.escribir("Ordenación del listado:");
		Util.escribir("  7. Ordenar por el nombre.");
		Util.escribir("  8. Ordenar por el autor.");
		Util.escribir("  9. Ordenar por autor de música/letra.");
	}

	private static void asignaPuntos() {

	}

	public static void listarTodas() {

		for (Agrupacion agrupacion : GestionPrograma.agrupaciones) {
			System.out.println(agrupacion.toString());
		}
	}

	public static void Chirigotas() {
		for (Agrupacion agrupacion : GestionPrograma.agrupaciones) {
			if (agrupacion instanceof Chirigota) {
				System.out.println(agrupacion.toString());
			}
		}
	}

	public static void Coros() {
		for (Agrupacion agrupacion : GestionPrograma.agrupaciones) {
			if (agrupacion instanceof Coro) {
				System.out.println(agrupacion.toString());
			}
		}
	}

	public static void Cuartetos() {
		for (Agrupacion agrupacion : GestionPrograma.agrupaciones) {
			if (agrupacion instanceof Cuarteto) {
				System.out.println(agrupacion.toString());
			}
		}
	}

	private static void ordenarPorNombre() {
		Arrays.sort(GestionPrograma.agrupaciones, new Comparator<Agrupacion>() {
			public int compare(Agrupacion a1, Agrupacion a2) {
				return a1.getNombre().compareTo(a2.getNombre());
			}
		});
	}

	private static void ordenarPorAutor() {
		Arrays.sort(GestionPrograma.agrupaciones, new Comparator<Agrupacion>() {
			public int compare(Agrupacion a1, Agrupacion a2) {
				return a1.getAutor().compareTo(a2.getAutor());
			}
		});
	}

	private static void ordenarPorAutorMusica() {
		Arrays.sort(GestionPrograma.agrupaciones, new Comparator<Agrupacion>() {
			public int compare(Agrupacion a1, Agrupacion a2) {
				return a1.getAutor_musica().compareTo(a2.getAutor_musica());
			}
		});
	}

}
