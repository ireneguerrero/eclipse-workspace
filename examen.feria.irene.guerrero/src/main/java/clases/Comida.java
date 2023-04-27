package clases;

public class Comida extends ElementoConNombre {
	private float precio;
	private boolean necesitaCalentarse;

	public Comida(String nombre, float precio, boolean necesitaCalentarse) {
		super(nombre);
		this.precio = precio;
		this.necesitaCalentarse = necesitaCalentarse;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isNecesitaCalentarse() {
		return necesitaCalentarse;
	}

	public void setNecesitaCalentarse(boolean necesitaCalentarse) {
		this.necesitaCalentarse = necesitaCalentarse;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tPrecio: " + precio + "\n\tNecesita calentarse: " + necesitaCalentarse;
	}

}
