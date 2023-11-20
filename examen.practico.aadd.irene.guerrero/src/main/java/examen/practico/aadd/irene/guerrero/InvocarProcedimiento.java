package examen.practico.aadd.irene.guerrero;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// esta clase sirve para invocar el procedimiento creado anteriormente
public class InvocarProcedimiento {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;

		try {
			// conectamos con la base de datos
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dbgametop", "root", "");
			// llamamos al procedimiento creado
			cstmt = conn.prepareCall("call NombreJuego()");
			cstmt.execute();

			System.out.println("Procedimiento invocado");

			// cerramos la conexión
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
