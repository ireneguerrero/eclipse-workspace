package clases;

import java.util.ArrayList;

public class PuestoComida extends ElementoConNombre {
	private boolean puedeVenderAlcohol;
	private ArrayList<Comida> comidasEnVenta;

	public PuestoComida(String nombre, boolean puedeVenderAlcohol, ArrayList<Comida> comidasEnVenta) {
		super(nombre);
		this.puedeVenderAlcohol = puedeVenderAlcohol;
		this.comidasEnVenta = comidasEnVenta;
	}

	public boolean isPuedeVenderAlcohol() {
		return puedeVenderAlcohol;
	}

	public void setPuedeVenderAlcohol(boolean puedeVenderAlcohol) {
		this.puedeVenderAlcohol = puedeVenderAlcohol;
	}

	public ArrayList<Comida> getComidasEnVenta() {
		return comidasEnVenta;
	}

	public void setComidasEnVenta(ArrayList<Comida> comidasEnVenta) {
		this.comidasEnVenta = comidasEnVenta;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPuede vender alcohol: " + puedeVenderAlcohol + "\nComidas en venta: "
				+ comidasEnVenta;
	}

}
