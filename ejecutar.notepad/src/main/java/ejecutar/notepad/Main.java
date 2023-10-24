package ejecutar.notepad;

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

		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "ipconfig");
		try {
			Process p = pb.start();
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1) {
				System.out.print((char) c);
			}
			is.close();
			InputStream isError=p.getErrorStream();
			int cError;
			while((cError=isError.read())!=-1) {
				System.out.println((char)cError);
			}
			isError.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
