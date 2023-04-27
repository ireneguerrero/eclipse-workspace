package apuntes8;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Clase principal que contiene el main
 * @author Irene Guerrero
 */
public class Apuntes8 {

	/**
	 * Función que pide el número por teclado y te dice si es primo
	 * @param args sin uso
	 */
	public static void main(String[] args) {
		// Tema 3 funciones
		/*las funciones se hacen dentro de la clase y fuera del main
		  después de public static puedes poner cualquier tipo de variable, en este caso void significa vacío, osea que cuando termine no devolverá nada
		  después del nombre (siempre en lowerCamelCase) vienen siempre paréntesis, da igual que tengan algo dentro o no
		  primero hace el main y luego la función
		  para que la función de class aparezca en la consola se tiene que poner en el main [el nombre de la clase+.+nombre de la función]
		  para poner una segunda clase en el mismo archivo no marcar el tick del main
		  para que no proteste al cambiar la función a otra clase cambiar el nombre de la clase a la que contiene
		  se pueden crear dos funciones llamadas iguales mientras tenga un número distinto se argumentos,
		  la máquina luego elige qué función usar dependiendo del número de argumentos pida la variable
		  */
		/*System.out.println("Hola soy el main");
		//miPrimeraFuncion();
		//Funciones.miPrimeraFuncion(); //<--- mejor ponerlo así
		int numero0y30=Funciones.numeroAleatorio(30);
		System.out.println(numero0y30);
		int numero50y80=Funciones.numeroAleatorio(50,80);
		System.out.println(numero50y80);*/
		
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("¿Cuántas caras quieres?");
		byte nCaras=Byte.parseByte(sc.nextLine());
		System.out.println("Dime el carácter que quieres para los ojos");
		char ojos=sc.nextLine().charAt(0);
		System.out.println("Dime qué carácter quieres para la boca");
		char boca=sc.nextLine().charAt(0);
		
		for(byte i=0;i<nCaras;i++) {
			System.out.print(" /'''\\ ");
		}System.out.println();
		
		for(byte i=0;i<nCaras;i++) {
			System.out.print("( o o )");
		}System.out.println();
		
		for(byte i=0;i<nCaras;i++) {
			System.out.print(" \\ - / ");
		}System.out.println();
		
		for(byte i=0;i<nCaras;i++) {
			System.out.print("/-----\\");
		}System.out.println();
		
		System.out.println(Funciones.imprimeTrozoPelo("pelo", nCaras));
		//System.out.println(Funciones.imprimeTrozo(Funciones.dibujaPelo(), nCaras));
		//System.out.println(Funciones.imprimeTrozo(" /'''\\ ", nCaras));
		
		System.out.println(Funciones.imprimeTrozoOjos("ojos", nCaras));
		//String trozoOjos=Funciones.imprimeTrozo("( o o )", nCaras);
		//trozoOjos=Funciones.sustituirTrozo(trozoOjos, 'o', ojos);
		//System.out.println(trozoOjos);
		//System.out.println(Funciones.imprimeTrozo("( o o )", nCaras));
		
		System.out.println(Funciones.imprimeTrozoBoca("boca", nCaras));
		//String trozoBoca=Funciones.imprimeTrozo(" \\ - / ", nCaras);
		//System.out.println(Funciones.sustituirTrozo(trozoBoca, '-', boca));
		//System.out.println(Funciones.imprimeTrozo(" \\ - / ", nCaras));
		
		System.out.println(Funciones.imprimeTrozoPelo("/-----\\", nCaras));*/
		
		
		
		
		//System.out.println(Funciones.sustituirTrozo("( o o )", '?'));
		/*
 /'''\
( o o )
 \ - /
/-----\
		
		System.out.print(" /'''\\ ");
		System.out.print(" /'''\\ ");
		System.out.print(" /'''\\ ");
		System.out.println();
		System.out.print("( o o )");
		System.out.print("( o o )");
		System.out.print("( o o )");
		System.out.println();
		System.out.print(" \\ - / ");
		System.out.print(" \\ - / ");
		System.out.print(" \\ - / ");
		System.out.println();
		System.out.print("/-----\\");
		System.out.print("/-----\\");
		System.out.print("/-----\\");
		System.out.println();*/

		System.out.println("¿Anchura máxima?");
		byte anchuraMaxima=Byte.parseByte(sc.nextLine());
		System.out.println(Funciones.imprimeRombo(anchuraMaxima));
		
		

	}

}
