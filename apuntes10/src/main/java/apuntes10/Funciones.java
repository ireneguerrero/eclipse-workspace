package apuntes10;

public class Funciones {

	/**
	 * Función que dando un iterador y un número te devuelve todos los divisores de ese número menos el mismo
	 * la variable c debería inicializarse siempre a 2 como mínimo
	 * @param c contador, número más pequeño que se mira si es divisor, debería valer 2 como mínimo
	 * @param num número al que se le buscan los divisores, desde c hasta num/2
	 * @return String con todos los divisores de num mayores o iguales a c concatenados y separados por espacios
	 * @deprecated (quiere decir obsoleto, el nombre de la función se tacha)
	 */
	public static String bucleForRecursivo(byte c, long num) {
		String ret="";
		if (c<=num/2) {
			if (num%c==0) {
				ret+=c+" ";
			}
			ret+=Funciones.bucleForRecursivo((byte)(c+1), num);
		}else {//Caso base
			
		}
		return ret;
	}
	
	/**
	 * Versión mejorada de la anterior función
	 * Función que dando un iterador y un número te devuelve todos los divisores de ese número incluido el mismo
	 * la variable c debería inicializarse siempre a 1 como mínimo
	 * @param c contador, número más pequeño que se mira si es divisor, debería valer 1 como mínimo
	 * @param num número al que se le buscan los divisores, desde c hasta él mismo
	 * @return String con todos los divisores de num mayores o iguales a c concatenados y separados por espacios
	 * 
	 */
	public static String bucleForRecursivo(long c, long num) {
		String ret="";
		if (c<=num/2) {
			if (num%c==0) {
				ret+=c+" ";
			}
			ret+=Funciones.bucleForRecursivo(c+1, num);
		}else {//Caso base
			ret=num+" ";
		} 
		return ret;
	}
	
	/*public static String imprimeArray(char[] arr) {
		return "";
	}*/
	
	
	
}
