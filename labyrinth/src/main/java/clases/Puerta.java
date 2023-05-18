package clases;

import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class Puerta extends ElementoCelda {
	private Llave llave;
	private ArrayList<String> material;

	public Puerta(String nombre, ImageIcon imagen, Clip sonido, Llave llave, ArrayList<String> material) {
		super(nombre, imagen, sonido);
		this.llave = llave;
		this.material = material;
	}

	public Llave getLlave() {
		return llave;
	}

	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public ArrayList<String> getMaterial() {
		return material;
	}

	public void setMaterial(ArrayList<String> material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Puerta [llave=" + llave + ", material=" + material + "]";
	}

}
