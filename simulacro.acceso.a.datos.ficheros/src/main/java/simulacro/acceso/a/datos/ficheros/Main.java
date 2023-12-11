package simulacro.acceso.a.datos.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		String ruta = "c:\\simulacro\\";
		String nombreArchivo = "simulacro.txt";
		
		String rutaFichero = "c:\\simulacro\\simulacro.txt";
		do {
			salir = false;
			System.out.println(
					"Seleccione una opción: " + "\n\t0 - Salir" + "\n\t1 - Crear Carpeta" + "\n\t2 - Crear Fichero"
							+ "\n\t3 - Borrar Fichero" + "\n\t4 - Borrar Carpeta" + "\n\t5 - Leer Fichero");
			byte opcion = Byte.parseByte(sc.nextLine());

			switch (opcion) {
			case 0:

				salir = true;

				break;
			case 1:

				File fichero = new File(ruta);
				if (fichero.mkdir()) {
					System.out.println("Carpeta creada");
				} else {
					System.err.println("No se puedo crear la carpeta");
					if (fichero.exists()) {
						System.err.println("La carpeta ya existe");
					}
				}

				break;
			case 2:

				String[] contenido = { "Me quiero morir" };
				try {
					BufferedWriter fw = new BufferedWriter(new FileWriter(ruta + nombreArchivo));
					System.out.println("Archivo simulacro.txt creado correctamente.");
					for (String content : contenido) {
						fw.write(content + "\n");
						fw.flush();
					}
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Error");
				}

				break;
			case 3:

				File fichero2 = new File(rutaFichero);
				if (fichero2.exists()) {
					boolean borrado = fichero2.delete();
					if (borrado) {
						System.out.println("El fichero ha sido borrado con éxito");
					} else {
						System.out.println("No se pudo borrar el fichero");
					}
				} else {
					System.out.println("El fichero no existe en la ubicación especificada");
				}

				break;
			case 4:

				File carpeta = new File(ruta);
				if (carpeta.exists() && carpeta.isDirectory()) {
					System.out.println("La carpeta existe");
					try {
						FileUtils.deleteDirectory(carpeta);
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("La carpeta ha sido borrado");
				} else {
					System.out.println("La carpeta no existe o no es una carpeta");
				}

				break;
			case 5:

				File archivo = new File(rutaFichero);
				if (!archivo.exists()) {
					System.out.println("El archivo simulacro.txt no existe ");
					return; // salimos del programa si el archivo no existe
				}
				try {
					FileReader fr = new FileReader(archivo);
					BufferedReader br = new BufferedReader(fr);
					String linea;
					while ((linea = br.readLine()) != null) {
						System.out.println(linea);
					}
					br.close();
					fr.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			}

		} while (!salir);

	}

}
