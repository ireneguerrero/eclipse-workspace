package hilos;

public class EjemploPrioridades extends Thread {
	public EjemploPrioridades(String nombre) {
		super(nombre);
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hilo " + getName() + " - vueltas: " + i);
		}
	}

	public static void main(String[] args) {
		EjemploPrioridades hilo1 = new EjemploPrioridades("Prioridad Alta");
		EjemploPrioridades hilo2 = new EjemploPrioridades("Prioridad Baja");
// Establecemos las prioridades
		hilo1.setPriority(Thread.MAX_PRIORITY); // Prioridad máxima
		hilo2.setPriority(Thread.MIN_PRIORITY); // Prioridad mínima
// Iniciamos los hilos
		hilo1.start();
		hilo2.start();
	}
}
