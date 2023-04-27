package combate.a.muerte.en.cenec;

import clases.Berserker;
import clases.Guerrero;
import clases.Luchador;
import clases.Torneo;

public class Main {

	public static void main(String[] args) {
		Luchador[] participantes = { new Guerrero("Carlos Rodríguez"), new Berserker("Carlos Castro"),
				new Berserker("Sergio"), new Guerrero("Javi"), new Guerrero("Borja"), new Berserker("Darío"),
				new Berserker("Jose Holgado"), new Berserker("Alberto Enrique"), new Guerrero("Cosmin"),
				new Guerrero("Alexandr"), new Guerrero("Mar"), new Guerrero("Mónica"), new Guerrero("Ricardo"),
				new Berserker("Mario"), new Berserker("Nico"), new Berserker("Jose Gómez"), new Berserker("Naomi"),
				new Guerrero("Irene"), new Berserker("Alberto Moreno"), new Guerrero("Eric"),
				new Guerrero("Juan Carlos"), new Berserker("Alex López"), new Berserker("Dolores"),
				new Berserker("Franco"), new Guerrero("Miguel"), new Berserker("Carlos Boni"), new Guerrero("Cintia"),
				new Berserker("Natalia"), new Berserker("Rodolfo"), new Berserker("Silvia"), new Guerrero("Manoli"),
				new Berserker("Alejandra nos dejó") };

		Torneo torneo = new Torneo("Combate a muerte Cenec", participantes);
		Luchador ganador = torneo.jugar();

		System.out.println("\n\n\n\nCAMPEÓN 1DAW OFICIAL 22/23: " + ganador);
	}

}
