package Clases;

public class Equipo extends ElementoConPresupuesto {

	private Estadio estadio;

	/** Constructores **/
	public Equipo(String nombre, float presupuesto, Estadio estadio) {
		super(nombre, presupuesto);
		this.estadio = estadio;
	}

	/** Getters y Setters **/

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	@Override
	public String toString() {
		return super.toString() + "\" : Presupuesto: " + super.getPresupuesto() + " €. Estadio: " + estadio + "\n";
	}

}
