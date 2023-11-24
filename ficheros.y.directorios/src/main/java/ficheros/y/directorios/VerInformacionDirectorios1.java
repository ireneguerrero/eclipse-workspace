package ficheros.y.directorios;

import java.io.File;

public class VerInformacionDirectorios1 {

	public static void main(String[] args) {
		System.out.println("INFORMACIÓN SOBRE EL DIRECTORIO:");
		File direc = new File(".\\src\\ficheros\\");

		if (direc.exists()) {
			System.out.println("Nombre del directorio: " + direc.getName());
			System.out.println("Ruta: " + direc.getPath());
			System.out.println("Ruta absoluta: " + direc.getAbsolutePath());
			System.out.println("Lectura: " + direc.canRead());
			System.out.println("Escritura: " + direc.canWrite());
			System.out.println("Tamaño: " + direc.length() + " Kb");
			System.out.println("Directorio: " + direc.isDirectory());
			System.out.println("Fichero: " + direc.isFile());
			System.out.println("Nombre del directorio padre: " + direc.getParent());
		} else {
			System.out.println("El directorio no existe");
		}

	}

}
