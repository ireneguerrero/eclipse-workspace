package clases;

import java.util.Random;

public final class Berserker extends Luchador {
	private Arma segundaArma;

	public Berserker(String nombre) {
		super(nombre);
		this.segundaArma = new Arma();
	}

	public Berserker(String nombre, byte vida, Arma arma, Arma segundaArma) {
		super(nombre, vida, arma);
		this.segundaArma = segundaArma;
	}

	public Arma getSegundaArma() {
		return segundaArma;
	}

	public void setSegundaArma(Arma segundaArma) {
		this.segundaArma = segundaArma;
	}

	@Override
	protected byte atacar() {
		byte dañoArma1 = super.atacar();
		Random r = new Random();
		byte dañoHecho = (byte) r.nextInt(this.segundaArma.getDaño());
		Luchador.esperaCorta();
		System.out.println(this.getNombre() + " ataca con su " + this.segundaArma.getNombre() + ", y hace " + dañoHecho + " de daño");
		return (byte) (dañoArma1 + dañoHecho);
	}

	@Override
	public String toString() {
		return "BERSERKER\n" + super.toString() + "\n\tArma: " + this.segundaArma;
	}

}
