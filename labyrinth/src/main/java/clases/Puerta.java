package clases;

import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.swing.ImageIcon;

public class Puerta extends ElementoConNombreEImagen {
	private boolean estado;
	private Llave llave;
	private byte posicion;
	private ArrayList<String> material;
	private AudioInputStream sonido;

	public Puerta(String nombre, ImageIcon imagen, boolean estado, Llave llave, byte posicion,
			ArrayList<String> material, AudioInputStream sonido) {
		super(nombre, imagen);
		this.estado = estado;
		this.llave = llave;
		this.posicion = posicion;
		this.material = material;
		this.sonido = sonido;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Llave getLlave() {
		return llave;
	}

	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public byte getPosicion() {
		return posicion;
	}

	public void setPosicion(byte posicion) {
		this.posicion = posicion;
	}

	public ArrayList<String> getMaterial() {
		return material;
	}

	public void setMaterial(ArrayList<String> material) {
		this.material = material;
	}

	public AudioInputStream getSonido() {
		return sonido;
	}

	public void setSonido(AudioInputStream sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Puerta:\nEstado: " + estado + "\nLlave: " + llave + "\nPosición: " + posicion + "\nMaterial: "
				+ material + "\nSonido: " + sonido;
	}

}
