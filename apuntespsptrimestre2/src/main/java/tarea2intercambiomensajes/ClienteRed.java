package tarea2intercambiomensajes;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteRed {

	public static void main(String[] args) {
		Socket cliente = null;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numero=Integer.parseInt(sc.nextLine());

		try {
			cliente = new Socket("localhost", 62000);

			ObjectOutputStream oos = new ObjectOutputStream(cliente.getOutputStream());
			oos.writeObject(numero);
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
