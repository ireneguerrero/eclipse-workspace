package clases;

public abstract class EdadMinima {
	private byte edadMinima;

	public EdadMinima(byte edadMinima) {
		super();
		this.edadMinima = edadMinima;
	}

	public byte getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(byte edadMinima) {
		this.edadMinima = edadMinima;
	}

	@Override
	public String toString() {
		return "Edad mínima: " + edadMinima;
	}

}
