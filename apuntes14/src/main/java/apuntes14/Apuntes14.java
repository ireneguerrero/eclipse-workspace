package apuntes14;

import java.util.Scanner;

import clases.Animal;
import clases.Gato;
import clases.Persona;
import enumeraciones.Especie;
import enumeraciones.Genero;

public class Apuntes14 {

	public static void main(String[] args) {
		/*
		 * Tema 5 
		 * La variable inicializada se le llama instancia o objeto Si una clase
		 * tiene el tipo final no se puede heredar de ella Si una clase tiene el tipo
		 * abstract no deja modificarla
		 * Las enumeraciones sirven para poner etiquetas al nombre de valores posibles, solamente se pone el nombre
		 * las letras de los enums se escriben todas en mayúsculas y si son más de una palabra separadas por _
		 * son etiquetas y entre ellas se separan por comas
		 * 
		 * Para añadir elementos al ArrayList hay que hacer:
		 * ArrayList <clase> hola = new ArrayList <clase> ();
		 * hola.add(loquesea);
		 * hola.add(loquesea2);
		 * sysout(hola);
		 * 
		 * Sim rodoberto = new Sim("Rodoberto", "Matina", 'h', (byte) -90, (byte) 0,
		 * (byte) 0, (byte) 0, null, null, null, null); rodoberto.comer();
		 * System.out.println(rodoberto.getHambre()); rodoberto.setHambre((byte)-120);
		 * 
		 * Sim mariPepis = new Sim("Mari Pepis", "Cinas", 'm'); mariPepis.comer();
		 * 
		 * Perro sputnik = new Perro("Sputnik", "Labrador", 'h', rodoberto);
		 * 
		 * Gato cooper = new Gato("Cooper", "Siamés", 'h', mariPepis);
		 * 
		 * rodoberto.setMadre(mariPepis);
		 * 
		 * rodoberto.setPerros(new Perro[5]); rodoberto.getPerros()[0]=sputnik;
		 * mariPepis.setGatos(new Gato[] { cooper });
		 * 
		 * cooper.setDueño(mariPepis); sputnik.setDueño(rodoberto);
		 * 
		 * System.out.println(rodoberto); System.out.println(mariPepis); //
		 * System.out.println(sputnik); // System.out.println(cooper);
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el nombre del Sim");
		String nombre = sc.nextLine();
		System.out.println("Dime los apellidos");
		String apellidos = sc.nextLine();

		byte opcionGenero;
		do {
			System.out.println("Dime su género" + "\n\t1 - Hombre" + "\n\t2 - Mujer" + "\n\t3 - Neutro");
			opcionGenero = Byte.parseByte(sc.nextLine());
		} while (opcionGenero < 1 || opcionGenero > 3);
		Genero genero;
		switch (opcionGenero) {
		case 1:
			genero = Genero.HOMBRE;
			break;
		case 2:
			genero = Genero.MUJER;
			break;
		default:
			genero = Genero.NEUTRO;
		}

		Persona miSim = new Persona(nombre, apellidos, genero);

		byte opcion;
		do {
			System.out.println(
					"¿Qué quieres hacer con tu Sim?" + "\n\t0 - Salir" + "\n\t1 - Imprimir" + "\n\t2 - Cambiar nombre"
							+ "\n\t3 - Cambiar apellidos" + "\n\t4 - Cambiar género" + "\n\t5 - Comer"
							+ "\n\t6 - Dormir" + "\n\t7 - Jugar" + "\n\t8 - Ducharse" + "\n\t9 - Crear mascota");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println(miSim);
				break;
			case 2:
				System.out.println("Dime su nuevo nombre");
				miSim.setNombre(sc.nextLine());
				break;
			case 3:
				System.out.println("Dime nuevos apellidos");
				miSim.setApellido(sc.nextLine());
				break;
			case 4:
				byte opcionGeneroSim;
				do {
					System.out.println("Dime su nuevo género" + "\n\t1 - Hombre" + "\n\t2 - Mujer" + "\n\t3 - Neutro");
					opcionGeneroSim = Byte.parseByte(sc.nextLine());
				} while (opcionGeneroSim < 1 || opcionGeneroSim > 3);
				Genero generoSim;
				switch (opcionGeneroSim) {
				case 1:
					generoSim = Genero.HOMBRE;
					break;
				case 2:
					generoSim = Genero.MUJER;
					break;
				default:
					generoSim = Genero.NEUTRO;
				}
				miSim.setGenero(generoSim);
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:
				miSim.setMascota(new Animal[1]);
				byte opcionEspecie;
				do {
					System.out.println("Dime especie:" + "\n\t1 - Gato" + "\n\t2 - Perro" + "\n\t3 - Pavo Real");
					opcionEspecie = Byte.parseByte(sc.nextLine());
				} while (opcionEspecie < 1 || opcionEspecie > 3);
				Especie especie;
				switch (opcionEspecie) {
				case 1:
					especie = Especie.GATO;
					break;
				case 2:
					especie = Especie.PERRO;
					break;
				default:
					especie = Especie.PAVO_REAL;
				}

				System.out.println("Dime raza");
				String raza = sc.nextLine();
				System.out.println("Dime nombre");
				String nombreMascota = sc.nextLine();
				byte opcionGeneroMascota;
				do {
					System.out.println("Dime su nuevo género" + "\n\t1 - Hombre" + "\n\t2 - Mujer" + "\n\t3 - Neutro");
					opcionGeneroMascota = Byte.parseByte(sc.nextLine());
				} while (opcionGeneroMascota < 1 || opcionGeneroMascota > 3);
				Genero generoMascota;
				switch (opcionGeneroMascota) {
				case 1:
					generoMascota = Genero.HOMBRE;
					break;
				case 2:
					generoMascota = Genero.MUJER;
					break;
				default:
					generoMascota = Genero.NEUTRO;
				}
				if (especie == Especie.GATO) {
					miSim.getMascota()[0] = new Gato(nombreMascota, generoMascota, raza, miSim);
				} else {
					miSim.getMascota()[0] = new Animal(nombreMascota, generoMascota, especie, raza, miSim);
				}
				break;
			}

		} while (opcion != 0);

	}

}