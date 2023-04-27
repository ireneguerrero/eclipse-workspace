package dragon.ball.irene;

import java.util.Scanner;

public class EjericioDragon {

	public static void main(String[] args) {

		        Scanner sc=new Scanner(System.in);

		        System.out.println("Dime tu nombre honorable guerrero número 1");
		        String Panta=sc.nextLine();
		        System.out.println("Dime tu nombre honorable guerrero número 2");
		        String Lón=sc.nextLine();

		        System.out.println("Dime el nivel de poder base de " + Panta + ", entre 1 y 127");
		        byte PBPanta=sc.nextByte();
		        System.out.println("Dime el nivel de poder de " + Lón + ", entre 1 y 127");
		        byte PBLón=sc.nextByte();
		        System.out.println("Poder Base de " + Panta + " es: "+PBPanta);
		        System.out.println("Poder Base de " + Lón + " es: "+PBLón);
		        
		        //short resultadoKaioken=PBPanta*10;
		        System.out.println("El poder de " + Panta + " si hace un Kaioken x 10 es de: "+PBPanta*10);
		        //short resultadosSSJ1=PBPanta*50;
		        System.out.println("El poder base de " + Panta + " si se transforma en SSJ1 es de: "+PBPanta*50);
		        //short resultadosSSJ2=PBPanta*100;
		        System.out.println("El poder de " + Panta + " si se transforma en SSJ2 es de: "+PBPanta*100);
		        
		        String resultadoFusión=Panta+Lón;
		        System.out.println("El resultado de la fusión es de: "+resultadoFusión);
		        
		        //short poderFusión=(PBPanta+PBLón)*1.5;
		        System.out.println("El poder de " + resultadoFusión + " en forma base es de: "+(PBPanta+PBLón)*1.5);
		        
		        //int poderFusiónSSJ2=(PBPanta+PBLón)*100*3;
		        System.out.println("El poder de " + resultadoFusión + " en SSJ2 es de: "+(PBPanta+PBLón)*100*3);
		        
		        //float fusiónErrada=((PBPanta/2)+(PBLón/2)*0.7;
		        System.out.println("El poder de " + resultadoFusión + " mal fusionado es de: "+(PBPanta/2+PBLón/2)*0.7);
		        
		        //float mediaSSJ1=((PBPanta*50)+(PBLón*50))/2;
		        System.out.println("La media de poder de " + Panta + Lón + " en SSJ1 es: "+(PBPanta*50+PBLón*50)/2);
		        
		        //short diferenciaPoderSSJ2=PBPanta*100-PBLón*100;
		        System.out.println("La diferencia de poder de " + Panta +" y " + Lón + "en SSJ2 es: "+(PBPanta*100-PBLón*100));

	}




	}


