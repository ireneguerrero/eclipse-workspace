package simulacro.acceso.a.datos.ficheros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		do {
			System.out.println(
					"Seleccione una opción: " + "\n\t0 - Salir" + "\n\t1 - Crear Carpeta" + "\n\t2 - Crear Fichero"
							+ "\n\t3 - Borrar Fichero" + "\n\t4 - Borrar Carpeta" + "\n\t5 - Leer Fichero");
			salir = false;
			byte opcion = Byte.parseByte(sc.nextLine());

			switch (opcion) {
			case 0:
				salir = true;
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			}

		} while (!salir);

	}

}
