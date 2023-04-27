package clases;

import java.util.Random;

public class Escudo extends ElementoConNombre {
	private byte proteccion;

	public Escudo() {
		super();
		Random r = new Random();
		byte nivelEscudo = (byte) r.nextInt(3);
		String[] nombresPosibles = null;
		switch (nivelEscudo) {
		case 0: // Escudos flojuchos
			nombresPosibles = new String[] { "Bolsa de basura", "Manta de cama rota", "Camiseta raía", "Folio",
					"Crema solar factor 0", "Cortina rota", "Pantalones con agujero en el culo", "Mochila vacía",
					"Colilla usada", "Vaselina", "Tirita mojada", "Gimiendo: Por favor no me pegues",
					"Llamando a su mamá, pero no viene", "Argumentos terraplanistas", "Gorro de papel de aluminio" };
			this.proteccion = (byte) r.nextInt(1, 15);
			break;
		case 1: // Escudos normales
			nombresPosibles = new String[] { "Tapa de la olla", "Almohada", "Espejo de cristal dispuesto a romperse",
					"Armadura de gomaespuma", "Libreta", "Oso de peluche", "Monitor", "Silla de tres patas",
					"Mascarilla FP2", "Casco de madera", "Escudo mediocre", "Firewall de windows", "Abrigo gordo",
					"Paquetón de folios", "Manta de la abuela", "Escudo del capitán cártama", "La mano de Karius" };
			this.proteccion = (byte) r.nextInt(15, 30);
			break;
		case 2: // Escudos potentes
			nombresPosibles = new String[] { "Spray de pimienta", "Escudo de acero", "Escudo de oro",
					"Escudo del capitán américa", "Cristal blindado", "Nokia antiguo", "Puerta", "Ricardo de LI",
					"Armadura berserker", "Escudo reluciente de la defensa infinita", "Chaleco anti navaja de Naomi",
					"Armadura de guión", "Muchos pollos de goma unidos con fiso", "La palabra de Dios",
					"Dominic toreto", };
			this.proteccion = (byte) r.nextInt(30, 41);
			break;
		}
		this.setNombre(nombresPosibles[r.nextInt(nombresPosibles.length)]);
	}

	public Escudo(String nombre, byte proteccion) {
		super(nombre);
		this.proteccion = proteccion;
	}

	public byte getProteccion() {
		return proteccion;
	}

	public void setProteccion(byte proteccion) {
		this.proteccion = proteccion;
	}

	@Override
	public String toString() {
		return super.toString() + " [proteccion: " + proteccion + "]";
	}

}
