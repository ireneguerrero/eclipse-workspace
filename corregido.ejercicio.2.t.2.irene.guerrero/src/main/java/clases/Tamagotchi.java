package clases;

import enums.Especie;

public class Tamagotchi extends CosaConNombre {
	private byte edad;
	private Especie especie;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;

	public Tamagotchi(String nombre, byte edad, Especie especie, byte hambre, byte sueño, byte diversion, byte estres) {
		super(nombre);
		this.edad = edad;
		this.especie = especie;
		this.hambre = hambre;
		this.sueño = sueño;
		this.diversion = diversion;
		this.estres = estres;
	}

	public Tamagotchi(String nombre, Especie especie) {
		super(nombre);
		this.edad = 0;
		this.especie = especie;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		this.hambre = hambre;
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		this.sueño = sueño;
	}

	public byte getDiversion() {
		return diversion;
	}

	public void setDiversion(byte diversion) {
		this.diversion = diversion;
	}

	public byte getEstres() {
		return estres;
	}

	public void setEstres(byte estres) {
		this.estres = estres;
	}

	public boolean estaVivo() {
		return hambre > 0 && sueño > 0 && diversion > 0 && estres < 100 && edad < 30;
	}

	public void relajarse() {
		this.estres -= 25;
		this.desgastarse();
		if (this.estres < 0) {
			this.estres = 0;
		}
	}

	public void dormir() {
		this.sueño += 25;
		this.desgastarse();
		if (this.sueño > 100) {
			this.sueño = 100;
		}
	}

	public void comer(Comida c) {
		this.hambre += c.getValorEnergetico();
		this.estres -= c.getMorriña();
		this.hambre += 5;
		this.estres -= 5;
		this.desgastarse();
		if (this.hambre > 100) {
			this.hambre = 100;
		}
		if (this.estres < 0) {
			this.estres = 0;
		}
	}

	public void jugar(Juego j) {
		this.diversion += j.getDiversion();
		this.estres -= j.getEstres();
		this.diversion += 5;
		this.estres -= 5;
		this.desgastarse();
		if (this.diversion > 100) {
			this.diversion = 100;
		}
		if (this.estres < 0) {
			this.estres = 0;
		}
	}

	protected void desgastarse() {
		this.hambre -= 5;
		this.sueño -= 5;
		this.diversion -= 5;
		this.estres += 5;
		this.edad++;
		if (this.estres > 100) {
			this.estres = 100;
		}
		if (this.sueño < 0) {
			this.sueño = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " edad: " + edad + " años" + ", especie: " + especie + ", hambre: " + hambre
				+ ", sueño: " + sueño + ", diversion: " + diversion + ", estres: " + estres;
	}

}
