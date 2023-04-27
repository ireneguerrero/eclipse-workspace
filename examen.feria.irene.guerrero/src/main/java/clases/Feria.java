package clases;

import java.util.ArrayList;

public class Feria extends ElementoConNombre {
	private ArrayList<Tiovivo> tiovivo;
	private ArrayList<Noria> noria;
	private ArrayList<PuestoComida> puestoComida;

	public Feria(String nombre, ArrayList<Tiovivo> tiovivo, ArrayList<Noria> noria,
			ArrayList<PuestoComida> puestoComida) {
		super(nombre);
		this.tiovivo = tiovivo;
		this.noria = noria;
		this.puestoComida = puestoComida;
	}

	public ArrayList<Tiovivo> getTiovivo() {
		return tiovivo;
	}

	public void setTiovivo(ArrayList<Tiovivo> tiovivo) {
		this.tiovivo = tiovivo;
	}

	public ArrayList<Noria> getNoria() {
		return noria;
	}

	public void setNoria(ArrayList<Noria> noria) {
		this.noria = noria;
	}

	public ArrayList<PuestoComida> getPuestoComida() {
		return puestoComida;
	}

	public void setPuestoComida(ArrayList<PuestoComida> puestoComida) {
		this.puestoComida = puestoComida;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTiovivo: " + tiovivo + "\nNoria: " + noria + "\nPuesto de comida: " + puestoComida;
	}

}
