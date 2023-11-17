package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimulacroConectarDb {

	public static void main(String[] args) {
		Connection conect = null;

		try {
			conect = DriverManager.getConnection("jdbc:mysql://localhost/AAD1", "root", "");
			if (conect != null) {
				System.out.println("Conexión a base de datos ok");
				conect.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

}
