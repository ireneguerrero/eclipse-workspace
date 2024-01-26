package accesoDatosTema3Reto;

import javax.persistence.*;

@Entity
@Table(name = "libroPedido")
public class LibroPedido {

	@Id
	@ManyToOne
	@JoinColumn(name = "idLibro")
	private Libro libro;

	@Id
	@ManyToOne
	@JoinColumn(name = "idPedido")
	private Pedido pedido;

	@Column(name = "cantidad", nullable = false)
	private int cantidad;

	public LibroPedido() {
	}

	public LibroPedido(Libro libro, Pedido pedido, int cantidad) {
		this.libro = libro;
		this.pedido = pedido;
		this.cantidad = cantidad;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LibroPedido{" + "libro=" + libro + ", pedido=" + pedido + ", cantidad=" + cantidad + '}';
	}
}
