package clases;

import enums.EstadoMaterial;

public class Perifericos {
	protected String modelo;
	protected String marca;
	protected byte añosGarantia;
	protected boolean reestreno;
	protected EstadoMaterial estado;
	
	public Perifericos(String modelo, String marca, byte añosGarantia, boolean reestreno, EstadoMaterial estado) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.añosGarantia = añosGarantia;
		this.reestreno = reestreno;
		this.estado = estado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public byte getAñosGarantia() {
		return añosGarantia;
	}

	public void setAñosGarantia(byte añosGarantia) {
		this.añosGarantia = añosGarantia;
	}

	public boolean isReestreno() {
		return reestreno;
	}

	public void setReestreno(boolean reestreno) {
		this.reestreno = reestreno;
	}

	public EstadoMaterial getEstado() {
		return estado;
	}

	public void setEstado(EstadoMaterial estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "\nMONITOR \nModelo: " + modelo + "\nMarca :" + marca
				+ "\nAños Garantia: " + añosGarantia + "\nEstreno: " + reestreno + "\nEstado: " + estado;
	}
	

}
