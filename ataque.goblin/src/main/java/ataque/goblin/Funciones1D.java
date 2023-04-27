package ataque.goblin;

import java.util.Random;
import java.util.Scanner;

public class Funciones1D {
	public static void jugar(String nombreJugador, char generoJugador) {
		System.out.println("Bienvenid" + Funciones.terminacionGenero(generoJugador, true)
							+ ", " + nombreJugador + " al Ataque de los Goblin 1D");
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el tamaño que tendrá el tablero");
		byte tamaño=Byte.parseByte(sc.nextLine());
		String[] tablero = Funciones1D.creaTablero(tamaño);
		//👨 👩 웃 👺
		String iconoJugador=(generoJugador=='m'?"👨":generoJugador=='f'?"👩":"웃");
		byte posicionJugador=0;
		tablero[posicionJugador]=iconoJugador;
		for(byte i=0;i<(tablero.length/3);i++) { //for(byte i=(byte)(tablero.length-1);i>tablero.length*2/3;i--){
			tablero[tablero.length-1-i]="👺";	 //tablero[i]="👺";
		}										 //}
		Random r=new Random();
		for(short i=0;i<1000;i++) {
			Funciones1D.intercambiaPosicion(tablero, (byte)r.nextInt(tablero.length), (byte)r.nextInt(tablero.length));
		}
		System.out.println(Funciones1D.imprime(tablero));
	}
	
	public static String[] creaTablero(byte tamaño) { //🏻
		String[] tablero=new String[tamaño];
		for(byte i=0;i<tablero.length;i++) {
			tablero[i]="♒"; //♒
		}
		return tablero;
	}
	
	public static String imprime(String[] array) { 
		Random r=new Random();
		String[] simbolos={"♨","🍙","🏞","🌀"}; //♨ 🍙 🏞 🌀
		String ret="";
		
		for(byte i=0;i<array.length+2;i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
		ret += "\n" + simbolos[r.nextInt(simbolos.length)];
		
		for(byte i=0;i<array.length;i++) {
			ret += array[i];
		}
		ret += simbolos[r.nextInt(simbolos.length)] + "\n";
		
		for(byte i=0;i<array.length+2;i++) {
			ret += simbolos[r.nextInt(simbolos.length)];
		}
			
		return ret;
	}
	
	public static void intercambiaPosicion(String[] tablero, byte p1, byte p2) {
		String g=tablero[p1];
		tablero[p1]=tablero[p2];
		tablero[p2]=g;
	}
	
}
