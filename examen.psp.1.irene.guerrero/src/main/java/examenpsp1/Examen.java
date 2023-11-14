package examenpsp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Examen {

	public static void main(String[] args) {
		// Abrir chrome
		String chrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

		ProcessBuilder pb1 = new ProcessBuilder(chrome);
		try {
			Process p = pb1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Procesos que tenemos abiertos
		String comandoWindows = "tasklist";
		String comandoLinux = "ps aux";

		String os = System.getProperty("os.name").toLowerCase();
		String comando = os.contains("win") ? comandoWindows : comandoLinux;

		ProcessBuilder pb2 = new ProcessBuilder(comando);

		try {
			Process proceso = pb2.start();

			InputStream is = proceso.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
