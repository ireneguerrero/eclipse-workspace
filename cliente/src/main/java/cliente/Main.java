package cliente;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

import clases.Cliente;
import utils.DAO;

public class Main {

	public static void main(String[] args) {
		//4 - Si el array que recibes de la función consultar está vacío, quiere decir que el usuario o la contraseña
		//    no son correctos:
		//    Vuelve a pedirlos por teclado las veces que haga falta hasta que ponga los datos correctos
		//    En ese caso, di al usuario ¡Login correcto!, crea una variable de tipo cliente con los datos que te devuelve
		//    el ArrayListm y usa toString para imprimir el cliente por pantalla (recuerda: el password no tiene que salir aquí)
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Dime el email de la persona a consultar");
		String email=sc.nextLine();
		System.out.println("Dime su contraseña");
		String contrasena=sc.nextLine();
		
		try {
			LinkedHashSet<String> columnasSacar = new LinkedHashSet<String>();
			columnasSacar.add("email");
			columnasSacar.add("telefono");
			columnasSacar.add("nombre");
			HashMap<String, Object> restricciones = new HashMap<String, Object>();
			restricciones.put("email", email);
			restricciones.put("contraseña", contrasena);
			ArrayList<Object> cliente = DAO.consultar("cliente", columnasSacar, restricciones);
			Cliente c= new Cliente(cliente.get(0));
			for (byte i = 0; i < c.size(); i++) {
				System.out.print(c.get(i) + " : ");
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
