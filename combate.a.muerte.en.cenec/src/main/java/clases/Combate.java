package clases;

import java.util.Random;

public class Combate {
	private Luchador luchador1;
	private Luchador luchador2;

	public Combate(Luchador luchador1, Luchador luchador2) {
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
	}

	public Luchador pelear() {
		Random r = new Random();
		if (r.nextBoolean()) {
			if (this.luchador1.pelear(luchador2)) {
				return this.luchador1;
			} else {
				return this.luchador2;
			}
		} else {
			if (this.luchador2.pelear(luchador1)) {
				return this.luchador2;
			} else {
				return this.luchador1;
			}
		}
	}

	public Luchador getLuchador1() {
		return luchador1;
	}

	public Luchador getLuchador2() {
		return luchador2;
	}

}
