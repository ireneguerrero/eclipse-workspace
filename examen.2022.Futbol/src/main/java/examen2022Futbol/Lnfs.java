package examen2022Futbol;

import java.util.ArrayList;
import java.util.Scanner;

import Clases.Equipo;
import Clases.Estadio;
import Clases.Liga;
import Clases.Partido;

public class Lnfs {

	public static void main(String[] args) {

		/**
		 * Declara en el main a dos equipos, cada uno con su estadio. Invéntate todos
		 * los datos de los equipos y estadios. Crea dos partidos entre esos equipos,
		 * que el equipoLocal de uno sea el equipoVisitante del otro. Invéntate la fecha
		 * y el resultado de ambos.
		 */
		Estadio laBombonera = new Estadio("La Bombonera", "Avda Rosaleda", "Málaga", 35000);
		Estadio pistaDeLaRoca = new Estadio("Pista de la Roca", "Tras el Materno", "Málaga", 50);
		Equipo losValdaos = new Equipo("Los Valdaos", -3000, laBombonera);
		Equipo losReventaos = new Equipo("Los Reventaitos", 2500, pistaDeLaRoca);

		Partido ida = new Partido("09/03/2023 15:00", losValdaos, losReventaos);
		Partido vuelta = new Partido("10/03/2023 11:00", losReventaos, losValdaos);

		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		equipos.add(losValdaos);
		equipos.add(losReventaos);

		ArrayList<Partido> partidos = new ArrayList<Partido>();
		partidos.add(ida);
		partidos.add(vuelta);

		//Liga liga = new Liga("Liga de los Mataos", (byte) 2, (byte) 10, -50, equipos, partidos);
		Liga liga= new Liga("Liga de los Mataos",
				-5000, (byte)2, (byte)10, equipos, partidos);
		
		System.out.println(liga);
		;
	}

}
