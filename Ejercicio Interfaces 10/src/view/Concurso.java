package view;

import model.Chirigota;

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
				
				case 6 -> ordenarPorPuntos();
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
		Util.escribir("  6. Ordenar por puntos.");
		Util.escribir("  7. Ordenar por el nombre.");
		Util.escribir("  8. Ordenar por el autor.");
		Util.escribir("  9. Ordenar por autor de música/letra.");
	}
	
	private static void asignaPuntos() {
		
	}
	
	public static void listarTodas() {
		int opc;
		do {
			for (int i = 0; i < ; i++) {
				
			}
			
			
			opc = Util.leerInt("Opción [0 - Volver] : ");
			
		} while (opc != 0);
	}
	
	public static void Chirigotas() {
		int opc;
		do {
			for (int i = 0; i < Chirigota.length; i++) {
				
			}
			
			
			opc = Util.leerInt("Opción [0 - Volver] : ");
			
		} while (opc != 0);
	}
	
	public static void Coros() {
		int opc;
		do {
			for (int i = 0; i < ; i++) {
				
			}
			
			
			opc = Util.leerInt("Opción [0 - Volver] : ");
			
		} while (opc != 0);
	}
	
	public static void Cuartetos() {
		int opc;
		do {
			for (int i = 0; i < array.length; i++) {
				
			}
			
			
			opc = Util.leerInt("Opción [0 - Volver] : ");
			
		} while (opc != 0);	
	}
	
	private static void ordenarPorPuntos() {
		
	}
	
	private static void ordenarPorNombre() {
		
	}
	
	private static void ordenarPorAutor() {
		
	}
	
	private static void ordenarPorAutorMusica() {
		
	}
	
}
