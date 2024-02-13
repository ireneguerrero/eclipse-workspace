package tema3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ejercicio1 {

	public static void main(String[] args) {
		InetAddress dir;
		System.out.println("\n\tINFORMACIÓN www.cenecmalaga.es");
		System.out.println("\t==============================");

		try {
			dir = InetAddress.getByName("www.cenecmalaga.es");
			metodoByName(dir);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

	private static void metodoByName(InetAddress dir) {
		try {
			System.out.println("\tMétodo getByName(String host): " + dir.getByName("www.cenecmalaga.es"));
			System.out.println("\tMétodo getHostName(): " + dir.getHostName());
			System.out.println("\tMétodo getHostAddress(): " + dir.getHostAddress());
			System.out.println("\tMétodo getCanonicalHostName(): " + dir.getCanonicalHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
