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
		Tamagotchi tamagotchi = null;

		System.out.println("Dime el nombre del tamagotchi");
		String nombre = sc.nextLine();

		byte opcion;
		do {
			System.out.println(
					"Dime la especie del tamagotchi \n\t1 - Dragón\n\t2 - Pollito" + "\n\t3 - Perro\n\t4 - Gato");
			opcion = Byte.parseByte(sc.nextLine());
		} while (opcion < 1 || opcion > 4);
		switch (opcion) {
		case 1:
			tamagotchi = new Tamagotchi(nombre, Especie.DRAGON);
			break;
		case 2:
			tamagotchi = new Tamagotchi(nombre, Especie.POLLITO);
			break;
		case 3:
			tamagotchi = new Perro(nombre);
			break;
		case 4:
			tamagotchi = new Gato(nombre);
			break;
		}

		while (tamagotchi.estaVivo()) {
			System.out.println(tamagotchi);
			System.out.println("¿Qué quieres hacer?\n\t1 - Comer\n\t2 - Dormir\n\t3 - Jugar\n\t4 - Relajarse"
					+ (tamagotchi.getEspecie() == Especie.GATO ? "\n\t5 - Causar Caos" : "")
					+ (tamagotchi.getEspecie() == Especie.PERRO ? "\n\t5 - Pasear" : ""));
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				Comida hamburguesa = new Comida("Hamburguesa", (byte) 7, (byte) 2);
				tamagotchi.comer(hamburguesa);
				break;
			case 2:
				tamagotchi.dormir();
				break;
			case 3:
				Juego football = new Juego("Football", (byte) 8, (byte) 8);
				tamagotchi.jugar(football);
				break;
			case 4:
				tamagotchi.relajarse();
				break;
			case 5:
				if (tamagotchi.getEspecie() == Especie.GATO) {
					((Gato) tamagotchi).caos();
				} else if (tamagotchi.getEspecie() == Especie.PERRO) {
					((Perro) tamagotchi).pasear();
				}
				break;
			default:
				System.out.println("Esa opcion no es válida");
			}

		}

	}

}
