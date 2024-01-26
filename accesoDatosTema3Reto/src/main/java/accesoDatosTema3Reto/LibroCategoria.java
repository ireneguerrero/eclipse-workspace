package accesoDatosTema3Reto;

import javax.persistence.*;

@Entity
@Table(name = "libroCategoria")
public class LibroCategoria {
	@Id
	@ManyToOne
	@JoinColumn(name = "idLibro")
	private Libro libro;

	@Id
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;

	public LibroCategoria(Libro libro, Categoria categoria) {
		this.libro = libro;
		this.categoria = categoria;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
