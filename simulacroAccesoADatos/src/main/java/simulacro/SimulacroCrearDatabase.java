package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimulacroCrearDatabase {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE DATABASE empresa";

		try {
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
			stmt = conn.createStatement();

			stmt.execute(sql);
			System.out.println("La base de datos empresa ok");
			conn.close();
			stmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
