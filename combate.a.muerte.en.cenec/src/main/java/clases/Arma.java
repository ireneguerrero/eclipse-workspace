package clases;

import java.util.Random;

public class Arma extends ElementoConNombre {
	private byte daño;

	public Arma() {
		super();
		Random r = new Random();
		byte nivelArma = (byte) r.nextInt(3);
		String[] nombresPosibles = null;
		switch (nivelArma) {
		case 0: // Armas flojuchas
			nombresPosibles = new String[] { "Espada de corchopan", "Mechero viejo", "Vaso de café", "Calcetín sudado",
					"Conexión wifi", "Gritos de los niños de la Guardería", "Mando del proyector", "Ratón de ordenador",
					"Cabeza de caballo", "Paquetes de kleenex sin usar", "Pollo de goma", "Disfraz de furro",
					"Botella de agua vacía", "Matasuegras", "Cable de red", "Funda de móvil", "Almohada de bob esponja",
					"Aceituna sin hueso" };
			this.daño = (byte) r.nextInt(1, 15);
			break;
		case 1: // Armas normales
			nombresPosibles = new String[] { "Rantón honda", "Grito del butanero", "Monitor", "Grito del afilador",
					"Chancla de su madre", "Viernes por la tarde", "Jutsu de recursividad", "Raqueta de pádel",
					"Bastón robado a un viejo", "Café caliente", "Maza-Teclado", "Lámpara",
					"Espada de mediocridad suprema", "PC de Aliexpress", "Gato enfadao" };
			this.daño = (byte) r.nextInt(15, 30);
			break;
		case 2: // Armas potentes
			nombresPosibles = new String[] { "Botijo nuclear", "Bíceps de Jose", "Navaja de Naomi", "Pico de una mesa",
					"Cable de red cortocircuitado", "Croqueta congelada con pinchos", "Examen de programación",
					"Escupitajo griposo", "Papyrus", "Ira de Carlos Boni", "Patada en la oreja un día frío",
					"Carlos Rodríguez sin supervisión", "Nullpointer Exception", "Colacao con 5 sobres de azúcar",
					"Pantallazo azul de Windows" };
			this.daño = (byte) r.nextInt(30, 41);
			break;
		}
		this.setNombre(nombresPosibles[r.nextInt(nombresPosibles.length)]);
	}

	public Arma(String nombre, byte daño) {
		super(nombre);
		this.daño = daño;
	}

	public byte getDaño() {
		return daño;
	}

	public void setDaño(byte daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return super.toString() + " [daño: " + daño + "]";
	}

}
