package clases;

import enums.Peligrosidad;

public class GrupoFurtivo extends Grupo {
	private byte zonAvistamiento;
	private GrupoGuardia guardias;
	public GrupoFurtivo(String nombre, Peligrosidad peligrosidad, byte zonAvistamiento, GrupoGuardia guardias) {
		super(nombre, peligrosidad);
		this.zonAvistamiento = zonAvistamiento;
		this.guardias = guardias;
	}
	public byte getZonAvistamiento() {
		return zonAvistamiento;
	}
	public void setZonAvistamiento(byte zonAvistamiento) {
		this.zonAvistamiento = zonAvistamiento;
	}
	public GrupoGuardia getGuardias() {
		return guardias;
	}
	public void setGuardias(GrupoGuardia guardias) {
		this.guardias = guardias;
	}
	@Override
	public String toString() {
		return super.toString()+" GrupoFurtivo [zonAvistamiento=" + zonAvistamiento + ", guardias=" + guardias + "]";
	}
	
}
