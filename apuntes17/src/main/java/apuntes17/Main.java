package apuntes17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import utils.DAO;

public class Main {

	public static void main(String[] args) {
//		Tema 8 BBDD
		Scanner sc = new Scanner(System.in);

		byte opcion;
		do {
			System.out.println("Dime qué quieres hacer:" + "\n\t0 - Salir" + "\n\t1 - Insertar cliente"
					+ "\n\t2 - Borrar cliente" + "\n\t3 - Modificar cliente" + "\n\t4 - Mostrar clientes");
			opcion = Byte.parseByte(sc.nextLine());
			switch (opcion) {
			case 1:
				System.out.println("Dime tu email");
				String email = sc.nextLine();
				System.out.println("Dime tu nombre");
				String nombre = sc.nextLine();
				System.out.println("Dime tu contraseña");
				String contrasena = sc.nextLine();
				System.out.println("Dime tu teléfono");
				int telefono = Integer.parseInt(sc.nextLine());

				try {
					HashMap<String, String> cols = new HashMap<String, String>();
					cols.put("email", email);
					cols.put("nombre", nombre);
					cols.put("password", contrasena);
					DAO.insertar("cliente", cols);
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case 2:
				System.out.println("Dime el email de la persona a borrar");
				String emailABorrar = sc.nextLine();
				try {
					HashMap<String, String> columnasBorrar = new HashMap<String, String>();
					columnasBorrar.put("email", emailABorrar);
					if (DAO.borrar("cliente", columnasBorrar) == 0) {
						System.out.println("No se ha podido borrar: El email no existía");
					} else {
						System.out.println("Borrado con éxito");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:

				break;
			case 4:
				try {
					ArrayList<Object> cliente = DAO.consultar("select * from cliente");
					for (byte i = 0; i < cliente.size(); i++) {
						System.out.print(cliente.get(i) + " : ");
					}
					System.out.println();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}
		} while (opcion != 0);

	}

}
