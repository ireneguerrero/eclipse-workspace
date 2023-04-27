package clases;

import enums.TematicaVehiculo;

public class Vehiculo extends EdadMinima {
	private boolean tieneBocinas;
	private byte numeroPlazas;
	private TematicaVehiculo tematicaVehiculo;

	public Vehiculo(byte edadMinima, boolean tieneBocinas, byte numeroPlazas, TematicaVehiculo tematicaVehiculo) {
		super(edadMinima);
		this.tieneBocinas = tieneBocinas;
		this.numeroPlazas = numeroPlazas;
		this.tematicaVehiculo = tematicaVehiculo;
	}

	public boolean isTieneBocinas() {
		return tieneBocinas;
	}

	public void setTieneBocinas(boolean tieneBocinas) {
		this.tieneBocinas = tieneBocinas;
	}

	public byte getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(byte numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public TematicaVehiculo getTematicaVehiculo() {
		return tematicaVehiculo;
	}

	public void setTematicaVehiculo(TematicaVehiculo tematicaVehiculo) {
		this.tematicaVehiculo = tematicaVehiculo;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tTiene bocinas: " + tieneBocinas + "\n\tNúmero de plazas: " + numeroPlazas
				+ "\n\tTematica del vehículo: " + tematicaVehiculo;
	}

}
