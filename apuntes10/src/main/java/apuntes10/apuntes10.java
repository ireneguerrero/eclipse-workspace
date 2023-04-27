package apuntes10;

import java.util.Random;
import java.util.Scanner;

public class apuntes10 {

	public static void main(String[] args) {
		// Tema 4
		/* si le poner [] estás creando un array de esa variable
		   para inicializar un array se le pone new + la variable que estés usando 
		   + [](dentro de ellos el tamaño que queremos que quepa en esa variable)
		   al array siempre hay que ponerle un tamaño que no se podrá cambiar
		   un array con {} tiene una estructura mientras que en un array null tiene literalmente nada
		   */
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número y te imprimo los divisores");
		long numero=Long.parseLong(sc.nextLine());
		
		System.out.println(Funciones.bucleForRecursivo(2, numero));
		//Convierte a función recursiva este bucle:
		for(long i=0;i<=numero;i++) {
			if(numero%i==0) {
				System.out.println(i);
			}
		}*/

		
		/*int numero=54;
		String texto="hola";
		int [] n2=new int[5];
		n2[3]=-14;
		n2[4]=2345;
		n2[1]=1;
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		System.out.println(n2[2]);
		System.out.println(n2[3]);
		System.out.println(n2[4]);
		
		for(byte i=0;i<n2.length;i++) {
			System.out.print(n2[i]+" ");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el tamaño del array");
		int tamaño=Integer.parseInt(sc.nextLine());
		int [] n2=new int[tamaño];
		
		for(byte i=0;i<n2.length;i++) {
			System.out.println("Dime número en la posición " + (i+1) + "/" + n2.length);
			n2[i]=Integer.parseInt(sc.nextLine());
		}
		int acumulado=0;
		for(byte i=0;i<n2.length;i++) {
			System.out.print(n2[i]+" ");
			acumulado+=n2[i];
		}
		System.out.println("\nMedia: " + 1f*acumulado/n2.length);*/
		
		/*String[] nombres= {"Ana","Miguel","Gustavo","Ambrosio","Pablo","Sofía","Rebeca","Sandra"};
		String[] apellidos= {"Gómez","González","Perea","Martín","Castro","Páramos","Centollo","Pérez","Sánchez","Benítez"};
		Random r=new Random();
		byte posAleatoria=(byte)r.nextInt(nombres.length);
		System.out.println(nombres[posAleatoria]
							+ " " + apellidos[r.nextInt(apellidos.length)]
							+ " " + apellidos[r.nextInt(apellidos.length)]);
		for(byte i=0;i<nombres.length;i++) {
			String actual=nombres[i];
			System.out.println("¿Tiene a? " + actual.contains("a"));
			System.out.println("Nombre en mayúsculas: " + actual.toUpperCase());
			System.out.println("¡" + actual + "! Ven acá p'acá");
		}*/
		char[] letras= {'b','q','$','!'};
		char actual=letras[3];
		float[] flotantes= {1.5f,-2.11111111f,-6f};
		flotantes[0]=3f;
		System.out.println(flotantes[2]);
		System.out.println(letras[3]);
	}

}
