package clases;

import java.util.ArrayList;

import enums.Insignia;

public class Usuario extends ElementoValorable {
	private String apellidos;
	private String username;
	private boolean genero;

	public Usuario(String nombre, int karma, ArrayList<Insignia> insignias, String apellidos, String username,
			boolean genero) {
		super(nombre, karma, insignias);
		this.apellidos = apellidos;
		this.username = username;
		this.genero = genero;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return super.toString() + "Usuario [apellidos=" + apellidos + ", username=" + username + ", genero=" + genero
				+ "]";
	}

}
