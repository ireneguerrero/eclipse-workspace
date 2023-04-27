package sopa.de.letras;

import java.util.Scanner;

public class SopaDeLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Generación de la matriz
		System.out.println("¿De cuántas filas quieres la sopa?");
		byte nFilas = Byte.parseByte(sc.nextLine());
		System.out.println("¿De cuántas columnas quieres la sopa?");
		byte nColumnas = Byte.parseByte(sc.nextLine());
		boolean[][] palabraAqui = new boolean[nFilas][nColumnas];
		char[][] sopa = Funciones.creaSopa(nFilas, nColumnas);

		// Inserción de la palabra
		System.out.println("¿Cuántas palabras quieres insertar?");
		byte nPalabras = Byte.parseByte(sc.nextLine());
		byte contador = 0;

		do {
			contador++;

			System.out.println("Dime una palabra que quieras insertar en la sopa");
			String palabra = sc.nextLine();
			System.out.println("Dime la direccion que quieres poner tu palabra:"
					+ "- Si es 0, se insertará en horizontal hacia adelante\r\n"
					+ "- Si es 1, se insertará en horizontal hacia atrás\r\n"
					+ "- Si es 2, se insertará en vertical hacia arriba\r\n"
					+ "- Si es 3,se insertará en vertical hacia abajo\r\n"
					+ "- Si es 4, se insertará en diagonal hacia arriba a la derecha\r\n"
					+ "- Si es 5, se insertará en diagonal hacia arriba a la izquierda\r\n"
					+ "- Si es 6, se insertará en diagonal hacia abajo a la derecha\r\n"
					+ "- Si vale 7, se insertará en diagonal hacia abajo a la izquierda");
			byte direccion = Byte.parseByte(sc.nextLine());

			System.out.println("Dime la fila donde quieres insertar la palabra");
			byte fInsercion = Byte.parseByte(sc.nextLine());
			System.out.println("Dime la columna donde quieres insertar la palabra");
			byte cInsercion = Byte.parseByte(sc.nextLine());

			Funciones.insertaPalabra(sopa, palabraAqui, palabra, fInsercion, cInsercion, direccion);
		} while (contador < nPalabras);
		// Imprimimos matriz
		System.out.println(Funciones.imprimeMatriz(sopa));

		for (byte i = 0; i < palabraAqui.length; i++) {
			for (byte j = 0; j < palabraAqui[i].length; j++) {
				System.out.print(palabraAqui[i][j] + " ");
			}
			System.out.println();
		}

	}

}
