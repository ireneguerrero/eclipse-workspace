package clases;

import enums.Peligrosidad;

public class Grupo {
	private String nombre;
	private Peligrosidad peligrosidad;
	public Grupo(String nombre, Peligrosidad peligrosidad) {
		super();
		this.nombre = nombre;
		this.peligrosidad = peligrosidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Peligrosidad getPeligrosidad() {
		return peligrosidad;
	}
	public void setPeligrosidad(Peligrosidad peligrosidad) {
		this.peligrosidad = peligrosidad;
	}
	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", peligrosidad=" + peligrosidad + "]";
	}
	
}
