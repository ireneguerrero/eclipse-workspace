package clases;

import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;

public class Llave extends ElementoConNombreEImagen {
	private boolean tipo;
	private boolean estado;
	private byte posicion;
	private AudioInputStream sonido;

	public Llave(String nombre, ImageIcon imagen, boolean tipo, boolean estado, byte posicion,
			AudioInputStream sonido) {
		super(nombre, imagen);
		this.tipo = tipo;
		this.estado = estado;
		this.posicion = posicion;
		this.sonido = sonido;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public byte getPosicion() {
		return posicion;
	}

	public void setPosicion(byte posicion) {
		this.posicion = posicion;
	}

	public AudioInputStream getSonido() {
		return sonido;
	}

	public void setSonido(AudioInputStream sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Llave:\nTipo: " + tipo + "\nEstado: " + estado + "\nPosición: " + posicion + "\nSonido: " + sonido;
	}

}
