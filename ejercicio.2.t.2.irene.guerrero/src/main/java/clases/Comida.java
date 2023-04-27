package clases;

public class Comida extends CosaConNombre {
	private byte valorEnergetico;
	private byte morriña;

	public Comida(String nombre) {
		super(nombre);
		this.valorEnergetico = 20;
		this.morriña = 20;
	}

	public byte getValorEnergetico() {
		return valorEnergetico;
	}

	public void setValorEnergetico(byte valorEnergetico) {
		this.valorEnergetico = valorEnergetico;
	}

	public byte getMorriña() {
		return morriña;
	}

	public void setMorriña(byte morriña) {
		this.morriña = morriña;
	}

	@Override
	public String toString() {
		return super.toString() + "valor energetico: " + valorEnergetico + ", morriña: " + morriña;
	}

}
