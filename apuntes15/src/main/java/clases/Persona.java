package clases;

import java.util.Arrays;

import enums.Genero;
import excepciones.ApellidoConNumerosException;
import excepciones.NombreConNumerosException;

public class Persona extends SerVivo {
	// Variables internas todo lo que cada Persona es

	/** El apellido familiar de nuestro Persona **/
	private String apellido; // Protégelo para que no tenga números
	/** La madre biológica del Persona **/
	private Persona madre;
	/** El padre biológico del Persona **/
	private Persona padre;
	/** Array de las mascotas que tiene este Persona **/
	private Animal[] mascota;

	public Persona(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			String apellido, Persona madre, Persona padre, Animal[] mascota) throws NombreConNumerosException, ApellidoConNumerosException  {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad);
		this.setApellido(apellido);
		this.madre = madre;
		this.padre = padre;
		this.mascota = mascota;
	}

	public Persona(String nombre, String apellido, Genero genero) throws NombreConNumerosException, ApellidoConNumerosException {
		super(nombre, genero);
		this.setApellido(apellido);
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) throws ApellidoConNumerosException {
		String numeros = "0987654321";
		for (short i = 0; i < apellido.length(); i++) {
			if (numeros.contains("" + apellido.charAt(i))) {
				throw new ApellidoConNumerosException("El nombre " + apellido + " no es válido porque tiene números");
			}
		}
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
