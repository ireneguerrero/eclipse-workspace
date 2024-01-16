package tema3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		URL url;
		System.out.println("Introduzca una url");
		String nombre = sc.nextLine();
		System.out.println();
		System.out.println("\tURL " + nombre);
		System.out.println("\t==============================");
		try {
			url = new URL(nombre);
			visualizar(url, nombre);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void visualizar(URL url, String nombre) {
		System.out.println("\tURL completa: " + url);
		System.out.println("\tgetProtocol(): " + url.getProtocol());
		System.out.println("\tgetHost(): " + url.getHost());
		System.out.println("\tgetDefaultPort(): " + url.getDefaultPort());
		System.out.println("\tgetPort(): " + url.getPort());
		System.out.println("\tgetPath(): " + url.getPath());
		System.out.println("\tgetQuery(): " + url.getQuery());
		System.out.println("\tgetFile(): " + url.getFile());
		System.out.println("\tgetAuthority(): " + url.getAuthority());
	}

}
