package clases;

import enums.Especie;
import exceptions.NombreConNumerosException;

public class Tamagotchi extends CosaConNombre {
	private byte edad;
	private byte hambre;
	private byte sueño;
	private byte diversion;
	private byte estres;
	private Especie especie;

	public Tamagotchi(String nombre, Especie especie) throws NombreConNumerosException {
		super(nombre);
		this.especie = especie;
		this.hambre = 50;
		this.sueño = 50;
		this.edad = 0;
		this.estres = 50;
		this.diversion = 50;
	}

	public Especie getEspecie() {
		return especie;
	}

	@Override
	public String toString() {
		return super.toString() + " - " + this.especie + " (" + this.edad + " años)" + "\n\t" + "Hambre: " + this.hambre
				+ "\n\t" + "Sueño: " + this.sueño + "\n\t" + "Diversion: " + this.diversion + "\n\t" + "Estres: "
				+ this.estres + "\n\t";
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

	public void comer(Comida c) {
		this.hambre += c.getValorEnergetico();
		this.estres -= c.getMorriña();
		this.hambre += 5;
		this.estres -= 5;
		this.desgastarse();
		if (this.hambre > 100) {
			hambre = 100;
		}
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

	protected void desgastarse() {
		this.hambre -= 5;
		this.sueño -= 5;
		this.diversion -= 5;
		this.estres += 5;
		if (this.sueño < 0) {
			this.sueño = 0;
		}
		if (this.estres > 100) {
			this.estres = 100;
		}
		this.edad++;
	}

	public byte getHambre() {
		return hambre;
	}

	public void setHambre(byte hambre) {
		if(hambre<0) {
			this.hambre=0;
		}else if(hambre>100) {
			this.hambre=100;
		}else {
			this.hambre = hambre;
		}
	}
	
	

}
