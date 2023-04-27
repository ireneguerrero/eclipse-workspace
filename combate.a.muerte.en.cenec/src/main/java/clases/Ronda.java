package clases;

import java.util.Arrays;
import java.util.Random;

public class Ronda extends ElementoConNombre {
	private Combate[] combates;

	public Ronda(String nombre, Combate[] combates) {
		super(nombre);
		this.combates = combates;
	}

	public Ronda(String nombre, Luchador[] participantes) {
		super(nombre);
		if ((participantes.length & (participantes.length - 1)) == 0) {
			Random r = new Random();
			String participantesCogidos = "";
			this.combates = new Combate[participantes.length / 2];
			for (byte i = 0; i < combates.length; i++) {
				Luchador p1 = null;
				do {
					p1 = participantes[r.nextInt(participantes.length)];
				} while (participantesCogidos.contains(p1.getNombre()));
				participantesCogidos += p1.getNombre() + "|";
				Luchador p2 = null;
				do {
					p2 = participantes[r.nextInt(participantes.length)];
				} while (participantesCogidos.contains(p2.getNombre()));
				participantesCogidos += p2.getNombre() + "|";
				this.combates[i] = new Combate(p1, p2);
			}
		} else {
			System.out.println("Lo siento, si el nº de participantes no es potencia de 2, no se puede hacer torneo");
		}
	}

	public Luchador[] jugar() {
		Luchador[] ganadores = new Luchador[combates.length];
		System.out.println("------------COMIENZA LA RONDA------------");
		System.out.println("------------" + this.getNombre() + "------------");
		for (byte i = 0; i < this.combates.length; i++) {
			System.out.println(this.getNombre() + " (" + (i + 1) + "/" + combates.length + ")");
			ganadores[i] = this.combates[i].pelear();
		}
		return ganadores;
	}

	public Combate[] getCombates() {
		return combates;
	}

	public void setCombates(Combate[] combates) {
		this.combates = combates;
	}

	@Override
	public String toString() {
		return super.toString() + "Ronda [combates=" + Arrays.toString(combates) + "]";
	}

}
