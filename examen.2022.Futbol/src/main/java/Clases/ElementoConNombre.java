package Clases;

public class ElementoConNombre {
	private String nombre;

	/** Constructor **/
	public ElementoConNombre(String nombre) {
		super();
		this.nombre = nombre;
	}

	/** Getters y Setters **/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}

}
