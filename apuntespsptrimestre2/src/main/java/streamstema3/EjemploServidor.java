package streamstema3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EjemploServidor {

	public static void main(String[] args) {
		// APERTURA DE SOCKET
		int numeroPuerto = 6000;

		// En el programa servidor se crea un objeto ServerSocket invocando al método
		// ServerSocket()
		// en el que indicamos el número de puerto por el que el servidor escucha las
		// peticiones de conexión de clientes
		try {
			ServerSocket servidor = new ServerSocket(numeroPuerto);

			System.out.println("Esperando al cliente...");

			// Necesitamos también un objeto Socket para aceptar las peticiones clientes
			Socket clienteConectado = servidor.accept();

			// CREAR FLUJO DE ENTRADA DEL CLIENTE
			InputStream entrada = clienteConectado.getInputStream();
			DataInputStream flujoEntrada = new DataInputStream(entrada);

			// EL CLIENTE ENVÍA UN MENSAJE
			System.out.println("Recibiendo del CLIENTE: \n\t" + flujoEntrada.readUTF());

			// CREO FLUJO DE SALIDA AL CLIENTE
			OutputStream salida = clienteConectado.getOutputStream();
			DataOutputStream flujoSalida = new DataOutputStream(salida);

			// ENVÍO UN SALUDO AL CLIENTE
			flujoSalida.writeUTF("Hola, Don José");
			// CERRAR STREAMS Y SOCKETS
			entrada.close();
			flujoEntrada.close();
			salida.close();
			flujoSalida.close();
			clienteConectado.close();
			servidor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
