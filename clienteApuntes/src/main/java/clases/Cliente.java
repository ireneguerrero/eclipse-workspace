package clases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

import exceptions.ClienteNoExisteException;
import exceptions.ContraseñaInvalidaException;
import utils.DAO;

public class Cliente {
	private String contraseña;
	private String email;
	private int telefono;
	private String nombre;

	public Cliente(String nombre,String email, int telefono) {
		   this.nombre=nombre;
		   this.email=email;
		   this.telefono=telefono;
	   }
	
	public Cliente(String nombre, String email, int telefono, String contraseña) throws SQLException {
		super();
		HashMap<String, Object> cols = new HashMap<String, Object>();
		cols.put("email", email);
		cols.put("nombre", nombre);
		cols.put("password", contraseña);
		cols.put("telefono", telefono);
		DAO.insertar("cliente", cols);

		this.email = email;
		this.telefono = telefono;
		this.nombre = nombre;
	}

	public Cliente(String email, String contraseña) throws SQLException, ClienteNoExisteException, ContraseñaInvalidaException {
		super();
		LinkedHashSet<String> columnasSacar = new LinkedHashSet<String>();
		columnasSacar.add("email");
		columnasSacar.add("password");
		columnasSacar.add("telefono");
		columnasSacar.add("nombre");
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		ArrayList<Object> resultado = DAO.consultar("cliente", columnasSacar, restricciones);
		if (resultado.isEmpty()) {
			throw new ClienteNoExisteException("Cliente no existe");
		} else {
			String contraseñaAlmacenada = (String) resultado.get(1);
			if (contraseñaAlmacenada.equals(contraseña)) {
				this.email = (String) resultado.get(0);
				this.telefono = (int) resultado.get(2);
				this.nombre = (String) resultado.get(3);
			}else {
				throw new ContraseñaInvalidaException("Contraseña incorrecta");
			}
		}
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws SQLException {
		HashMap<String, Object> emailAModificar = new HashMap<String, Object>();
		emailAModificar.put("email", email);
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		DAO.actualizar("cliente", emailAModificar, restricciones);
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) throws SQLException {
		HashMap<String, Object> telefonoAModificar = new HashMap<String, Object>();
		telefonoAModificar.put("telefono", telefono);
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		DAO.actualizar("cliente", telefonoAModificar, restricciones);
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws SQLException {
		HashMap<String, Object> nombreAModificar = new HashMap<String, Object>();
		nombreAModificar.put("nombre", nombre);
		HashMap<String, Object> restricciones = new HashMap<String, Object>();
		restricciones.put("email", email);
		DAO.actualizar("cliente", nombreAModificar, restricciones);
		this.nombre = nombre;
	}
	
	public static ArrayList<Cliente> getTodos() throws SQLException{
		   LinkedHashSet<String> columnasSacar = new LinkedHashSet<>();
		   columnasSacar.add("email");
		   columnasSacar.add("telefono");
		   columnasSacar.add("nombre");
		   HashMap<String,Object> restricciones = new HashMap<>();
		   ArrayList<Cliente> clientes = new ArrayList<>();
		   ArrayList<Object> listaClientes= new ArrayList<>();
		   listaClientes=DAO.consultar("cliente", columnasSacar, restricciones);
		   for(byte i =0;i<listaClientes.size();i+=3) {
			   Cliente cliente = new Cliente((String)listaClientes.get(i),(String)listaClientes.get(i+2),(int)listaClientes.get(i+1));
		   clientes.add(cliente);
		   }
		   return clientes;
	   }

	@Override
	public String toString() {
		return "Cliente: \nContraseña: " + contraseña + "\nEmail: " + email + "\nTeléfono: " + telefono + "\nNombre: "
				+ nombre;
	}

}
