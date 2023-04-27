package examen.feria.irene.guerrero;

import java.util.ArrayList;

import clases.Caballo;
import clases.Comida;
import clases.Feria;
import clases.Noria;
import clases.PuestoComida;
import clases.Tiovivo;
import clases.Vehiculo;
import enums.TematicaVehiculo;

public class Main {

	public static void main(String[] args) {
		ArrayList<Caballo> caballo1 = new ArrayList<Caballo>();
		caballo1.add(new Caballo((byte) 12, (byte) 10));
		caballo1.add(new Caballo((byte) 9, (byte) 15));
		caballo1.add(new Caballo((byte) 10, (byte) 20));
		caballo1.add(new Caballo((byte) 5, (byte) 6));
		caballo1.add(new Caballo((byte) 3, (byte) 6));

		ArrayList<Caballo> caballo2 = new ArrayList<Caballo>();
		caballo2.add(new Caballo((byte) 13, (byte) 11));
		caballo2.add(new Caballo((byte) 10, (byte) 16));
		caballo2.add(new Caballo((byte) 11, (byte) 21));
		caballo2.add(new Caballo((byte) 6, (byte) 7));
		caballo2.add(new Caballo((byte) 4, (byte) 7));

		ArrayList<Vehiculo> vehiculo1 = new ArrayList<Vehiculo>();
		vehiculo1.add(new Vehiculo((byte) 12, true, (byte) 10, TematicaVehiculo.AMBULANCIA));
		vehiculo1.add(new Vehiculo((byte) 9, false, (byte) 15, TematicaVehiculo.COCHE_BATMAN));
		vehiculo1.add(new Vehiculo((byte) 10, true, (byte) 20, TematicaVehiculo.COCHE_BOMBEROS));
		vehiculo1.add(new Vehiculo((byte) 5, false, (byte) 6, TematicaVehiculo.COHETE));
		vehiculo1.add(new Vehiculo((byte) 3, false, (byte) 6, TematicaVehiculo.SUPERMAN));

		ArrayList<Vehiculo> vehiculo2 = new ArrayList<Vehiculo>();
		vehiculo2.add(new Vehiculo((byte) 13, true, (byte) 11, TematicaVehiculo.AMBULANCIA));
		vehiculo2.add(new Vehiculo((byte) 10, false, (byte) 16, TematicaVehiculo.COCHE_BATMAN));
		vehiculo2.add(new Vehiculo((byte) 11, true, (byte) 21, TematicaVehiculo.COCHE_BOMBEROS));
		vehiculo2.add(new Vehiculo((byte) 6, false, (byte) 7, TematicaVehiculo.COHETE));
		vehiculo2.add(new Vehiculo((byte) 4, false, (byte) 7, TematicaVehiculo.SUPERMAN));

		ArrayList<Tiovivo> tiovivo = new ArrayList<Tiovivo>();
		tiovivo.add(new Tiovivo("Tevacaé", 10.5f, caballo1, vehiculo1, 2.5f));
		tiovivo.add(new Tiovivo("Tevacaé tú", 11.5f, caballo2, vehiculo2, 3.2f));

		ArrayList<Noria> noria = new ArrayList<Noria>();
		noria.add(new Noria("Vueltecita pa la derecha", 5.2f, (short) 12, (byte) 10, (byte) 4, 0.5f));
		noria.add(new Noria("Vueltecita pa la izquierda", 4.3f, (short) 10, (byte) 8, (byte) 2, 0.2f));

		ArrayList<Comida> comidaEnVenta1 = new ArrayList<Comida>();
		comidaEnVenta1.add(new Comida("Cervecita", 2f, false));
		comidaEnVenta1.add(new Comida("Cocretas de jamón", 1.5f, true));
		comidaEnVenta1.add(new Comida("Pintxo de tortilla", 1.1f, true));
		comidaEnVenta1.add(new Comida("Pitufo mixto", 1.2f, true));

		ArrayList<Comida> comidaEnVenta2 = new ArrayList<Comida>();
		comidaEnVenta2.add(new Comida("Patatas fritas", 2.3f, true));
		comidaEnVenta2.add(new Comida("Helado", 1.5f, false));
		comidaEnVenta2.add(new Comida("Gofre", 3.5f, true));
		comidaEnVenta2.add(new Comida("Algodón de azúcar", 1.2f, false));

		ArrayList<PuestoComida> puestoComida = new ArrayList<PuestoComida>();
		puestoComida.add(new PuestoComida("Los Manolos", true, comidaEnVenta1));
		puestoComida.add(new PuestoComida("Pa los niños", false, comidaEnVenta2));

		Feria feria = new Feria("La feria de CENEC", tiovivo, noria, puestoComida);

		System.out.println(feria);
	}

}
