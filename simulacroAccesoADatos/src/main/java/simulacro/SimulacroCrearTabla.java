package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimulacroCrearTabla {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "CREATE TABLE productos (id INT PRIMARY KEY,"
					+ "nombre VARCHAR(60) NOT NULL,"
					+ "descripcion VARCHAR (80),"
					+ "fabricante VARCHAR(20) NOT NULL,"
					+ "precio VARCHAR(8),"
					+ "numeroSerie VARCHAR(20))";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Creada la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
