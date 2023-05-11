package clases;

import java.util.Arrays;

import javax.swing.ImageIcon;

public class Laberinto extends ElementoConNombreEImagen {
	private byte celdas[][];
	private byte nivel;

	public Laberinto(String nombre, ImageIcon imagen, byte[][] celdas, byte nivel) {
		super(nombre, imagen);
		this.celdas = celdas;
		this.nivel = nivel;
	}

	public byte[][] getCeldas() {
		return celdas;
	}

	public void setCeldas(byte[][] celdas) {
		this.celdas = celdas;
	}

	public byte getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Laberinto:\nCeldas: " + Arrays.toString(celdas) + "\nNivel=" + nivel;
	}

}
