package examen.practico.aadd.irene.guerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// esta clase sirve para mostrar los datos de la tabla
public class MostrarDatosTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		// seleccionamos toda la tabla tvideojuegos
		String sql = "SELECT * FROM tvideojuegos";

		try {
			// conectamos con la base de datos
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			// imprimimos todos los datos
			while (rs.next()) {
				int idjuego = rs.getInt("idjuego");
				String nombre = rs.getString("nombre");
				int anio = rs.getInt("anio");
				String compania = rs.getString("compania");
				float precio = rs.getFloat("precio");
				String sinopsis = rs.getString("sinopsis");
				String plataforma = rs.getString("plataforma");

				System.out.println("idjuego: " + idjuego + ", nombre: " + nombre + ", anio: " + anio + ", compania: "
						+ compania + ", preico: " + precio + ", sinopsis: " + sinopsis + ", plataforma: " + plataforma);
			}

			// cerramos la conexión
			conn.close();
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
