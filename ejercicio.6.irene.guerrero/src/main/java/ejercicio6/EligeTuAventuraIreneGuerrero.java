package ejercicio6;

import java.util.Scanner;

public class EligeTuAventuraIreneGuerrero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Estamos en cenec un pacífico día " 
							+ "de clase. \nY de repente, cae del tragaluz \n" 
							+ "una jirafa con gafas de sol y en sus manos \n" 
							+ "una botella de vodka y una bandurria " 
							+ "\n¿Cómo reaccionas?" 
							+ "\n\t1 - Decirle: ¡Vámonos de fiesta!"
							+ "\n\t2 - Intentar robarle el vodka"
							+ "\n\t3 - Pegarle con la bandurria en la cabeza");
		byte opcionElegida=Byte.parseByte(sc.nextLine());
		
		if(opcionElegida==1) {
			System.out.println("La jirafa contesta: ¿De fiesta? Me acabo de caer de un tragaluz. Estoy molida."
								+ "\nClaro, ves una jirafa con vodka y te quieres ir de fiesta, "
								+ "\npero nadie pregunta cómo está la girafa después de caerse."
								+ "\n¿Qué haces?"
								+ "\n\t1 Decirle: Jirafa tía, lo siento ¿Estás bien?"
								+ "\n\t2 Decirle: ¿Y tú me has preguntado cómo estoy yo? Porque yo necesito irme de fiesta.");
			byte opcion1=Byte.parseByte(sc.nextLine());
			if(opcion1==1) {
				System.out.println("La jitafa contesta: ¿Puedes llamar a una ambulancia?");
			}else if(opcion1==2) {
				System.out.println("La jirafa contesta: Pues toma el vodka y vete."  
									+ "\nTe tira el vodka a la cara y te vas de fiesta con la nariz rota por un vodkazo.");
			}
		}
		
		if(opcionElegida==2) {
			System.out.println("La jirafa te dice: ¿Qué haces listo pan?"
								+ "\nSi quieres robarme el vodka pa eso vamos al chino de mi barrio que no tiene cámaras."
								+ "\n¿Qué haces?"
								+ "\n\t1 - Llamar a control animal para que se lleven a la jirafa."
								+ "\n\t2 - Decirle: Venga vamos al chino.");
			byte opcion2=Byte.parseByte(sc.nextLine());
			if(opcion2==1) {
				System.out.println("La jirafa se caga en tus muertos mientras se la llevan en una jaula");
			}else if(opcion2==2) {
				System.out.println("Os robais 2 botellas de kas limón, unos vasos y os montáis botellón en el parque de chill.");
			}
		}
		  		
		if(opcionElegida==3) {
			System.out.println("La jirafa te dice: Esquivo, esquivo, leo tus derechos no tenés sos mujer, leo los míos peor soy negro y me desaparesco.");
		}
		

	}

}
