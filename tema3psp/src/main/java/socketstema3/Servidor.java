package socketstema3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		int puerto = 2025; // asigno el puerto de escucha
		try {
			ServerSocket servidor = new ServerSocket(puerto); // creamos la clase servidor y le damos el parámetro puerto
			System.out.println("Escuchando en el puerto: " + servidor.getLocalPort()); // probamos el método

			Socket cliente = servidor.accept(); // método de espera de aceptar cliente1
			Socket cliente2 = servidor.accept(); // método de espera de aceptar cliente2

			servidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
