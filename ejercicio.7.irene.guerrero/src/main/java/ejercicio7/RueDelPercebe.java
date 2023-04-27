package ejercicio7;

import java.util.Scanner;

/**
 * Clase principal que contiene el main
 * @author Irene Guerrero
 */
public class RueDelPercebe {

	/**
	 * Función que te pide el número de casas y de pisos por teclado y te las pinta en la consola.
	 * @param args detrás de -nPlantas se indica el número de plantas que tendrá el edificio
	 * @param args detrás de -nPisos se indica cuántos pisos hay en cada casa
	 */
	public static void main(String[] args) {
		//Paso 1 - Las variables a las que afecten los argumentos las declaramos al principio y le damos un valor absurdo (imposible)
		byte nPlantas=-1;
		byte nPisos=-1;
		boolean pintoCartel=true;
		boolean cartelPorArgumentos=false;
		//Paso 2 - Recorrer con un bucle todos los argumentos, buscando los que nos interesan, e ignorando al resto
		for(byte i=0;i<args.length;i++) {
			if(args[i].equals("-nPlantas")) {
				nPlantas=Byte.parseByte(args[i+1]);
			}
			if(args[i].equals("-nPisos")) {
				nPisos=Byte.parseByte(args[i+1]);
			}
			if(args[i].equals("-sinCartel")) {
				pintoCartel=false;
			}
			if(args[i].equals("-conCartel")) {
				cartelPorArgumentos=true;
			}
			if(args[i].equals("-h")||args[i].equals("-help")) {
				System.out.println("Argumentos: "
									+ "\n\t-nPlantas: Después debería de ir el nº de plantas del edificio"
									+ "\n\t-nPisos: Después debería de ir el nº de pisos por planta del edificio"
									+ "\n\t-sinCartel: Hace que el cartel 13 Rue Del Percebe no se pinte"
									+ "\n\t-conCartel: Hace que el cartel 13 Rue Del Percebe sí se pinte");
				System.exit(0);
			}
		}
		
		Scanner sc=new Scanner(System.in);
		
		//Paso 3 - Si se piden por teclado, en el momento de hacerlo, solo los pedimos si siguen teniendo el valor imposible del principio.
		//Porque si valen otra cosa quiere decir que se ha cogido por argumentos
		if(nPlantas==-1) {
			System.out.println("Dime cuantas casas quieres");
			nPlantas=Byte.parseByte(sc.nextLine());
		}
		if(nPisos==-1) {
			System.out.println("Dime cuantos pisos quieres");
			nPisos=Byte.parseByte(sc.nextLine());
		}
		if(pintoCartel==true&&cartelPorArgumentos==false) {
			System.out.println("¿Quieres que pinte el cartel? (s/n)");
			pintoCartel=sc.nextLine().toLowerCase().charAt(0)=='s';
		}
		
		/*if(args.length<1) {
			//En este caso no hay argumentos, por lo que se pide por teclado
		System.out.println("Te voy a construir un edificio, dime el número de casas");		
		nPisos=Byte.parseByte(sc.nextLine());
		}else {
			//Como hay al menos un argumento lo uso para el casasPiso
			nPisos=Byte.parseByte(args[0]);
		}
		
		
		if(args.length<2) {
		System.out.println("Ahora dime el número de plantas");
		nPlantas=Byte.parseByte(sc.nextLine());
		}else {
			nPlantas=Byte.parseByte(args[1]);
		}*/
		
		
		/*if(args.length<3) {
			System.out.println("¿Quieres que pinte el cartel? (s/n)");
			pintoCartel=sc.nextLine().toLowerCase().charAt(0)=='s';
		}else {
			if(args[2].toLowerCase().equals("cartel")) {
				pintoCartel=true;
			}else {
				pintoCartel=false;
			}
		}*/
		
		if(pintoCartel) {
		System.out.println("|--------------------|");
		System.out.println("| 13 Rue del Percebe |");
		System.out.println("|--------------------|");
		}
		
		for (byte i=0;i<nPlantas;i++) {
			System.out.print(Funciones.pintarAltura("|-----|", nPisos));
			System.out.print(Funciones.pintarAltura("|     |", nPisos));
			System.out.print(Funciones.pintarAltura("|     |", nPisos));
		}
		
	}

}
