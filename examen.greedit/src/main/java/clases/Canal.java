package clases;

import java.util.ArrayList;

public class Canal extends ElementoConNombre {
	private String descripcion;
	private ArrayList<String> reglas;
	private ArrayList<Post> posts;

	public Canal(String nombre, String descripcion, ArrayList<String> reglas, ArrayList<Post> posts) {
		super(nombre);
		this.descripcion = descripcion;
		this.reglas = reglas;
		this.posts = posts;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<String> getReglas() {
		return reglas;
	}

	public void setReglas(ArrayList<String> reglas) {
		this.reglas = reglas;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return super.toString() + "Canal [descripcion=" + descripcion + ", reglas=" + reglas + ", posts=" + posts + "]";
	}

}
