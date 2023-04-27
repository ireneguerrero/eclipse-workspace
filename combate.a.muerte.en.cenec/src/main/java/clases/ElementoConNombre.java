package clases;

public abstract class ElementoConNombre {

	private String nombre;

	public ElementoConNombre() {

	}

	public ElementoConNombre(String nombre) {
		this.nombre = nombre;
	}

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
