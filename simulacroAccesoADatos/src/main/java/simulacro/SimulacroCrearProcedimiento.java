package simulacro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SimulacroCrearProcedimiento {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement presta=null;
		
		String dropProcedure="DROP PROCEDURE IF EXISTS CalcularIva";
		
		String createProcedure="CREATE PROCEDURE CalcularIva"
				+ "(IN precio DECIMAL(10,2), OUT total DECIMAL(10,2))"
				+ "BEGIN "
				+ "DECLARE iva DECIMAL(10,2);"
				+ "SET iva := 0.21;"
				+ "SET total := precio+(precio*iva);"
				+ "END;";
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
			presta=conn.prepareStatement(dropProcedure);
			presta.executeUpdate();
			
			presta=conn.prepareStatement(createProcedure);
			presta.executeUpdate();
			System.out.println("Procedimiento creado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
