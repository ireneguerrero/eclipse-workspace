package apuntes18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
//		Prueba IO
		try {
			FileWriter escritor = new FileWriter("./prueba.txt", true);
			escritor.write("Hola Mundo\n");
			escritor.write("Sigo escribiendo\n");
			escritor.write("Ya voy a parar\n");
			escritor.write("ya está\n");
			escritor.write("" + 97 + "\n");
			escritor.flush();
			escritor.close();

			BufferedReader lector = new BufferedReader(new FileReader("./prueba.txt"));
			String linea = lector.readLine();
			String texto = "";
			while (linea != null) {
				texto += linea + "\n";
				linea = lector.readLine();
			}
			lector.close();
			System.out.println(texto);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
