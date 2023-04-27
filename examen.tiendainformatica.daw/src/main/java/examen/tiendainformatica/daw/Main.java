package examen.tiendainformatica.daw;

import java.util.ArrayList;

import clases.Monitor;
import clases.Perifericos;
import clases.PerifericosEntrada;
import clases.Raton;
import clases.Raton;
import clases.Teclado;
import clases.Tienda;
import enums.EstadoMaterial;
import enums.Resoluciones;
import enums.TipoCable;
import enums.TipoTeclado;

public class Main {

	public static void main(String[] args) {
//		PerifericosEntrada raton1 = new Raton("KEOS RGB", "Krom", (byte) 2, true,
//				EstadoMaterial.FALLOS_DE_FUNCIONAMIENTO, TipoCable.USB_3, true, (byte) 7);
//		prueba.setConectividad(TipoCable.USB_2);
//		System.out.println(raton1);
//		PerifericosEntrada raton2 = new Raton("G102 LIGHTSYNC", "Logitech", (byte) 2, true,
//				EstadoMaterial.DESPERFECTOS_ESTETICOS_MODERADOS, TipoCable.USB_2, true, (byte) 6);
//		System.out.println(raton2);
		
//		PerifericosEntrada teclado1 = new Teclado("BLACKWIDOW V3 MINI HYPERSPEED", "Razer", (byte) 2, true,
//				EstadoMaterial.DESPERFECTOS_ESTETICOS_LEVES, TipoCable.USB_C, true, TipoTeclado.REDUCIDO);
//		System.out.println(teclado1);
//		PerifericosEntrada teclado2 = new Teclado("K70 PRO MINI WIRELESS", "Corsair", (byte) 2, false,
//				EstadoMaterial.NUEVO, TipoCable.WIRELESS, true, TipoTeclado.MULTIMEDIA);
//		System.out.println(teclado2);
		
//		TipoCable[] monitor= {TipoCable.HDMI,TipoCable.DVI,TipoCable.VGA};
//		Monitor monitor1 = new Monitor("KEEP OUT XGMV", "KEEP OUT", (byte) 3, false,
//				EstadoMaterial.DESPERFECTOS_ESTETICOS_LEVES, (float) 24, Resoluciones.HD, monitor);
//		System.out.println(monitor1);
//		Monitor monitor2 = new Monitor("FHUXDU SAMSUNG", "SAMSUNG", (byte) 3, true, EstadoMaterial.NUEVO,
//				(float) 27, Resoluciones.HD, monitor);
//		System.out.println(monitor2);
		
		ArrayList<Perifericos> datos = new ArrayList<Perifericos>();
		datos.add(new Raton("KEOS RGB", "Krom", (byte) 2, true,
				EstadoMaterial.FALLOS_DE_FUNCIONAMIENTO, TipoCable.USB_3, true, (byte) 7));
		datos.add(new Raton("G102 LIGHTSYNC", "Logitech", (byte) 2, true,
				EstadoMaterial.DESPERFECTOS_ESTETICOS_MODERADOS, TipoCable.USB_2, true, (byte) 6));
		datos.add(new Teclado("BLACKWIDOW V3 MINI HYPERSPEED", "Razer", (byte) 2, true,
				EstadoMaterial.DESPERFECTOS_ESTETICOS_LEVES, TipoCable.USB_C, true, TipoTeclado.REDUCIDO));
		datos.add(new Teclado("K70 PRO MINI WIRELESS", "Corsair", (byte) 2, false,
				EstadoMaterial.NUEVO, TipoCable.WIRELESS, true, TipoTeclado.MULTIMEDIA));
		TipoCable[] monitor= {TipoCable.HDMI,TipoCable.DVI,TipoCable.VGA};
		datos.add(new Monitor("KEEP OUT XGMV", "KEEP OUT", (byte) 3, false,
				EstadoMaterial.DESPERFECTOS_ESTETICOS_LEVES, (float) 24, Resoluciones.HD, monitor));
		datos.add(new Monitor("FHUXDU SAMSUNG", "SAMSUNG", (byte) 3, true, EstadoMaterial.NUEVO,
				(float) 27, Resoluciones.HD, monitor));
//		datos.add(raton1);
//		datos.add(raton2);
//		datos.add(teclado1);
//		datos.add(teclado2);
//		datos.add(monitor1);
//		datos.add(monitor2);
		Tienda tienda = new Tienda("Dimensioon Gamers", "C/Mundo Cosmicoo", datos);
		System.out.println(tienda);
		
		for (byte i = 0; i < datos.size(); i++) {
			System.out.println(datos.get(i));
		}

	}

}
