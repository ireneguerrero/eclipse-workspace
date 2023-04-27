package ejercicios.recursividad.y.strings;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
	// Ejercicios2
	public static short cuentaLetras(String texto, char letra) {
		short contador = 0;
		String ret = "";
		while (texto.indexOf(letra) != -1) {
			contador++;
			texto = texto.substring(texto.indexOf(letra) + 1);
		}
		return contador;
	}

	// ejercicio 3
	public static String dibujarBarcos(short numeroBarcos) {
		String ret = "";
	
			for (short i = 0; i < numeroBarcos; i++) {
				ret+= "      /|      ";
			}
				ret+="\n";
			for (short i = 0; i < numeroBarcos; i++) {
				ret+= "      \\|      ";
			}
			ret+="\n";
			for (short i = 0; i < numeroBarcos; i++) {
				ret+= "-------|------";
			}
			ret+="\n";
			for (short i = 0; i < numeroBarcos; i++) {
				ret+= "\\------------/";
			}
		

		return ret;
	}

	// ejercicio 4
	public static short loQueQueda(String orig, String subString) {
		short posicionInicial = (short) orig.indexOf(subString);
		if (posicionInicial != -1) {
			orig = orig.substring(posicionInicial + subString.length());
			short longitud = (short) orig.length();
			return longitud;

		} else if (posicionInicial == -1) {
			return posicionInicial;
		}
		return posicionInicial; // Aqui no va a llegar
	}

	// ejercicio 5
	public static String patadadizarRefran(String miRefran) {
		Random ran = new Random();
		String refran = "patada en la entrepierna";
		String resultado = "";
		char ret = 'a';
		char rat = 'e';
		if (miRefran.indexOf(",") != -1) {
			if (miRefran.lastIndexOf(",") != miRefran.indexOf(",")) {
				return null;
			} else {
				byte simboloAzar = (byte) (ran.nextInt(5));
				switch (simboloAzar) {
				case 0:
					ret = '#';
					break;
				case 1:
					ret = '$';
					break;
				case 2:
					ret = '€';
					break;
				case 3:
					ret = '@';
					break;
				case 4:
					ret = '&';
					break;
				}
				simboloAzar = (byte) (ran.nextInt(5));
				switch (simboloAzar) {
				case 0:
					rat = '#';
					break;
				case 1:
					rat = '$';
					break;
				case 2:
					rat = '€';
					break;
				case 3:
					rat = '@';
					break;
				case 4:
					rat = '&';
					break;
				}

				miRefran = miRefran.replace(miRefran.substring(miRefran.indexOf(",") + 2), refran);
				resultado +=ret+" " + miRefran + " "+rat;
				return resultado;
			}

		} else {
			return null;
		}

	}

	// ejercicio 6
	public static byte descifrarQuiero(String cifrado) {
		String ret="";
		byte contador=1;
		for (short i = 0; i < cifrado.length(); i++) {

			ret += (char) (cifrado.charAt(i)+contador);
			if(i==cifrado.length()-1) {
				contador--;
				ret="";
				i=-1;
			}
			if(ret.contains("Quiero")) {
				return contador;
			}
		}

		return contador;//Aqui no llega
	}

	// Ejercicio 7
	public static String codificado(String real, short numero) {
		String ret = "";
		for (short i = 0; i < real.length(); i++) {
			ret += (char) (real.charAt(i) + numero);
		}
		return ret;
	}
	// EJercicio 8

	public static String funcionRecursiva(String textito, short id, byte iterador) {
		String ret = "";
		if (iterador < textito.length()) {
			ret += (char) (textito.charAt(iterador) + id);
			ret += Funciones.funcionRecursiva(textito, id, (byte) (iterador + 1));
		}

		return ret;
	}

	// Ejercicio 9
	public static String devueltaRecursiva(byte max) {
		Scanner sc = new Scanner(System.in);
		String ret = "";
		System.out.println("Dime un numero que sea entre 1-4");
		byte numero = Byte.parseByte(sc.nextLine());
		if (numero > 0 && numero <= 4 && max <= 4) {
			ret += numero;
		} else if (numero < 1 || numero > 4 || max > 4) {
			Funciones.devueltaRecursiva(max);
		}

		return ret;
	}

	// Ejercicio 10
	public static String descodificar(String codificado) {
		String ret = "";
		codificado = codificado.replace('-', 'a');
		codificado = codificado.replace('@', 'p');
		codificado = codificado.replace('%', 'b');
		ret = codificado;
		return ret;

	}

	// Ejercicio 12
	public static String imprimeVocal(String textito, short entero) {
		String ret = "";

		if (entero < textito.length()) {
			if (textito.charAt(entero) == 'a' || textito.charAt(entero) == 'e' || textito.charAt(entero) == 'i'
					|| textito.charAt(entero) == 'o' || textito.charAt(entero) == 'u') {
				ret += textito.charAt(entero) + " ";
			}
			ret += Funciones.imprimeVocal(textito, (short) (entero + 1));
		}
		return ret;

	}

	// EJErcicio 13
	public static String whileRecursivo() {
		Scanner sc = new Scanner(System.in);
		String ret = "";
		System.out.println("Dime un numerito");
		byte numerito = Byte.parseByte(sc.nextLine());
		if (numerito > 50 || numerito < 1) {
			ret += Funciones.whileRecursivo();
		} else {
			ret += numerito;
		}
		return ret;
	}

	// Ejercicio 15

	public static String imprimeArray(char[] letritas) {
		String ret = "";
		for (byte i = 0; i < letritas.length; i++) {
			ret += letritas[i] + " ";
		}

		return ret;
	}
}
