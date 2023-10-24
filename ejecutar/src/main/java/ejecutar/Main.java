package ejecutar;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {

	public static void main(String[] args) {
//		ProcessBuilder pb = new ProcessBuilder("Notepad");
//		try {
//			Process p = pb.start();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		ProcessBuilder pb = new ProcessBuilder("Calc");
//		try {
//			Process p = pb.start();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "ipconfig");
//		try {
//			Process p = pb.start();
//			InputStream is = p.getInputStream();
//			int c;
//			while ((c = is.read()) != -1) {
//				System.out.print((char) c);
//			}
//			is.close();
//			InputStream isError = p.getErrorStream();
//			int cError;
//			while ((cError = isError.read()) != -1) {
//				System.out.println((char) cError);
//			}
//			isError.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		File ruta = new File("C:\\Users\\irene\\eclipse-workspace\\ejecutar\\target\\classes");
//		ProcessBuilder pb = new ProcessBuilder("java", "prueba.ej4.Prueba");
//		pb.directory(ruta);
//		try {
//			Process p;
//			p = pb.start();
//			InputStream is = p.getInputStream();
//			int c;
//			while ((c = is.read()) != -1) {
//				System.out.println((char) c);
//			}
//			is.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

//		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DATE");
//		try {
//			Process p = pb.start();
//			InputStream is = p.getInputStream();
//			int c;
//			while ((c = is.read()) != -1) {
//				System.out.print((char) c);
//			}
//			is.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "tasklist");
		File fOut = new File("Salida.txt");
		File fErr = new File("Error.txt");
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		try {
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// TODO: Investiga por tu cuenta cómo utilizar el método getOutputStream y
		// cambia la fecha con el comando Date

	}

}
