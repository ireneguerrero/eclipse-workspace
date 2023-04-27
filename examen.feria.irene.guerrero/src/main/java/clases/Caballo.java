package clases;

public class Caballo extends EdadMinima {
	private byte numeroPlazas;

	public Caballo(byte edadMinima, byte numeroPlazas) {
		super(edadMinima);
		this.numeroPlazas = numeroPlazas;
	}

	public byte getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(byte numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tNúmero de plazas: " + numeroPlazas;
	}

}
