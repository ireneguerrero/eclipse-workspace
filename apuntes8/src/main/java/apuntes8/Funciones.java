package apuntes8;

import java.util.Random;

/**
 * Clase que contiene funciones de ejemplo preparadas para generar
 * números aleatorios, ver si un número es primo y dibujar caras 
 * con algunos caracteres decididos aleatoriamente
 * @author Irene Guerrero
 * @version 1;
 * @since 1;
 *
 */
public class Funciones {
	
	/**
	 * Función que hace un sysout que dice hola
	 */
	public static void miPrimeraFuncion() {
		System.out.println("Hola desde la función");
	}
	
	/**
	 * Función que devuelve un número entero aleatorio entre 
	 * mínimo (incluido) y máximo (excluido). El mínimo tiene que
	 * ser obligatoriamente más pequeño que el máximo.
	 * @param minimo número entero más pequeño que podría salir aleatoriamente. Tiene que ser más pequeño que el máximo.
	 * @param maximo número entero que es una unidad más grande que el que podría salir aleatoriamente como mucho. Tiene que ser más grande que el mínimo.
	 * @return número entero aleatorio entre mínimo (incluido) y máximo (excluido).
	 */
	public static int numeroAleatorio(int minimo,int maximo) {
		Random r=new Random();
		return r.nextInt(minimo,maximo);
	}
	
	/**
	 * Función que devuelve un número aleatorio entre 0 (incluido) y máximo (excluido)
	 * @param maximo número una unidad mayor que el mayor número que podría salir aleatoriamente.
	 * @return número aleatorio entre 0 (incluido) y máximo (excluido) 
	 */
	public static int numeroAleatorio(int maximo) {
		Random r=new Random();
		return r.nextInt(maximo);
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static short suma(byte n1,byte n2) {
		short resultado=(short)(n1+n2);
		return resultado;
	}
	/*public static String imprimeTrozo(String trozo, byte nVeces) {
		String ret="";
		for(byte i=0;i<nVeces;i++) {
			ret+=trozo;
		}
		return ret;
	}*/
	public static String imprimeTrozoPelo(String trozo, byte nVeces) {
		String ret="";
		for(byte i=0;i<nVeces;i++) {
			if(trozo.equals("pelo")) {
				ret+=Funciones.dibujaPelo();
			}else {
				ret+=trozo;
			}
		}
		return ret;
	}
	public static String imprimeTrozoOjos(String trozo, byte nVeces) {
		String ret="";
		for(byte i=0;i<nVeces;i++) {
			if(trozo.equals("ojos")) {
				ret+=Funciones.dibujaOjos();
			}else {
				ret+=trozo;
			}
		}
		return ret;
	}
	public static String imprimeTrozoBoca(String trozo, byte nVeces) {
		String ret="";
		for(byte i=0;i<nVeces;i++) {
			if(trozo.equals("boca")) {
				ret+=Funciones.dibujaBoja();
			}else {
				ret+=trozo;
			}
		}
		return ret;
	}
		
		
		
	/*public static String sustituirTrozo(String trozo,char sustituto) {
		return trozo.replace('o', sustituto);		
	}*/
	public static String sustituirTrozo(String trozo,char paraSustituir,char sustituto) {
		return trozo.replace(paraSustituir, sustituto);		
	}
	public static String dibujaPelo() {
		Random p=new Random();
		String pelo="";
		switch(p.nextInt(4)) {
		case 0:
			pelo=" /'''\\ ";
			break;
		case 1:
			pelo=" /\\_/\\ ";
			break;
		case 2:
			pelo=" @@@@@ ";
			break;
		case 3:
			pelo=" /|||\\ ";
			break;
		}
		return pelo;
	}
	public static String dibujaOjos() {
		Random o=new Random();
		String ojos="";
		switch (o.nextInt(4)) {
		case 0:
			ojos="( o o )";
			break;
		case 1:
			ojos="( x x )";
			break;
		case 2:
			ojos="( ? ? )";
			break;
		case 3:
			ojos="( 8 8 )";
			break;
		}
		return ojos;
	}
	public static String dibujaBoja() {
		Random b=new Random();
		String boca="";
		switch (b.nextInt(4)) {
		case 0:
			boca=" \\ - / ";
			break;
		case 1:
			boca=" \\ v / ";
			break;
		case 2:
			boca=" \\ o / ";
			break;
		case 3:
			boca=" \\ b / ";
			break;
		}
		return boca;
	}
	/*  Ejemplo para hacerlo más corto:
	 	public static String dibujaBoja() {
		Random b=new Random();
		switch (b.nextInt(4)) {
		case 0:
			return " \\ - / ";
		case 1:
			return " \\ v / ";
		case 2:
			return " \\ o / ";
		case 3:
			return " \\ b / ";
		}
		return null;
	}*/
	
/*
  /\
 /  \
<    >
 \  /
  \/*/

	public static String imprimeRombo(byte anchuraMaxima) {
		String ret="|";
		boolean longitudPar=anchuraMaxima%2==0;
		for(byte i=0;i<anchuraMaxima/2-("DEP".length()/2+(longitudPar?1:0));i++) {
			ret+=" ";
		}
		ret+="DEP";
		for(byte i=0;i<anchuraMaxima/2-"DEP".length()/2;i++) {
			ret+=" ";
		}
		ret+="|";
		//Parte central
		ret+="\n<";
		for(byte i=0;i<anchuraMaxima;i++) {
			ret+="-";
		}
		ret+=">\n";
		//Fin parte central
		
		return ret;
	}
	/*public static boolean esPrimo(long numero) {
		for(long i=2;i<=numero/2;i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
	}*/
	
	
}
