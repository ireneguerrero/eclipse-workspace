package que.viene.la.pelona;

import java.util.Random;
import java.util.Scanner;

public class LaPelona {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		boolean tumbaEncima=false;
		char teclaIzda='a'; 
		char teclaDcha='d';
		
		for(byte i=0;i<args.length;i++) {
			if(args[i].equals("-teclaIzda")) {
				teclaIzda=args[i+1].charAt(0);
			}
			if(args[i].equals("-teclaDcha")) {
				teclaDcha=args[i+1].charAt(0);
			}
		}
		
		System.out.println("⚰️⚰️⚰️⚰️⚰️ Que viene la pelonaaaa ⚰️⚰️⚰️⚰️⚰️");
		byte tamaño;
		do {
			System.out.println("Dime tamaño del tablero ( 5 - 15 )");
			tamaño=Byte.parseByte(sc.nextLine());
		}while(tamaño<5||tamaño>15);
		
		//Pido el nº de muertes objetivo
		System.out.println("¿A cuántas personas quieres sacar de este plano de existencia?");
		byte muertesObjetivo=Byte.parseByte(sc.nextLine());
		byte contadorMuertes=0;
			
		//generamos el tablero con el tamaño dado
		String[] tablero=Funciones.generaTablero(tamaño);
		
		//El segundo tablero tumbas, va a servir para colocar las tumbas 
		//en las posiciones en las que se vayan produciendo muertes
		String[] tumbas=Funciones.generaTablero(tamaño);
		byte posCalavera=Funciones.colocaElemento(tablero, '☠');//☠
		byte posCondenado=Funciones.colocaElemento(tablero, 'ඞ');//ඞ
		
		System.out.println(Funciones.imprimeTablero(tablero, tumbas));
		
		//contador de turnos
		short contadorTurnos=0;
		//bucle de juego
		//for(contadorTurnos=0;muertesObjetivo>contadorMuertes;contadorTurnos++) 
		for(contadorTurnos=0;contadorMuertes<muertesObjetivo;contadorTurnos++){
			//1 - obtener las entradas
			System.out.println("¿A dónde quieres moverte? (Izquierda - " + teclaIzda + " / Derecha - " + teclaDcha + ")");
			char direccion=sc.nextLine().charAt(0);
			
			byte direccionMovimiento=0;
			if (direccion == teclaDcha) {
				direccionMovimiento=1;
			} else if (direccion == teclaIzda) {
				direccionMovimiento=-1;
			}
			posCalavera=Funciones.moverElemento(tablero, '☠', direccionMovimiento, posCalavera);
			//2 - calcular las consecuencias
			//2.1 - la calavera se mueve
			if (tumbaEncima == false) {
				if (contadorMuertes < muertesObjetivo / 2) {
					if (posCondenado != posCalavera) {
						posCondenado = Funciones.moverElemento(tablero, 'ඞ', (byte) (r.nextBoolean() ? -1 : 1),
								posCondenado);
						if (posCondenado == posCalavera) { // ?=entonces //:=sino
							tablero[posCalavera] = "☠";
						}
					}
				} else {
					if (posCondenado != posCalavera) {
						posCondenado = Funciones.moverElemento(tablero, 'ඞ', direccionMovimiento, posCondenado);
						if (posCondenado == posCalavera) { // ?=entonces //:=sino
							tablero[posCalavera] = "☠";
						}
					}
				}
				if (tumbas[posCondenado] == "☗") {
					tumbaEncima = true;
				}
			} else {
				tumbaEncima = false;
			}
			//2.2 - si la muerte pilla al condenado, el condenado la espicha
			if(posCalavera==posCondenado) {
				contadorMuertes++;
				tumbas[posCondenado]="☗";
				tablero[posCalavera]="☠";
				if(contadorMuertes==muertesObjetivo) {
					break;
				}
				posCondenado=Funciones.colocaElemento(tablero, 'ඞ');//ඞ
			}
			
			//3 - imprimir la siguiente imagen
			System.out.println("\n\nMuertes: " + contadorMuertes + "/" + muertesObjetivo);		
			System.out.println(Funciones.imprimeTablero(tablero, tumbas));
		}
		System.out.println("☗☗☗☗☗ Mwahahahahaha ☗☗☗☗☗");//☗
		System.out.println("Has cosechado " + contadorMuertes + " almas...");
		System.out.println("Has tardado " + contadorTurnos + " turnos, en un tablero de tamaño " + tablero.length);
		
	}	

}
