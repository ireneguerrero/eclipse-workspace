package apuntes1;

import java.util.Scanner;

public class Apuntes1 {

	public static void main(String[] args) {
		
		//Temas 1 y 2
		//print no hace salto de línea
		// \"\" para poner comillas en una frase
		System.out.print("Hace un \"buen día\",\npara morir. ");
		
		//println salta de línea
		System.out.println("\tAdiós vida, no te echaré de menos.");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu nombre");		;
		String nombre=sc.nextLine();
		System.out.println("Dime tu año de nacimiento");
		Short añoNacimiento=Short.parseShort(sc.nextLine());
		System.out.println("Dime la ciudad donde naciste");
		String ciudadNacimiento=sc.nextLine();
		System.out.println(nombre+" de "+(2022-añoNacimiento)+" años de edad nació en "+ciudadNacimiento);
		
	}

}
