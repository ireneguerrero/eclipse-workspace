package ejercicio.tamagotchi.corregido;

import java.util.Scanner;

public class EjercicioTamagotchiCorregido {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String raza=null;
				
		do{
			System.out.println("¡Bienvenido al mundo Tamagotchi!"
					+"\nElige la raza de tu próximo compañero: " 
					+ "\n\t1 - Perro."
					+ "\n\t2 - Gato."
					+ "\n\t3 - Hipopótamo."
					+ "\n\t4 - Capibara.");
			
			switch (Byte.parseByte(sc.nextLine())) {
			 case 1:
				 System.out.println("¡Has escogido perro!");
				 raza="perro";
				 break;
			 case 2:
				 System.out.println("¡Has escogido gato!");
				 raza="gato";
				 break;
			 case 3:
				 System.out.println("¡Has escogido hipopótamo!");
				 raza="hipopótamo";
				 break;
			 case 4:
				 System.out.println("¡Has escogido capibara!");
				 raza="capibara";
				 break;
		 }	
		
		}while (raza==null||(!raza.equals("perro")&&!raza.equals("gato")&&!raza.equals("hipopótamo")&&!raza.equals("capibara")));
		 
		String nombre;
		do {
			System.out.println("Dime el nombre de tu " + raza);
			nombre = sc.nextLine();
			if(Funciones.tieneNumeros(nombre)) {
				System.out.println("Sin números ¬ ¬");
			}
		}while (Funciones.tieneNumeros(nombre));
		System.out.println("¡Enhorabuena! Tu compañero ahora se llama " + nombre + " el " + raza);
		
		boolean estaVivo=true;
		byte estadoHambre=50;
		byte estadoSueño=50;
		byte estadoHigiene=50;
		byte estadoDiversion=50;
		byte estadoPaseo=50;
		byte estadoMate=50;
		byte turnos=0;
		do {
			turnos++;
			System.out.println(nombre + " el " + raza + "\n--------------------------"
					+ "Turnos jugados: " + turnos
					+ "\nHambre - " + estadoHambre
					+ "\nSueño - " + estadoSueño
					+ "\nHigiene - " + estadoHigiene
					+ "\nDiversión - " + estadoDiversion
					+ (raza.equals("perro")?"\nPaseo - " + estadoPaseo:"")
					+ (raza.equals("capibara")?"\nMate - " + estadoMate:""));
			System.out.println(Funciones.imprimirMenu(raza));
			
			switch(Byte.parseByte(sc.nextLine())) {
			 case 0:
				estaVivo=false;
				break;
			 case 1:
				 estadoHambre+=25;
				 if(estadoHambre>100) {
					 estadoHambre=105;
				 }
				 break;
			 case 2:
				 estadoSueño+=25;
				 if(estadoSueño>100) {
					 estadoSueño=105;
				 }
				 break;
			 case 3:
				 estadoHigiene+=25;
				 if(estadoHigiene>100) {
					 estadoHigiene=105;
				 }
				 break;
			 case 4:
				 estadoDiversion+=25;
				 if(estadoDiversion>100) {
					 estadoDiversion=105;
				 }
				 break;
			 case 5:
				 if(raza.equals("perro")) {
					 estadoPaseo+=25;
					 if(estadoPaseo>100) {
						 estadoPaseo=105;
					 }
				 }else if(raza.equals("capibara")) {
					 estadoMate+=25;
					 if(estadoMate>100) {
						 estadoMate=105;
					 }
				 }
				 break;
			}
			estadoHambre -= 5;
			estadoSueño -= 5;
			estadoHigiene -= 5;
			estadoDiversion -= 5;
			
			if(raza.equals("perro")) {
				 estadoPaseo -= 5;
			 }else if(raza.equals("capibara")) {
				 estadoMate -= 5;
			 }
			
			
			if(estadoHambre==0) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió de hambre en el turno " + turnos + " *llora*");
			}else if(estadoSueño==0) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió de insomnio en el turno " + turnos + " *llora*");
			}else if(estadoHigiene==0) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió deprimido en el turno " + turnos + " *llora*");
			}else if(estadoDiversion==0) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió aplastado por el peso de su propia mugre en el turno " + turnos + " *llora*");
			}else if(raza.equals("perro") && estadoPaseo==0) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió por no salir a la calle en el turno " + turnos + " *llora*");
			}else if(raza.equals("capibara") && estadoMate==0) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió por síndrome de abstinencia en el turno " + turnos + " *llora*");
			}else if(turnos>=30) {
				estaVivo=false;
				System.out.println("NOOOOO " + nombre + " el " + raza + " murió de viejo en el turno " + turnos + " *llora*");
			}
			
			
		}while (estaVivo!=false);
		
		System.out.println(Funciones.enterrar(nombre, raza, turnos));

	}

}
