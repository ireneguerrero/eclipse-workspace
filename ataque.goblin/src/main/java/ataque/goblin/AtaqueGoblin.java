package ataque.goblin;

import java.util.Scanner;

public class AtaqueGoblin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char genero='!';
		String nombreJugador=null;
		//char genero=Funciones.pideGenero();
		for(byte i=0;i<args.length;i++) {
			if(args[i].equals("-g")) {
				genero=args[i+1].charAt(0);
			}
			if(args[i].equals("-n")) {
				nombreJugador=args[i+1];
			}
		}
		if(genero!='m'&&genero!='f'&&genero!='n') {
			genero=Funciones.pideGenero();
		}
		if(nombreJugador==null) {
			System.out.println("Dime el nombre de tu personaje");
			nombreJugador=sc.nextLine();
		}
		byte opcion;
		do {
			System.out.println("¿Qué decides?"
								+ "\n\t1 - Jugar en 1D"
								+ "\n\t2 - Jugar en 2D"
								+ "\n\t3 - Jugar en 3D");
			opcion=Byte.parseByte(sc.nextLine());
		}while(opcion!=1&&opcion!=2&&opcion!=3);
		
		switch(opcion) {
		case 1:
			Funciones1D.jugar(nombreJugador, genero);
			break;
		case 2:
			Funciones2D.jugar(nombreJugador, genero);
			break;
		case 3:
			Funciones3D.jugar(nombreJugador, genero);
			break;
		}
		
		
	}

}
