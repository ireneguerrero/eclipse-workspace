package ejercicios.recursividad.y.strings;

import java.util.Scanner;

public class RelacionEjercicios2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Ejercicio 1
		/*System.out.println("Dime unt texto");
		String original=sc.nextLine().strip();
		System.out.println("Dime una palabra comprendida en el texto o no, como quieras");
		String subString=sc.nextLine();
		if(original.contains(subString)) {
			System.out.println("Esta comprendida en el texto");
		}else {
			System.out.println("No está comprendida");
		}*/
		
		//Ejercicio 2
		/*System.out.println("Dime un texto");
		String texto=sc.nextLine();
		System.out.println("Dime la letra que esta comprendida en el texto y cuento las veces que esta");
		char letra=sc.nextLine().charAt(0);
		System.out.println(Funciones.cuentaLetras(texto, letra));*/
		
		//Ejercicio 3
		/*System.out.println("Dime el numero de veces que quiere que se repita tu barco");
		short veces=Short.parseShort(sc.nextLine());
			System.out.println(Funciones.dibujarBarcos((short)(veces)));*/
		
		//Ejercicio 4
		/*System.out.println("Dime un texto");
		String texto=sc.nextLine();
		System.out.println("Dime palabra comprendida en el texto");
		String subString=sc.nextLine();
		System.out.println(Funciones.loQueQueda(texto, subString));*/
		
		//Ejercicio 5
		/*System.out.println("Dime un texto");
		String texto=sc.nextLine();
		System.out.println(Funciones.patadadizarRefran(texto));*/
		
		//Ejercicio 6
		/*String cifrado="Vznjwt%fuwtgfw%jxyf%fxnlsfyzwf";
		System.out.println("El numero de descodificacion es: " + Funciones.descifrarQuiero(cifrado));*/
		
		//Ejercicio 7
		/*System.out.println("Dime una palabra para codificarla");
		String palabra=sc.nextLine();
		System.out.println("Dime el numero de codificacion");
		short numero=Short.parseShort(sc.nextLine());
		System.out.println(Funciones.codificado(palabra, numero));*/
		
		//Ejercicio 8
		/*System.out.println("Dime un texto");
		String textazo=sc.nextLine();
		System.out.println("Ahora dime el numero codifficador");
		short numCodificador=Short.parseShort(sc.nextLine());
		System.out.println(Funciones.funcionRecursiva(textazo, numCodificador, (byte)(0)));*/
		
		//Ejercicio 9
		//System.out.println(Funciones.devueltaRecursiva((byte)(4)));
		
		//Ejercicio 10
		/*System.out.println("dime un texto");
		String texto=sc.nextLine();
		System.out.println(Funciones.descodificar(texto));*/
		
		//Ejercicio 11
		/*Scanner s=new Scanner(System.in);
		String pass=s.nextLine();
		String contraseña="la contraseña es: "+pass;
		pass=null;
		contraseña=contraseña.replace(contraseña.substring(14, 17), "encontrada es:");
		String contraseñaEncontrada=contraseña;
		System.out.println(contraseñaEncontrada);*/
		
		//Ejercicio 12
		/*System.out.println("Dime un texto");
		String palabreja=sc.nextLine().toLowerCase();
		short numeroEntero=0;
		System.out.println(Funciones.imprimeVocal(palabreja, (short)(numeroEntero)));*/
		
		//Ejercicio 13
		//System.out.println("Dime un numero entre 1-50");
		//byte numero=Byte.parseByte(sc.nextLine());
		/*while(numero<1||numero>50) {
			System.out.println("Porfavor el numero debe de estar emtre 1-50");
			numero=Byte.parseByte(sc.nextLine());
		}*/
		//String visionarFuncion=Funciones.whileRecursivo();
		//System.out.println(visionarFuncion);
		
		//Ejercicio 14
		/*char[]letras= {'a','b','c','e','o','g','u','p','f','l'};
		for(byte i=0;i<letras.length;i++) {
			if(letras[i]=='a'||letras[i]=='e'||letras[i]=='o'||letras[i]=='u') {
				System.out.print(letras[i]+" ");
			}
		}*/
		
		//Ejercicio 15
		/*char[]muchasLetras= {'a','b','c','e','o','g','u','p','f','l'};
		System.out.println(Funciones.imprimeArray(muchasLetras));*/
		
		
		
	}

}
