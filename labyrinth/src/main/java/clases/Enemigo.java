package clases;

import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;

public class Enemigo extends Personaje {
	private AudioInputStream sonido;

	public Enemigo(String nombre, ImageIcon imagen, byte vida, boolean estado, byte poder, byte daño, byte fuerza,
			byte inteligencia, byte agilidad, AudioInputStream sonido) {
		super(nombre, imagen, vida, estado, poder, daño, fuerza, inteligencia, agilidad);
		this.sonido = sonido;
	}

	public AudioInputStream getSonido() {
		return sonido;
	}

	public void setSonido(AudioInputStream sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Enemigo:\nSonido: " + sonido;
	}

}
