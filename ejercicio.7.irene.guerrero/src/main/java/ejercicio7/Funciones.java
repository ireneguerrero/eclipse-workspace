package ejercicio7;

/**
 * Clase que contiene la función que pinta un edificio en el main
 * @author Irene Guerrero
 * @version 1.0;
 * @since 1;
 *
 */
public class Funciones {
	
	/**
	 * Función que declara variables para repetir el dibujo de los pisos que pidan.
	 * @param casa define el dibujo que queremos que se repita.
	 * @param nVeces1 define el número de veces que se piden por consola para que se repita la variable "casa".
	 * @return Devuelve un String para repetir el dibujo de los pisos que se pidan.
	 */
	public static String pintarAltura(String casa, byte nVeces1) {
		String ret="";
		for (byte i=0;i<nVeces1;i++) {
			System.out.print(casa);
		}
		System.out.println();
		return ret;
	}

	
}
