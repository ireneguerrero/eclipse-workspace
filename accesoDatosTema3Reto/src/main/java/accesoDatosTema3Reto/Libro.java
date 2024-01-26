package accesoDatosTema3Reto;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLibro")
	private int idLibro;

	@Column(name = "titulo", nullable = false)
	private String titulo;

	@Column(name = "ISBN", nullable = false)
	private String ISBN;

	@ManyToMany
	@JoinTable(name = "libroAutor", joinColumns = @JoinColumn(name = "idLibro"), inverseJoinColumns = @JoinColumn(name = "idAutor"))
	private Set<Autor> autores = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "libroCategoria", joinColumns = @JoinColumn(name = "idLibro"), inverseJoinColumns = @JoinColumn(name = "idCategoria"))
	private Set<Categoria> categorias = new HashSet<>();

	@OneToMany(mappedBy = "libro", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<LibroPedido> pedidos = new HashSet<>();

	public Libro() {
	}

	public Libro(String titulo, String ISBN, Set<Autor> autores) {
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autores = autores;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(Set<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Set<LibroPedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<LibroPedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void agregarPedido(LibroPedido libroPedido) {
		this.pedidos.add(libroPedido);
		libroPedido.setLibro(this);
	}

	public void removerPedido(LibroPedido libroPedido) {
		this.pedidos.remove(libroPedido);
		libroPedido.setLibro(null);
	}

	@Override
	public String toString() {
		return "Libro{" + "idLibro=" + idLibro + ", titulo='" + titulo + '\'' + ", ISBN='" + ISBN + '\'' + ", autores="
				+ autores + ", categorias=" + categorias + '}';
	}
}
