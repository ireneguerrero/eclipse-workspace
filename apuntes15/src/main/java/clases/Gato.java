package clases;

import enums.Especie;
import enums.Genero;
import excepciones.NombreConNumerosException;

public class Gato extends Animal {
	/**
	 * El nivel de tendencia al caos entre 0 y 100 de un gato. 0 es que está
	 * tranquilo, 100 se hizo el caos
	 **/
	private byte tendenciaAlCaos;

	public Gato(String nombre, Genero genero, byte hambre, byte sueño, byte aburrimiento, byte suciedad,
			Especie especie, String raza, Persona dueño, byte tendenciaAlCaos) throws NombreConNumerosException {
		super(nombre, genero, hambre, sueño, aburrimiento, suciedad, especie, "Gato", dueño);
		this.tendenciaAlCaos = tendenciaAlCaos;
	}

	public Gato(String nombre, Genero genero, String raza, Persona dueño) throws NombreConNumerosException {
		super(nombre, genero, Especie.GATO, raza, dueño);
		this.tendenciaAlCaos = 0;
	}

	public byte getTendenciaAlCaos() {
		return tendenciaAlCaos;
	}

	public void setTendenciaAlCaos(byte tendenciaAlCaos) {
		this.tendenciaAlCaos = tendenciaAlCaos;
	}

	@Override
	public String toString() {
		return super.toString() + "[tendenciaAlCaos=" + tendenciaAlCaos + "]";
	}
}
