package examen.practico.aadd.irene.guerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// esta clase sirve para insertar datos a la tabla tvideojuegos
public class InsertarDatos {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		// insertamos los datos
		String sql = "INSERT INTO tvideojuegos (idjuego, nombre, anio, compania, precio, sinopsis, plataforma)"
				+ "VALUES "
				+ "(1, 'The Legend of Zelda: Breath of the Wild', '2017', 'Nintendo', '59.99', 'Aventura épica', 'Nintendo Switch'), "
				+ "(2, 'Red Dead Redemption 2', '2018', 'Rockstar Games', '49.99', 'Aventura del viejo oeste', 'PlayStation 4'), "
				+ "(3, 'Minecraft', '2011', 'Mojang', '29.99', 'Mundo abierto y construcción', 'Multiplataforma')";

		try {
			// conectamos con la base de datos
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Datos insertados en la tabla tvideojuegos");
			// cerramos la conexión
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
