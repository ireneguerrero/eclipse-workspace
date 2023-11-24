package hilos.entregar;

public class EjercicioParImpar extends Thread {

	public void run() {

		for (int i = 1; i <= 20; i++) {

			if (getName().equals("Hilo par")) {

				if (i % 2 == 0) {

					System.out.println("Aqui el hilo par numero " + i);

				}

			} else if (getName().equals("Hilo impar")) {

				if (i % 2 != 0) {

					System.out.println("Aqui el hilo impar numero " + i);

				}

			}
		}

	}

	public static void main(String[] args) {

		EjercicioParImpar h1 = new EjercicioParImpar();
		EjercicioParImpar h2 = new EjercicioParImpar();

		h1.setName("Hilo par");
		h2.setName("Hilo impar");
		h1.start();
		h2.start();

		System.out.println("En que lugar me estoy ejecutando");

	}

}
