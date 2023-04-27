package clases;

import enums.Especie;
import enums.Genero;
import excepciones.NombreConNumerosException;

public class Animal extends SerVivo {
	/** La especie del animal **/
	private Especie especie;
	/** La raza del animal **/
	private String raza;
	/** La Persona dueña del animal **/
	private Persona dueño;

	public Animal(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			Especie especie, String raza, Persona dueño) throws NombreConNumerosException {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.especie = especie;
		this.raza = raza;
		this.dueño = dueño;
	}

	public Animal(String nombre, Genero genero, Especie especie, String raza, Persona dueño) throws NombreConNumerosException {
		super(nombre, genero);
		this.especie = especie;
		this.raza = raza;
		this.dueño = dueño;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}

	@Override
	public String toString() {
		return super.toString() + "[especie=" + especie + ", raza=" + raza + ", dueño=" + dueño.getNombre() + " "
				+ dueño.getApellido() + "]";
	}
}
