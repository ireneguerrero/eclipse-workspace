package conectarphoneland;

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
			conn = DriverManager.getConnection("jdbc:mysql://localhost/phoneland", "root", "");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int idProducto = rs.getInt("id_PRODUCTO");
				int idProveedor = rs.getInt("id_proveedor");
				String nombre = rs.getString("NOMBRE");
				String fabricante = rs.getString("FABRICANTE");
				String precio = rs.getString("PRECIO");
				float pvp = rs.getFloat("PVP");
				String descripcion = rs.getString("Descripcion");
				int columna8 = rs.getInt("Columna 8");

				System.out.println("id_PRODUCTO: " + idProducto + ", id_proveedor: " + idProveedor + ", NOMBRE: "
						+ nombre + ", FABRICANTE: " + fabricante + ", PRECIO: " + precio + ", PVP: " + pvp
						+ ", Descripcion: " + descripcion + ", Columna 8: " + columna8);
			}

			conn.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
