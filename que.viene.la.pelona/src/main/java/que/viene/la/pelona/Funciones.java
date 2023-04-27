package que.viene.la.pelona;

import java.util.Random;

public class Funciones {

	/**
	 * Función que dando un tamaño, crea un array de ese tamaño, con todas
	 * las posiciones rellenas con el string "_"
	 * @param tamaño tamaño del array
	 * @return null si el tamaño no está entre 5 y 15, un array del tamaño indicado con todas sus posiciones rellenas con "_" en caso contrario
	 */
	public static String[] generaTablero(byte tamaño) {
		if(tamaño<5||tamaño>15) {
			return null;
		}
		String[] posicion=new String[tamaño];
		for(byte i=0;i<posicion.length;i++) {
			posicion[i]="_";
		}
		return posicion;
	}
	
	//Sortea una posición aleatoria de array (entre 0 y tablero.length-1). Comprueba que en esa posición hay un "_".
	//Si no es así sortea otra vez la posición las veces que haga falta hasta que el valor sorteado caiga en una posición que contiene "_".
	//Una vez obtenida una posición válida, coloca el elemento en esa posición sorteada del tablero
	public static byte colocaElemento(String[] tablero, char elemento) { 
		Random r=new Random();
		byte posicion=(byte)r.nextInt(tablero.length);
		
		/*while(!tablero[posicion].equals("_")) {
			posicion=(byte)r.nextInt(tablero.length);
		}*/
		
		 if(!tablero[posicion].equals("_")){
		 	posicion=colocaElemento(tablero,elemento);
		 }else {
		 	tablero[posicion]= "" + elemento;
		 }
		 return posicion;
		//tablero[posicion]="" + elemento;
	}
	
	public static String imprimeTablero(String[] tablero,String[] tumbas) {
		String ret="| ";
		for(byte i=0;i<tablero.length-1;i++) {
			if(tablero[i].equals("_")) {
				ret+=tumbas[i] + "\t";
			}else {
				ret+=tablero[i] + "\t";
			}
		}
		ret+=(tablero[tablero.length-1].equals("_")?tumbas[tumbas.length-1]:tablero[tablero.length-1]) + (tablero.length>11?" ":"") + " |\n| ";
		for(byte i=0;i<tablero.length-1;i++) {
			ret+=i + "\t";
		}
		return ret + (tablero.length-1) + (!tablero[tablero.length-1].equals("_")?" ":"") + " |";
	}
	
	public static byte moverElemento(String[] tablero, char simbolo, byte direccion, byte posicionElemento) {

		tablero[posicionElemento] = "_";
		// En segundo lugar, cambio la posicion de la pelona
		if (direccion == -1) {
			if (posicionElemento != 0) {
				posicionElemento--;
			} else {// Tratamiento especial para el caso extremo
				posicionElemento = (byte) (tablero.length - 1);
			}
		}
		if (direccion == 1) {
			if (posicionElemento != tablero.length - 1) {
				posicionElemento++;
			} else {// Tratamiento especial para el caso extremo
				posicionElemento = 0;
			}

		}
		// Por último, pinto a la pelona en su nueva posición
		tablero[posicionElemento] = "" + simbolo;

		return posicionElemento;
	}
	
}
