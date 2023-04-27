package apuntes11;

public class Funciones {
	
	public static boolean insertarEnArray(String[] arr, byte pos, String valor) {
		if(pos<0||pos>=arr.length) {
			return false;
		}
		arr[pos]=valor;
		return true;
	}
	
	public static void intercambiar(char[]arr,byte p1, byte p2) {
		char aux=arr[p1];
		arr[p1]=arr[p2];
		arr[p2]=aux;
	}
	
	public static String imprimeArray(char[]numeritos) {
		String nuevo="";
		for(int i=0;i<numeritos.length;i++) {
			nuevo+=numeritos[i];
		}
		return nuevo;
	}
	
	/*public static String imprimeArray(char[]numeritos) {
		String nuevo="";
		for(char elemento:numeritos) {
			nuevo+=elemento;
		}
		return nuevo;
	}*/
	
	public static String imprimeArrayAlReves(char[]numeritos) {
		String nuevo="";
		for(int i=numeritos.length-1;i>=0;i--) {
			nuevo+=numeritos[i];
		}
		return nuevo;
	}
	
	public static char[] copiaArray(char[] orig){
		char[] copia=new char[orig.length];
		for(byte i=0;i<orig.length;i++) {
			copia[i]=orig[i];
		}
		return copia;
	}

}
