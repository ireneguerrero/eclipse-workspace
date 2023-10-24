package prueba.ej4;

import java.io.IOException;

public class PruebaEj4 {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("Notepad");
		try {
			Process p = pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
