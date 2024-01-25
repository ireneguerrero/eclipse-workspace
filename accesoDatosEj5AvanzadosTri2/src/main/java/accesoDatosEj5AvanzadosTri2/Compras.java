package accesoDatosEj5AvanzadosTri2;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "compras")
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcompras")
	private int idcompras;

	@Column(name = "fecha")
	private Date fecha;

	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Productos id_producto;

	@Column(name = "unidades")
	private int unidades;

	public Compras() {

	}

	public Compras(Date fecha, Productos id_producto, int unidades) {
		this.fecha = fecha;
		this.id_producto = id_producto;
		this.unidades = unidades;
	}

	public int getIdcompras() {
		return idcompras;
	}

	public void setIdcompras(int idcompras) {
		this.idcompras = idcompras;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Productos getId_producto() {
		return id_producto;
	}

	public void setId_producto(Productos id_producto) {
		this.id_producto = id_producto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	@Override
	public String toString() {
		return "Compras {idcompras=" + idcompras + ", fecha='" + fecha + '\'' + ", id_producto=" + id_producto
				+ ", unidades=" + unidades + "}";
	}

}
