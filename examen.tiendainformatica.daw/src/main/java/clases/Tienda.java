package clases;

import java.util.ArrayList;

public class Tienda {
	private String nombre;
	private String direccion;
	private ArrayList<Perifericos> perifericos;
	
	public Tienda(String nombre, String direccion, ArrayList<Perifericos> perifericos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.perifericos = perifericos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Perifericos> getPerifericos() {
		return perifericos;
	}
	public void setPerifericos(ArrayList<Perifericos> perifericos) {
		this.perifericos = perifericos;
	}
	
	@Override
	public String toString() {
		return "Tienda \nNombre: " + nombre + " \nDireccion: " + direccion + "\n";
	}

}
