package ejercicio2Irene;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");

		int numero = Integer.parseInt(sc.nextLine());
		int n1 = numero * 3;
		System.out.println("Tu número multiplicado por 3 da: " + n1);
		int n2 = n1 + 6;
		System.out.println("Si ahora sumas 6 a tu número da: " + n2);
		int n3 = n2 / 3;
		System.out.println("Dividiendo ahora tu número entre 3 da: " + n3);
		int n4 = n3 - numero;
		System.out.println("Restando tu número elegido da: " + n4);
		boolean resultado = n4 == 2;
		System.out.println("El resultado es " + resultado);

		System.out.println("¿Cuál es tu año de nacimiento?");
		short añoNac = Short.parseShort(sc.nextLine());
		System.out.println("¿En qué año estamos?");
		short añoAc = Short.parseShort(sc.nextLine());
		boolean edad = (añoAc - añoNac) >= 30 || añoNac % 2 == 0;
		System.out.println("Tu año de nacimiento es par o tienes más de 30 años " + edad);

		System.out.println("¿Cuál es tu talla de pie?");
		short talla = Short.parseShort(sc.nextLine());
		short n5 = (short) (talla * 5);
		System.out.println("Tu talla de pie multiplicado por 5 da: " + n5);
		short n6 = (short) (n5 + 50);
		System.out.println("Si ahora sumas 50 da: " + n6);
		short n7 = (short) (n6 * 20);
		System.out.println("Multiplicando el resultado por 20 da: " + n7);
		short n8 = (short) (n7 + 1022);
		System.out.println("Sumándole 1022 da: " + n8);
		short n9 = (short) (n8 - añoNac);
		System.out.println("Restándole tu año de nacimiento da: " + n9);
		boolean resultado2 = (n9 / 1000 > 1 && n9 / 10000 < 1 && n9 / 100 == talla && n9 % 100 == (añoAc - añoNac));
		System.out.println(resultado2);

	}

}
