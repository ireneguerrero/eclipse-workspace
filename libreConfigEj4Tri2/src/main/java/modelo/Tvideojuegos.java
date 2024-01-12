package modelo;

import javax.persistence.*;

@Entity
@Table(name = "tvideojuegos")
public class Tvideojuegos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idjuego")
	private int idjuego;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "anio")
	private int anio;

	@Column(name = "compania")
	private String compania;

	@Column(name = "precio")
	private int precio;

	@Column(name = "sinopsis")
	private String sinopsis;

	@Column(name = "plataforma")
	private String plataforma;

	public Tvideojuegos() {

	}

	public Tvideojuegos(String nombre, int anio, String compania, int precio, String sinopsis, String plataforma) {
		this.nombre = nombre;
		this.anio = anio;
		this.compania = compania;
		this.precio = precio;
		this.sinopsis = sinopsis;
		this.plataforma = plataforma;
	}

	public int getIdjuego() {
		return idjuego;
	}

	public void setIdjuego(int idjuego) {
		this.idjuego = idjuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Tvideojuegos {idjuego=" + idjuego + ", nombre='" + nombre + '\'' + ", anio=" + anio + ", compania='"
				+ compania + '\'' + ", precio=" + precio + ", sinopsis='" + sinopsis + '\'' + ", plataforma='"
				+ plataforma + '\'' + "}";
	}

}
