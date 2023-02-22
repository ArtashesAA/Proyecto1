package view;

public class GestionPrograma {

	public static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
				case 1 -> Integrantes.opcIntegrantes();
				case 2 -> addAgrupacion();
				case 3 -> delAgrupacion();
				case 4 -> editAgrupacion();
				case 5 -> Concurso.opcConcurso();
				case 6 -> Concurso.listarTodas();
				case 7 -> Concurso.Chirigotas();
				case 8 -> Concurso.Coros();
				case 9 -> Concurso.Cuartetos();
				case 10 -> Romanceros();
				case 11 -> ordenNombre();
				case 12 -> ordenAutor();
				case 13 -> ordenAutorMusica();
			}
		} while (opc != 0);
		finDelPrograma();
	}	
	
	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por el autor de música/letra.");
	}
	
	private static void addAgrupacion() {
		
	}
	
	private static void delAgrupacion() {
		
	}
	
	private static void editAgrupacion() {
		
	}
	
	
	
	private static void Romanceros() {
		do {
			for (int i = 0; i < ; i++) {
				
			}
			
			
			opc = Util.leerInt("Opción [0 - Volver] : ");
			
		} while (opc != 0);
	}

	//---------------Orden--------------------------------------
	
	private static void ordenNombre() {
		
	}
	
	private static void ordenAutor() {
			
	}
	
	private static void ordenAutorMusica() {
		
	}
	
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
	
}
