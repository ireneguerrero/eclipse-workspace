package clases;

import enums.EstadoMaterial;
import enums.TipoCable;

public class Raton extends PerifericosEntrada{
	private byte botones;

	public Raton(String modelo, String marca, byte añosGarantia, boolean reestreno, EstadoMaterial estado,
			TipoCable conectividad, boolean gaming, byte botones) {
		super(modelo, marca, añosGarantia, reestreno, estado, conectividad, gaming);
		this.botones = botones;
	}
	
	public byte getBotones() {
		return botones;
	}

	public void setBotones(byte botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "RATÓN" + super.toString() + " \nBotones: " + botones + "\n";
	}
	

}
