package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimulacroInstertarDatos {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		String sql = "INSERT INTO productos (id, nombre, descripcion, fabricante, precio, numeroSerie)"
				+ "VALUES "
				+ "(1,'portátil1','portátil gama alta','HP','1500','111'), "
				+ "(2,'portátil2','portátil gama baja','Apple','1000','222'), "
				+ "(3,'monitor1','monitor gama alta','LG','800','333'), "
				+ "(4,'monitor2','monitor gama alta','HP','200','444')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("Datos insertados en la tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
