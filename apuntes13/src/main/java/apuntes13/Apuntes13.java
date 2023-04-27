package apuntes13;

import java.util.Scanner;

public class Apuntes13 {

	public static void main(String[] args) {
		// Tema 4 Argumentos
		/* Para ponerle los argumentos args al programa hay que ir a propiedades, en el run/debug settings, darle a editar
		 * y en argumentos poner los argumentos que se pidan
		 
		System.out.println("Tamaño de args: " + args.length);
		for(byte i=0;i<args.length;i++) {
			System.out.println(i + " : " + args[i]);
		}*/

		//Tema 4 Matrices
		/* Siempre decimos primero la fila y luego la columna 
		 * el {} grande representa las filas y cada {} dentro son los valores de cada fila
		 * las matrices pueden tener dimensiones infinitas, cuantos más [] más dimensiones tienen*/
		
		/*byte numero=5;
		byte[][][] matriz3D= {  {{1,2},{3,4}},  {{5,6},{7,8}},  {{9,10},{11,12}}  };//new byte[3][2][2];
		byte[][][] mg2=new byte[matriz3D.length][matriz3D[0].length][matriz3D[0][0].length];
		byte[] array= {4,-3,12,44};
		byte[][] matriz= {{5,3,22},{-12,77,1}};*/
		/*matriz[1][2]=74;
		System.out.println(matriz[1][2]);
		for(byte i=0;i<matriz.length;i++) { //Voltear en vertical: byte i=(byte)(matriz.length-1);i>=0;i--
			for(byte j=0;j<matriz[i].length;j++) { //Voltear en horizontal: byte j=(byte)(matriz[i].length-1);j>=0;j--
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}*/

	}

}
