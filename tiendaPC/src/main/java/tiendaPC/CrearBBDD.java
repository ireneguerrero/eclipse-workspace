package tiendaPC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBBDD {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		String sql = "CREATE DATABASE tienda";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("La base de datos tienda ok");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
