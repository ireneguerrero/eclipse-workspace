package ahorcado.irene;

public class Funciones {
	public static void dibujarAhorcado(int intentos) {
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
}
