package ejercicio8;

import java.util.Scanner;

/**
 * Clase que contiene el main dedicada a crear un tamagotchi por consola
 * @author Irene Guerrero
 *
 */
public class TuPropioTamagochi {
	
	/**
	 * Función que te crea un tamagotchi por consola
	 * @param args sin uso
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		/**
		 * Variables utilizadas en el ejercicio
		 */
		String nombre="";
		String raza="";
		byte opcionRaza;
		boolean estaVivo=true;
		byte estadoHambre=50;
		byte estadoSueño=50;
		byte estadoHigiene=50;
		byte estadoDiversion=50;
		byte estadoPaseo=50;
		byte estadoMate=50;
		byte turnos=0;
		
		
		/**
		 * Primer bucle que imprime la bienvenida al juego y te da a elegir entre 4 opciones de razas
		 */
		do{
			System.out.println("¡Bienvenido al mundo Tamagotchi!"
					+"\nElige la raza de tu próximo compañero: " 
					+ "\n\t1 - Perro."
					+ "\n\t2 - Gato."
					+ "\n\t3 - Hipopótamo."
					+ "\n\t4 - Capibara.");
			opcionRaza = Byte.parseByte(sc.nextLine());
			switch (opcionRaza) {
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
			 default:
				 System.out.println("Tienes que escoger un número entre 1 y 4");
				 break;
		 }	
		
		}while (opcionRaza<1||opcionRaza>4);
		 
		
		/**
		 * Segundo bucle que te pide el nombre del tamagotchi
		 * Este bucle sirve para asegurarse de que el nombre del tamagotchi no contenga ningun número
		 */
		do {
			System.out.println("Dime el nombre de tu " + raza);
			nombre = sc.nextLine();
		}while ((nombre.contains("0")||nombre.contains("1")||nombre.contains("2")||nombre.contains("3")||nombre.contains("4")||nombre.contains("5")
					||nombre.contains("6")||nombre.contains("7")||nombre.contains("8")||nombre.contains("9")));
		
		/**
		 * No sabía de qué forma poner este sysout dentro del bucle para que quedara bonito, sorry Miguel
		 */
		System.out.println("¡Enhorabuena! Tu compañero ahora se llama " + nombre + " el " + raza);
		
		/**
		 * Tercer bucle que sirve para dar las estadísticas, es el núcleo del juego y contiene una de las funciones creadas
		 */
		do {		
			System.out.println(nombre + " el " + raza + "\n--------------------------"
					+ "\nHambre - " + estadoHambre
					+ "\nSueño - " + estadoSueño
					+ "\nHigiene - " + estadoHigiene
					+ "\nDiversión - " + estadoDiversion);
			
			switch(opcionRaza) {
			 case 1:
				System.out.println("Paseo - " + estadoPaseo);
				break;
			 case 4:
				System.out.println("Mate - " + estadoMate);
				break;
			}
			System.out.println(Funciones.imprimirMenu());
			switch(opcionRaza){
			 case 1:
				 System.out.println("\t5 - Ir de paseo");
				 break;
			 case 4:
				 System.out.println("\t5 - Tomar mate");
			}
			
			byte elegirAccion=Byte.parseByte(sc.nextLine());
			
			/**
			 * Aquí me morí
			 */
			switch(elegirAccion) {
			 case 1:
				 estadoHambre+=20;
				 if(estadoHambre>=100) {
					 estadoHambre=100;
				 }
				 estadoSueño -= 10;
				 estadoHigiene -= 10;
				 estadoDiversion -= 10;
				 estadoPaseo -= 10;
				 estadoMate -= 10;
				 break;
			 case 2:
				 estadoSueño+=20;
				 if(estadoSueño>=100) {
					 estadoSueño=100;
				 }
				 estadoHambre -= 10;
				 estadoHigiene -= 10;
				 estadoDiversion -= 10;
				 estadoPaseo -= 10;
				 estadoMate -= 10;
				 break;
			 case 3:
				 estadoHigiene+=20;
				 if(estadoHigiene>=100) {
					 estadoHigiene=100;
				 }
				 estadoHambre -= 10;
				 estadoSueño -= 10;
				 estadoDiversion -= 10;
				 estadoPaseo -= 10;
				 estadoMate -= 10;
				 break;
			 case 4:
				 estadoDiversion+=20;
				 if(estadoDiversion>=100) {
					 estadoDiversion=100;
				 }
				 estadoHambre -= 10;
				 estadoSueño -= 10;
				 estadoHigiene -= 10;
				 estadoPaseo -= 10;
				 estadoMate -= 10;
				 break;
			 case 5:
				 if(raza.equals("perro")) {
					 estadoPaseo+=20;
					 if(estadoPaseo>=100) {
						 estadoPaseo=100;
					 }
					 estadoHambre -= 10;
					 estadoSueño -= 10;
					 estadoHigiene -= 10;
					 estadoDiversion -= 10;
				 }
				 if(raza.equals("capibara")) {
					 estadoMate+=20;
					 if(estadoMate>=100) {
						 estadoMate=100;
					 }
					 estadoHambre -= 10;
					 estadoSueño -= 10;
					 estadoHigiene -= 10;
					 estadoDiversion -= 10;
				 }
				 break;
			}
			
			/**
			 * Aquí me morí *2
			 */
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
			
			turnos++;
		}while (estaVivo!=false);
		
		/**
		 * Función que imprime la tumba
		 * Aquí me morí *3
		 */
		System.out.println(Funciones.imprimeTumba(nombre, raza, turnos));

	}

}
