package examen2ireneguerrero;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que contiene el main que crea unas estadísticas de canales de youtube
 * @author irene
 *
 */
public class MiguelApruebamePorFavor {
	
	/**
	 * Función que  te crea las estadísticas de los canales
	 * @param args sin uso
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		/**
		 * Primer bucle que te pide un número de personas entre 1 y 5 para crear sus estadísticas
		 */
		byte numero;
		do {
			System.out.println("Dime un número de personas a introducir entre 1 y 5");
			numero=Byte.parseByte(sc.nextLine());
		}while(numero<1||numero>5);
		
		/**
		 * Segundo bucle que te da a elegir entre introducir tú los datos de las personas o que se generen aleatoriamente
		 */
		byte opcionEscogida;
		do {
			System.out.println("Elige cómo quieres que se generen las personas:"
							+ "\n\t1 - Introduciré los datos"
							+ "\n\t2 - Se generarán aleatoriamente");
			opcionEscogida=Byte.parseByte(sc.nextLine());
		}while(opcionEscogida<1||opcionEscogida>2);
		
		/**
		 * Sinceramente, ni idea, la he liado pardísima porque me crea más estadísticas de las pedidas, yo qué sé.
		 * PD: Perdón por la cantidad de línias, lo hice lo mejor que pude
		 */
		for (numero=0;numero<=1;numero++) {
			if (opcionEscogida==1) {
				System.out.println("Dime el género de la persona:" + "\n\t1 - Hombre" + "\n\t2 - Mujer");
				byte genero=Byte.parseByte(sc.nextLine());
				System.out.println("Dime el nombre de la persona");
				String nombre=sc.nextLine();
				System.out.println("Dime el primer apellido de la persona");
				String apellido1=sc.nextLine();
				System.out.println("Dime el segundo apellido de la persona");
				String apellido2=sc.nextLine();
				System.out.println("Dime el total de horas jugadas a en 2022 de la persona sin decimales");
				short horasJugadas=Short.parseShort(sc.nextLine());
				System.out.println("Dime el total de juegos completados en 2022 de la persona");
				byte juegosCompletados=Byte.parseByte(sc.nextLine());
				
				System.out.println(Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, numero, horasJugadas, opcionEscogida));
			}else if(opcionEscogida==2) {
				String genero="";
				Random g=new Random();
				switch (g.nextInt(2)) {
				case 0:
					genero="hombre";
					break;
				case 1:
					genero="mujer";
					break;
				}
				System.out.print(Funciones.generaApellidoAleatorio()+" ");
				System.out.print(Funciones.generaApellidoAleatorio()+", ");
				System.out.println(Funciones.generaNombreAleatorio(genero));
				System.out.println("____________________________");
				Random añoElegido=new Random();
				int añoNacimiento=añoElegido.nextInt(1970,2004);
				System.out.println("\t Año nacimiento: " + añoNacimiento);
				Random horas=new Random();
				int horasJugadas=horas.nextInt(0,501);
				System.out.println("\t Horas jugadas en 2022: " + horasJugadas);
				Random videojuegos=new Random();
				int videojuegosJugados=videojuegos.nextInt(0,31);
				System.out.println("\t Juegos completados en 2022: " + videojuegosJugados);
			}
		}
		for (numero=0;numero<=2;numero++) {
			if (opcionEscogida==1) {
				System.out.println("Dime el género de la persona:" + "\n\t1 - Hombre" + "\n\t2 - Mujer");
				byte genero=Byte.parseByte(sc.nextLine());
				System.out.println("Dime el nombre de la persona");
				String nombre=sc.nextLine();
				System.out.println("Dime el primer apellido de la persona");
				String apellido1=sc.nextLine();
				System.out.println("Dime el segundo apellido de la persona");
				String apellido2=sc.nextLine();
				System.out.println("Dime el total de horas jugadas a en 2022 de la persona sin decimales");
				short horasJugadas=Short.parseShort(sc.nextLine());
				System.out.println("Dime el total de juegos completados en 2022 de la persona");
				byte juegosCompletados=Byte.parseByte(sc.nextLine());
				
				System.out.println(Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, numero, horasJugadas, opcionEscogida));
			}else if(opcionEscogida==2) {
				String genero="";
				Random g=new Random();
				switch (g.nextInt(2)) {
				case 0:
					genero="hombre";
					break;
				case 1:
					genero="mujer";
					break;
				}
				System.out.print(Funciones.generaApellidoAleatorio()+" ");
				System.out.print(Funciones.generaApellidoAleatorio()+", ");
				System.out.println(Funciones.generaNombreAleatorio(genero));
				System.out.println("____________________________");
				Random añoElegido=new Random();
				int añoNacimiento=añoElegido.nextInt(1970,2004);
				System.out.println("\t Año nacimiento: " + añoNacimiento);
				Random horas=new Random();
				int horasJugadas=horas.nextInt(0,501);
				System.out.println("\t Horas jugadas en 2022: " + horasJugadas);
				Random videojuegos=new Random();
				int videojuegosJugados=videojuegos.nextInt(0,31);
				System.out.println("\t Juegos completados en 2022: " + videojuegosJugados);
			}
		}
		for (numero=0;numero<=3;numero++) {
			if (opcionEscogida==1) {
				System.out.println("Dime el género de la persona:" + "\n\t1 - Hombre" + "\n\t2 - Mujer");
				byte genero=Byte.parseByte(sc.nextLine());
				System.out.println("Dime el nombre de la persona");
				String nombre=sc.nextLine();
				System.out.println("Dime el primer apellido de la persona");
				String apellido1=sc.nextLine();
				System.out.println("Dime el segundo apellido de la persona");
				String apellido2=sc.nextLine();
				System.out.println("Dime el total de horas jugadas a en 2022 de la persona sin decimales");
				short horasJugadas=Short.parseShort(sc.nextLine());
				System.out.println("Dime el total de juegos completados en 2022 de la persona");
				byte juegosCompletados=Byte.parseByte(sc.nextLine());
				
				System.out.println(Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, numero, horasJugadas, opcionEscogida));
			}else if(opcionEscogida==2) {
				String genero="";
				System.out.print(Funciones.generaApellidoAleatorio()+" ");
				System.out.print(Funciones.generaApellidoAleatorio()+", ");
				System.out.println(Funciones.generaNombreAleatorio(genero));
				System.out.println("____________________________");
				Random añoElegido=new Random();
				int añoNacimiento=añoElegido.nextInt(1970,2004);
				System.out.println("\t Año nacimiento: " + añoNacimiento);
				Random horas=new Random();
				int horasJugadas=horas.nextInt(0,501);
				System.out.println("\t Horas jugadas en 2022: " + horasJugadas);
				Random videojuegos=new Random();
				int videojuegosJugados=videojuegos.nextInt(0,31);
				System.out.println("\t Juegos completados en 2022: " + videojuegosJugados);
			}
		}
		for (numero=0;numero<=4;numero++) {
			if (opcionEscogida==1) {
				System.out.println("Dime el género de la persona:" + "\n\t1 - Hombre" + "\n\t2 - Mujer");
				byte genero=Byte.parseByte(sc.nextLine());
				System.out.println("Dime el nombre de la persona");
				String nombre=sc.nextLine();
				System.out.println("Dime el primer apellido de la persona");
				String apellido1=sc.nextLine();
				System.out.println("Dime el segundo apellido de la persona");
				String apellido2=sc.nextLine();
				System.out.println("Dime el total de horas jugadas a en 2022 de la persona sin decimales");
				short horasJugadas=Short.parseShort(sc.nextLine());
				System.out.println("Dime el total de juegos completados en 2022 de la persona");
				byte juegosCompletados=Byte.parseByte(sc.nextLine());
				
				System.out.println(Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, numero, horasJugadas, opcionEscogida));
			}else if(opcionEscogida==2) {
				String genero="";
				Random g=new Random();
				switch (g.nextInt(2)) {
				case 0:
					genero="hombre";
					break;
				case 1:
					genero="mujer";
					break;
				}
				System.out.print(Funciones.generaApellidoAleatorio()+" ");
				System.out.print(Funciones.generaApellidoAleatorio()+", ");
				System.out.println(Funciones.generaNombreAleatorio(genero));
				System.out.println("____________________________");
				Random añoElegido=new Random();
				int añoNacimiento=añoElegido.nextInt(1970,2004);
				System.out.println("\t Año nacimiento: " + añoNacimiento);
				Random horas=new Random();
				int horasJugadas=horas.nextInt(0,501);
				System.out.println("\t Horas jugadas en 2022: " + horasJugadas);
				Random videojuegos=new Random();
				int videojuegosJugados=videojuegos.nextInt(0,31);
				System.out.println("\t Juegos completados en 2022: " + videojuegosJugados);
			}
		}
		for (numero=0;numero<=5;numero++) {
			if (opcionEscogida==1) {
				System.out.println("Dime el género de la persona:" + "\n\t1 - Hombre" + "\n\t2 - Mujer");
				byte genero=Byte.parseByte(sc.nextLine());
				System.out.println("Dime el nombre de la persona");
				String nombre=sc.nextLine();
				System.out.println("Dime el primer apellido de la persona");
				String apellido1=sc.nextLine();
				System.out.println("Dime el segundo apellido de la persona");
				String apellido2=sc.nextLine();
				System.out.println("Dime el total de horas jugadas a en 2022 de la persona sin decimales");
				short horasJugadas=Short.parseShort(sc.nextLine());
				System.out.println("Dime el total de juegos completados en 2022 de la persona");
				byte juegosCompletados=Byte.parseByte(sc.nextLine());
				
				System.out.println(Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, numero, horasJugadas, opcionEscogida));
			}else if(opcionEscogida==2) {
				String genero="";
				Random g=new Random();
				switch (g.nextInt(2)) {
				case 0:
					genero="hombre";
					break;
				case 1:
					genero="mujer";
					break;
				}
				System.out.print(Funciones.generaApellidoAleatorio()+" ");
				System.out.print(Funciones.generaApellidoAleatorio()+", ");
				System.out.println(Funciones.generaNombreAleatorio(genero));
				System.out.println("____________________________");
				Random añoElegido=new Random();
				int añoNacimiento=añoElegido.nextInt(1970,2004);
				System.out.println("\t Año nacimiento: " + añoNacimiento);
				Random horas=new Random();
				int horasJugadas=horas.nextInt(0,501);
				System.out.println("\t Horas jugadas en 2022: " + horasJugadas);
				Random videojuegos=new Random();
				int videojuegosJugados=videojuegos.nextInt(0,31);
				System.out.println("\t Juegos completados en 2022: " + videojuegosJugados);
			}
		}
		
	}

}
