package ejercicio.tamagotchi.corregido;

import java.util.Random;

public class Funciones {

	public static boolean tieneNumeros(String cadena) {
		return cadena.contains("0")||cadena.contains("1")||cadena.contains("2")||cadena.contains("3")||cadena.contains("4")||cadena.contains("5")
				||cadena.contains("6")||cadena.contains("7")||cadena.contains("8")||cadena.contains("9");
	}
	
	
	public static String imprimirMenu() {
		return "\n¡Elige acción!"
				+ "\n\t0 - Matarlo"
				+ "\n\t1 - Comer"
				+ "\n\t2 - Dormir"
				+ "\n\t3 - Ducharse"
				+ "\n\t4 - Jugar";
	}
	
	public static String imprimirMenu(String raza) {
		return "\n¡Elige acción!"
				+ "\n\t0 - Matarlo"
				+ "\n\t1 - Comer"
				+ "\n\t2 - Dormir"
				+ "\n\t3 - Ducharse"
				+ "\n\t4 - Jugar"
				+ (raza.equals("perro")?"\n\t5 - Pasear":"")
				+ (raza.equals("capibara")?"\n\t5 - Tomar mate":"");
	}
	
	public static String enterrar(String nombre, String raza, byte turnos) {
		String ret=" ";
		String dep="D.E.P";
		String nombreRaza=nombre + " el " + raza;
		String turnosVividos="Vivió " + turnos + " turnos";
		String fraseAleatoria=null;
		
		Random r=new Random();
		switch(r.nextInt(4)) {
		case 0:
			fraseAleatoria="Se ha morido";
			break;
		case 1:
			fraseAleatoria="Dimitió de existir";
			break;
		case 2:
			fraseAleatoria="La ha espichado";
			break;
		case 3:
			fraseAleatoria="Viaja hacia las estrellas";
			break;
		}
		String cadenaMasLarga=dep;
		short longitudMaxima=(short)dep.length();
		if(fraseAleatoria.length()>longitudMaxima) {
			longitudMaxima=(short)fraseAleatoria.length();
			cadenaMasLarga=fraseAleatoria;
		}
		if(turnosVividos.length()>longitudMaxima) {
			longitudMaxima=(short)turnosVividos.length();
			cadenaMasLarga=turnosVividos;
		}
		if(nombreRaza.length()>longitudMaxima) {
			longitudMaxima=(short)nombreRaza.length();
			cadenaMasLarga=nombreRaza;
		}
		//Para poder poner un espacio al principio y otro al final de la frase
		//para dejar margen con los bordes de la lápida
		longitudMaxima+=2;
		
		for(short i=0;i<longitudMaxima+1;i++) {
			ret+="_";
		}
		ret+="\n|\\";
		for(short i=0;i<longitudMaxima;i++) {
			ret+="_";
		}
		ret+="\\\n||";
		for(short i=0;i<longitudMaxima/2-dep.length()/2;i++) {
			ret+=" ";
		}
		ret+=dep;
		for(short i=0;i<longitudMaxima/2-dep.length()/2-(dep.length()%2+longitudMaxima%2);i++) {
			ret+=" ";
		}
		ret+="|\n||";
		for(short i=0;i<longitudMaxima/2-nombreRaza.length()/2;i++) {
			ret+=" ";
		}
		ret+=nombreRaza;
		if(cadenaMasLarga.equals(nombreRaza)) {
			for(short i=0;i<longitudMaxima/2-nombreRaza.length()/2-(nombreRaza.length()%2+longitudMaxima%2);i++) {
			ret+=" ";
			}
		
		}
		ret+="|\n||";
		for(short i=0;i<longitudMaxima/2-fraseAleatoria.length()/2;i++) {
			ret+=" ";
		}
		ret+=fraseAleatoria;
		for(short i=0;i<longitudMaxima/2-fraseAleatoria.length()/2-(fraseAleatoria.length()%2+longitudMaxima%2);i++) {
			ret+=" ";
		}
		ret+="|\n||";
		
		return ret;
	}
	
	
	public static String imprimeTumba(String nombreBicho, String raza, byte turnos) {
		String nombre=nombreBicho + " el " + raza;
		String enBlanco1="";
		String enBlanco2="";
		String enBlanco3="";
		
		byte espaciosFaltan1=(byte) (31-nombre.length());
		for(byte i=0;i<espaciosFaltan1/2;i++) {
			enBlanco1+=" ";
		}
		nombre=enBlanco1+nombre+enBlanco1;
		String contadorTurnos="Vivió " + turnos + " turnos";
		
		byte espaciosFaltan2=(byte)(31-contadorTurnos.length());
		for(byte i=0;i<espaciosFaltan2/2;i++) {
			enBlanco2+=" ";
		}
		contadorTurnos=enBlanco2+contadorTurnos+enBlanco2;
		
		String fraseMuerte="";
		Random r=new Random();
		switch (r.nextInt(4)) {
		 case 0:
			fraseMuerte="Se ha morido";
			break;
		 case 1:
			fraseMuerte="Dimitió de existir";
			break;
		 case 2:
			fraseMuerte="La ha espichado";
			break;
		 case 3:
			fraseMuerte="Viaja hacia las estrellas";
			break;
		}
		
		String contadorFraseMuerte=fraseMuerte;
		byte espaciosFaltan3=(byte)(30-contadorFraseMuerte.length());
		for(byte i=0;i<espaciosFaltan3/2;i++) {
			enBlanco3+=" ";
		}
		contadorFraseMuerte=enBlanco3+contadorFraseMuerte+enBlanco3;
		
		return " _________________________________\r\n"
				+ "|\\_________________________________\\\r\n"
				+ "| |             D.E.P              |\r\n"
				+ "| | "+ nombre + " |\r\n"
				+ "| | "+ contadorFraseMuerte + "  |\r\n"
				+ "| | "+ contadorTurnos + " |\r\n"
				+ "| |                                |\r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n";
		
	}
}
