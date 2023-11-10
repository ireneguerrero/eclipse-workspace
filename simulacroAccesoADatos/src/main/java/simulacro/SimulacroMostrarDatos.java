package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimulacroMostrarDatos {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "SELECT * FROM productos";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String descripcion=rs.getString("descripcion");
				String fabricante=rs.getString("fabricante");
				String precio=rs.getString("precio");
				String numeroSerie=rs.getString("numeroSerie");
				System.out.println("id: "+ id
								+ ", nombre: " + nombre
								+ ", descripcion: " + descripcion
								+ ", fabricante: " + fabricante
								+ ", precio: " + precio
								+ ", numeroSerie: " + numeroSerie);
			}

			conn.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
