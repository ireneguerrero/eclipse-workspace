package tema3psp;

import java.net.MalformedURLException;
import java.net.URL;

public class EjemploURL {

	public static void main(String[] args) {
		URL url;
		URL url2;
		try {
			System.out.println("\n\tConstructor simple para una URL");
			System.out.println("\t===============================");
			url = new URL("https://www.youtube.com/watch?v=euOEE1lK410");
			visualizar(url);
			System.out.println("\n\t===============================");
			System.out.println("\n\tOtra URL");
			System.out.println("\t========");
			url2=new URL("https://drive.google.com/drive/folders/1xnbEx9rpiB3jOCGe-nSjRyxV1dmMm8lR");
			visualizar(url2);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	private static void visualizar(URL url) {
		System.out.println("\tURL completa: " + url);
		System.out.println("\tgetProtocol(): " + url.getProtocol());
		System.out.println("\tgetHost(): " + url.getHost());
		System.out.println("\tgetDefaultPort(): " + url.getDefaultPort());
		System.out.println("\tgetPort(): " + url.getPort());
		System.out.println("\tgetPath(): " + url.getPath());
		System.out.println("\tgetQuery(): " + url.getQuery());
		System.out.println("\tgetFile(): " + url.getFile());
		System.out.println("\tgetAuthority(): " + url.getAuthority());
	}

}
