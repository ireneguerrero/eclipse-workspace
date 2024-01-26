package accesoDatosTema3Reto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoria")
	private int idCategoria;

	@Column(name = "nombre")
	private String nombre;

	@ManyToMany(mappedBy = "categorias")
    private Set<Libro> libros = new HashSet<>();

	public Categoria() {

	}

	public Categoria(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categoria {idCategoria=" + idCategoria + ", nombre='" + nombre + '\'' + "}";
	}

}
