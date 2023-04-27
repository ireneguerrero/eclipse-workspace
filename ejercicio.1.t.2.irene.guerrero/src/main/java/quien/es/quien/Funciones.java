package quien.es.quien;

public class Funciones {
	public static String imprimePersonas(String[] arr) {
		String nuevo = "";
		byte contador = 1;
		for (byte i = 0; i < arr.length; i++) {
			nuevo += contador + ": " + arr[i] + "\n";
			contador++;
		}
		return nuevo;
	}

	public static String[] copyArray(String[] array) {
		String[] modificable = new String[array.length];
		for (byte i = 0; i < array.length; i++) {
			modificable[i] = array[i];
		}
		return modificable;
	}

	public static String[] respuestaSi(String[] personas, String[] caracteristicas, byte opcion) {
		switch (opcion) {
		case 1:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("gafas")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 2:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("sombrero")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 3:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("mujer")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 4:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("pelorubio")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 5:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("ojosmarrones")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 6:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("barba")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 7:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("hombre")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 8:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("pelomoreno")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 9:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("ojosverdes")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 10:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("collar")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		case 11:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("ojosazules")) {
					personas[i] = personas[i];
				} else {
					personas[i] = personas[i].replace(personas[i], "-");
				}
			}
			return personas;
		}
		return personas;
	}
	public static String[] respuestaNo(String[] personas, String[] caracteristicas, byte opcion) {
		switch (opcion) {
		case 1:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("gafas")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 2:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("sombrero")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 3:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("mujer")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 4:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("pelorubio")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 5:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("ojosmarrones")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 6:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("barba")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 7:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("hombre")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 8:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("pelomoreno")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 9:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("ojosverdes")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 10:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("collar")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		case 11:
			for (byte i = 0; i < caracteristicas.length; i++) {
				if (caracteristicas[i].contains("ojosazules")) {
					personas[i] = personas[i].replace(personas[i], "-");
				} else {
					personas[i] = personas[i];
				}
			}
			return personas;
		}
		return personas;
	}
}
