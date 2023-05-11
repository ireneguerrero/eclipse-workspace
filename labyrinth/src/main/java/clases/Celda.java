package clases;

import javax.swing.ImageIcon;

public class Celda extends ElementoConNombreEImagen {
	private Llave llave;
	private Puerta puerta;
	private Recompensa recompensa;
	private Enemigo enemigo;
	private boolean salida;

	public Celda(String nombre, ImageIcon imagen, Llave llave, Puerta puerta, Recompensa recompensa, Enemigo enemigo,
			boolean salida) {
		super(nombre, imagen);
		this.llave = llave;
		this.puerta = puerta;
		this.recompensa = recompensa;
		this.enemigo = enemigo;
		this.salida = salida;
	}

	public Llave getLlave() {
		return llave;
	}

	public void setLlave(Llave llave) {
		this.llave = llave;
	}

	public Puerta getPuerta() {
		return puerta;
	}

	public void setPuerta(Puerta puerta) {
		this.puerta = puerta;
	}

	public Recompensa getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(Recompensa recompensa) {
		this.recompensa = recompensa;
	}

	public Enemigo getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}

	public boolean isSalida() {
		return salida;
	}

	public void setSalida(boolean salida) {
		this.salida = salida;
	}

	@Override
	public String toString() {
		return "Celda:\nLlave: " + llave + "\nPuerta: " + puerta + "\nRecompensa: " + recompensa + "\nEnemigo: "
				+ enemigo + "\nSalida: " + salida;
	}

}
