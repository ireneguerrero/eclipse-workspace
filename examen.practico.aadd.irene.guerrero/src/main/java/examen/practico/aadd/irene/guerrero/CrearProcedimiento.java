package examen.practico.aadd.irene.guerrero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// esta clase sirve para crear un procedimiento
public class CrearProcedimiento {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement presta = null;

		// eliminamos el procedimiento en caso de que exista
		String dropProcedure = "DROP PROCEDURE IF EXISTS NombreJuego";

		// creamos el procedimiento NombreJuego que nos da todos los datos de la tabla
		String createProcedure = "CREATE PROCEDURE NombreJuego()" + "BEGIN " + "SELECT * FROM tvideojuegos;" + "END;";

		try {
			// conectamos con la base de datos
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			// ejecutamos el eliminar procedimiento
			presta = conn.prepareStatement(dropProcedure);
			presta.executeUpdate();

			// ejecutamos el crear procedimiento
			presta = conn.prepareStatement(createProcedure);
			presta.executeUpdate();
			System.out.println("Procedimiento creado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
