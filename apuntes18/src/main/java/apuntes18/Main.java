package apuntes18;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Prueba IO
		try {
			FileWriter escritor=new FileWriter("./prueba.txt");
			escritor.write("Hola Mundo ");
			escritor.write("Sigo escribiendo ");
			escritor.write("Ya voy a parar ");
			escritor.write("ya está");
			escritor.flush();
			Scanner sc=new Scanner(System.in);
			System.out.println("Pulsa intro");
			sc.nextLine();
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
