package clases;

import enums.Especie;

public class Perro extends Tamagotchi {
	private byte paseo;

	public Perro(String nombre, byte edad, Especie especie, byte hambre, byte sueño, byte diversion, byte estres,
			byte paseo) {
		super(nombre, edad, especie, hambre, sueño, diversion, estres);
		this.paseo = paseo;
	}

	public Perro(String nombre) {
		super(nombre, Especie.PERRO);
		this.paseo = 50;
	}

	public void paseo() {
		this.paseo += 20;
	}

	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		if (paseo < 0) {
			this.paseo = 0;
		} else if (paseo > 100) {
			this.paseo = 100;
		} else {
			this.paseo = paseo;
		}
	}

	@Override
	public boolean estaVivo() {
		return super.estaVivo() && paseo > 0;
	}

	@Override
	protected void desgastarse() {
		super.desgastarse();
		this.setPaseo((byte) (this.paseo - 5));
	}

	public void pasear() {
		this.desgastarse();
		this.setPaseo((byte) (paseo + 25));
	}

	@Override
	public String toString() {
		return super.toString() + " paseo: " + paseo;
	}

}
