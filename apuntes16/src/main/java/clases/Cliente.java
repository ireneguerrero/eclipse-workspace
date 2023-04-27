package clases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Cliente {
	private String email;
	private String password;
	private int telefono;
	private String nombre;
	private TreeSet<Bicicleta> bicicleta = new TreeSet<Bicicleta>();

	public Cliente(String email, String password, int telefono, String nombre, HashSet<Bicicleta> bicicleta) {
		super();
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.nombre = nombre;
		this.bicicleta = new TreeSet<Bicicleta>();
	}

	public Cliente(String email, String password, int telefono, String nombre) {
		super();
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.nombre = nombre;
		this.setBicicleta(bicicleta);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TreeSet<Bicicleta> getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(TreeSet<Bicicleta> bicicleta) {
		this.bicicleta = bicicleta;
	}

	public String bicis() {
		Iterator it = bicicleta.iterator();
		String a = "";
		while (it.hasNext()) {
			String actual = (String) it.next().toString();
			a += actual;
		}
		return a;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", password=" + password + ", telefono=" + telefono + ", nombre=" + nombre
				+ ", bicicleta=" + bicis() + "]";
	}

}
