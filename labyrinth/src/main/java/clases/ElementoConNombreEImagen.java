package clases;

import javax.swing.ImageIcon;

public class ElementoConNombreEImagen {
	protected String nombre;
	protected ImageIcon imagen;

	public ElementoConNombreEImagen(String nombre, ImageIcon imagen) {
		super();
		this.nombre = nombre;
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nImagen: " + imagen;
	}

}
