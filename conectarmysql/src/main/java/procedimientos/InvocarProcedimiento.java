package procedimientos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class InvocarProcedimiento {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
//			cstmt = conn.prepareCall("call ObtenerClientes()");
			cstmt = conn.prepareCall("call CalcularEdad(?,?)");
			cstmt.setInt(1, 2000);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.execute();

//			ResultSet rs = cstmt.getResultSet();
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String nif = rs.getString("nif");
//				String nombre = rs.getString("nombre");
//				String edad = rs.getString("edad");
//				System.out.println("id: " + id + ", nif: " + nif + ", nombre: " + nombre + ", edad: " + edad);
//			}

			int edad = cstmt.getInt(2);
			System.out.println("Procedimiento invocado");
			System.out.println("La edad es " + edad);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
