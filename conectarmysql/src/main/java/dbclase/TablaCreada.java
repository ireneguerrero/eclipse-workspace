package dbclase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TablaCreada {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE TABLE dam (id INT PRIMARY KEY," + "nif VARCHAR(10) NOT NULL,"
				+ "nombre VARCHAR(60) NOT NULL," + "edad VARCHAR(2))";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/clase", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla dam");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
