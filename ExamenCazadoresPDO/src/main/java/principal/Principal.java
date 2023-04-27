package principal;

import java.util.Scanner;

import clases.GrupoFurtivo;
import clases.GrupoGuardia;
import clases.ResponsableCoordinacion;
import enums.Peligrosidad;

public class Principal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GrupoGuardia[] guardias = { new GrupoGuardia("Alfa", Peligrosidad.GRAVE),
				new GrupoGuardia("Beta", Peligrosidad.MODERADA), new GrupoGuardia("Country", Peligrosidad.LEVE) };
		ResponsableCoordinacion responsable = new ResponsableCoordinacion(guardias);
		System.out.println("Dime el nombre del grupo de furtivos");
		String nombreFurtivo=sc.nextLine();
		System.out.println("Zona de incidencia del grupo de furtivo");
		byte zonaIncidencia=Byte.parseByte(sc.nextLine());
		System.out.println("Nivel de amenaza del grupo de furtivo:"
				+ "\n\t1- Grave"
				+ "\n\t2- Moderado"
				+ "\n\t3 Leve");
		byte opcionPeligrosidad=Byte.parseByte(sc.nextLine());
		while(opcionPeligrosidad<1||opcionPeligrosidad>3) {
			System.out.println("Solo puedes elegir del 1-3");
			opcionPeligrosidad=Byte.parseByte(sc.nextLine());
		}
		Peligrosidad peligrosidad=null;
		switch(opcionPeligrosidad) {
		case 1:
			peligrosidad=Peligrosidad.GRAVE;
			break;
		case 2:
			peligrosidad=Peligrosidad.MODERADA;
			break;
		case 3:
			peligrosidad=Peligrosidad.LEVE;
			break;
		}
		GrupoFurtivo furtivos=responsable.avisarGuardias(nombreFurtivo, opcionPeligrosidad, peligrosidad);
		System.out.println(furtivos);
		
	}

}
