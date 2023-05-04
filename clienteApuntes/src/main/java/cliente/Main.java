package cliente;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import clases.Cliente;
import exceptions.ClienteNoExisteException;
import exceptions.ContraseñaInvalidaException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte opcion = 0;
		Cliente cliente;
		boolean repite = false;
		do {
			System.out.println(
					"Elige una opción:" + "\n\t0 - Salir" + "\n\t1 - Registro" + "\n\t2 - Login" + "\n\t3 - Ver Login");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 0:
				System.out.println("Arrivederci");
				break;
			case 1:
				System.out.println("Dime tu email");
				String email = sc.nextLine();
				System.out.println("Dime tu nombre");
				String nombre = sc.nextLine();
				System.out.println("Dime tu contraseña");
				String contraseña = sc.nextLine();
				System.out.println("Dime tu teléfono");
				int telefono = Integer.parseInt(sc.nextLine());

				try {
					cliente = new Cliente(email, nombre, telefono, contraseña);
					System.out.println("Cliente registrado con éxito");
					String log = "Cliente " + cliente.getEmail() + " registrado con éxito en: "
							+ LocalDateTime.now().toString() + "\n";
					try {
						FileWriter writer = new FileWriter("./clientes.log", true);
						writer.write(log);
						writer.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				do {
					System.out.println("Dime el email de la persona que quieres logearte");
					String emailLog = sc.nextLine();
					System.out.println("Dime la contraseña de la persona que quieres logearte");
					String contraseñaLog = sc.nextLine();
					try {
						cliente = new Cliente(emailLog, contraseñaLog);
						repite = true;
						System.out.println("Cliente logeado con éxito");
						String log = "Cliente " + cliente.getEmail() + " logeado con éxito en: "
								+ LocalDateTime.now().toString() + "\n";
						try {
							FileWriter writer = new FileWriter("./clientes.log", true);
							writer.write(log);
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					} catch (SQLException e) {
						e.printStackTrace();
					} catch (ClienteNoExisteException e) {
						e.printStackTrace();
					} catch (ContraseñaInvalidaException e1) {
						e1.printStackTrace();
					}
				} while (!repite);
				break;
			case 3:
				try {
					BufferedReader reader = new BufferedReader(new FileReader("./clientes.log"));
					String linea;
					while ((linea = reader.readLine()) != null) {
						System.out.println(linea);
					}
					reader.close();
				} catch (IOException e) {
					System.out.println("Error al leer el archivo de log: " + e.getMessage());
				}
				break;
			}
		} while (opcion != 0);

	}

}
