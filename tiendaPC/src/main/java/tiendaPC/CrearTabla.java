package tiendaPC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE TABLE productos (id INT PRIMARY KEY," + "nombreProduct VARCHAR(40) NOT NULL,"
				+ "fabricante VARCHAR(30) NOT NULL)";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
