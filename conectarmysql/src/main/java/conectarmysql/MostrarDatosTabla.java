package conectarmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatosTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "SELECT * FROM clientes";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nif = rs.getString("nif");
				String nombre = rs.getString("nombre");
				String edad = rs.getString("edad");
				System.out.println("id: " + id + ", nif: " + nif + ", nombre: " + nombre + ", edad: " + edad);
			}

			conn.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
