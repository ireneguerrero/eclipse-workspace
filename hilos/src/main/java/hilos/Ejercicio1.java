package hilos;

public class Ejercicio1 extends Thread {
	// Creo una variable entera
	private int id;

	public Ejercicio1(int id) {
		this.id = id;
	}

	// Va a ejecutar los hilos
	public void run() {
		System.out.println("Soy el hilo " + id);
	}

	public static void main(String[] args) {
		Ejercicio1 h1 = new Ejercicio1(1);
		Ejercicio1 h2 = new Ejercicio1(2);
		Ejercicio1 h3 = new Ejercicio1(3);

		h1.start();
		h2.start();
		h3.start();

		System.out.println("Soy el hilo principal");

	}

}
