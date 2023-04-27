package clases;

import java.util.ArrayList;

import exceptions.NombreConNumerosException;

public class Base extends ElementoConNombre{
	private ArrayList<Zord> zordsAlmacenados;

	public Base(String nombre, ArrayList<Zord> zordsAlmacenados) throws NombreConNumerosException {
		super(nombre);
		this.zordsAlmacenados = zordsAlmacenados;
	}

	public ArrayList<Zord> getZordsAlmacenados() {
		return zordsAlmacenados;
	}

	public void setZordsAlmacenados(ArrayList<Zord> zordsAlmacenados) {
		this.zordsAlmacenados = zordsAlmacenados;
	}
	
	
	
	
}
