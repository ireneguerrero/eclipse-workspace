package examen.practico.aadd.irene.guerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// esta clase sirve para crear la tabla
public class CrearTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		// creamos la tabla tvideojuegos
		String sql = "CREATE TABLE tvideojuegos (idjuego INT PRIMARY KEY," + "nombre VARCHAR(50) NOT NULL,"
				+ "anio INT," + "compania VARCHAR(50)," + "precio DECIMAL(10,2)," + "sinopsis VARCHAR(150),"
				+ "plataforma VARCHAR(50))";

		try {
			// conectamos a la base de datos
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla tvideojuegos");
			// cerramos la conexión
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}