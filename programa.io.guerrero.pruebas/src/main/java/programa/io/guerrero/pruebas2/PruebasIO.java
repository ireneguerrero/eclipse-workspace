package programa.io.guerrero.pruebas2;

import java.util.Scanner;

public class PruebasIO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime tu nombre");
		String nombre=sc.nextLine();
		System.out.println("Me alegro " + "de verte" + " hoy, " +nombre);
		System.out.println("Dime un numero con decimales");
		float n1=sc.nextFloat();
		System.out.println("Dime otro numero con decimales");
		float n2=sc.nextFloat();
		
		float resultadoSuma=n1+n2+1;
		System.out.println("la suma de los dos numeros es: " 
		+(n1+n2));
		
		float resultadoResta=n1-n2;
		System.out.println("la resta de los numeros es: "
		+(n1-n2));
		//float resultadoMult=n1*n2;
		System.out.println("la multiplicacion de los numeros es: "
		+(n1*n2));
		//float resultadoDivi=n1/n2;
		System.out.println("la division de los numeros es: "
		+(n1/n2));
		//float resultadoModulo=n1%n2;
		System.out.println("El módulo es: "
		+(n1%n2));
		
		System.out.println("la media es: "+(n1+n2)/2f);
		
		int edad=sc.nextInt();
		
		char letra=84;
		System.out.println(letra);
		byte numero='A';
		System.out.println(numero);
		
		
		
	}

}
