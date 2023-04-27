package clases;

import java.util.Arrays;

import enumeraciones.Genero;

/**
 * Clase que modela un Sim, con todas sus características para poder jugar a
 * juego de los Sims
 * 
 * @author irene
 */
public class Persona extends SerVivo {
	// Variables internas todo lo que cada sim es

	/** El apellido familiar de nuestro Sim **/
	private String apellido;
	/** La madre biológica del Sim **/
	private Persona madre;
	/** El padre biológico del Sim **/
	private Persona padre;
	/** Array de las mascotas que tiene este Sim **/
	private Animal[] mascota;

	public Persona(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad, String apellido,
			Persona madre, Persona padre, Animal[] mascota) {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.apellido = apellido;
		this.madre = madre;
		this.padre = padre;
		this.mascota = mascota;
	}

	public Persona(String nombre, String apellido, Genero genero) {
		super(nombre, genero);
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Persona getMadre() {
		return madre;
	}

	public void setMadre(Persona madre) {
		this.madre = madre;
	}

	public Persona getPadre() {
		return padre;
	}

	public void setPadre(Persona padre) {
		this.padre = padre;
	}

	public Animal[] getMascota() {
		return mascota;
	}

	public void setMascota(Animal[] mascota) {
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return super.toString() + "[apellido=" + apellido + ", madre=" + madre + ", padre=" + padre + ", mascota="
				+ Arrays.toString(mascota) + "]";
	}

}