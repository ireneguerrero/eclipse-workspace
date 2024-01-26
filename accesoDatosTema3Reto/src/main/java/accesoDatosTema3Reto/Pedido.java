package accesoDatosTema3Reto;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPedido")
	private int idPedido;

	@Column(name = "fechaPedido", nullable = false)
	private Date fechaPedido;

	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente cliente;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<LibroPedido> libroPedidos = new HashSet<>();

	public Pedido() {
	}

	public Pedido(Date fechaPedido, Cliente cliente) {
		this.fechaPedido = fechaPedido;
		this.cliente = cliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<LibroPedido> getLibroPedidos() {
		return libroPedidos;
	}

	public void setLibroPedidos(Set<LibroPedido> libroPedidos) {
		this.libroPedidos = libroPedidos;
	}

	@Override
	public String toString() {
		return "Pedido{" + "idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", cliente=" + cliente
				+ ", libroPedidos=" + libroPedidos + '}';
	}
}
