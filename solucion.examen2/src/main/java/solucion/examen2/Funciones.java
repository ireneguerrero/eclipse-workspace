package solucion.examen2;

import java.util.Random;

public class Funciones {

	public static String  generaNombreAleatorio(char genero) {
		Random r=new Random();
		if(genero=='h') {
			switch(r.nextInt(5)) {
			case 0:
				return "Ambrosio";
			case 1:
				return "Lucas";
			case 2:
				return "Canduterio";
			case 3:
				return "Pepe";
			default:
				return "Javier";
			}
		}else {
				switch(r.nextInt(5)) {
				case 0:
					return "Eustaquia";
				case 1:
					return "Galatea";
				case 2:
					return "Carmen";
				case 3:
					return "María";
				default:
					return "Cintia";
			}
			
		}
		
	}
	
	public static String  generaApellidoAleatorio() {
		Random r=new Random();
			switch(r.nextInt(5)) {
			case 0:
				return "Noso";
			case 1:
				return "Tardo";
			case 2:
				return "Ligro";
			case 3:
				return "Tira";
			default:
				return "Gonzalez";
			}
	}
	
	public static String imprimeDatosPersona(String n, String a1, String a2, short aN, short hJ, byte jC) {
		String ret="";
		String nombreCompleto=a1 + " " + a2 + ", " + n;
		ret+=nombreCompleto + "\n";
		for(short i=0;i<nombreCompleto.length();i++) {
			ret+="_";
		}
		ret+="\n\tAño de nacimiento: " + aN + "\n";
		ret+="\n\tHoras jugadas en 2022: " + hJ + "\n";
		ret+="\n\tJuegos completados en 2022: " + jC + "\n";
		return ret;
	}
	
}
