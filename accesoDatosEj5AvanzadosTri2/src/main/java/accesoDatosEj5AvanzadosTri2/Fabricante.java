package accesoDatosEj5AvanzadosTri2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "fabricante")
public class Fabricante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
	private List<Productos> productos = new ArrayList<>();

	public Fabricante() {

	}

	public Fabricante(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Fabricante{" + "id=" + id + ", nombre='" + nombre + '\'' + '}';
	}

}
