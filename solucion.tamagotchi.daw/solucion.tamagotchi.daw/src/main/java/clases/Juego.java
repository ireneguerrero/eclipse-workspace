package clases;

import exceptions.NombreConNumerosException;

public class Juego extends CosaConNombre{
	private byte diversion;
	private byte estres;
	
	public Juego(String nombre, byte diversion, byte estres) throws NombreConNumerosException {
		super(nombre);
		this.diversion = diversion;
		this.estres = estres;
	}

	public byte getDiversion() {
		return diversion;
	}

	public byte getEstres() {
		return estres;
	}

	@Override
	public String toString() {
		return super.toString()+" [diversion=" + diversion + ", estres=" + estres + "]";
	}
	
	
	
	
}
