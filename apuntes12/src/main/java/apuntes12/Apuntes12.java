package apuntes12;

public class Apuntes12 {

	public static void main(String[] args) {
		// Tema 4
		
		/*String frase="A las tres de la tarde, es muy mala hora para empezar una clase, "
					+ "es la hora de estar tranquilo sentado, digiriendo la comida";
		
		String[] resultado=frase.split(" ");
		System.out.println("Número de palabras: " + resultado.length);
		System.out.println("Número de espacios: " + (resultado.length-1));
		
		String[] resultado=frase.split("hora");
		System.out.println("Número de veces que aparece \"hora\": " + (resultado.length-1));
		
		String[] resultado=frase.split("");
		System.out.println(Funciones.imprimeArray(resultado));
		
		String frase="hola cien años, encima de ver hola nuestras ciudades cerdos volando, "
					+ "veremos otras cosas que nos hola";
		
		String [] separado=(" " + frase + " !").split(" hola ");
		System.out.println("Veces que aparece \"hola\": " + (separado.length-1));
		System.out.println(Funciones.imprimeArray(separado));*/
		
		/*Función que compare si dos arrays de char son iguales.
		  Cabecera:
		  public static boolean sonIguales(char[] a1, char[] a2)
		  - Comprueba que el tamaño de ambos arrays es el mismo. Si no lo es, devuelve false
		  - Recorre posición por posición los dos arrays, mirando si cada posición i tiene
		    el mismo valor en los dos arrays. O sea, si a1[i] es igual a a2[i] para todos, 
		    si encuentras alguno que no sea igual, devuelve false.
		  - Al final de la función, fuera del bucle, devuelve true.*/
		char[] a= {'a','b'};
		char[] b= {'a','b','z'};
		System.out.println(Funciones.sonIguales(a, b));
	}

}
