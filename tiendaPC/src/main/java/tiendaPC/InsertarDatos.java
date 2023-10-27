package tiendaPC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "INSERT INTO productos (id, nombreProduct, fabricante)" + "VALUES (1,'Portatil','Hp'),(2,'Tablet','Lenovo')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Datos insertados en la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
