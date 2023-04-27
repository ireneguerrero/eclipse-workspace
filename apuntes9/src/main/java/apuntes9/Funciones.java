package apuntes9;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que implementa varias funciones donde probamos las principales características de String
 * @author irene
 *
 */
public class Funciones {

	public static String mayusculasAleatorias(String original) {
		String ret="";
		Random r=new Random();
		for(int i=0;i<original.length();i++) {
			char letra=original.charAt(i);
			if(r.nextBoolean()) {
				ret+=(""+letra).toUpperCase();
			}else {
				ret+=(""+letra).toLowerCase();
			}
		}
		return ret;
	}
	
	public static String quitaEspacios(String orig) {
		String copia=orig;
		
		while(copia.contains("\t\t")) {
			copia=copia.replace("\t\t", " ");
		}
		while(copia.contains("\t ")) {
			copia=copia.replace("\t ", " ");
		}
		while(copia.contains(" \t")) {
			copia=copia.replace(" \t", " ");
		}
		while(copia.contains("  ")) {
			copia=copia.replace("  ", " ");
		}
		return copia;
	}
	
	public static void funcionRecursiva() {
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Entiendes la recursividad?");
		char respuesta=sc.nextLine().toLowerCase().charAt(0);
		if(respuesta=='n') { //Caso recursivo la función se invoca a si misma
			Funciones.funcionRecursiva();
		}else { //Caso base
			System.out.println("Me alegra oírlo");
		}
	}
	
	/**
	 * Función recuriva que itera desde 0 a 4 imprimiento todos esos números
	 * @param c iretador que debe empezar en 0 y acaba en 5 (equivale a i en el for)
	 */
	public static void bucleForRecursivo(byte c) {
		if (c<5) { //Caso recursivo
			System.out.println(c);
			Funciones.bucleForRecursivo((byte)(c+1));
		}else { //Caso base
			
		}
	}
	
	public static String bucleForRecursivoSinSysout(byte c) {
		String ret="";
		if (c<5) { //Caso recursivo
			ret+=c+" ";
			ret+=Funciones.bucleForRecursivoSinSysout((byte)(c+1));
		}else { //Caso base
			
		}
		return ret;
	}
}
