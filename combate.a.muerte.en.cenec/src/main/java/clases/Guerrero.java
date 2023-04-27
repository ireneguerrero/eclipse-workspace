package clases;

import java.util.Random;

public class Guerrero extends Luchador {
	private Escudo escudo;

	public Guerrero(String nombre) {
		super(nombre);
		escudo = new Escudo();
	}

	public Guerrero(String nombre, byte vida, Arma arma, Escudo escudo) {
		super(nombre, vida, arma);
		this.escudo = escudo;
	}

	public Escudo getEscudo() {
		return escudo;
	}

	public void setEscudo(Escudo escudo) {
		this.escudo = escudo;
	}

	protected byte defender() {
		Random r = new Random();
		byte dañoBloqueado = (byte) r.nextInt(escudo.getProteccion());
		Luchador.esperaCorta();
		System.out.println(this.getNombre() + " defiende con su " + escudo.getNombre() + " y bloquea " + dañoBloqueado + " de daño");
		return dañoBloqueado;
	}

	@Override
	public String toString() {
		return "GUERRERO\n" + super.toString() + "\n\tEscudo: " + this.escudo;
	}

}
