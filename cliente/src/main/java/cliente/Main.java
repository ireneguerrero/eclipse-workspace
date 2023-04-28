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
		Scanner sc=new Scanner(System.in);
		ArrayList<Object> resultado=null;
		do {
		System.out.println("Dime tu email");
		String email=sc.nextLine();
		System.out.println("Dime tu contraseña");
		String contraseña=sc.nextLine();
		
		LinkedHashSet<String> columnas =new LinkedHashSet<String>();
		columnas.add("email");
		columnas.add("nombre");
		columnas.add("telefono");
		
		HashMap<String,Object> restricciones=new HashMap<String,Object>();
		restricciones.put("email", email);
		restricciones.put("password", contraseña);
		
		try {
			resultado= DAO.consultar("cliente", columnas, restricciones);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}while(resultado.isEmpty());
		System.out.println("¡Login correcto!");
		
		Cliente cliente=new  Cliente((String)resultado.get(0), (Integer)resultado.get(2), (String)resultado.get(1));
		System.out.println(cliente);
		
	}

}
