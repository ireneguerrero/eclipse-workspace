package Clases;

import java.util.ArrayList;

public class Liga extends ElementoConPresupuesto {
	private byte minimoEquiposParticipantes;
	private byte maximoEquiposParticipantes;
	
	ArrayList<Equipo> equipos;
	ArrayList<Partido> partidos;

	/** Constructor **/
	public Liga(String nombre, float presupuesto, byte minimoEquiposParticipantes, byte maximoEquiposParticipantes,
			ArrayList<Equipo> equipos, ArrayList<Partido> partidos) {
		super(nombre, presupuesto);
		this.minimoEquiposParticipantes = minimoEquiposParticipantes;
		this.maximoEquiposParticipantes = maximoEquiposParticipantes;
		this.equipos = equipos;
		this.partidos = partidos;
	}
	
	

	/** Getters y Setters **/

	public byte getMinimoEquiposParticipantes() {
		return minimoEquiposParticipantes;
	}



	public void setMinimoEquiposParticipantes(byte minimoEquiposParticipantes) {
		this.minimoEquiposParticipantes = minimoEquiposParticipantes;
	}

	public byte getMaximoEquiposParticipantes() {
		return maximoEquiposParticipantes;
	}

	public void setMaximoEquiposParticipantes(byte maximoEquiposParticipantes) {
		this.maximoEquiposParticipantes = maximoEquiposParticipantes;
	}

	

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(ArrayList<Partido> partidos) {
		this.partidos = partidos;
	}

	/**
	 * Se modifica el toString para que imprima de forma mas clara en el main, se
	 * hacen don bucles foreach para que se impriman los arrays de Partidos y
	 * Equipos de la liga
	 */
	@Override
	public String toString() {
		String equiposDelArray = "";
		for (Equipo equipo : equipos) {
			equiposDelArray += equipo.toString();
		}

		String partidosDelArray = "";
		for (Partido partido : partidos) {
			partidosDelArray += partido.toString() + "\n";

		}

		return "Bienvenidos a la Liga " + super.toString() + "\nUna liga donde contaremos con un minimo de "
				+ minimoEquiposParticipantes + " equipos y un maximo de " + maximoEquiposParticipantes + " equipos."
				+ "\nEl presupuesto de esta liga es de " + super.getPresupuesto() + " €." + "\n\nContamos con los equipos: \n"
				+ equiposDelArray + "\nY los partidos serán: \n" + partidosDelArray;
	}

}
