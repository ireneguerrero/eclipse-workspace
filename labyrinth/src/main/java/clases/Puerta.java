package clases;

import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;

public class Puerta extends ElementoConNombreEImagen {
	private boolean estado;
	private Llave llave;
	private byte posicion;
	private ArrayList<String> material;
	private AudioInputStream sonido;
}
