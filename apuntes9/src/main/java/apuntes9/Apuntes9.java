package apuntes9;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase principal que lanza el main, donde hacemos pruebas con string
 * @author irene
 *
 */
public class Apuntes9 {
	//Tema 4
	/**
	 * Función main del programa, donde hacemos varios experimentos con string
	 * @param args sin uso
	 */
	public static void main(String[] args) {
		/*
		//El festival de caras largas que teníamos en clase solo era superado por las ganas de echarse una cerveza
		Scanner sc=new Scanner (System.in);
		System.out.println("Dime un texto");
		String texto=sc.nextLine();
		System.out.println(texto.strip());
		System.out.println(Funciones.mayusculasAleatorias(texto));
		System.out.println("¿Empieza el texto con \"hol\"? "
							+ texto.startsWith("hol"));
		System.out.println("¿Empieza el texto con \"hol\"? "
				+ texto.endsWith("hol"));
		System.out.println("¿Está en blanco? "
				+ texto.isBlank());
		System.out.println("¿Está vacía? "
				+ texto.isEmpty());
		System.out.println(Funciones.quitaEspacios(texto));
		System.out.println(texto.repeat(5421));
		
		
		Funciones.funcionRecursiva();
		
		
		for(byte i=0;i<5;i++) {
			System.out.println(i);
		}
		Funciones.bucleForRecursivo((byte)0);*/
		
		
		System.out.println(Funciones.bucleForRecursivoSinSysout((byte)0));
	}

}
