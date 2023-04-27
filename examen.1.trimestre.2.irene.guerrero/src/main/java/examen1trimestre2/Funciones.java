package examen1trimestre2;

import java.util.Random;

public class Funciones {

	/**
	 * Función que imprime el aula en la consola
	 * 
	 * @param iconos  iconos que representan a los alumnos
	 * @param nombres nombres de los alumnos
	 * @return devuelve el aula al main y la imprime de la consola
	 */
	public static String imprimeAula(String[][] iconos, String[][] nombres) {
		String ret = "";
		for (byte i = 0; i < iconos.length; i++) {
			for (byte j = 0; j < iconos[i].length; j++) {
				ret += iconos[i][j];
			}
			ret += "\t---->\t";
			for (byte j = 0; j < nombres[i].length; j++) {
				ret += nombres[i][j] + (nombres[i][j].equals("|  ") || nombres[i][j].equals("|🐴") ? "" : "\t");
			}
			ret += "\n";
		}
		return ret;
	}

	/**
	 * Función que sirve para intercambiar los valores de la posición de fila1 y
	 * columna1 de la matriz con los de la fila2 y columna 2
	 * 
	 * @param matriz   matriz donde se intercambian los elementos
	 * @param fila1    fila de la primera coordenada
	 * @param columna1 columna de la primera coordenada
	 * @param fila2    fila de la segunda coordenada
	 * @param columna2 columna de la segunda coordenada
	 */
	public static void intercambiarPosiciones(String[][] matriz, byte fila1, byte columna1, byte fila2, byte columna2) {
		String g = matriz[fila1][columna1];
		matriz[fila1][columna1] = matriz[fila2][columna2];
		matriz[fila2][columna2] = g;
	}

	/**
	 * Función que devuelve dos números aleatorios concatenados en un String y
	 * separados por una coma
	 * 
	 * @param tamanioFilas    el tamaño de las filas
	 * @param tamanioColumnas el tamaño de las columnas
	 * @return devuelve los números aleatorios
	 */
	public static String posicionAleatoriaMatriz(byte tamanioFilas, byte tamanioColumnas) {
		Random r = new Random();
		int fila = r.nextInt(tamanioFilas);
		int columna = r.nextInt(tamanioColumnas);
		return fila + ", " + columna;
	}

	/**
	 * Función que hace que los alumnos se intercambien de posiciones
	 * 
	 * @param iconos  iconos que representan a los alumnos
	 * @param nombres nombres de los alumnos
	 * @param veces   veces que se intercambiarán a los alumnos
	 */
	public static void intercambiarAlumnos(String[][] iconos, String[][] nombres, byte veces) {
		byte fila1, columna1, fila2, columna2;
		for (byte i = 0; i < veces; i++) {
			do {
				String[] posiciones = posicionAleatoriaMatriz((byte) iconos.length, (byte) iconos[0].length).split(",");
				fila1 = Byte.parseByte(posiciones[0]);
				columna1 = Byte.parseByte(posiciones[1]);
			} while (!iconos[fila1][columna1].equals("👨") && !iconos[fila1][columna1].equals("👩")
					&& !iconos[fila1][columna1].equals("◓"));

			do {
				String[] posiciones = posicionAleatoriaMatriz((byte) iconos.length, (byte) iconos[0].length).split(",");
				fila2 = Byte.parseByte(posiciones[0]);
				columna2 = Byte.parseByte(posiciones[1]);
			} while (!iconos[fila2][columna2].equals("👨") && !iconos[fila2][columna2].equals("👩")
					&& !iconos[fila2][columna2].equals("◓"));

			Funciones.intercambiarPosiciones(iconos, fila1, columna1, fila2, columna2);
		}
	}

	/**
	 * Función que busca al caballo dentro del aula, para que esta función funcione,
	 * el caballo debe estar en la columna 2 de alguna de las filas de la matriz
	 * 
	 * @param matriz matriz que representa el tamaño del aula
	 * @return i devuelve la posición en la que está el caballo
	 * @return -1 si no encuentra ninguna fila que cumpla la condición, devuelve -1
	 */
	public static byte buscarCaballo(String[][] matriz) {
		for (byte i = 0; i < matriz.length; i++) {
			if (matriz[i][2].equals("♞")) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Funcion que mueve el caballo por el aula
	 * 
	 * @param iconos    iconos que representan a los alumnos
	 * @param nombres   nombres de los alumnos
	 * @param direccion esta variable tiene que valer 1 o -1
	 * @return
	 */
	public static boolean moverCaballo(String[][] iconos, String[][] nombres, byte direccion) {
		byte posCaballo = buscarCaballo(iconos);
		if (direccion == 1) {
			Funciones.intercambiarPosiciones(iconos, (byte) posCaballo, (byte) 2, (byte) (posCaballo + 1), (byte) 2);
			Funciones.intercambiarPosiciones(nombres, (byte) posCaballo, (byte) 2, (byte) (posCaballo + 1), (byte) 2);
		} else if (direccion == -1) {
			Funciones.intercambiarPosiciones(iconos, (byte) posCaballo, (byte) 2, (byte) (posCaballo - 1), (byte) 2);
			Funciones.intercambiarPosiciones(nombres, (byte) posCaballo, (byte) 2, (byte) (posCaballo - 1), (byte) 2);
		}
		return iconos[0][2].equals("♞") || iconos[iconos.length - 1][2].equals("♞");
	}

}
