package apuntes3;

public class Apuntes3 {

	public static void main(String[] args) {
		int nInt=70000;
		nInt=nInt+3000;
		
		byte nByte=120;
		
		nByte=(byte) (nByte+12); //el programa asume que te puedes pasar y por eso da error, para que el error no salga poner entre paréntesis
		System.out.println(nByte); //si "mentimos" al programa el número dará negativo
		
		short nShort=30;
		nShort=(short)(nShort+nByte);
		
		int añoNacimiento=1993;
		short añoNacimientoBueno=(short)añoNacimiento;
		
		float nFloat=nInt/(2000+12)*500;
		int otroInt=(int)nFloat;
		
		char letraInicial='t';
		System.out.println((byte)letraInicial);
		float numeroCodificado=(float)(letraInicial/3f*1.5f+5);
		System.out.println(numeroCodificado);
		System.out.println((char)numeroCodificado);
		System.out.println((char)((numeroCodificado-5)/1.5f*3));
	}

}
