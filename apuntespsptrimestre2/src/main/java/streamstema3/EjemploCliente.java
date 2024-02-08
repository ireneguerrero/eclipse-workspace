package streamstema3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class EjemploCliente {

	public static void main(String[] args) {
		String host = "localhost";
		int puerto = 6000; // puerto remoto

		System.out.println("PROGRAMA CLIENTE INICIADO...");

		try {
			// En el programa cliente es necesario crear un objeto Socket, donde aparece el
			// nombre del equipo y el puerto donde nos queremos conectar
			Socket cliente = new Socket(host, puerto);

			// CREO FLUJO DE SALIDA AL SERVIDOR
			OutputStream salida = cliente.getOutputStream();
			DataOutputStream flujoSalida = new DataOutputStream(salida);

			// ENVÍO UN SALIDO AL SERVIDOR
			flujoSalida.writeUTF("Hola, Don Pepito");

			// CREO FLUJO DE ENTRADA AL SERVIDOR
			DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream());

			// EL SERVIDOR ENVÍA UN MENSAJE
			System.out.println("Recibiendo del SERVIDOR: \n\t" + flujoEntrada.readUTF());

			// CERRAR STREAMS Y SOCKETS
			flujoEntrada.close();
			flujoSalida.close();
			cliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
