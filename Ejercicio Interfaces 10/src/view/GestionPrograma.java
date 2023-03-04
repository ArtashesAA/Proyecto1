package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import model.Agrupacion;
import model.Romancero;

public class GestionPrograma {

	protected static Agrupacion[] agrupaciones;
	protected static Romancero[] romanceros;
	
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
		Scanner scanner = new Scanner(System.in);

		String nombre = Util.leerString("Introduzca el nombre de la agrupación:");
		String tipo = Util.leerString("Introduzca el tipo de la agrupación:");
		String autor = Util.leerString("Introduzca el nombre del autor:");
		String autor_musica = Util.leerString("Introduzca el nombre del autor de la musica:");
		String autor_letras = Util.leerString("Introduzca el nombre del autor de las letras:");
		String disfraz = Util.leerString("Introduzca el nombre del disfraz:");
		
		Agrupacion nuevaAgrupacion = new Agrupacion(nombre, autor, autor_musica, autor_letras, disfraz);

	    boolean agregado = false;
	    for (int i = 0; i < agrupaciones.length; i++) {
	        if (agrupaciones[i] == null) {
	            agrupaciones[i] = nuevaAgrupacion;
	            agregado = true;
	            break;
	        }
	    }

	    if (agregado) {
	        System.out.println("Agrupación añadida correctamente.");
	    } else {
	        System.out.println("No se pudo añadir la agrupación.");
	    }
	}
	
	private static void delAgrupacion() {
	    String nombre = Util.leerString("Introduzca el nombre de la agrupación que desea eliminar:");

	    boolean eliminado = false;
	    for (int i = 0; i < agrupaciones.length; i++) {
	        if (agrupaciones[i] != null && agrupaciones[i].getNombre().equals(nombre)) {
	            agrupaciones[i] = null;
	            eliminado = true;
	            break;
	        }
	    }

	    if (eliminado) {
	        System.out.println("Agrupación eliminada.");
	    } else {
	        System.out.println("No se encontró la agrupación.");
	    }
	}
	
	private static void editAgrupacion() {
		String nombre = Util.leerString("Introduzca el nombre de la agrupación que desea editar:");
		
		Agrupacion agrupacion = null;
	    for (int i = 0; i < agrupaciones.length; i++) {
	        if (agrupaciones[i] != null && agrupaciones[i].getNombre().equals(nombre)) {
	            agrupacion = agrupaciones[i];
	            break;
	        }
	    }

	    if (agrupacion != null) {
	    	Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduzca el nuevo nombre de la agrupación:");
	        String nuevoNombre = scanner.nextLine();
	        agrupacion.setNombre(nuevoNombre);

	        System.out.println("Introduzca el nuevo nombre de autor:");
	        String nuevoAutor = scanner.nextLine();
	        agrupacion.setAutor(nuevoAutor);
	        
	        System.out.println("Introduzca el nuevo nombre de autor de musica:");
	        String nuevoAutorMusica = scanner.nextLine();
	        agrupacion.setAutor_musica(nuevoAutorMusica);
	        
	        System.out.println("Introduzca el nuevo nombre de autor letras:");
	        String nuevoAutorLetras = scanner.nextLine();
	        agrupacion.setAutor_letras(nuevoAutorLetras);
	        
	        System.out.println("Introduzca el nuevo nombre de disfraz:");
	        String nuevoDisfraz = scanner.nextLine();
	        agrupacion.setDisfraz(nuevoDisfraz);

	        System.out.println("Agrupación editada correctamente.");
	    } else {
	        System.out.println("No se encontró la agrupación o no se pudo editar.");
	    }
	}
	
	
	
	private static void Romanceros() {
		int opc;
		do {
			for (int i = 0; i < romanceros.length; i++) {
	            Romancero romancero = romanceros[i];
	            System.out.println((i + 1) + ". " + romancero.getNombre() + " (" + romancero.getAutor() + ")");
	        }
			
			opc = Util.leerInt("Opción [0 - Volver] : ");
			
		} while (opc != 0);
	}

	//---------------Orden--------------------------------------
	
	private static void ordenNombre() {
	    Arrays.sort(agrupaciones, Comparator.comparing(Agrupacion::getNombre));
	}
	
	private static void ordenAutor() {
		Arrays.sort(agrupaciones, Comparator.comparing(Agrupacion::getAutor));	
	}
	
	private static void ordenAutorMusica() {
		Arrays.sort(agrupaciones, Comparator.comparing(Agrupacion::getAutor_musica));
	}
	
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
	
}
