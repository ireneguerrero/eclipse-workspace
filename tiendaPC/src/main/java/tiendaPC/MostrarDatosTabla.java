package tiendaPC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatosTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "SELECT * FROM productos";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombreProduct = rs.getString("nombreProduct");
				String fabricante = rs.getString("fabricante");
				System.out.println("id: " + id + ", nombre producto: " + nombreProduct + ", fabricante: " + fabricante);
			}

			conn.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
