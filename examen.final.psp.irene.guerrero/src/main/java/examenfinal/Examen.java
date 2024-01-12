package examenfinal;

public class Examen implements Runnable {
	private String nombre;
	private int incremento;
	private int progreso;

	public Examen(String nombre, int incremento) {
		this.nombre = nombre;
		this.incremento = incremento;
		this.progreso = 0;
	}

	public void run() {
		while (progreso < 100) {
			progreso += incremento;
			if (progreso > 100) {
				progreso = 100;
			}
			System.out.println(nombre + ": " + progreso + "% completado");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("La " + nombre + " se ha completado");
	}

	public static void main(String[] args) {
		Thread descarga1 = new Thread(new Examen("descarga 1", 1));
		Thread descarga2 = new Thread(new Examen("descarga 2", 2));
		Thread descarga3 = new Thread(new Examen("descarga 3", 3));

		descarga3.setPriority(Thread.MAX_PRIORITY);
		descarga1.setPriority(Thread.NORM_PRIORITY);
		descarga2.setPriority(Thread.MIN_PRIORITY);

		descarga1.start();
		descarga2.start();
		descarga3.start();

		try {
			descarga1.join();
			descarga2.join();
			descarga3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Las descargas han finalizado");

	}

}
