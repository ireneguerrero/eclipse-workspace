package clases;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class Recompensa extends ElementoCelda {
	private String tipo;
	private byte puntos;

	public Recompensa(String nombre, ImageIcon imagen, Clip sonido, String tipo, byte puntos) {
		super(nombre, imagen, sonido);
		this.tipo = tipo;
		this.puntos = puntos;
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

	@Override
	public String toString() {
		return "Recompensa [tipo=" + tipo + ", puntos=" + puntos + "]";
	}

}
