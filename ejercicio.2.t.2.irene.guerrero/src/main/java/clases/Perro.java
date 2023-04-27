package clases;

import enums.Especie;

public class Perro extends Tamagotchi {
	private byte paseo;

	public Perro(String nombre, float edad, Especie especie, byte hambre, byte sueño, byte diversion, byte estres,
			byte paseo) {
		super(nombre, edad, especie, hambre, sueño, diversion, estres);
		this.paseo = paseo;
	}

	public Perro(String nombre, float edad, Especie especie) {
		super(nombre, edad, especie);
		this.paseo = 50;
	}

	public void paseo() {
		this.paseo += 20;
	}

	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		if (paseo <= 0) {
			this.paseo = 0;
		} else if (paseo >= 100) {
			System.out.println("Tu compañero ha paseado suficiente");
			this.paseo = 100;
		} else {
			this.paseo = paseo;
		}
	}

	public void comer(Comida c) {
		contador++;
		this.setHambre((byte) (this.hambre - c.getValorEnergetico()));
		this.setDiversion((byte) (this.diversion - 5));
		this.setEstres((byte) (this.estres + 5));
		this.setSueño((byte) (this.sueño + c.getMorriña()));
		this.setPaseo((byte) (this.paseo - 5));
		edad++;
	}

	public void dormir() {
		contador++;
		this.setSueño((byte) (this.sueño - 20));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setEstres((byte) (this.estres + 5));
		this.setPaseo((byte) (this.paseo - 5));
		edad++;
	}

	public void jugar(Juego j) {
		contador++;
		this.setDiversion((byte) (this.diversion + j.getDiversion()));
		this.setEstres((byte) (this.estres - j.getDesestres()));
		this.setHambre((byte) (this.hambre + 5));
		this.setSueño((byte) (this.sueño + 5));
		this.setPaseo((byte) (this.paseo - 5));
		edad++;
	}

	public void relajarse() {
		contador++;
		this.setEstres((byte) (this.estres - 20));
		this.setSueño((byte) (this.sueño + 5));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setPaseo((byte) (this.paseo - 5));
		edad++;
	}

	public void paseito() {
		contador++;
		this.setEstres((byte) (this.estres + 5));
		this.setSueño((byte) (this.sueño + 5));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setPaseo((byte) (this.paseo + 20));
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
		} else if (this.getPaseo() == 0) {
			System.out.println("Tu compañero murió por no salir a pasear");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " paseo: " + paseo;
	}

}
