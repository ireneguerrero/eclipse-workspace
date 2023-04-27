package clases;

import enums.Color;
import exceptions.NombreConNumerosException;
import exceptions.NombreZordInvalidoException;

public class Zord extends ElementoConColor{

	public Zord(String nombre, Color color) throws NombreConNumerosException, NombreZordInvalidoException {
		super(nombre, color);
		if (!nombre.toLowerCase().endsWith("zord")) {
            throw new NombreZordInvalidoException("El nombre del Zord debe acabar en 'zord'");
        }
        this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.getNombre()+" ("+super.toString()+")";
	}

	
	
}
