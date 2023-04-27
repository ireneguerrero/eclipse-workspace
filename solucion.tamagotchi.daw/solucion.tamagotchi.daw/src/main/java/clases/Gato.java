package clases;

import enums.Especie;
import exceptions.NombreConNumerosException;

public class Gato extends Tamagotchi {
	private byte causarCaos;

	public Gato(String nombre) throws NombreConNumerosException {
		super(nombre, Especie.GATO);
		this.causarCaos = 50;
	}

	public byte getCausarCaos() {
		return causarCaos;
	}

	public void setCausarCaos(byte causarCaos) {
		if(causarCaos<0) {
			this.causarCaos=0;
		}else if(causarCaos>100) {
			this.causarCaos=100;
		}else {
			this.causarCaos = causarCaos;
		}
	}
	
	
	
	@Override
	public boolean estaVivo() {
		return super.estaVivo()&&this.causarCaos>0;
	}

	
	
	
	@Override
	protected void desgastarse() {
		super.desgastarse();
		this.setCausarCaos((byte)(this.causarCaos-5));
	}
	
	public void causarCaos() {
		this.desgastarse();
		this.setCausarCaos((byte)(this.causarCaos+25));
	}

	@Override
	public String toString() {
		return super.toString()+"Causar Caos: "+this.causarCaos+"\n\t";
	}
	
	
}
