package clases;

import exceptions.NombreConNumerosException;

public abstract class ElementoConNombre {
	protected String nombre;

	public ElementoConNombre(String nombre) throws NombreConNumerosException {
		super();
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) throws NombreConNumerosException {
		String numero="0123456789";
		for (short i = 0; i < nombre.length(); i++) {
			if (numero.contains("" + nombre.charAt(i))) {
				throw new NombreConNumerosException("El nombre " + nombre + " no es válido porque tiene números");
			}
		}
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return nombre;
	}
	
	
}
