package clases;

import java.util.Arrays;

public class Laberinto {
	private byte nivel;
	private Celda[][] celdas;

	public Laberinto(Celda[][] celdas, byte nivel) {
		this.celdas = celdas;
		this.nivel = nivel;
	}

	public Laberinto(int numero) {
	    switch (numero) {
	        case 1:
	            this.nivel = 1;
	            this.celdas = new Celda[][] {
	                {new Celda(), new Celda(), new Celda()},
	                {new Celda(), new Celda(), new Celda()},
	                {new Celda(), new Celda(), new Celda()}
	            };
	            break;
	        case 2:
	            this.nivel = 2;
	            this.celdas = new Celda[][] {
	                {new Celda(), new Celda(), new Celda(), new Celda()},
	                {new Celda(), new Celda(), new Celda(), new Celda()},
	                {new Celda(), new Celda(), new Celda(), new Celda()},
	                {new Celda(), new Celda(), new Celda(), new Celda()}
	            };
	            break;
	        case 3:
	            this.nivel = 3;
	            this.celdas = new Celda[][] {
	                {new Celda(), new Celda()},
	                {new Celda(), new Celda()},
	                {new Celda(), new Celda()},
	                {new Celda(), new Celda()},
	                {new Celda(), new Celda()}
	            };
	            break;
	        default:
	            this.nivel = 0;
	            this.celdas = new Celda[0][0]; // Laberinto vacío por defecto
	            break;
	    }
	}


	public Celda[][] getCeldas() {
		return celdas;
	}

	public void setCeldas(Celda[][] celdas) {
		this.celdas = celdas;
	}

	public byte getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Laberinto:\nCeldas: " + Arrays.toString(celdas) + "\nNivel=" + nivel;
	}

}
