package socketstema3;

import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		String host = "localhost"; // dirección a la que se quiere conectar
		int puerto = 2025; // puerto al que se quiere conectar

		try {
			Socket cliente = new Socket(host, puerto);
			System.out.println("Holi");
			cliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
