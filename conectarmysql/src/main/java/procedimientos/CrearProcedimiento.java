package procedimientos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrearProcedimiento {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement presta = null;
		String dropProcedure = "DROP PROCEDURE IF EXISTS ObtenerClientes";
		// String createProcedure = "CREATE PROCEDURE ObtenerClientes()" + "BEGIN " +
		// "SELECT * FROM clientes;" + "END;";
		String createProcedure = "CREATE PROCEDURE ObtenerClientes()" + "BEGIN "
				+ "SELECT * FROM clientes WHERE edad<40;" + "END;";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			presta = conn.prepareStatement(dropProcedure);
			presta.executeUpdate();

			presta = conn.prepareStatement(createProcedure);
			presta.executeUpdate();
			System.out.println("Procedimiento creado");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
