package ataque.goblin;

import java.util.Scanner;

public class Funciones {

	public static char pideGenero() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el género de tu personaje (m/f/n)");
		char genero=sc.nextLine().charAt(0);
		if(genero!='m'&&genero!='f'&&genero!='n') {
			System.out.println("Introduce un genero válido");
			return Funciones.pideGenero();
		}
		return genero;
	}
	
	public static char terminacionGenero(char genero, boolean masculinoIncluido) {
		if(genero=='f') {
			return 'a';
		}
		if(genero=='n') {
			return 'i';
		}
		if(genero=='m') {
			if(masculinoIncluido==true) {
				return 'o';
			}
		}
		return 0;
	}
	
}
