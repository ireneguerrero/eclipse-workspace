package Clases;

public class Estadio extends ElementoConNombre {
	private String direccionCompleta;
	private String Ciudad;
	private int capacidad;

	/** Constructor **/
	public Estadio(String nombre, String direccionCompleta, String ciudad, int capacidad) {
		super(nombre);
		this.direccionCompleta = direccionCompleta;
		Ciudad = ciudad;
		this.capacidad = capacidad;
	}

	/** Getters y Setters **/
	public String getDireccionCompleta() {
		return direccionCompleta;
	}

	public void setDireccionCompleta(String direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Estadio "+"\""+super.toString()+ "\" : Dirección: " + direccionCompleta + "(" + Ciudad + "). "+"Capacidad: " + capacidad +" espectadores.";
	}

}
