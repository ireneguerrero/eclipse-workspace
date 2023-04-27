package ejercicio.simulacro.examen;

import java.util.Scanner;

public class SimulacroExamen {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
			String nombre=sc.nextLine();
			
		System.out.println("Dime tu año de nacimiento");
			Short añoNac=Short.parseShort(sc.nextLine());
			
		System.out.println("Dime el año actual");
			Short añoAc=Short.parseShort(sc.nextLine());
			
		System.out.println("Dime tu peso en kg");
			float peso=Float.parseFloat(sc.nextLine());
		
		System.out.println("Hola " + nombre);
		System.out.println("Han pasado " + (añoAc-añoNac) + " años desde que naciste" );
		System.out.println("En el año " + (añoNac+85) + " cumplirás 85 años");
		System.out.println("A continuación te diré tu peso en los planetas del sistema solar: "
							+ "\nMercurio: " + (peso*0.38f) + "kg"
							+ "\nVenus: " + (peso*0.90f) + "kg"
							+ "\nTierra: " + peso + "kg"
							+ "\nMarte: " + (peso*0.38f) + "kg"
							+ "\nJúpiter: " + (peso*2.53f) + "kg"
							+ "\nSaturno: " + (peso*1.06f) + "kg"
							+ "\nUrano: " + (peso*0.89f) + "kg"
							+ "\nNeptuno: " + (peso*1.14f) + "kg"
							+ "\nPlutón: " + (peso*0.06f) + "kg");
		
		boolean resultado=((peso*0.38f+peso*0.90f)>peso*0.38f||peso*2.53f<(peso+peso*0.38f));
		System.out.println(resultado);
		
	}

}
