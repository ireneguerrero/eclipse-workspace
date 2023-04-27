package clases;

import enums.Genero;
import excepciones.NombreConNumerosException;

public class SerVivo {
	/** Almacena el nombre del ser vivo **/
	private String nombre;
	/** Almacena el género del ser vivo **/
	private Genero genero;
	/**
	 * El nivel de hambre entre 0 y 100. 0 está saciado, 100 se muere de hambre
	 **/
	private byte hambre;
	/**
	 * El nivel de sueño entre 0 y 100. 0 está descansado, 100 se muere de sueño
	 **/
	private byte sueño;
	/**
	 * El nivel de aburrimiento entre 0 y 100. 0 está divertidisimo a más no poder,
	 * 100 se muere de aburrimiento
	 **/
	private byte aburrimiento;
	/**
	 * El nivel de suciedad entre 0 y 100. 0 es que está limpisimo, 100 está
	 * enterrado en mugre
	 **/
	private byte suciedad;

	public SerVivo(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad) throws NombreConNumerosException {
		super();
		this.setNombre(nombre);
		this.genero = genero;
		this.hambre = hambre;
		this.sueño = sueño;
		this.aburrimiento = aburrimiento;
		this.suciedad = suciedad;
	}

	public SerVivo(String nombre, Genero genero) throws NombreConNumerosException {
		this.setNombre(nombre);
		this.genero = genero;
		this.hambre = 0;
		this.sueño = 0;
		this.aburrimiento = 0;
		this.suciedad = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreConNumerosException {
		String numeros = "0987654321";
		for (short i = 0; i < nombre.length(); i++) {
			if (numeros.contains("" + nombre.charAt(i))) {
				throw new NombreConNumerosException("El nombre " + nombre + " no es válido porque tiene números");
			}
		}
		this.nombre = nombre;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		this.hambre = hambre;
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		this.sueño = sueño;
	}

	public byte getAburrimiento() {
		return aburrimiento;
	}

	public void setAburrimiento(byte aburrimiento) {
		this.aburrimiento = aburrimiento;
	}

	public byte getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(byte suciedad) {
		this.suciedad = suciedad;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", genero=" + genero + ", hambre=" + hambre + ", sueño=" + sueño
				+ ", aburrimiento=" + aburrimiento + ", suciedad=" + suciedad + "]";
	}
}
