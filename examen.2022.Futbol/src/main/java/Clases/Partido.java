package Clases;

public class Partido {
	private byte golesLocales;
	private byte golesVisitantes;
	private String diaYHora;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private boolean finalizado;

	/** Constructor **/
	public Partido(byte golesLocales, byte golesVisitantes, String diaYHora, Equipo equipoLocal,
			Equipo equipoVisitante) {
		this.finalizado=false;
		this.golesLocales = golesLocales;
		this.golesVisitantes = golesVisitantes;
		this.diaYHora = diaYHora;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}

	/**
	 * Haz un constructor de partido que no reciba por argumentos ni los goles del
	 * equipo local ni los del visitante, y los inicialice a cero.
	 */
	
	public Partido(String diaYHora, Equipo equipoLocal,
			Equipo equipoVisitante) {
		this.finalizado=false;
		this.golesLocales = 0;
		this.golesVisitantes = 0;
		this.diaYHora = diaYHora;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}
	
	

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	/** Getters y Setters **/
	public byte getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(byte golesLocales) {
		this.golesLocales = golesLocales;
	}

	public byte getGolesVisitantes() {
		return golesVisitantes;
	}

	public void setGolesVisitantes(byte golesVisitantes) {
		this.golesVisitantes = golesVisitantes;
	}

	public String getDiaYHora() {
		return diaYHora;
	}

	public void setDiaYHora(String diaYHora) {
		this.diaYHora = diaYHora;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	@Override
	public String toString() {
		return diaYHora + " " + equipoLocal.getEstadio().getNombre() + 
				" (" + equipoLocal.getEstadio().getCiudad()
				+ ")\n" + "Local: " + equipoLocal.getNombre() + " " 
				+ golesLocales + "\n" + "Visitante: "
				+ equipoVisitante.getNombre() + " " + golesVisitantes + "\n";
	}

}
