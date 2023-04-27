package quien.es.quien;

import java.util.Scanner;

public class QuienEsQuien {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Quién es quién
		String marta="gafas|sombrero|mujer|pelorubio|ojosmarrones";
		String andres="barba|hombre|pelomoreno|ojosverdes";
		String sofia="collar|mujer|pelomoreno|ojosverdes";
		String samuel="gafas|hombre|sombrero|pelorubio|ojosmarrones";
		String laura="gafas|collar|mujer|pelomoreno|ojosverdes";
		String anselmo="hombre|gafas|barba|pelorubio|ojosazules";
		String elvira="mujer|collar|sombrero|pelomoreno|ojosazules";
		
		String[] personas={"Marta", "Andres", "Sofia", "Samuel", "Laura", "Anselmo", "Elvira"};
		String[] original=Funciones.copyArray(personas);
		String[] caractericticas={"gafas", "sombrero", "mujer", "pelo rubio", "ojos marrones", "barba", "hombre",
				"pelo moreno", "ojos verdes", "collar", "ojos azules"};
		String[] modificable={marta, andres, sofia, samuel, laura, anselmo, elvira};
		String nuevo="";
		
		System.out.println("Vamos a jugar al juego de ¿Quién es Quién?"
							+ "\nTú elegirás si quieres que la característica elegida esté o no entre las personas que buscas"
							+ "\nLas personas que quedan actualmente son:");
		System.out.println(Funciones.imprimePersonas(personas));
		
		byte opcionElegida;
		byte contador=0;
		
		while(contador<=7) {
			System.out.println("¿Quiéres que la característica esté en la persona? (s/n)");
			char respuesta=sc.nextLine().toLowerCase().charAt(0);
			
			while(respuesta!='s'&&respuesta!='n') {
				System.out.println("Tienes que contestar sí o no makina");
				respuesta=sc.nextLine().toLowerCase().charAt(0);
			}
			
			if(respuesta=='s') {
				
				System.out.println("Elige característica");
				System.out.println(Funciones.imprimePersonas(caractericticas));
				opcionElegida=Byte.parseByte(sc.nextLine());
				String[] copia=Funciones.respuestaSi(personas, modificable, opcionElegida);
				contador=0;
				
				for(byte i=0;i<copia.length;i++) {
					if(copia[i].equals("-")){
						contador++;
					}
				}
				
				if(contador==6) {
					for(byte i=0;i<copia.length;i++) {
						if(!copia[i].equals("-")) {
							nuevo=copia[i];
						}
					}
					System.out.println("La persona encontrada es: " + nuevo);
					break;
				
				}else if(contador==7) {
					personas=original;
					System.out.println("Elige de nuevo la caracteristica con todas las personas"
							+ " de nuevo ya que la caracteristica elegida no corresponde con ninguna persona");
					System.out.println("Personas actuales: "+"\n"+Funciones.imprimePersonas(personas));
					System.out.println("Ahora elige de nuevo la caracteristica");
					System.out.println(Funciones.imprimePersonas(caractericticas));
					opcionElegida=Byte.parseByte(sc.nextLine());
				}
				
				System.out.println(Funciones.imprimePersonas(Funciones.respuestaSi(personas, modificable, opcionElegida)));
			
			} else {
				System.out.println("Elige caracteristica");
				System.out.println(Funciones.imprimePersonas(caractericticas));
				opcionElegida=Byte.parseByte(sc.nextLine());
				String[] copia=Funciones.respuestaNo(personas, modificable, opcionElegida);
				contador=0;
				
				for(byte i=0;i<copia.length;i++) {
					if(copia[i].equals("-")) {
						contador++;
					}
				}
				
				if(contador==6) {
					for(byte i=0;i<copia.length;i++) {
						if(!copia[i].equals("-")) {
							nuevo=copia[i];
						}
					}
					System.out.println("La persona encontrada es: " + nuevo);
					break;
				
				}else if(contador==7) {
					personas=original;
					System.out.println("Elige de nuevo la caracteristica con todas las personas"
							+ " de nuevo ya que la caracteristica elegida no corresponde con ninguna persona");
					System.out.println("Personas actuales: "+"\n"+Funciones.imprimePersonas(personas));
					System.out.println("Ahora elige de nuevo la caracteristica");
					System.out.println(Funciones.imprimePersonas(caractericticas));
					opcionElegida=Byte.parseByte(sc.nextLine());
				}
				
				System.out.println(Funciones.imprimePersonas(Funciones.respuestaNo(personas, modificable, opcionElegida)));
			}
			
		}
		
	}

}
