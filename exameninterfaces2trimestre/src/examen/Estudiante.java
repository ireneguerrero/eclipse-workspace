package examen;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudiante {
	private IntegerProperty id = new SimpleIntegerProperty();
	private StringProperty nombre = new SimpleStringProperty();
	private StringProperty correo_electronico = new SimpleStringProperty();
	private StringProperty telefono = new SimpleStringProperty();
	private StringProperty curso = new SimpleStringProperty();
	private StringProperty fecha_inscripcion = new SimpleStringProperty();

	public Estudiante(int id, String nombre, String correo_electronico, String telefono, String curso, String fecha_inscripcion) {
		this.id.set(id);
		this.nombre.set(nombre);
		this.correo_electronico.set(correo_electronico);
		this.telefono.set(telefono);
		this.curso.set(curso);
		this.fecha_inscripcion.set(fecha_inscripcion);
	}

	public int getId() {
		return id.get();
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getNombre() {
		return nombre.get();
	}

	public StringProperty nombreProperty() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}

	public String getCorreoElectronico() {
		return correo_electronico.get();
	}

	public StringProperty correoelectronicoProperty() {
		return correo_electronico;
	}

	public void setCorreoElectronico(String correo_electronico) {
		this.correo_electronico.set(correo_electronico);
	}

	public String getTelefono() {
		return telefono.get();
	}

	public StringProperty telefonoProperty() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono.set(telefono);
	}

	public String getCurso() {
		return curso.get();
	}

	public StringProperty cursoProperty() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso.set(curso);
	}

	public String getFechaInscripcion() {
		return fecha_inscripcion.get();
	}

	public StringProperty fechainscripcionProperty() {
		return fecha_inscripcion;
	}

	public void setFechaInscripcion(String fecha_inscripcion) {
		this.fecha_inscripcion.set(fecha_inscripcion);
	}

}
