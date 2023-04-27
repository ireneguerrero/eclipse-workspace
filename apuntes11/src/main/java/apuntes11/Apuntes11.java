package apuntes11;

import java.util.Random;
import java.util.Scanner;

public class Apuntes11 {

	public static void main(String[] args) {
		// Tema 4 arrays
		
		Scanner sc=new Scanner(System.in);
		
		/*String[] nombres=new String[7];
		
		
		System.out.println("Dime una posición para poner un nombre de (0-"
						+ (nombres.length-1) + ")");
		byte posicion=Byte.parseByte(sc.nextLine());
		System.out.println("Dime un nombre para la posición " + posicion);
		//nombres[posicion]=sc.nextLine();
		String nom=sc.nextLine();
		if(Funciones.insertarEnArray(nombres, posicion, nom)) {
			System.out.println("Insertado correctamente");
		}else {
			System.out.println("El valor no se puede insertar");
		}
		
		for(byte i=0;i<nombres.length;i++) {
			System.out.println(i + ": "
							+ (nombres[i]!=null?nombres[i].toUpperCase():"-"));
			
		}
		
		char[] palabra= {'p','e','l','o','t','a'};
		System.out.println("Dime la primera posición entre 0 y 5");
		byte posicion1=Byte.parseByte(sc.nextLine());
		System.out.println("Dime la segunda posición entre 0 y 5");
		byte posicion2=Byte.parseByte(sc.nextLine());
		Funciones.intercambiar(palabra, posicion1, posicion2);
		for(byte i=0;i<palabra.length;i++) {
			System.out.print(palabra[i]);
		}*/
		
		char[] palabra= {'p','e','l','o','t','a'};
		char[] original=Funciones.copiaArray(palabra);
		/*char[] original=new char[palabra.length];
		for(byte i=0;i<original.length;i++) {
			original[i]=palabra[i];
		}*/
		
		Random r=new Random();
		System.out.println("¿Cuántos cambios aleatorios quieres que se hagan?");
		short nCambios=Short.parseShort(sc.nextLine());
		//Intercambiamos posiciones aleatoriamente tantas veces como pidamos
		//Cuantas más veces, más difícil será adivinar la palabra original
		for(short i=0;i<nCambios;i++) {
			byte pos1=(byte)r.nextInt(palabra.length);
			byte pos2=(byte)r.nextInt(palabra.length);
			Funciones.intercambiar(palabra, pos1, pos2);
		}
		
		//Pedimos al usuario que adivine la palabra original
		System.out.println("Adivina la palabra original:\n" + Funciones.imprimeArray(palabra));
		String intento=sc.nextLine();
		//Coger el array original y convertirlo a String
		String solucion="";
		for(byte i=0;i<original.length;i++) {
			solucion+=original[i];
		}
		//Comprobar si son iguales
		if(intento.equals(solucion)) {
			System.out.println("¡Acertaste! ¡Esa es la palabra!");
		}else {
			System.out.println("Has fallado...");
		}
		
	}

}
