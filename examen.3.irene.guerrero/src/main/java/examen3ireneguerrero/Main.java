package examen3ireneguerrero;

import java.util.Random;
import java.util.Scanner;

public class Main {

	/**
	 * Función que contiene el main
	 * @author irene
	 * @since 1
	 * @version 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Random r=new Random();
		
		//1
		System.out.println("Dime un número");
		int tamaño=Integer.parseInt(sc.nextLine());
		byte[]numeros=new byte [tamaño];
		char[]letras=new char[tamaño];
		
		//2
		for(byte i=0;i<numeros.length;i++) {
			int numAleatorio=r.nextInt(32,127);
			numeros[i]=(byte)numAleatorio;
			letras[i]=(char)numAleatorio;
			System.out.println(numeros[i]);
			System.out.println(letras[i]);
		}
		
		//3
		String frase="";		
		for(byte i=0;i<letras.length;i++) {
			frase+=letras[i];
			if(letras[i]=='A'&&letras[i]=='E'&&letras[i]=='I'&&letras[i]=='O'&&letras[i]=='U') {
				letras[i]=Character.toLowerCase(letras[i]);
			}
		}
		System.out.println(frase);
		
		//4
		/**
		 * Hay un lío aquí tremendo, no me preguntes lo que pasa porque no sé
		 */
		System.out.println("Dime un número entre 97 y 122 y te diré qué posición tienen en la tabla ASCII");
		byte posicion1=Byte.parseByte(sc.nextLine());
		System.out.println("Dime otro número entre 97 y 122 y te diré qué posición tienen en la tabla ASCII");
		byte posicion2=Byte.parseByte(sc.nextLine());
		System.out.println(letras[posicion1] + " " + letras[posicion2]);
		
		//5
		int contador=0;
		for (int i = 0; i < numeros.length; i++) {
			  char c=frase.charAt(i);
			  if(!Character.isUpperCase(c) && !Character.isLowerCase(c)) {
				  contador++;
			  }
			  
		}
		
		//6
		/**
		 * Una forma más liosa pero al menos lo he conseguido
		 */
		frase= frase.replace('A', 'a');
		frase= frase.replace('E', 'e');
		frase= frase.replace('I', 'i');
		frase= frase.replace('O', 'o');
		frase= frase.replace('U', 'u');
		System.out.println(frase);
		
		//7
		System.out.print("Ingrese el índice de inicio: ");
		int inicio = sc.nextInt();
		System.out.print("Ingrese el índice final: ");
		int fin = sc.nextInt();
		String subcadena = frase.substring(inicio, fin);
		System.out.println(subcadena);

		//8
		/*int contador1 = 0;
		for (int i = 0; i < frase.length(); i++) {
		  char c = frase.charAt(i);
		  if (!Character.isUpperCase(c) && !Character.isLowerCase(c)) {
		    contador1++;
		  }
		}

		System.out.println("Hay " + contador1 + " caracteres que no son ni mayúsculas ni minúsculas.");*/
		
		//9
		int contador1 = Funciones.cuentaNoLetras(frase, 0);
		System.out.println("Hay " + contador1 + " caracteres que no son ni mayúsculas ni minúsculas.");
	}

}
