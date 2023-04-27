package apuntes4;

import java.util.Scanner;

public class Apuntes4 {

	public static void main(String[] args) {

		//Tema3 
		Scanner scan = new Scanner(System.in);
		char genero='x';
		while(genero!='h'&&genero!='m'&&genero!='n') {		
			System.out.println("Escribe h si eres hombre, " + "m si eres mujer" + " o n si eres genero neutro");
			genero=scan.nextLine().charAt(0);
		}
		
		switch(genero) {
		case 'h':
		case 'H':
			System.out.println("Bienvenido al programa");
			break;
		case 'm':
		case 'M':
			System.out.println("Bienvenida al programa");
			break;
		case 'n':
		case 'N':
			System.out.println("Bienvenide al programa");
			break;
		default:
			System.out.println("Debes elegir una de estas opciones:"
								+ "\n\t1 - m para mujer"
								+ "\n\t2 - h para hombre"
								+ "\n\t3 - n para neutro");
			break;
		}
		
		
		/*Hacer un switch que:
		 Si elijo h me muestre un mensaje: "Bienvenido al programa"
		 Si elijo m me ponga: "Bienvenida al programa"
		 Si elijo n me ponga: "Bienvenide al programa"
		 
		boolean esMujer=(scan.nextLine().equals("m")?true:false);
		if (scan.nextLine().equals("m")) {
			esMujer=true;
		} else {
			esMujer=false;
		}*/
		
		
		System.out.println("Escribeme una " + "palabra que no sea \"Cermuzo\"");

		String palabra = scan.nextLine();
	
		
		/*No poner ; con if siempre con {}
		else siempre tiene que ir justo después de un if y también con {}
		un else puede ir dentro de un if y viceversa, hay veces que dentro de un else solo va un if y nada más, cuando pasa eso se suele poner "elsif"
		cuando pasa eso se le quita {} al else y se deja el del if
		los case siempre van acompañados con un break para "cerrar el caso"
		con el if hay que poner ifs en todas las opciones y con el switch hace todo de corrido hasta que se encuentre con el break de la opción elegida
		switch también va con {}
		el default solo se ejecuta si ninguno de los case se cumplen, también debe ir con break
		detrás del break no puede ir nada más que no sea un ;
		con el charAt para poner una letra la tienes que escribir de forma numérica empezando por el 0,
		si da pereza, pon la letra entre ''*/
		
		if (palabra.length() > 8) {
			System.out.println("No me gustan las palabras largas");
		}
		
		else if (palabra.equals("cermuzo")||palabra.equals("Cermuzo")) {
			System.out.println("Te he dicho que no me pongas " + "cermuzo, so cermuz" + (genero=='h'?"o":(genero=='h'?"a":"e")));
			System.out.println("Escribe la palabra otra vez");
			palabra=scan.nextLine();
		}
		
		else if(palabra.equals("Cancamusa")){
			System.out.println("Me alegro que no hayas puesto cermuzo");
		}
		
		System.out.println("Bienvenid" + (genero=='h'?"o":(genero=='h'?"a":"e")) + ", " + "has puesto la palabra: "
							+ palabra + ", ¿Qué quieres hacer" + " con ella?"
							+ "\n\t1 - Invertir la palabra"
							+ "\n\t2 - Codificar la palabra");
		
		byte opcion=Byte.parseByte(scan.nextLine());
		switch(opcion) {
			case 1:
				System.out.println("Aquí pondré la palabra al revés");
				break; 
			case 2:
				System.out.println("Aquí codificaré la palabra");
				break;
			default:
				System.out.println("Debiste elegir 1 o 2");
				break;
		}
		
	}

}
