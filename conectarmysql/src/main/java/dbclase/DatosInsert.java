package dbclase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatosInsert {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "INSERT INTO dam (id, nif, nombre, edad)" + "VALUES (1,'111111','Irene','22')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/clase", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Datos insertados en la tabla dam");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
