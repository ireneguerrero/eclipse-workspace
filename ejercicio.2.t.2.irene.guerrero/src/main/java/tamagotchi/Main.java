package tamagotchi;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enums.Especie;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;
		do {
			System.out.println("¡Bienvenido al mundo Tamagotchi!" + "\nElige el nombre de tu próximo compañero: ");
			nombre = sc.nextLine();
			if (nombre.contains("0") || nombre.contains("1") || nombre.contains("2") || nombre.contains("3")
					|| nombre.contains("4") || nombre.contains("5") || nombre.contains("6") || nombre.contains("7")
					|| nombre.contains("8") || nombre.contains("9")) {
				System.out.println("Sin números ¬ ¬");
			}
		} while (nombre.contains("0") || nombre.contains("1") || nombre.contains("2") || nombre.contains("3")
				|| nombre.contains("4") || nombre.contains("5") || nombre.contains("6") || nombre.contains("7")
				|| nombre.contains("8") || nombre.contains("9"));
		System.out.println("¡Enhorabuena! Tu compañero ahora se llama " + nombre);

		float edad;
		do {
			System.out.println("Dime la edad de " + nombre);
			edad = Byte.parseByte(sc.nextLine());
			if (edad > 100) {
				System.out.println("Te pasaste wey");
			} else if (edad < 0) {
				System.out.println("Déjale que nazca o algo ¿no?");
			}
		} while (edad < 0 || edad > 100);

		byte opcionEspecie;
		do {
			System.out.println("\nElige la especie de " + nombre + ": " + "\n\t1 - Perro." + "\n\t2 - Gato."
					+ "\n\t3 - Dragón." + "\n\t4 - Pollito.");
			opcionEspecie = Byte.parseByte(sc.nextLine());
		} while (opcionEspecie < 1 || opcionEspecie > 4);
		Especie especie = null;
		Tamagotchi bicho = null;
		switch (opcionEspecie) {
		case 1:
			especie = Especie.PERRO;
			System.out.println("¡Has escogido perro!");
			bicho = new Perro(nombre, edad, especie);
			break;
		case 2:
			especie = Especie.GATO;
			System.out.println("¡Has escogido gato!");
			bicho = new Gato(nombre, edad, especie);
			break;
		case 3:
			especie = Especie.DRAGON;
			System.out.println("¡Has escogido dragón!");
			bicho = new Tamagotchi(nombre, edad, especie);
			break;
		case 4:
			especie = Especie.POLLITO;
			System.out.println("¡Has escogido pollito!");
			bicho = new Tamagotchi(nombre, edad, especie);
			break;
		}

		byte accion;
		do {
			System.out.println(bicho.toString());
			System.out.println("Elige acción:" + "\n\t1 - Comer un plato de puchero" + "\n\t2 - Echarse una siestecita"
					+ "\n\t3 - Jugar al juego de la vaca" + "\n\t4 - Ver un capítulo de One Piece"
					+ (especie.equals(Especie.PERRO) ? "\n\t5 - Pasear por el Kilimanjaro" : "")
					+ (especie.equals(Especie.GATO) ? "\n\t5 - Cazar un puntero láser" : ""));
			accion = Byte.parseByte(sc.nextLine());
			switch (accion) {
			case 1:
				bicho.comer(new Comida("Plato de puchero"));
				break;
			case 2:
				bicho.dormir();
				break;
			case 3:
				bicho.jugar(new Juego("Juego de la vaca"));
				break;
			case 4:
				bicho.relajarse();
				break;
			case 5:
				if (bicho instanceof Perro) {
					((Perro) bicho).paseito();
				} else if (bicho instanceof Gato) {
					((Gato) bicho).caos();
				}
				break;
			default:
				System.out.println("Tienes que elegir una de las opciones fiera");
			}
		} while (bicho.estaVivo() == true);

	}

}
