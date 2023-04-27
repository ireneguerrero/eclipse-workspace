package clases;

public class Juego extends CosaConNombre {
	private byte diversion;
	private byte desestres;

	public Juego(String nombre) {
		super(nombre);
		this.diversion = 20;
		this.desestres = 20;
	}

	public byte getDiversion() {
		return diversion;
	}

	public void setDiversion(byte diversion) {
		this.diversion = diversion;
	}

	public byte getDesestres() {
		return desestres;
	}

	public void setDesestres(byte desestres) {
		this.desestres = desestres;
	}

	@Override
	public String toString() {
		return super.toString() + "diversion: " + diversion + ", estres: " + desestres;
	}

}
