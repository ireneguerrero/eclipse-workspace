package solucion.examen2;

import java.util.Random;
import java.util.Scanner;

public class SolucionExamen2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		byte veces;
		do{
			System.out.println("Dime un número entre 1 y 5");
			veces=Byte.parseByte(sc.nextLine());
		}while (veces<1||veces>5);
		
		byte opcion;
		do {
			System.out.println("Dime cómo quieres generar a las personas:"
								+ "\n\t1 - Generar a mano"
								+ "\n\t2 - Generar aleatoriamente");
			opcion=Byte.parseByte(sc.nextLine());
		}while(!(opcion==1||opcion==2));

		String infoPersonas="";
		short horasJugadasTotales=0;
		short horasJugadasMaximo=-1;
		String nombreMayorJugon="";
		for(byte i=0;i<veces;i++) {
			if (opcion==1) {//Generar a mano
				//System.out.println("Escribe m para elegir mujer o h para hombre");
				//boolean esMujer=sc.nextLine().charAt(0)=='m';
				char genero;
				
				do {
					System.out.println("Escribe m para elegir mujer o h para hombre");
					genero=sc.nextLine().charAt(0);
				}while(genero!='h'&&genero!='m');
				System.out.println("Dime tu nombre");
				String nombre=sc.nextLine();
				System.out.println("Dime tu primer apellido");
				String apellido1=sc.nextLine();
				System.out.println("Dime tu segundo apellido");
				String apellido2=sc.nextLine();
				System.out.println("Dime tu año de nacimiento");
				short añoNacimiento=Short.parseShort(sc.nextLine());
				System.out.println("Dime nº horas jugadas en 2022");
				short horasJugadas2022=Short.parseShort(sc.nextLine());
				horasJugadasTotales+=horasJugadas2022;
				if(horasJugadas2022>horasJugadasTotales) {
					nombreMayorJugon=apellido1 + " " + apellido2 + ", " + nombre;
				}
				System.out.println("Nº juegos que te has pasado este año");
				byte juegosJugados2022=Byte.parseByte(sc.nextLine());
				infoPersonas+=
				Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, añoNacimiento, horasJugadas2022, juegosJugados2022);	
			}else {//Generar aleatorio
				char genero='m';
				Random r=new Random();
				if(r.nextBoolean()) {
					genero='h';
				}
				
				String nombre=Funciones.generaNombreAleatorio(genero);
				String apellido1=Funciones.generaApellidoAleatorio();
				String apellido2=Funciones.generaApellidoAleatorio();
				short añoNacimiento=(short)r.nextInt(1970,2004);
				short horasJugadas2022=(short)r.nextInt(501);
				byte nJuegosPasados=(byte)r.nextInt(31);
				infoPersonas+=
						Funciones.imprimeDatosPersona(nombre, apellido1, apellido2, añoNacimiento, horasJugadas2022, nJuegosPasados);
				horasJugadasTotales+=horasJugadas2022;
				if(horasJugadas2022>horasJugadasTotales) {
					nombreMayorJugon=apellido1 + " " + apellido2 + ", " + nombre;
				}
			}
			System.out.println(infoPersonas);
			System.out.println("Horas jugadas totales: " + horasJugadasTotales);
			System.out.println("Mayor jugón: " + nombreMayorJugon);
		}
	}

}
