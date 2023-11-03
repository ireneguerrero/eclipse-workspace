package conectarmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "INSERT INTO clientes (id, nif, nombre, edad)"
				+ "VALUES (1,'111111','Irene','22'), (2,'2222','Cristina','34'), (3,'3333','Manue','47'), (4,'4444','Pablo','30'), (5,'5555','Raúl','27')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Datos insertados en la tabla clientes");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
