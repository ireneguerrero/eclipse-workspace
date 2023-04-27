package apuntes6;

import java.util.Scanner;

public class Apuntes6 {

	public static void main(String[] args) {
		// Tema 3 Pruebas For
		/*los for siempre tienen 3 zonas separadas por ;
		  la primera parte es lo que vale al principio
		  la segunda parte se llama la condición de parada que si devuelve verdadero el bucle sigue y si dice falso el bucle para
		  la tercera parte es cómo se modifica la primera parte*/
		
		
		/*//ejercicio4
		Scanner sc=new Scanner(System.in);
		System.out.println("Te voy a construir una pirámide torcía dime la altura");
		byte altura=Byte.parseByte(sc.nextLine());
		//(normal)
		for(byte i=0;i<altura;i++) {
			for(byte j=0;j<i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		//(al revés)
		for(byte i=altura;i>0;--i) {
			for(byte j=0;j<i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		//ejercicio3
		System.out.println("Dime un número y te digo si es primo");
		long numero=Long.parseLong(sc.nextLine());
		for (long j=0;j<numero;j++) {
		boolean esPrimo=true;
		long i;
		for(i=2;i<numero;i++) {
			if(j%i==0) {
				esPrimo=false;
				break;
			}
		}
		if(esPrimo) {
			System.out.println(j + " es primo");
		}
		
		//ejercicio2
		System.out.println("Dime un número y te digo si es primo");
		long numero=Long.parseLong(sc.nextLine());
		boolean esPrimo=true;
		long i;
		for(long i=2;i<numero;i++) {
			if(numero%i==0) {
				System.out.println("A " + numero + " lo divide " + i);
				esPrimo=false;
				break;
			}
		}
		if(esPrimo) {
			System.out.println(numero + " es primo");
		}else {
			System.out.println(numero + " no es primo");
		}
		
		//ejercicio1
		System.out.println("Dime qué tabla de multiplicar quieres");
		byte numero=Byte.parseByte(sc.nextLine());
		for(byte i=10;i>=0;i--) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}*/
		
		
		
		
			
		
	}

}
