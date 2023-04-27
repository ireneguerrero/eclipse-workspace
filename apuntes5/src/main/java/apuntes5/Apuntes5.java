package apuntes5;

import java.util.Scanner;

public class Apuntes5 {

	public static void main(String[] args) {

		// Tema3
		long suscriptoresTotales = 0;
		//byte nCanalesIntroducidos = 0;
		short videosTotales = 0;
		short duracionVideosTotal = 0;
		boolean respuesta;
		boolean suscriptoresComprobar=false;
		boolean horasComprobar=false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dime el nombre de tu canal");
			String nombreCanal = sc.nextLine();
			//nCanalesIntroducidos++;
			System.out.println("Dime tu número de suscriptores");
			int numeroSuscriptores = Integer.parseInt(sc.nextLine());
			suscriptoresTotales+=numeroSuscriptores;
			
			if(numeroSuscriptores>1000000) {
				suscriptoresComprobar=true;
			}
			
			System.out.println("¿Cuándo se creó tu canal?");
			short añoCanal = Short.parseShort(sc.nextLine());
			
			System.out.println("¿Cuántos vídeos tiene tu canal?");
			short videosCanal = Short.parseShort(sc.nextLine());
			videosTotales+=videosCanal;
			System.out.println("¿Cuántos minutos duran tus vídeos aproximadamente?(sin decimales)");
			short duracionVideos = Short.parseShort(sc.nextLine());
			duracionVideosTotal+=duracionVideos;

			float horasTotales=(videosCanal*duracionVideos)/60f;
			System.out.println("Las horas totales promedio de tu canal son: " + horasTotales);
			
			if(horasTotales>1000) {
				horasComprobar=true;
			}
						
			System.out.println("¿Quieres añadir otro canal (s/n)?");
			respuesta = sc.nextLine().charAt(0)=='s';
		}while (respuesta);
		
		System.out.println("Los suscriptores promedio de todos los canales introducidos son: " + suscriptoresTotales);
		
		
		boolean resultado=(suscriptoresComprobar && horasComprobar);
		System.out.println("El resultado del boolean es: " + resultado);

	}

}
