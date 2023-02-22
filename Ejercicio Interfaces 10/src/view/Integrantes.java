package view;

public class Integrantes {

	public static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
				case 1 -> addParticipante();
				case 2 -> delParticipante();
				case 3 -> editParticipante();
				
				case 4 -> listarParticipantes();
				case 5 -> listarAgrupacionesParticipante();
				
				case 6 -> ordenarPorNombre();
			}
		} while (opc != 0);
	}
	
	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│ GESTION DE PARTICIPANTES │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}
	
	private static void addParticipante() {
		
	}
	
	private static void delParticipante() {
			
	}
	
	private static void editParticipante() {
		
	}
	
	private static void listarParticipantes() {
		
	}
	
	private static void listarAgrupacionesParticipante() {
		
	}
	
	private static void ordenarPorNombre() {
		
	}
	
}
