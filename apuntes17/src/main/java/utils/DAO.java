package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public abstract class DAO {
	private static Connection conexion;

	private static Statement conectar() {
		try {
			// también se puede poner localhost:nº del puerto/el nombre de la base de datos
			conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bicicletasdaw", "root", "");
			return conexion.createStatement(); // siempre java.sql
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static void desconectar(Statement s) {
		try {
			s.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static int insertar(String tabla, HashMap<String, String> columnas) throws SQLException {
		Statement smt = conectar();
		String consulta = "insert into " + tabla + " (";
		Iterator it = columnas.keySet().iterator();
		while (it.hasNext()) {
			consulta += (String) it.next() + ",";
		}
		consulta = consulta.substring(0, consulta.length() - 1);
		consulta += ") values (";
		it = columnas.values().iterator();
		while (it.hasNext()) {
			consulta += "'" + (String) it.next() + "',";
		}
		consulta = consulta.substring(0, consulta.length() - 1);
		consulta += ")";
		System.out.println(consulta);
		int ret = smt.executeUpdate(consulta);
		desconectar(smt);
		return ret;
	}

	public static int borrar(String tabla, HashMap<String, String> columnas) throws SQLException {
		Statement smt = conectar();
		String consulta = "delete from " + tabla + " where ";
		Iterator it = columnas.entrySet().iterator();
		while (it.hasNext()) {
			Entry actual = (Entry) it.next();
			consulta += (String) actual.getKey() + "='" + (String) actual.getValue() + "' and ";
		}
		consulta = consulta.substring(0, consulta.length() - 5);
		System.out.println(consulta);
		int ret = smt.executeUpdate(consulta);
		desconectar(smt);
		return ret;
	}

	public static ArrayList<Object> consultar(String tabla, LinkedHashSet<String> columnasSelect,
			HashMap<String, String> restricciones) throws SQLException {
		Statement smt = conectar();
		String query = "select ";
		Iterator ith = columnasSelect.iterator();
		while (ith.hasNext()) {
			query += (String) ith.next() + ",";

		}
		ResultSet cursor = smt.executeQuery(query);
		ArrayList<Object> fila = new ArrayList<Object>();
		while (cursor.next()) {
			String emailQ = cursor.getString(cursor.findColumn("email"));
			String passQ = cursor.getString(cursor.findColumn("password"));
			int tlfQ = cursor.getInt(cursor.findColumn("telefono"));
			String nombreQ = cursor.getString(cursor.findColumn("nombre"));

			fila.add(emailQ);
			fila.add(passQ);
			fila.add(tlfQ);
			fila.add(nombreQ);
		}
		desconectar(smt);
		return fila;
	}

}
