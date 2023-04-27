package examen3ireneguerrero;

public class Funciones {

	/**
	 * Función que cuenta las letras que hay en mayúscula y en minúscula y te imprime el resultado por consola
	 * @param frase la frase de la que va a contar las letras
	 * @param indice argumento que empieza desde 0 y contea la cantidad de caracteres que no son ni mayúsculas ni minúsculas.
	 * @return devuelve el contador más la propia función
	 */
	public static int cuentaNoLetras(String frase, int indice) {
		  if (indice >= frase.length()) {
		    return 0;
		  }

		  char c = frase.charAt(indice);
		  int contador = 0;
		  if (!Character.isUpperCase(c) && !Character.isLowerCase(c)) {
		    contador++;
		  }

		  return contador + Funciones.cuentaNoLetras(frase, indice + 1);
		  
	}
}
