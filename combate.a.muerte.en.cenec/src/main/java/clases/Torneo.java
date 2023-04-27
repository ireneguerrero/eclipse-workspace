package clases;

import java.util.Arrays;

public class Torneo extends ElementoConNombre {
	private Ronda[] rondas;

	public Torneo(String nombre, Ronda[] rondas) {
		super(nombre);
		this.rondas = rondas;
	}

	public Torneo(String nombre, Luchador[] participantes) {
		super(nombre);
		byte totalParticipantes = (byte) participantes.length;
		byte nRondas = 0;
		// Cálculo del total de rondas que necesito para el torneo
		while (totalParticipantes != 1) {
			nRondas++;
			totalParticipantes /= 2;
		}
		this.rondas = new Ronda[nRondas];
		this.rondas[0] = new Ronda("1/" + (participantes.length / 2) + " de final", participantes);
	}

	public Luchador jugar() {
		for (byte i = 0; i < this.rondas.length - 1; i++) {
			Luchador[] ganadores = this.rondas[i].jugar();
			this.rondas[i + 1] = new Ronda("1/" + (ganadores.length / 2) + " de final", ganadores);
		}
		Luchador[] ganador = this.rondas[this.rondas.length - 1].jugar();
		return ganador[0];
	}

	public Ronda[] getRondas() {
		return rondas;
	}

	public void setRondas(Ronda[] rondas) {
		this.rondas = rondas;
	}

	@Override
	public String toString() {
		return super.toString() + "Torneo [rondas=" + Arrays.toString(rondas) + "]";
	}

}
