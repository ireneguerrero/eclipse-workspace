package accesoDatosEj4AvanzadosTri2;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private int precio;

	@ManyToOne
	@JoinColumn(name = "id_fabricante", nullable = false)
	private Fabricante fabricante;

	public Productos() {

	}

	public Productos(String nombre, int precio, Fabricante fabricante) {
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Productos {id=" + id + ", nombre='" + nombre + '\'' + ", precio=" + precio + ", fabricante="
				+ fabricante + "}";
	}

}
