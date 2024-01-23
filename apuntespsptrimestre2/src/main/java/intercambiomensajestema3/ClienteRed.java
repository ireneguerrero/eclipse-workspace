package intercambiomensajestema3;

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

			// Envío de mensajes cliente-servidor
			ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
			oos.writeObject("Hola servidor, soy un cliente");
			System.out.println("Fin del mensaje");

			// Envío de mensajes servidor-cliente
			InputStream input = cliente.getInputStream(); // Recibe entrada de bajo nivel
			ObjectInputStream ois = new ObjectInputStream(input); // Transforma ese bajo nivel a objetos
			String cadenaLeida = ois.readObject().toString(); // Transforma el objeto en una cadena de texto y lo lee
			System.out.println("El servidor dice: " + cadenaLeida); // Muestra por consola el dato recibido

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
