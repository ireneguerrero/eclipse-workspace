package simulacro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class SimulacroInvocarProcedimiento {

	public static void main(String[] args) {
		Connection conn=null;
		CallableStatement cstmt=null;
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			cstmt=conn.prepareCall("call CalcularIva(?,?)");
			cstmt.setDouble(1, 100);
			cstmt.registerOutParameter(2, Types.DECIMAL);
			cstmt.execute();
			
			double precioConIva=cstmt.getDouble(2);
			
			System.out.println("Procedimiento invocado");
			System.out.println("El imposte con iva es: "+precioConIva);
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
