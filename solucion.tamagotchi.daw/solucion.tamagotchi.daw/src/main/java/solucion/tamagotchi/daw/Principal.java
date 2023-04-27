package solucion.tamagotchi.daw;

import java.util.Scanner;

import clases.Comida;
import clases.Gato;
import clases.Juego;
import clases.Perro;
import clases.Tamagotchi;
import enums.Especie;
import exceptions.NombreConNumerosException;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tamagotchi tamagotchi = null;

		boolean hambreOk = false;
		byte valorHambre = 0;
		do {
			try {
				System.out.println("Dime un valor para el hambre (0 - 100)");
				valorHambre = Byte.parseByte(sc.nextLine());
				hambreOk = true;
			} catch (NumberFormatException k) {
				System.err.println(k.getMessage());
			}
		} while (!hambreOk);

		boolean nombreOk = false;
		do {
			System.out.println("Dime el nombre del tamagotchi");
			String nombre = sc.nextLine();
			nombreOk = false;

			byte opcion;
			do {
				System.out.println("Dime la especie del tamagotchi\n\t1-Dragón\n\t2-Pollito" + "\n\t3-Perro\n\t4-Gato");
				opcion = Byte.parseByte(sc.nextLine());
			} while (opcion < 1 || opcion > 4);

			try {
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
				nombreOk = true;
			} catch (NombreConNumerosException e) {
				System.err.println(e);
			}

		} while (!nombreOk);
		tamagotchi.setHambre(valorHambre);
		while (tamagotchi.estaVivo()) {
			System.out.println(tamagotchi);
			System.out.println("¿Qué quieres hacer?\n\t1-Comer\n\t2-Dormir\n\t3-Jugar" + "\n\t4-Relajarse"
					+ (tamagotchi.getEspecie() == Especie.GATO ? "\n\t5-Causar Caos" : "")
					+ (tamagotchi.getEspecie() == Especie.PERRO ? "\n\t5-Pasear" : ""));
			byte opcion2 = Byte.parseByte(sc.nextLine());
			switch (opcion2) {
			case 1:
				Comida hamburguesa = null;
				try {
					hamburguesa = new Comida("Hamburguesa", (byte) 7, (byte) 2);
				} catch (NombreConNumerosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tamagotchi.comer(hamburguesa);
				break;
			case 2:
				tamagotchi.dormir();
				break;
			case 3:
				Juego futbol = null;
				try {
					futbol = new Juego("Futbol", (byte) 8, (byte) 8);
				} catch (NombreConNumerosException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tamagotchi.jugar(futbol);
				break;
			case 4:
				tamagotchi.relajarse();
				break;
			case 5:
				if (tamagotchi.getEspecie() == Especie.GATO) {
					((Gato) tamagotchi).causarCaos();
				} else if (tamagotchi.getClass().equals(Perro.class)) {
					((Perro) tamagotchi).pasear();
				}
				break;
			default:
				System.out.println("Esa opcion no es válida");
				break;
			}

		}
		System.out.println("El tamagotchi se ha muerto");

	}

}
