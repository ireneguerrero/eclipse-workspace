package programa.io.guerrero.irene.prueba.daw;

import java.util.Scanner;

public class ProgramaIO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		System.out.println("Me alegro " + "de verte " + "hoy, " +nombre);
		
		System.out.println("Dime un número con decimales");
		float n1=sc.nextFloat();
		System.out.println("Dime otro número con decimales");
		float n2=sc.nextFloat();
		
		//float resultadoSuma=n1+n2;
		System.out.println("La suma de los números es: "+(n1+n2));
		//float resultadoResta=n1-n2;
		System.out.println("La resta de los números es: "+(n1-n2));
		//float resultadoMult=n1*n2;
		System.out.println("La multiplicación de los números es: "+(n1*n2));
		//float resultadoDiv=n1/n2;
		System.out.println("La división de los números es: "+(n1/n2));
		//float resultadoModulo=n1%n2;
		System.out.println("El módulo de los números es: "+(n1%n2));
		
		System.out.println("La media de los números es: "+(n1+n2)/2);

	}

}
