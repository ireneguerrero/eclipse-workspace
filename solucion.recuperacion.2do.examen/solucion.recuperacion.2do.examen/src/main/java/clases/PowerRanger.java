package clases;

import enums.Color;
import exceptions.NombreConNumerosException;
import interfaces.OperacionesZord;

public class PowerRanger extends ElementoConColor implements OperacionesZord {
	
	private Zord zordActivo;

	public PowerRanger(String nombre, Color color) throws NombreConNumerosException {
		super(nombre, color);
		this.zordActivo = null;
		
	}

	public Zord getZordActivo() {
		return zordActivo;
	}

	public void setZordActivo(Zord zordActivo) {
		this.zordActivo = zordActivo;
	}

	@Override
	public String toString() {
		String ret= "PowerRanger "+this.getColor()+": "+this.getNombre()+"\n\t";
		if(this.zordActivo==null) {
			ret+="Sin zord Activo";
		}else {
			ret+=this.zordActivo;
		}
		return ret;
	}

	public boolean asignarZord(Base b) {
		if(this.zordActivo!=null) {
			return false;
		}
		for(byte i=0;i<b.getZordsAlmacenados().size();i++) {
			if(this.getColor().equals(b.getZordsAlmacenados().get(i).getColor())) {
				this.zordActivo=b.getZordsAlmacenados().get(i);
				b.getZordsAlmacenados().remove(i);
				return true;
			}
		}
		return false;
	}

	public boolean devolverZord(Base b) {
		if(this.zordActivo!=null) {
			b.getZordsAlmacenados().add(this.zordActivo);
			this.zordActivo=null;
			return true;
		}
		return false;
	}
	
	
}
