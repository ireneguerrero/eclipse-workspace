package clases;

import java.util.ArrayList;

import enums.Insignia;

public class Publicacion extends ElementoValorable {
	private String contenido;
	private ArrayList<Respuesta> respuestas;

	public Publicacion(String nombre, int karma, ArrayList<Insignia> insignias, String contenido,
			ArrayList<Respuesta> respuestas) {
		super(nombre, karma, insignias);
		this.contenido = contenido;
		this.respuestas = respuestas;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ArrayList<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(ArrayList<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	@Override
	public String toString() {
		return super.toString() +"Publicacion [contenido=" + contenido + ", respuestas=" + respuestas + "]";
	}

}
