package clases;

public class Noria extends ElementoConNombre implements ContarNumeroPlazas, VenderFicha {
	private float precioFicha;
	private short alturaMetros;
	private byte numeroCabinas;
	private byte asientosPorCabina;
	private float beneficio;

	public Noria(String nombre, float precioFicha, short alturaMetros, byte numeroCabinas, byte asientosPorCabina,
			float beneficio) {
		super(nombre);
		this.precioFicha = precioFicha;
		this.alturaMetros = alturaMetros;
		this.numeroCabinas = numeroCabinas;
		this.asientosPorCabina = asientosPorCabina;
		this.beneficio = beneficio;
	}

	public float getPrecioFicha() {
		return precioFicha;
	}

	public void setPrecioFicha(float precioFicha) {
		this.precioFicha = precioFicha;
	}

	public short getAlturaMetros() {
		return alturaMetros;
	}

	public void setAlturaMetros(short alturaMetros) {
		this.alturaMetros = alturaMetros;
	}

	public byte getNumeroCabinas() {
		return numeroCabinas;
	}

	public void setNumeroCabinas(byte numeroCabinas) {
		this.numeroCabinas = numeroCabinas;
	}

	public byte getAsientosPorCabina() {
		return asientosPorCabina;
	}

	public void setAsientosPorCabina(byte asientosPorCabina) {
		this.asientosPorCabina = asientosPorCabina;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tPrecio ficha: " + precioFicha + "\n\tAltura en metros: " + alturaMetros
				+ "\n\tNumero de cabinas: " + numeroCabinas + "\n\tAsientos por cabina: " + asientosPorCabina
				+ "\n\tBeneficio: " + beneficio;
	}

	public byte numeroTotalPlazas() {
		return 0;
	}

	public void venderFicha() {

	}

}
