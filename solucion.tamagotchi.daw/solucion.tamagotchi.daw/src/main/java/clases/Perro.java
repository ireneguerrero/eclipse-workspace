package clases;

import enums.Especie;
import exceptions.NombreConNumerosException;

public class Perro extends Tamagotchi{
	private byte paseo;
	
	public Perro(String nombre) throws NombreConNumerosException {
		super(nombre,Especie.PERRO);
		this.paseo=50;
	}

	public byte getPaseo() {
		return paseo;
	}

	public void setPaseo(byte paseo) {
		if(paseo<0) {
			this.paseo=0;
		}else if(paseo>100) {
			this.paseo=100;
		}else {
			this.paseo = paseo;
		}
	}

	
	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return super.estaVivo()&&paseo>0;
	}

	@Override
	public String toString() {
		return super.toString()+"Paseo: "+this.paseo+"\n\t";
	}

	@Override
	protected void desgastarse() {
		super.desgastarse();
		this.setPaseo((byte)(this.paseo-5));
	}
	
	public void pasear() {
		this.desgastarse();
		this.setPaseo((byte)(paseo+25));
	}
	
	
	
}
