package clases;

import enums.Especie;

public class Gato extends Tamagotchi {
	private byte causarCaos;

	public Gato(String nombre, float edad, Especie especie, byte hambre, byte sueño, byte diversion, byte estres,
			byte causarCaos) {
		super(nombre, edad, especie, hambre, sueño, diversion, estres);
		this.causarCaos = causarCaos;
	}

	public Gato(String nombre, float edad, Especie especie) {
		super(nombre, edad, especie);
		this.causarCaos = 50;
	}

	public void causarCaos() {
		this.causarCaos -= 20;
	}

	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		if (causarCaos <= 0) {
			System.out.println("No te preocupes que tu compañero ya no te va a destrozar nada");
			this.causarCaos = 0;
		} else if (causarCaos >= 100) {
			this.causarCaos = 100;
		} else {
			this.causarCaos = causarCaos;
		}
	}

	public void comer(Comida c) {
		contador++;
		this.setHambre((byte) (this.hambre - c.getValorEnergetico()));
		this.setDiversion((byte) (this.diversion - 5));
		this.setEstres((byte) (this.estres + 5));
		this.setSueño((byte) (this.sueño + c.getMorriña()));
		this.setCausarCaos((byte) (this.causarCaos + 5));
		edad++;
	}

	public void dormir() {
		contador++;
		this.setSueño((byte) (this.sueño - 20));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setEstres((byte) (this.estres + 5));
		this.setCausarCaos((byte) (this.causarCaos + 5));
		edad++;
	}

	public void jugar(Juego j) {
		contador++;
		this.setDiversion((byte) (this.diversion + j.getDiversion()));
		this.setEstres((byte) (this.estres - j.getDesestres()));
		this.setHambre((byte) (this.hambre + 5));
		this.setSueño((byte) (this.sueño + 5));
		this.setCausarCaos((byte) (this.causarCaos + 5));
		edad++;
	}

	public void relajarse() {
		contador++;
		this.setEstres((byte) (this.estres - 20));
		this.setSueño((byte) (this.sueño + 5));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setCausarCaos((byte) (this.causarCaos + 5));
		edad++;
	}

	public void caos() {
		contador++;
		this.setEstres((byte) (this.estres + 5));
		this.setSueño((byte) (this.sueño + 5));
		this.setHambre((byte) (this.hambre + 5));
		this.setDiversion((byte) (this.diversion - 5));
		this.setCausarCaos((byte) (this.causarCaos - 20));
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
		} else if (this.getCausarCaos() == 100) {
			System.out.println("Tu compañero murió a causa del caos que creó");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " causar caos: " + causarCaos;
	}

}
