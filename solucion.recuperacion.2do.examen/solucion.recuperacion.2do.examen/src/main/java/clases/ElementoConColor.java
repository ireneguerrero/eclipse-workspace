package clases;

import enums.Color;
import exceptions.NombreConNumerosException;

public abstract class ElementoConColor extends ElementoConNombre{
	private Color color;

	public ElementoConColor(String nombre, Color color) throws NombreConNumerosException {
		super(nombre);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.color.toString();
	}


	
	
}
