package hilos;

class Hilo implements Runnable {
	private String nombre;

	public Hilo(String nombre) {
		this.nombre = nombre;
	}

	public void run() {
		// lo que va a hacer el hilo
		for (int i = 0; i < 10; i++) {
			System.out.println("Hola, soy " + nombre + " ejecutándose la vez " + (i + 1) + " con Runnable");
		}
	}
}

/**/
public class Runnable1 {

	public static void main(String[] args) {
		// Primera forma de crear un objeto hilo
		Hilo h1 = new Hilo("Hilo 1");
		new Thread(h1).start();
		// Segunda forma
		Hilo h2 = new Hilo("Hilo 2");
		Thread hilo = new Thread(h2);
		hilo.start();
		// Tercera forma
		new Thread(new Hilo("Hilo 3")).start();

	}
}