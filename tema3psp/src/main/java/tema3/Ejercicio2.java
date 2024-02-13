package tema3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InetAddress dir;
		System.out.println("Introduzca un nombre de máquina o una dirección IP");
		String nombre = sc.nextLine();
		System.out.println();
		System.out.println("\n\tINFORMACIÓN " + nombre);
		System.out.println("\t==============================");

		try {
			dir = InetAddress.getByName(nombre);
			metodos(dir, nombre);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

	private static void metodos(InetAddress dir, String nombre) {
		try {
			System.out.println("\tMétodo getByName(String host): " + dir.getByName(nombre));
			System.out.println("\tMétodo getHostName(): " + dir.getHostName());
			System.out.println("\tMétodo getHostAddress(): " + dir.getHostAddress());
			System.out.println("\tMétodo getCanonicalHostName(): " + dir.getCanonicalHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
