package ahorcado.irene;

import javax.swing.JOptionPane;

public class Funciones {
	public static String dibujarAhorcado(byte intentos) {
		StringBuilder dibujo = new StringBuilder();
		switch (intentos) {
		case 6:
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 5:
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 4:
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 3:
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 2:
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 1:
			System.out.println(" ________");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      /");
			System.out.println("|");
			System.out.println("|________");
			break;
		case 0:
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

	//determinar si todas las letras de la palabra secreta han sido adivinadas
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
            // El usuario presionó "Cancelar" o no ingresó nada
            return obtenerLetra(mensaje);
        }
        return entrada.charAt(0);
    }
}
