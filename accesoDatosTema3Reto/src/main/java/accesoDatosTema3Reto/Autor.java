package accesoDatosTema3Reto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAutor")
	private int idAutor;

	@Column(name = "nombre")
	private String nombre;

	@ManyToMany(mappedBy = "autores")
    private Set<Libro> libros = new HashSet<>();

	public Autor() {

	}

	public Autor(String nombre) {
		this.nombre = nombre;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Autor {idAutor=" + idAutor + ", nombre='" + nombre + '\'' + "}";
	}

}
