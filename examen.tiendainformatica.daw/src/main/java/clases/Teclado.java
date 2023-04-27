package clases;

import enums.EstadoMaterial;
import enums.TipoCable;
import enums.TipoTeclado;

public class Teclado extends PerifericosEntrada{
	private TipoTeclado tipo;

	public Teclado(String modelo, String marca, byte añosGarantia, boolean reestreno, EstadoMaterial estado,
			TipoCable conectividad, boolean gaming, TipoTeclado tipo) {
		super(modelo, marca, añosGarantia, reestreno, estado, conectividad, gaming);
		this.tipo = tipo;
	}

	public TipoTeclado getTipo() {
		return tipo;
	}

	public void setTipo(TipoTeclado tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TECLADO" + super.toString() + "\nTipo: " + tipo + "\n";
	}


}
