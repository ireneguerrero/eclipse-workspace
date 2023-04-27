package ejercicio8;

import java.util.Random;
/**
 * Clase que contiene funciones para imprimir el menú de acciones y la tumba del final,
 * pensadas para no ocupar tanto espacio en el main.
 * @author Irene Guerrero
 * @version 1.0
 * @since 1
 *
 */
public class Funciones {
	
	/**
	 * Función que imprime el menú de acciones a elegir.
	 * @return devuelve el menú de acciones y se imprime en la consola
	 */
	public static String imprimirMenu() {
		return ("\n¡Elige acción!"
				+ "\n\t1 - Comer"
				+ "\n\t2 - Dormir"
				+ "\n\t3 - Ducharse"
				+ "\n\t4 - Jugar");
	}
	
	/**
	 * Función que dibuja en la consola una tumba para conmemorar la vida del pobre tamagotchi
	 * @param nombreBicho es el nombre del tamagotchi
	 * @param raza es la raza del tamagotchi
	 * @param turnos son los turnos que vivió el tamagotchi
	 * @return devuelve la tumba que es pintada en la consola
	 */
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
