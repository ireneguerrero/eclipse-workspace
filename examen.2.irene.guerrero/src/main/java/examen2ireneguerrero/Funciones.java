package examen2ireneguerrero;

import java.util.Random;

/**
 * Clase que contiene las funciones del examen
 * @author irene
 * @version 1.0
 * @since 1
 *
 */
public class Funciones {

	/**
	 * Función que te genera un nombre aleatorio, iba a ser dependiendo del género pero me he rayado y lo metí todo junto
	 * @param genero string que elige entre hombre y mujer
	 * @return devuelve el nombre aleatorio
	 */
	public static String generaNombreAleatorio (String genero) {
		Random g=new Random();
		String nombre="";
		switch (g.nextInt(10)){
		case 0:
			nombre="Manolo";
			break;
		case 1:
			nombre="Jesús";
			break;
		case 2:
			nombre="Jose";
			break;
		case 3:
			nombre="Miguel";
			break;
		case 4:
			nombre="Carlos";
			break;
		case 5:
			nombre="Mar";
			break;
		case 6:
			nombre="Mónica";
			break;
		case 7:
			nombre="Naomi";
			break;
		case 8:
			nombre="Irene";
			break;
		case 9:
			nombre="Paula";
			break;
		}
		return nombre;
	}
	
	/**
	 * Función que te crea apellidos aleatorios
	 * @return devuelve el apellido aleatorio
	 */
	public static String generaApellidoAleatorio() {
		Random a=new Random();
		String apellido="";
		switch(a.nextInt(5)) {
		case 0:
			apellido="Guerrero";
			break;
		case 1:
			apellido="Camuña";
			break;
		case 2:
			apellido="Seys";
			break;
		case 3:
			apellido="Llanes";
			break;
		case 4:
			apellido="Holgado";
			break;
		}
		return apellido;
	}
	/**
	 * Función que te imprime los datos de la persona dependiendo de lo que has respondido en el main
	 * @param nombre el nombre de la persona
	 * @param apellido1 el primer apellido de la persona
	 * @param apellido2 el segundo apellido de la persona
	 * @param añoNacimiento el año de nacimiento de la persona
	 * @param horasJugadas la cantidad de horas jugadas en total del año 2022 de la persona
	 * @param juegosJugados la cantidad de juegos jugados en total del año 2022 de la persona
	 * @return devuelven los datos impresos
	 */
	public static String imprimeDatosPersona(String nombre, String apellido1, String apellido2, short añoNacimiento, short horasJugadas, byte juegosJugados) {
		return apellido1 + " " + apellido2 + ", " + nombre
				+ "\n____________________________"
				+ "\n\t Año nacimiento: " + añoNacimiento
				+ "\n\t Horas jugadas en 2022: " + horasJugadas
				+ "\n\t Juegos completados en 2022: " + juegosJugados + "\n";
	}
}
