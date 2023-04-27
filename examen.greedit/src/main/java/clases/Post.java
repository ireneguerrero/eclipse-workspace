package clases;

import java.util.ArrayList;

import enums.Insignia;

public class Post extends Publicacion {
	private Usuario usuario;

	public Post(String nombre, int karma, ArrayList<Insignia> insignias, String contenido,
			ArrayList<Respuesta> respuestas, Usuario usuario) {
		super(nombre, karma, insignias, contenido, respuestas);
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return super.toString() + "Post [usuario=" + usuario + "]";
	}

}
