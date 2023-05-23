package clases;

import javax.swing.ImageIcon;

public class Llave extends ElementoConNombreEImagen {
	private boolean esMaestra;

	public Llave(String nombre, ImageIcon imagen, boolean esMaestra) {
		super(nombre, imagen);
		this.esMaestra = esMaestra;
	}
	
//	public Llave(boolean esMaestra) {
//		super();
//		this.esMaestra=esMaestra;
//	}

	public boolean isEsMaestra() {
		return esMaestra;
	}

	public void setEsMaestra(boolean esMaestra) {
		this.esMaestra = esMaestra;
	}

	@Override
	public String toString() {
		return "Llave [esMaestra=" + esMaestra + "]";
	}

}
