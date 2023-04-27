package examen1trimestre2;

import java.util.Scanner;

/**
 * Clase principal que lanza el main, donde hacemos un examen tope de raro
 * 
 * @author irene
 *
 */
public class Main {

	/**
	 * Función que contiene el main donde hacemos un examen tope de raro*2
	 * 
	 * @param args intentando usarlo
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte intercambios = -1;
		byte movimientos = -1;
		for (byte i = 0; i < args.length; i++) {
			if (args[i].equals("-i")) {
				intercambios = Byte.parseByte(args[i + 1]);
			}
			if (args[i].equals("-m")) {
				movimientos = Byte.parseByte(args[i + 1]);
			}
		}

		// 👨 👩 🐴 🐹 Θ θ ϴ ෴ ෴ ◓
		System.out.println("Situación inicial: ");
		String[][] iconosAula = { { "--", "--", "|  ", " |", "--", "--" }, { "--", "👨", "|  ", " |", "--", "👨" },
				{ "👨", "👨", "|  ", " |", "◓ ", "◓ " }, { "👨", "👨", "|  ", " |", "👨", "👨" },
				{ "👨", "👨", "|  ", " |", "👨", "👨" }, { "👨", "--", "|  ", " |", "👩", "👩" },
				{ "--", "--", "|🐴", " |", "--", "👨" }, { "🖥", "🗔", "|  ", " |", " ", " " },
				{ "🪑", "⊡ ", "|  ", " |", " ", " " } };
		String[][] nombresAula = { { "-", "-", "|  ", " |", "-", "-" }, { "-", "Cosmin", "|  ", " |", "-", "Alberto" },
				{ "Darío", "José H", "|  ", " |", "Irene", "Naomi" },
				{ "Borja", "Javi", "|  ", " |", "José G", "Nico" },
				{ "Sergio", "CarlosC", "|  ", " |", "Mario", "Ricardo" },
				{ "CarlosR", "-", "|  ", " |", "Mónica", "Mar" }, { "-", "-", "|🐴", " |", "-", "Alex. T" },
				{ "🖥", "🗔", "|  ", " |", " ", " " }, { "🪑", "⊡ ", "|  ", " |", " ", " " } };
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));

		System.out.println("¿Cuántos intercambios quieres que haga el caballo?");
		intercambios = Byte.parseByte(sc.nextLine());
		Funciones.intercambiarAlumnos(iconosAula, nombresAula, intercambios);
		System.out.println(Funciones.imprimeAula(iconosAula, nombresAula));
		System.out.println("¿Cuántos movimientos quieres que haga el caballo?");
		movimientos = Byte.parseByte(sc.nextLine());
		byte direccion = 1;
		for (byte i = 0; i <= movimientos; i++) {
			Funciones.moverCaballo(iconosAula, nombresAula, direccion);
			if (Funciones.moverCaballo(iconosAula, nombresAula, direccion) == true) {
				direccion = -1;
			}
		}
		Funciones.imprimeAula(iconosAula, nombresAula);

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (byte i = 0; i < iconosAula.length; i++) {
			System.out.println("\r");
		}

	}

}
