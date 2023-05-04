package apuntes17;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
					HashMap<String, Object> cols = new HashMap<String, Object>();
					cols.put("email", email);
					cols.put("nombre", nombre);
					cols.put("password", contrasena);
					cols.put("telefono", telefono);
					DAO.insertar("cliente", cols);
				} catch (SQLException e) {
					e.printStackTrace();
				}

				break;
			case 2:
				System.out.println("Dime el email de la persona a borrar");
				String emailABorrar = sc.nextLine();
				try {
					HashMap<String, Object> columnasBorrar = new HashMap<String, Object>();
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
				System.out.println("Dime el email del cliente a modificar");
				String emailMod = sc.nextLine();
				HashMap<String, Object> valoresNuevos = new HashMap<String, Object>();
				System.out.println("¿Qué quieres cambiar?" + "\n\t1 - Email" + "\n\t2 - Nombre" + "\n\t3 - Password"
						+ "\n\t4 - Teléfono");
				switch (Byte.parseByte(sc.nextLine())) {
				case 1:
					System.out.println("Dime el nuevo email");
					valoresNuevos.put("email", sc.nextLine());
					break;
				case 2:
					System.out.println("Dime el nuevo nombre");
					valoresNuevos.put("nombre", sc.nextLine());
					break;
				case 3:
					System.out.println("Dime el nuevo password");
					valoresNuevos.put("password", sc.nextLine());
					break;
				case 4:
					System.out.println("Dime el nuevo teléfono");
					valoresNuevos.put("telefono", Integer.parseInt(sc.nextLine()));
					break;
				}
				HashMap<String, Object> restriccionesMod = new HashMap<String, Object>();
				restriccionesMod.put("email", emailMod);
				try {
					DAO.actualizar("cliente", valoresNuevos, restriccionesMod);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case 4:
				try {
					LinkedHashSet<String> columnasSacar = new LinkedHashSet<String>();
					columnasSacar.add("email");
					columnasSacar.add("password");
					columnasSacar.add("telefono");
					columnasSacar.add("nombre");
					HashMap<String, Object> restricciones = new HashMap<String, Object>();
					ArrayList<Object> cliente = DAO.consultar("cliente", columnasSacar, restricciones);
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
		
//		ArrayList<Object> resultado=null;
//		do {
//		System.out.println("Dime tu email");
//		String email=sc.nextLine();
//		System.out.println("Dime tu contraseña");
//		String contraseña=sc.nextLine();
//		
//		LinkedHashSet<String> columnas =new LinkedHashSet<String>();
//		columnas.add("email");
//		columnas.add("nombre");
//		columnas.add("telefono");
//		
//		HashMap<String,Object> restricciones=new HashMap<String,Object>();
//		restricciones.put("email", email);
//		restricciones.put("password", contraseña);
//		
//		try {
//			resultado= DAO.consultar("cliente", columnas, restricciones);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		}while(resultado.isEmpty());
//		System.out.println("¡Login correcto!");
//		
//		Cliente cliente=new  Cliente((String)resultado.get(0), (Integer)resultado.get(2), (String)resultado.get(1));
//		System.out.println(cliente);

	}

}
