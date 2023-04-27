package clases;

import java.util.Random;

public abstract class Luchador extends ElementoConNombre {
	private Arma arma;
	private byte vida;

	public Luchador(String nombre) {
		super(nombre);
		this.vida = 100;
		this.arma = new Arma();
	}

	public Luchador(String nombre, byte vida, Arma arma) {
		super(nombre);
		this.arma = arma;
		this.setVida(vida);
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		if (vida > 100) {
			System.out.println("No se puede poner una vida mayor que 100");
		} else if (vida < 0) {
			this.vida = 0;
		} else {
			this.vida = vida;
		}
	}

	/**
	 * Función que realiza el combate a muerte entre dos luchadores. Se pegan por
	 * turnos hasta que uno de los dos ve que su vida llega a 0. Siempre pega
	 * primero this.
	 * 
	 * @param rival el rival contra el que peleará quien llame a la función (this)
	 * @return true si this ha ganado, false si gana el rival
	 */
	public boolean pelear(Luchador rival) {
		System.out.println(this + "\n-------VS-------\n" + rival + "\n\n");
		Luchador.esperaLarga();
		do {
			byte ataque = this.atacar();
			byte defensa = 0;
			if (rival.getClass() == Guerrero.class) {
				defensa = ((Guerrero) rival).defender();
			}
			if (ataque > defensa) {
				rival.setVida((byte) (rival.vida - (ataque - defensa)));
			}
			System.out.println("A " + rival.getNombre() + " le quedan " + rival.vida + " puntos de vida");
			Luchador.esperaCorta();
			if (rival.vida > 0) { // Solo ataca si el rival no ha muerto
				ataque = rival.atacar();
				defensa = 0;
				if (this.getClass() == Guerrero.class) {
					defensa = ((Guerrero) this).defender();
				}
				if (ataque > defensa) {
					this.setVida((byte) (this.vida - (ataque - defensa)));
				}
				System.out.println("A " + this.getNombre() + " le quedan " + this.vida + " puntos de vida");
				Luchador.esperaCorta();
			}
		} while (this.vida > 0 && rival.vida > 0);
		return this.vida > 0;
	}

	protected byte atacar() {
		Random r = new Random();
		byte dañoHecho = (byte) r.nextInt(this.arma.getDaño());
		Luchador.esperaCorta();
		System.out.println(this.getNombre() + " ataca con su " + this.arma.getNombre() + ", y hace " + dañoHecho + " de daño");
		return dañoHecho;
	}

	protected static void esperaCorta() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void esperaLarga() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		String ret = super.toString() + " - " + this.vida + "/100\n";
		for (byte i = 0; i < this.getNombre().length() + 7; i++) {
			ret += "-";
		}
		ret += (this.vida < 10 ? "-" : vida < 100 ? "--" : "---");
		ret += "\n\tArma: " + this.arma;
		return ret;
	}

}
