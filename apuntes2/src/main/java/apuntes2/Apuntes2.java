package apuntes2;

import java.util.Scanner;

public class Apuntes2 {

	public static void main(String[] args) {
		
		//Temas 1 y 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad=Byte.parseByte(sc.nextLine());
		boolean resultado=edad>=18;
		System.out.println("¿Eres mayor de edad? "+(resultado));
		boolean tiene18=edad==18; //(== Para que sea exactamente el mismo valor)
		System.out.println("¿Tiene justo 18? "+(tiene18));
		boolean noTiene18=edad<=18;
		System.out.println("¿Tiene una edad distinta a 18? "+(noTiene18));
		boolean prejubilado=false;
		System.out.println("¿Tiene edad para trabajar? "+
		(edad>17&&edad<=65&&!prejubilado)); //!=no/distinto //&&=y //||=o //?=separador //%=da el resto de una división //:=para escribir las opciones
		System.out.println("¿Me he jubilado ya? "+
		(prejubilado==true||edad>65));
		System.out.println("¿Me he jubilado ya? "+
		!(prejubilado!=true||edad>=65));
		
		short gananciasAnuales=12000;
		short nHijos=10;
		System.out.println("¿Me pueden dar una subvención? "+ 
		(gananciasAnuales<15000||gananciasAnuales<=24000&&nHijos>2));
		
		int numero=300;
		numero+=5; //Equivalente a numero=numero+5
		numero-=5; //Equivalente a numero=numero-5
		numero*=5; //Equivalente a numero=numero*5
		numero/=5; //Equivalente a numero=numero/5
		numero%=5; //Equivalente a numero=numero%5
		
		
		
		/*int edadOriginal=edad;
		System.out.println("El año que viene tendrás "+(++edad)+" años");
		System.out.println("El año siguiente tendrás "+(++edad)+" años");
		System.out.println(edad);
		System.out.println("¿Estás vivo?");
		boolean estoyVivo=Boolean.parseBoolean(sc.nextLine());
		System.out.println("Lo contrario de lo que me has dicho es: "+(!estoyVivo));
		System.out.println(~edad);
		System.out.println(3*edad--);
		edad=edadOriginal;
		System.out.println("Tu edad ahora es: "+edad);
		edad=edad<<1; //equivalente a poner edad=edad*2;
		System.out.println(edad);
		edad=edadOriginal>>1; //equivalente a poner edad=edad/2;
		System.out.println(edad);
		*/
	}

}
