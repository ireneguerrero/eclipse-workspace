package hilos;

public class Prueba extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Holi " + (i + 1));
		}

	}

	public static void main(String[] args) {
		Prueba p = new Prueba();
		p.start();

	}

}
