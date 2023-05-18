package clases;

import java.util.Arrays;

import javax.swing.ImageIcon;

public class Laberinto extends ElementoConNombreEImagen {
	private byte celdas[][];
	private byte nivel;

	public Laberinto(String nombre, ImageIcon imagen, byte[][] celdas, byte nivel) {
		super(nombre, imagen);
		this.celdas = celdas;
		this.nivel = nivel;
	}
	
	public Laberinto(int numero) {
	    super("Laberinto", null);
	    this.nivel = (byte) (numero % 10); // Obtener el último dígito del número

//	    Este constructor crea un laberinto en función del número proporcionado.
//	    Se utiliza un switch para asignar diferentes valores a la matriz de celdas según el número.
//	    Si el número no coincide con ninguno de los casos especificados,
//	    se crea un laberinto vacío con un solo elemento en la matriz de celdas y el nivel se establece en 0.
	    
	    switch (numero) {
	        case 1:
	            this.celdas = new byte[][]{
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 0, 0, 1},
	                    {1, 1, 1, 0, 1},
	                    {1, 0, 0, 0, 1},
	                    {1, 1, 1, 1, 1}
	            };
	            break;
	        case 2:
	            this.celdas = new byte[][]{
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 0, 0, 1},
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 0, 0, 1},
	                    {1, 1, 1, 1, 1}
	            };
	            break;
	        case 3:
	            this.celdas = new byte[][]{
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 1, 0, 1},
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 0, 0, 1},
	                    {1, 1, 1, 1, 1}
	            };
	            break;
	        case 4:
	            this.celdas = new byte[][]{
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 1, 0, 1},
	                    {1, 1, 1, 1, 1},
	                    {1, 0, 1, 0, 1},
	                    {1, 1, 1, 1, 1}
	            };
	            break;
	        default:
	            this.celdas = new byte[][]{{0}};
	            this.nivel = 0;
	            break;
	    }
	}


	public byte[][] getCeldas() {
		return celdas;
	}

	public void setCeldas(byte[][] celdas) {
		this.celdas = celdas;
	}

	public byte getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Laberinto:\nCeldas: " + Arrays.toString(celdas) + "\nNivel=" + nivel;
	}

}
