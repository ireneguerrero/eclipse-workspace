package ataque.goblin;

import java.util.Random;
import java.util.Scanner;

public class Funciones2D {
	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, true) + ", " + nombreJugador
				+ " al Ataque de los Goblin 2D");
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el tamaño que tendrá el tablero");
		byte tamaño = Byte.parseByte(sc.nextLine());
		String[][] tablero = Funciones2D.creaTablero(tamaño);
		// 👨 👩 웃 👺
		String iconoJugador = (generoJugador == 'm' ? "👨" : generoJugador == 'f' ? "👩" : "웃");
		byte[] posJugador = { 0, 0 };
		for (byte i = 0; i < (tablero.length / 3); i++) {
			for (byte j = 0; j < tablero[i].length; j++) {
				tablero[tablero.length - 1 - i][j] = "👺";
			}
		}
		// en posJugador[0] siempre almacenamos la fila y en posJugador[1] la columna
		tablero[posJugador[0]][posJugador[1]] = iconoJugador;
		Random r = new Random();
		for (short i = 0; i < 1000; i++) {
			byte f0 = (byte) r.nextInt(tablero.length);
			byte c0 = (byte) r.nextInt(tablero[f0].length);
			byte f1 = (byte) r.nextInt(tablero.length);
			byte c1 = (byte) r.nextInt(tablero[f1].length);
			Funciones2D.intercambiaPosicion(tablero, f0, c0, f1, c1);
		}
		System.out.println(Funciones2D.imprime(tablero));
		System.out.println(Funciones2D.goblinsAlrededor(tablero, posJugador));
	}

	/**
	 * Función que intercambia en matriz el elemento que haya en (f0,c0)por lo que
	 * haya en la posición (f1,c1)
	 * 
	 * @param matriz matriz donde se intercambian los elementos
	 * @param f0     fila de la primera coordenada
	 * @param c0     columna de la primera coordenada
	 * @param f1     fila de la segunda coorsdenada
	 * @param c1     columna de la segunda coordenada
	 */
	public static void intercambiaPosicion(String[][] tablero, byte f0, byte c0, byte f1, byte c1) {
		String g = tablero[f0][c0];
		tablero[f0][c0] = tablero[f1][c1];
		tablero[f1][c1] = g;
	}

	public static String[][] creaTablero(byte tamaño) { // 🏻
		String[][] tablero = new String[tamaño][tamaño];
		for (byte i = 0; i < tablero.length; i++) {
			for (byte j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = "♒"; // ♒
			}
		}
		return tablero;
	}

	public static String imprime(String[][] matriz) {
		Random r = new Random();
		String[] icono = { "♨", "🍙", "🏞", "🌀" }; // ♨ 🍙 🏞 🌀
		String ret = "";
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}
		ret += "\n";
		for (byte i = 0; i < matriz.length; i++) {
			ret += icono[r.nextInt(icono.length)];
			for (byte j = 0; j < matriz[i].length; j++) {
				ret += matriz[i][j];
			}
			ret += icono[r.nextInt(icono.length)];
			ret += "\n";
		}
		for (byte i = 0; i < matriz.length + 2; i++) {
			ret += icono[r.nextInt(icono.length)];
		}
		return ret;
	}

	/**
	 * Función que compruebe en los alrededores de posJugador, cuántas casillas hay
	 * que tengan un goblin, y devuelva en un byte el nº de goblins que tiene
	 * alrededor
	 * 
	 * @param matriz     matriz tablero(usa la de la función jugar)
	 * @param posJugador array siempre de dos posiciones. En la posición 0 está el
	 *                   nº de fila donde está el jugador, y en la posición 1, el nº
	 *                   de columna donde está el jugador
	 * @return byte que cuenta cuánto goblins tiene el jugador alrededor
	 */
	public static byte goblinsAlrededor(String[][] matriz, byte[] posJugador) {
		byte contadorGoblins = 0;
		byte fila = posJugador[0];
		byte columna = posJugador[1];
		// fila arriba
		if (fila > 0 && matriz[fila - 1][columna].equals("👺")) {
			contadorGoblins++;
		}
		// fila abajo
		if (fila < matriz.length - 1 && matriz[fila + 1][columna].equals("👺")) {
			contadorGoblins++;
		}
		// columna izquierda
		if (columna > 0 && matriz[fila][columna - 1].equals("👺")) {
			contadorGoblins++;
		}
		// columna derecha
		if (columna < matriz[fila].length - 1 && matriz[fila][columna + 1].equals("👺")) {
			contadorGoblins++;
		}
		// diagonal arriba izquierda
		if ((fila > 0 && columna > 0) && matriz[fila - 1][columna - 1].equals("👺")) {
			contadorGoblins++;
		}
		// diagonal abajo izquierda
		if ((fila < matriz.length - 1 && columna > 0) && matriz[fila + 1][columna - 1].equals("👺")) {
			contadorGoblins++;
		}
		// diagonal arriba derecha
		if ((fila > 0 && columna < matriz[fila].length - 1) && matriz[fila - 1][columna + 1].equals("👺")) {
			contadorGoblins++;
		}
		// diagonal abajo derecha
		if ((fila < matriz.length - 1 && columna < matriz[fila].length - 1)
				&& matriz[fila + 1][columna + 1].equals("👺")) {
			contadorGoblins++;
		}
		return (byte) contadorGoblins;
	}

}
