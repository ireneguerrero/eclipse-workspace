package apuntes7;

import java.util.Random;
import java.util.Scanner;

public class Apuntes7 {

	public static void main(String[] args) {
		//Tema 3 más pruebas for
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un texto y le hacemos transformaciones en el programa");
		String codificado="";
		String original="";
		String mimificado="";
		String codificadoLetra="";
		String texto=sc.nextLine();
		
		byte opcion;
		do {
			System.out.println("Elige una opción: "
								+ "\n\t0 - Salir"
								+ "\n\t1 - Invertir la cadena"
								+ "\n\t2 - Poner todo en mayúsculas"
								+ "\n\t3 - Poner todo en minúsculas"
								+ "\n\t4 - Poner mayúscula la primera letra, minúscula el resto"
								+ "\n\t5 - Mimificar el texto"
								+ "\n\t6 - Codificar el texto"
								+ "\n\t7 - Decodificar el texto"
								+ "\n\t8 - Codificar con caracteres aleatorios"
								+ "\n\t9 - EXTRA (sin relación) - Adivina qué número estoy pensando"
								+ "\n\t10 - Desmimificar el texto");
			opcion=Byte.parseByte(sc.nextLine());
			switch(opcion) {
			case 1:
				//te lo imprime normal
				/*for(short i=0;i<texto.length();i++) {
					System.out.print(texto.charAt(i));
				}
				System.out.println();*/
				
				//te lo imprime invertido
				for(short i=(short)(texto.length()-1);i>=0;i--) {
					System.out.print(texto.charAt(i));
				}
				System.out.println();
				break;
			case 2:
				texto=texto.toUpperCase();
				System.out.println(texto);
				break;
			case 3:
				texto=texto.toLowerCase();
				System.out.println(texto);
				break;
			case 4:
				String resultado=""+texto.toUpperCase().charAt(0);//para convertir un char a un string poner ""+ antes
				for(short i=1;i<texto.length();i++) {
					resultado+=texto.toLowerCase().charAt(i);
				}
				System.out.println(resultado);
				break;
			case 5:
				//hola-->hmiomilmiami
				mimificado="";
				for(short i=0;i<texto.length();i++) {
					mimificado+=texto.charAt(i)+"mi";
				}
				System.out.println(mimificado);
				break;
			case 6:
				codificado="";
				for(short i=0;i<texto.length();i++) {
					codificado+=(char)(texto.charAt(i)+8);
				}
				System.out.println(codificado);
				break;
			case 7:
				original="";
				for(short i=0;i<codificado.length();i++) {
					original+=(char)(codificado.charAt(i)-8);
				}
				System.out.println(original);
				break;
			case 8:
				//Hacer lo mismo que el caso 6 pero que entre letra y letra colocar una letra aleatoria entre a y z
				codificadoLetra="";
				Random letraAle=new Random();
				char letraRandom;
				for(short i=0;i<texto.length();i++) {
					letraRandom=(char)letraAle.nextInt(97,123);
					codificadoLetra+=texto.charAt(i)+Character.toString(letraRandom);
				}
				System.out.println(codificadoLetra);
				break;
			case 9:
				Random aleatorio=new Random();
				int numeroElegido=aleatorio.nextInt(1,11);
				System.out.println("He elegido un número entre 1 y 10, adivina cuál");
				byte numeroEscogido;
				do {
					numeroEscogido=Byte.parseByte(sc.nextLine());
					if(numeroEscogido!=numeroElegido) {
						System.out.println("Ese no era :(");
					}
				}while(numeroEscogido!=numeroElegido);
				System.out.println("¡Has acertado! :D");
				
				/*Random aleatorio=new Random();
				for(byte i=0;i<30;i++) {
					int numeroElegido=aleatorio.nextInt(-100,100);//para que sea entre números específicos poner , entre ellos, el menor primero ej: -100,100
					System.out.println(numeroElegido);
				}*/
				break;
			case 10:
				for(short i=0;i<mimificado.length();i=(short) (i+3)) {
					System.out.print(mimificado.charAt(i));
				}
				
				/*original=mimificado.replace("mi", "");
				System.out.println(original);*/
				break;
			}
			
			System.out.println("\nPulsa intro para continuar...");
			sc.nextLine();
			
		}while(opcion!=0);

	}

}
