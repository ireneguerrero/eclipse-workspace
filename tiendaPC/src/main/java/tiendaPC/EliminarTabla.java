package tiendaPC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EliminarTabla {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		String sql="DROP TABLE productos;";
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Eliminada tabla productos");
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
