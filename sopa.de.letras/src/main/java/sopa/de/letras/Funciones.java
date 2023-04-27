package sopa.de.letras;

import java.util.Random;

public class Funciones {
	public static char[][] creaSopa(byte nF, byte nC) {
		Random r = new Random();

		char[][] tamaño = new char[nF][nC];

		for (byte i = 0; i < tamaño.length; i++) {
			for (byte y = 0; y < tamaño[i].length; y++) {

				tamaño[i][y] = (char) r.nextInt('a', ('z' + 1));
			}
		}

		return tamaño;
	}

	public static String imprimeMatriz(char[][] matriz) {
		String ret = "";
		for (byte i = 0; i < matriz.length; i++) {
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j] + " ";
			}
			ret += "\n";
		}
		return ret;
	}

	public static boolean insertaPalabra(char[][] tamaño, boolean[][] palabraAqui, String palabra, byte fila,
			byte columna, byte direccion) {

		switch (direccion) {

		case 0:
			if (columna + palabra.length() - 1 < tamaño[fila].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila][columna + i]) {
						palabraAqui[fila][columna + i] = false;
					}
				}

				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila][columna + i] = palabra.charAt(i);
					palabraAqui[fila][columna + i] = true;
				}
				return true;
			}
			return false;

		case 1:
			if (columna - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila][columna - i]) {
						palabraAqui[fila][columna - i] = false;
					}
				}

				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila][columna - i] = palabra.charAt(i);
					palabraAqui[fila][columna - i] = true;
				}
				return true;
			}
			return false;

		case 2:
			if (fila + palabra.length() - 1 >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila - i][columna]) {
						palabraAqui[fila - i][columna] = false;
					}
				}

				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila - i][columna] = palabra.charAt(i);
					palabraAqui[fila - i][columna] = true;
				}
				return true;
			}
			return false;

		case 3:
			if (fila + palabra.length() - 1 < tamaño.length) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila + i][columna]) {
						palabraAqui[fila + i][columna] = false;
					}
				}

				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila + i][columna] = palabra.charAt(i);
					palabraAqui[fila + i][columna] = true;
				}
				return true;
			}
			return false;

		case 4:
			if (fila - (palabra.length() - 1) >= 0 && columna + palabra.length() - 1 < tamaño[0].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila - i][columna + i]) {
						palabraAqui[fila - i][columna + i] = false;
					}
				}

				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila - i][columna + i] = palabra.charAt(i);
					palabraAqui[fila - i][columna + i] = true;
				}
				return true;
			}
			return false;

		case 5:
			if (fila - (palabra.length() - 1) >= 0 && columna - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila - i][columna - i]) {
						palabraAqui[fila - i][columna - i] = false;
					}
				}

				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila - i][columna - i] = palabra.charAt(i);
					palabraAqui[fila - i][columna - i] = true;
				}
				return true;
			}
			return false;

		case 6:
			if (fila + (palabra.length() - 1) < tamaño.length && columna + palabra.length() - 1 < tamaño[0].length) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila + i][columna + i]) {
						palabraAqui[fila + i][columna + i] = false;
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila + i][columna + i] = palabra.charAt(i);
					palabraAqui[fila + i][columna + i] = true;
				}
				return true;
			}
			return false;

		case 7:
			if (fila + (palabra.length() - 1) < tamaño.length && columna - (palabra.length() - 1) >= 0) {
				for (byte i = 0; i < palabra.length(); i++) {
					if (palabra.charAt(i) == tamaño[fila + i][columna - i]) {
						palabraAqui[fila + i][columna - i] = false;
					}
				}
				for (byte i = 0; i < palabra.length(); i++) {
					tamaño[fila + i][columna - i] = palabra.charAt(i);
					palabraAqui[fila + i][columna - i] = true;
				}
				return true;
			}
			return false;
		}

		return false;

	}

}
