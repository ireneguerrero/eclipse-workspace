package tarea1intercambiomensajes;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorRed {

	public static void main(String[] args) {
		ServerSocket servidor = null;
		Socket cliente = null;
		int puerto = 62000;

		try {
			servidor = new ServerSocket(puerto);
			System.out.println("Esperando al cliente en el puerto: " + puerto);
			cliente = servidor.accept();

			InputStream input = cliente.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(input);
			String cadenaLeida = ois.readObject().toString();
			String cadenaMin = cadenaLeida.toLowerCase();
			System.out.println("Servidor: " + cadenaLeida);
			System.out.println("Servidor en minúscula: " + cadenaMin);

			ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
			oos.writeObject(cadenaLeida);
			System.out.println("Fin del servidor");

			cliente.close();
			servidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
