package clases;

import enums.EstadoMaterial;
import enums.TipoCable;

public class PerifericosEntrada extends Perifericos{
	private TipoCable conectividad;
	private boolean gaming;
	
	public PerifericosEntrada(String modelo, String marca, byte añosGarantia, boolean reestreno, EstadoMaterial estado,
			TipoCable conectividad, boolean gaming) {
		super(modelo, marca, añosGarantia, reestreno, estado);
		this.setConectividad (conectividad);
		this.gaming = gaming;
	}
	
	public TipoCable getConectividad() {
		return conectividad;
	}

	public void setConectividad(TipoCable conectividad) {
		if (conectividad.equals(TipoCable.USB_2)) {
			this.conectividad = TipoCable.USB_2;
		} else if (conectividad.equals(TipoCable.USB_3)) {
			this.conectividad = TipoCable.USB_3;
		} else if (conectividad.equals(TipoCable.USB_C)) {
			this.conectividad = TipoCable.USB_C;
		} else if (conectividad.equals(TipoCable.WIRELESS)) {
			this.conectividad = TipoCable.WIRELESS;
		} else {
			this.conectividad = null;
		}
	}
	
	public boolean isGaming() {
		return gaming;
	}
	
	public void setGaming(boolean gaming) {
		this.gaming = gaming;
	}

	@Override
	public String toString() {
		return "\nModelo: " + modelo + "\nMarca: " + marca + " \nConectividad: "
				+ (this.conectividad == null ? "No se puede" : this.conectividad) + " \nGaming: " + gaming
				+ "\nAños Garantia: " + añosGarantia + "\nEstreno: " + reestreno + "\nEstado: " + estado;
	}
	
}
