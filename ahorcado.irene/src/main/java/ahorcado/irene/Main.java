package ahorcado.irene;

import java.util.Random;
import java.util.Scanner;

public class Main {
	//TODO: ventana que pida la letra y ventana que de el resultado (JOptionPanel)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] palabras = { "java", "gato", "perro", "mundo" };
		Random r = new Random();
		String palabraCorrecta = palabras[r.nextInt(palabras.length)];
		byte intentos = 6;
		boolean juegoTerminado = false;
		char[] letrasAdivinadas = new char[palabraCorrecta.length()];

		for (byte i = 0; i < letrasAdivinadas.length; i++) {
			letrasAdivinadas[i] = '_';
		}

		System.out.println("¡Hola! ¡Vamos a jugar al juego del ahorcado!");

		do {

			System.out.println("Palabra secreta: " + new String(letrasAdivinadas));
			System.out.println("Intentos: " + intentos);
			System.out.println("Ingresa una letra: ");
			Funciones.dibujarAhorcado(intentos);
			char letra = Character.toLowerCase(sc.next().charAt(0));
			boolean letraAdivinada = false;

			for (byte i = 0; i < palabraCorrecta.length(); i++) {
				if (palabraCorrecta.charAt(i) == letra) {
					letrasAdivinadas[i] = letra;
					letraAdivinada = true;
				}
			}

			if (!letraAdivinada) {
				intentos--;
				System.out.println("¡Letra incorrecta!");
				Funciones.dibujarAhorcado(intentos);
			}

			juegoTerminado = intentos == 0 || Funciones.palabraAdivinada(letrasAdivinadas);

			if (juegoTerminado) {
				if (Funciones.palabraAdivinada(letrasAdivinadas)) {
					System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraCorrecta);
				} else {
					System.out.println("¡Perdiste! La palabra secreta era: " + palabraCorrecta);
				}
			}

		} while (!juegoTerminado);
	}
}
