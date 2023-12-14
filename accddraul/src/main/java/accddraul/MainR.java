package accddraul;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class MainR {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			byte opcion;
			boolean salir = false;
			String ruta = "C:\\";

			do {
				salir = false;
				System.out.println("Seleccione una opción:");
				System.out.println("1 - Crear carpeta");
				System.out.println("2 - Crear fichero");
				System.out.println("3 - Borrar fichero");
				System.out.println("4 - Borrar carpeta");
				System.out.println("5 - Leer fichero");
				System.out.println("0 - Salir");

				opcion = Byte.parseByte(ruta);

				switch (opcion) {
				case 1:
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpeta = sc.nextLine();
					File carpeta = new File(ruta + nombreCarpeta);

					if (!carpeta.exists()) {
						carpeta.mkdirs(); // crea la carpeta si no existe
						System.out.println("La carpeta " + nombreCarpeta + " se ha creado correctamente.");
					} else {
						System.out.println("La carpeta " + nombreCarpeta + " ya existe.");
					}
					break;

				case 2:
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaFichero = sc.nextLine();
					File carpetaFichero = new File(ruta + nombreCarpetaFichero);

					if (carpetaFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero:");
						String nombreFichero = sc.nextLine();

						try (BufferedWriter bw = new BufferedWriter(
								new FileWriter(ruta + nombreCarpetaFichero + "\\" + nombreFichero + ".txt"))) {
							System.out.println("Introduzca el nombre:");
							String nombre = sc.nextLine();
							bw.write("Nombre: " + nombre);
							bw.newLine();

							System.out.println("Introduzca los apellidos:");
							String apellidos = sc.nextLine();
							bw.write("Apellidos: " + apellidos);
							bw.newLine();

							System.out.println("Introduzca la dirección:");
							String direccion = sc.nextLine();
							bw.write("Dirección: " + direccion);

							System.out.println("Fichero creado correctamente.");
						} catch (IOException e) {
							System.out.println("No se ha podido escribir en el fichero");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaFichero + " no existe.");
					}
					break;

				case 3:
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaBorrarFichero = sc.nextLine();
					File carpetaBorrarFichero = new File(ruta + nombreCarpetaBorrarFichero);

					if (carpetaBorrarFichero.exists()) {
						System.out.println("Introduzca el nombre del fichero a borrar:");
						String nombreFicheroBorrar = sc.nextLine();
						File ficheroBorrar = new File(
								ruta + nombreCarpetaBorrarFichero + "\\" + nombreFicheroBorrar + ".txt");

						if (ficheroBorrar.exists()) {
							ficheroBorrar.delete();
							System.out
									.println("El fichero " + nombreFicheroBorrar + ".txt se ha borrado correctamente.");
						} else {
							System.out.println("El fichero " + nombreFicheroBorrar + ".txt no existe.");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrarFichero + " no existe.");
					}
					break;

				case 4:
					System.out.println("Introduzca el nombre de la carpeta a borrar:");
					String nombreCarpetaBorrar = sc.nextLine();
					File carpetaBorrar = new File(ruta + nombreCarpetaBorrar);

					if (carpetaBorrar.exists()) {
						// Borrar carpeta y su contenido
						FileUtils.deleteDirectory(carpetaBorrar);
						System.out.println("La carpeta " + nombreCarpetaBorrar + " se ha borrado correctamente.");
					} else {
						System.out.println("La carpeta " + nombreCarpetaBorrar + " no existe.");
					}
					break;

				case 5:
					System.out.println("Introduzca el nombre de la carpeta:");
					String nombreCarpetaLeer = sc.nextLine();
					File carpetaLeer = new File(ruta + nombreCarpetaLeer);

					if (carpetaLeer.exists()) {
						System.out.println("Introduzca el nombre del fichero a leer:");
						String nombreFicheroLeer = sc.nextLine();
						File ficheroLeer = new File(ruta + nombreCarpetaLeer + "\\" + nombreFicheroLeer + ".txt");

						if (ficheroLeer.exists()) {
							try (BufferedReader br = new BufferedReader(new FileReader(ficheroLeer))) {
								String linea;
								while ((linea = br.readLine()) != null) {
									System.out.println(linea);
								}
							} catch (IOException e) {
								System.out.println("No se puede leer el fichero.");
							}
						} else {
							System.out.println("El fichero " + nombreFicheroLeer + ".txt no existe en la carpeta.");
						}
					} else {
						System.out.println("La carpeta " + nombreCarpetaLeer + " no existe.");
					}
					break;

				case 0:
					salir = true;
					break;

				default:
					System.out.println("Opción inválida.");
					break;
				}

			} while (!salir);

			sc.close();

		} catch (IOException ioe) {
			System.out.println("Error en la operación.");
		}
	}
}