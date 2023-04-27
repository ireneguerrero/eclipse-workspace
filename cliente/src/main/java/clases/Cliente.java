package clases;

public class Cliente {
	private String email;
	private int telefono;
	private String nombre;
	
	public Cliente(String email, int telefono, String nombre) {
		super();
		this.email = email;
		this.telefono = telefono;
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Cliente: \nemail: " + email + "\ntelefono: " + telefono + "\nnombre: " + nombre;
	}
	
}
