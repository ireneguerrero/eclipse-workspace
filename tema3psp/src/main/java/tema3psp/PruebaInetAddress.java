package tema3psp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PruebaInetAddress {

	public static void main(String[] args) {
		// Creo una variable dir que almacenará la dirección de la máquina local
		InetAddress dir;
		System.out.println("\n\tSALIDA PARA LOCALHOST: ");
		System.out.println("\t======================");

		try {
			// LOCALHOST. Almaceno el nombre de mi máquina local en dir
			dir = InetAddress.getLocalHost();
			pruebaMetodos(dir);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

	private static void pruebaMetodos(InetAddress dir) {
		System.out.println("\tMétodo getLocalHost(): " + dir);

		// Usamos los métodos vistos
		System.out.println("\tMétodo getHostName(): " + dir.getHostName());
		System.out.println("\tMétodo getHostAddress(): " + dir.getHostAddress());
		System.out.println("\tMétodo getCanonicalHostName(): " + dir.getCanonicalHostName());
	}

}
