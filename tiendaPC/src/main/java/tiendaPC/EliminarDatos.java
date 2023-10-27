package tiendaPC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EliminarDatos {

	public static void main(String[] args) {
//		delete from nombre where id=x
		Connection conn = null;
		Statement stmt = null;
		String sql = "DELETE FROM productos WHERE id=1;";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Dato eliminado");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
