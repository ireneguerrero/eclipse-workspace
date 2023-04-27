package clases;

import java.util.ArrayList;

public class Tiovivo extends ElementoConNombre implements ContarNumeroPlazas, VenderFicha {
	private float precioFicha;
	private ArrayList<Caballo> caballo;
	private ArrayList<Vehiculo> vehiculo;
	private float beneficio;

	public Tiovivo(String nombre, float precioFicha, ArrayList<Caballo> caballo, ArrayList<Vehiculo> vehiculo,
			float beneficio) {
		super(nombre);
		this.precioFicha = precioFicha;
		this.caballo = caballo;
		this.vehiculo = vehiculo;
		this.beneficio = beneficio;
	}

	public float getPrecioFicha() {
		return precioFicha;
	}

	public void setPrecioFicha(float precioFicha) {
		this.precioFicha = precioFicha;
	}

	public ArrayList<Caballo> getCaballo() {
		return caballo;
	}

	public void setCaballo(ArrayList<Caballo> caballo) {
		this.caballo = caballo;
	}

	public ArrayList<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tPrecio ficha: " + precioFicha + "\n\tCaballo: " + caballo + "\n\tVehículo: "
				+ vehiculo + "\n\tBeneficio" + beneficio;
	}

	public byte numeroTotalPlazas() {
		return 0;
	}

	public void venderFicha() {

	}

}
