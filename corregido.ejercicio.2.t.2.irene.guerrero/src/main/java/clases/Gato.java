package clases;

import enums.Especie;

public class Gato extends Tamagotchi {
	private byte causarCaos;

	public Gato(String nombre, byte edad, Especie especie, byte hambre, byte sueño, byte diversion, byte estres,
			byte causarCaos) {
		super(nombre, edad, especie, hambre, sueño, diversion, estres);
		this.causarCaos = causarCaos;
	}

	public Gato(String nombre) {
		super(nombre, Especie.GATO);
		this.causarCaos = 50;
	}

	public void causarCaos() {
		this.causarCaos -= 20;
	}

	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		if (causarCaos < 0) {
			this.causarCaos = 0;
		} else if (causarCaos > 100) {
			this.causarCaos = 100;
		} else {
			this.causarCaos = causarCaos;
		}
	}

	@Override
	public boolean estaVivo() {
		return super.estaVivo() && causarCaos > 0;
	}

	@Override
	protected void desgastarse() {
		super.desgastarse();
		this.setCausarCaos((byte) (this.causarCaos - 5));
	}

	public void caos() {
		this.desgastarse();
		this.setCausarCaos((byte) (this.causarCaos + 25));
	}

	@Override
	public String toString() {
		return super.toString() + " causar caos: " + causarCaos;
	}

}
