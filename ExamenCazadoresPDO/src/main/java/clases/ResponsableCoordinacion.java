package clases;

import java.util.Arrays;

import enums.Peligrosidad;

public class ResponsableCoordinacion {
	private GrupoGuardia[] grupoRespuesta;

	public ResponsableCoordinacion(GrupoGuardia[] grupoRespuesta) {
		super();
		this.grupoRespuesta = grupoRespuesta;
	}
	
	

	public GrupoGuardia[] getGrupoRespuesta() {
		return grupoRespuesta;
	}

	public void setGrupoRespuesta(GrupoGuardia[] grupoRespuesta) {
		this.grupoRespuesta = grupoRespuesta;
	}
	public GrupoFurtivo avisarGuardias(String nombreClaveFurtivos, int zonaAvistamientoFurtivos, Peligrosidad nivelAmenaza) {
		for(byte i=0;i<this.grupoRespuesta.length;i++) {
			if(grupoRespuesta[i].getPeligrosidad()==nivelAmenaza) {
				GrupoFurtivo grupoFurtivo=new GrupoFurtivo(nombreClaveFurtivos,nivelAmenaza,(byte)zonaAvistamientoFurtivos,this.grupoRespuesta[i]);
				return grupoFurtivo;
			}
			
		}
		return null; 
		
	}

	@Override
	public String toString() {
		return "ResponsableCoordinacion [grupoRespuesta=" + Arrays.toString(grupoRespuesta) + "]";
	}
	
}
