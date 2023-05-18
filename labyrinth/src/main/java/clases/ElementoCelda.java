package clases;

import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class ElementoCelda extends ElementoConNombreEImagen {
	private Clip sonido;

	public ElementoCelda(String nombre, ImageIcon imagen, Clip sonido) {
		super(nombre, imagen);
		this.sonido = sonido;
	}

	public Clip getSonido() {
		return sonido;
	}

	public void setSonido(Clip sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "ElementoCelda [sonido=" + sonido + "]";
	}

}
