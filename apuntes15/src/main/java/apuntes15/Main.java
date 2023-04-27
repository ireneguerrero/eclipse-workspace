package apuntes15;

import java.util.Scanner;

import clases.Animal;
import clases.Gato;
import clases.Persona;
import enums.Especie;
import enums.Genero;
import excepciones.ApellidoConNumerosException;
import excepciones.NombreConNumerosException;

public class Main {

	public static void main(String[] args) {
//		IndexOutOfBoundsException ioobe = new IndexOutOfBoundsException();
//		System.out.println("Buenas tardes");
//		throw ioobe;

//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Dime un número");
//			byte numero = Byte.parseByte(sc.nextLine());
//			System.out.println("El número que me has dado era " + numero);
//		} catch (NumberFormatException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("Me tenías que haber dicho un número");
//			System.err.println(e.getMessage());
//			System.err.println("Me tenías que haber dicho un número");
//		}
//		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Adioooooooooooos");

		Scanner sc = new Scanner(System.in);

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

		Persona miSim = null;
		boolean nombreOk = false;
		boolean apellidoOk = false;
		do {
			try {
				System.out.println("Dime el nombre del Sim");
				String nombre = sc.nextLine();
				nombreOk = true;
				System.out.println("Dime los apellidos");
				String apellidos = sc.nextLine();
				miSim = new Persona(nombre, apellidos, genero);
				apellidoOk = true;
			} catch (NombreConNumerosException e1) {
				System.err.println(e1.getMessage());
			} catch (ApellidoConNumerosException e) {
				System.err.println(e.getMessage());
			}
		} while (!nombreOk&&!apellidoOk);
		
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
				nombreOk = false;
				do {
					try {
						System.out.println("Dime su nuevo nombre");
						miSim.setNombre(sc.nextLine());
						nombreOk = true;
					} catch (NombreConNumerosException e) {
						System.err.println(e.getMessage());
					}
				} while (!nombreOk);
				break;
			case 3:
				apellidoOk = false;
				do {
					try {
						System.out.println("Dime su nuevo apellido");
						miSim.setApellido(sc.nextLine());
						apellidoOk = true;
					} catch (ApellidoConNumerosException e) {
						System.err.println(e.getMessage());
					}
				} while (!apellidoOk);
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
					nombreOk = false;
					do {
						try {
							System.out.println("Dime nombre");
							String nombreMascota = sc.nextLine();
							miSim.getMascota()[0] = new Gato(nombreMascota, generoMascota, raza, miSim);
							nombreOk = true;
						} catch (NombreConNumerosException e1) {
							System.err.println(e1.getMessage());
						}
					} while (!nombreOk);
				} else {
					nombreOk = false;
					do {
						try {
							System.out.println("Dime nombre");
							String nombreMascota = sc.nextLine();
							miSim.getMascota()[0] = new Gato(nombreMascota, generoMascota, raza, miSim);
							nombreOk = true;
						} catch (NombreConNumerosException e1) {
							System.err.println(e1.getMessage());
						}
					} while (!nombreOk);
				}
				break;
			}

		} while (opcion != 0);
	}

}
