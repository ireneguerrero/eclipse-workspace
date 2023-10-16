package ahorcado.irene;

import javax.swing.JOptionPane;

public class Funciones {
	public static String dibujarAhorcado(byte intentos) {
		String dibujo = "";
		switch (intentos) {
		case 6:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n" + "|" + "\n"
					+ "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 5:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|       O" + "\n" + "|" + "\n" + "|" + "\n" + "|"
					+ "\n" + "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 4:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|       O" + "\n" + "|       |" + "\n" + "|"
					+ "\n" + "|" + "\n" + "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 3:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|       O" + "\n" + "|      /|" + "\n" + "|"
					+ "\n" + "|" + "\n" + "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 2:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|       O" + "\n" + "|      /|\\" + "\n" + "|"
					+ "\n" + "|" + "\n" + "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 1:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|       O" + "\n" + "|      /|\\" + "\n"
					+ "|      /" + "\n" + "|" + "\n" + "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      /");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 0:
			dibujo = "\n" + " ________" + "\n" + "|       |" + "\n" + "|       O" + "\n" + "|      /|\\" + "\n"
					+ "|      / \\" + "\n" + "|" + "\n" + "|________";
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      / \\");
			System.out.println("|");
			System.out.println("|________");
			break;
		}
		return dibujo.toString();
	}

	// determinar si todas las letras de la palabra secreta han sido adivinadas
	public static boolean palabraAdivinada(char[] letrasAdivinadas) {
		for (char c : letrasAdivinadas) {
			if (c == '_') {
				return false;
			}
		}
		return true;
	}

	public static char obtenerLetra(String mensaje) {
		String entrada = JOptionPane.showInputDialog(mensaje);
		if (entrada == null || entrada.length() == 0) {
			// se le dió a cancelar o no se le dió a nada
			return obtenerLetra(mensaje);
		}
		return entrada.charAt(0);
	}
}
