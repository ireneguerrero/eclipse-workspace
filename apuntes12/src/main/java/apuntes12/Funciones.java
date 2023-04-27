package apuntes12;

public class Funciones {
	
	/*public static String imprimeArray(String[] res) {
		String nuevo="";
		for(String elemento : res) {
			nuevo+=elemento + "\n";
		}
		return nuevo;
	}*/
	
	public static String imprimeArray(String[] res) {
		String nuevo="";
		for(byte i=0;i<res.length;i++) {
			nuevo+=i + " : " + res[i] + "\n";
		}
		return nuevo;
	}
	
	/*public static boolean sonIguales(char[] a1, char[] a2) {
		return Arrays.equals(a1, a2);
	}*/
	
	public static boolean sonIguales(char[] a1, char[] a2) {
		boolean iguales=true;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					return false;
				}
			}
		}else {
			return false;
		}
		return iguales;
	}

}
