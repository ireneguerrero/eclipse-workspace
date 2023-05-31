package cliente;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import clases.Cliente;
import interfaces.Ventana;

public class Main {

	public static void main(String[] args) {
		// ~ esto significa not

		Ventana v = new Ventana();

//		File archivo = new File("./noExisto.txt");
//		System.out.println("Existe el archivo: " + archivo.exists());
//		try {
//			System.out.println("Pude crear el archivo: " + archivo.createNewFile());
//			System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
//			System.out.println("Nombre: " + archivo.getName());
//			System.out.println("Carpeta madre: " + archivo.getParent());
//			System.out.println("¿Es un directorio? " + archivo.isDirectory());
//			System.out.println("Tamaño total del disco duro (en bytes): "
//					+ archivo.getTotalSpace() / 1024f / 1024f / 1024f + "GB");
//			// para dividir en kilobytes /1024f - para megabytes /1024f - para
//			// gigabytes/1024f
//			System.out.println(
//					"Tamaño libre del disco duro (en bytes): " + archivo.getFreeSpace() / 1024f / 1024f / 1024f + "GB");
//			System.out.println("Tamaño del archivo (en bytes): " + archivo.length());
//			System.out.println("Fecha de modificación: " + archivo.lastModified());
////			LocalDate para almacenar fecha
////			LocalTime para almacenar hora
////			LocalDateTime para almacenar fecha y hora
//			LocalDateTime ultimaMod = LocalDateTime.ofEpochSecond(archivo.lastModified()/1000, 0,
//					ZoneOffset.systemDefault().getRules().getOffset(Instant.now()));
//			System.out.println("Fecha de modificación bien escrita: " + ultimaMod);
//			
////			System.out.println("¿Pude borrarlo?" + archivo.delete());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		try {
//			BufferedImage imagen = ImageIO.read(new File("./fotoclase.jpg"));
//			for (short i = 0; i < imagen.getWidth(); i++) {
//				for (short j = 0; j < imagen.getHeight(); j++) {
//					if (i < imagen.getWidth() / 2) {
//						imagen.setRGB(i, j, imagen.getRGB(i, j) & Integer.parseInt("FF00FF", 16));
//					} else {
//						imagen.setRGB(i, j, ~imagen.getRGB(i, j));
//					}
//				}
//			}
//			ImageIO.write(imagen, "jpg", new File("./resultado.jpg"));

//			BufferedImage imagen = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
//			float contadorRojo = 0;
//			float contadorVerde = 0;
//			float contadorAzul = 0;
//			for (short i = 0; i < imagen.getWidth(); i++) {
//				for (short j = 0; j < imagen.getHeight(); j++) {
//					String colorEscogido = String.format("%02X", (int) contadorRojo);
//					colorEscogido += String.format("%02X", (int) contadorVerde);
//					colorEscogido += String.format("%02X", (int) contadorAzul);
//					imagen.setRGB(i, j, Integer.parseInt(colorEscogido, 16));
//					contadorRojo = (contadorRojo + (255f / imagen.getHeight()))%255;
//				}
//				contadorVerde=(contadorVerde+(255f/imagen.getHeight()))%255;
//			}
//			ImageIO.write(imagen, "JPG", new File("./miImagen.jpg")); // exportar con java.io
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		
//		try {
//			ArrayList<Cliente> clientes = Cliente.getTodos();
//			for (Cliente c : clientes) {
//				System.out.println(
//						"Nombre: " + c.getNombre() + ", Email: " + c.getEmail() + " ,Telefono: " + c.getTelefono());
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		recorridoRecursivo(new File("./"));
	}

	public static void recorridoRecursivo(File carpeta) {
//		File carpeta = new File("./");
		if (carpeta.isDirectory()) {
			File[] hijos = carpeta.listFiles();
			for (short i = 0; i < hijos.length; i++) {
				File hijoActual = hijos[i];
				if (hijoActual.isDirectory()) {
					recorridoRecursivo(hijoActual);
				} else {
					System.out.println(hijoActual.getAbsolutePath() + " : " + hijoActual.length() + " : "
							+ LocalDateTime.ofEpochSecond(hijoActual.lastModified() / 1000, 0,
									ZoneOffset.systemDefault().getRules().getOffset(Instant.now())));
				}
			}
		}
	}
}
