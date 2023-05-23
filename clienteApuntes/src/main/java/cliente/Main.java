package cliente;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import clases.Cliente;
//import interfaces.Ventana;

public class Main {

	public static void main(String[] args) {
		// ~ esto significa not

		try {
			BufferedImage imagen = ImageIO.read(new File("./fotoclase.jpg"));
			for (short i = 0; i < imagen.getWidth(); i++) {
				for (short j = 0; j < imagen.getHeight(); j++) {
					imagen.setRGB(i, j, imagen.getRGB(i, j) & Integer.parseInt("FF00FF", 16));
				}
			}
			ImageIO.write(imagen, "jpg", new File("./resultado.jpg"));

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
		} catch (IOException e) {
			e.printStackTrace();
		}

//		Ventana v = new Ventana();
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
	}
}
