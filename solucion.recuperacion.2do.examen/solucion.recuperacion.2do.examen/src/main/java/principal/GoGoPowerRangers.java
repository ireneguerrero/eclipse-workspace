package principal;

import java.util.Scanner;

import enums.Color;
import exceptions.NombreConNumerosException;
import exceptions.NombreZordInvalidoException;
import clases.Zord;
import clases.Base;
import clases.PowerRanger;
import java.util.ArrayList;

public class GoGoPowerRangers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Zord> zordsBase = new ArrayList<Zord>();
		boolean zordsBaseOk = false;
		do {
			try {
				zordsBase.add(new Zord("Tiranozord", Color.ROJO));
				zordsBase.add(new Zord("Mastodonzord", Color.NEGRO));
				zordsBase.add(new Zord("Tricerazord", Color.AZUL));
				zordsBase.add(new Zord("Sabrezord", Color.AMARILLO));
				zordsBase.add(new Zord("Pterodactzord", Color.ROSA));
				zordsBase.add(new Zord("Dragonzord", Color.VERDE));
				zordsBase.add(new Zord("Tigrezord", Color.BLANCO));
				zordsBaseOk = true;
			} catch (NombreConNumerosException k) {
				System.err.println(k.getMessage());
			} catch (NombreZordInvalidoException e) {
				System.err.println(e.getMessage());
			}
		} while (!zordsBaseOk);

		Base centroDeMando = null;
		boolean centroDeMandoOk = false;
		do {
			try {
				centroDeMando = new Base("Centro de Mando", zordsBase);
				centroDeMandoOk = true;
			} catch (NombreConNumerosException f) {
				System.err.println(f.getMessage());
			}
		} while (!centroDeMandoOk);

		boolean nombreOk = false;
		boolean nombreConZordOk = false;
		String nombreZord = null;
		do {
			System.out.println("Dime el nombre de un nuevo zord");
			nombreZord = sc.nextLine();
			nombreOk = true;
			nombreConZordOk = true;
		} while (!nombreOk && !nombreConZordOk);

		Color colorZord = null;
		boolean colorValidoZord = false;
		do {
			try {
				System.out.print(Color.imprimirMenuSeleccionColor());
				byte opcion = Byte.parseByte(sc.nextLine());
				colorZord = Color.opcionNumericaAColor(opcion);
				if (opcion > 0 && opcion < 8) {
					colorValidoZord = true;
				} else {
					System.out.println("El número introducido no es válido, inténtalo de nuevo.");
				}
			} catch (NumberFormatException e) {
				System.out.println("La entrada introducida no es un número válido, inténtalo de nuevo.");
			}
		} while (!colorValidoZord);
		do {
			try {
				centroDeMando.getZordsAlmacenados().add(new Zord(nombreZord, colorZord));
				centroDeMandoOk = true;
			} catch (NombreConNumerosException e) {
				System.err.println(e.getMessage());
			} catch (NombreZordInvalidoException e) {
				System.err.println(e.getMessage());
			}
		} while (!centroDeMandoOk);

		boolean nombreRangerOk = false;
		String nombreRanger = null;
		do {
			System.out.println("Dime el nombre del Power Ranger");
			nombreRanger = sc.nextLine();
			nombreRangerOk = true;
		} while (!nombreRangerOk);

		Color colorRanger = null;
		boolean colorValidoRanger = false;
		do {
			try {
				System.out.print(Color.imprimirMenuSeleccionColor());
				byte opcion = Byte.parseByte(sc.nextLine());
				colorRanger = Color.opcionNumericaAColor(opcion);
				if (opcion > 0 && opcion < 8) {
					colorValidoRanger = true;
				} else {
					System.out.println("El número introducido no es válido, inténtalo de nuevo.");
				}
			} catch (NumberFormatException e) {
				System.out.println("La entrada introducida no es un número válido, inténtalo de nuevo.");
			}
		} while (!colorValidoRanger);

		PowerRanger ranger = null;
		boolean rangerOk = false;
		do {
			try {
				ranger = new PowerRanger(nombreRanger, colorRanger);
				rangerOk = true;
			} catch (NombreConNumerosException a) {
				System.err.println(a.getMessage());
			}
		} while (!rangerOk);
		ranger.asignarZord(centroDeMando);
		System.out.println(ranger + "\n");
		ranger.devolverZord(centroDeMando);
		System.out.println(ranger);

	}

}
