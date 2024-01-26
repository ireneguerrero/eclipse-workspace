package accesoDatosTema3Reto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "libroAutor")
@IdClass(LibroAutorId.class)
public class LibroAutor implements Serializable{
	@Id
	@ManyToOne
	@JoinColumn(name = "idLibro")
	private Libro libro;

	@Id
	@ManyToOne
	@JoinColumn(name = "idAutor")
	private Autor autor;

	public LibroAutor(Libro libro, Autor autor) {
		this.libro = libro;
		this.autor = autor;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}
