package clases;

import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;

public class Recompensa extends ElementoConNombreEImagen {
	private String tipo;
	private byte puntos;
	private AudioInputStream sonido;

	public Recompensa(String nombre, ImageIcon imagen, String tipo, byte puntos, AudioInputStream sonido) {
		super(nombre, imagen);
		this.tipo = tipo;
		this.puntos = puntos;
		this.sonido = sonido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public byte getPuntos() {
		return puntos;
	}

	public void setPuntos(byte puntos) {
		this.puntos = puntos;
	}

	public AudioInputStream getSonido() {
		return sonido;
	}

	public void setSonido(AudioInputStream sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Recompensa:\nTipo: " + tipo + "/nPuntos: " + puntos + "\nSonido: " + sonido;
	}

}
