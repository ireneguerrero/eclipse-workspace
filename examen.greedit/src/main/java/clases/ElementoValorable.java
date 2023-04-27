package clases;

import java.util.ArrayList;

import enums.Insignia;

public class ElementoValorable extends ElementoConNombre{
	private int karma;
	private ArrayList<Insignia> insignias;
	
	public ElementoValorable(String nombre, int karma, ArrayList<Insignia> insignias) {
		super(nombre);
		this.karma = karma;
		this.insignias = insignias;
	}
	
	public int getKarma() {
		return karma;
	}
	
	public void setKarma(int karma) {
		this.karma = karma;
	}
	
	public ArrayList<Insignia> getInsignias() {
		return insignias;
	}
	
	public void setInsignias(ArrayList<Insignia> insignias) {
		this.insignias = insignias;
	}
	
	@Override
	public String toString() {
		return "Valoracion [karma=" + karma + ", insignias=" + insignias + "]";
	}
	
}
