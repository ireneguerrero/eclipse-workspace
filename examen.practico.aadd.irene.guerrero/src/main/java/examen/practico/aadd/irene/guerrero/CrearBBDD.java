package examen.practico.aadd.irene.guerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// esta clase sirve para crear la base de datos dbgametop
public class CrearBBDD {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		// creamos la base de datos
		String sql = "CREATE DATABASE dbgametop";

		try {
			// conectamos a mysql
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			stmt = conn.createStatement();

			stmt.execute(sql);
			System.out.println("La base de datos dbgametop ha sido creada");
			// cerramos la conexión
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
