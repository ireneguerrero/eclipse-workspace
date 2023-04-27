package clases;

import enums.Especie;

public class Tamagotchi extends CosaConNombre {
	protected float edad;
	private Especie especie;
	protected byte hambre;
	protected byte sueño;
	protected byte diversion;
	protected byte estres;
	protected byte contador;

	public Tamagotchi(String nombre, float edad, Especie especie, byte hambre, byte sueño, byte diversion,
			byte estres) {
		super(nombre);
		this.edad = edad;
		this.especie = especie;
		this.hambre = hambre;
		this.sueño = sueño;
		this.diversion = diversion;
		this.estres = estres;
	}

	public Tamagotchi(String nombre, float edad, Especie especie) {
		super(nombre);
		this.edad = edad;
		this.especie = especie;
		this.hambre = 50;
		this.sueño = 50;
		this.diversion = 50;
		this.estres = 50;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
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
		if (hambre <= 0) {
			System.out.println("Tu compañero está lleno");
			this.hambre = 0;
		} else if (hambre >= 100) {
			this.hambre = 100;
		} else {
			this.hambre = hambre;
		}
	}

	public byte getSueño() {
		return sueño;
	}

	public void setSueño(byte sueño) {
		if (sueño <= 0) {
			System.out.println("Tu compañero ya no tiene sueño");
			this.sueño = 0;
		} else if (sueño >= 100) {
			this.sueño = 100;
		} else {
			this.sueño = sueño;
		}
	}

	public byte getDiversion() {
		return diversion;
	}

	public void setDiversion(byte diversion) {
		if (diversion <= 0) {
			this.diversion = 0;
		} else if (diversion >= 100) {
			System.out.println("Tu compañero está ya muy animado");
			this.diversion = 100;
		} else {
			this.diversion = diversion;
		}
	}

	public byte getEstres() {
		return estres;
	}

	public void setEstres(byte estres) {
		if (estres <= 0) {
			System.out.println("Tu compañero está que se derrite de lo relajado que está");
			this.estres = 0;
		} else if (estres >= 100) {
			this.estres = 100;
		} else {
			this.estres = estres;
		}
	}

	public void comer(Comida c) {
		contador++;
		this.setHambre((byte) (this.hambre - c.getValorEnergetico()));
		this.setDiversion((byte) (this.diversion - 5));
		this.setEstres((byte) (this.estres + 5));
		this.setSueño((byte) (this.sueño + c.getMorriña()));
		edad++;
	}

	public void dormir() {
		contador++;
		this.setSueño((byte) (this.sueño - 20));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setEstres((byte) (this.estres + 5));
		edad++;
	}

	public void jugar(Juego j) {
		contador++;
		this.setDiversion((byte) (this.diversion + j.getDiversion()));
		this.setEstres((byte) (this.estres - j.getDesestres()));
		this.setHambre((byte) (this.hambre + 5));
		this.setSueño((byte) (this.sueño + 5));
		edad++;
	}

	public void relajarse() {
		contador++;
		this.setEstres((byte) (this.estres - 20));
		this.setSueño((byte) (this.sueño + 5));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		edad++;
	}

	public boolean estaVivo() {
		if (this.getHambre() == 100) {
			System.out.println("Tu compañero murió de hambre");
			return false;
		} else if (this.getSueño() == 100) {
			System.out.println("Tu compañero murió de sueño");
			return false;
		} else if (this.getDiversion() == 0) {
			System.out.println("Tu compañero murió del aburrimiento");
			return false;
		} else if (this.getEstres() == 100) {
			System.out.println("Tu compañero murió a causa del estrés");
			return false;
		} else if (contador == 30) {
			System.out.println("Tu compañero murió por causas naturales");
			return false;
		} else {
			return true;
		}
	}

	public void crecer() {
		this.setEdad(this.edad++);
	}

	@Override
	public String toString() {
		return super.toString() + " edad: " + edad + ", especie: " + especie + ", hambre: " + hambre + ", sueño: "
				+ sueño + ", diversion: " + diversion + ", estres: " + estres;
	}

}
