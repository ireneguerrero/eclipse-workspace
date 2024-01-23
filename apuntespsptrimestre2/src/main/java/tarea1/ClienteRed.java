package tarea1;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteRed {

	public static void main(String[] args) {
		Socket cliente = null;

		try {
			cliente = new Socket("localhost", 62000);

			ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
			oos.writeObject("Holi Servidor, Soy Un CLIENTE");
			System.out.println("Fin del mensaje");

			InputStream input = cliente.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(input);
			String cadenaLeida = ois.readObject().toString();
			System.out.println("El servidor dice: " + cadenaLeida);

			cliente.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
