package Clases;

public class ElementoConPresupuesto extends ElementoConNombre {
	public float presupuesto;

	public ElementoConPresupuesto(String nombre, float presupuesto) {
		super(nombre);
		this.setPresupuesto(presupuesto);
	}

	public float getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(float presupuesto) {
		if(this.presupuestoValido(presupuesto)) {
			this.presupuesto = presupuesto;
		}else {
			System.out.println("No puedes poner presupuesto menor a cero");
		}

	}

	/** Proteccion de los presupuestos para que sea mayor que 0 **/
	protected boolean presupuestoValido(float propuesta) {
		return propuesta>0;
	}

	@Override
	public String toString() {
		return super.toString() + " con un presupuesto de: " + this.presupuesto + " €";
	}

}
