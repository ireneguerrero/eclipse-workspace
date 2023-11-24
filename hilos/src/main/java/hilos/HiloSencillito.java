package hilos;

// le digo que se comporte como un hilo
public class HiloSencillito extends Thread {
	// dentro de la clase creo un método run que será lo que ejecute nuestro hilo
	public void run() {
		// código que se ejecutará cuando el hilo se inicie
//		System.out.println("Hola, soy un hilo ejecutándose");

//		for (int i = 0; i < 10; i++) {
//			System.out.println("Hola, soy un hilo ejecutándose " + (i + 1) + " veces");
//		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Hola, soy un hilo " + getName() + " ejecutándose " + (i + 1) + " veces");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// creo el objeto h de la clase ejemplo
		HiloSencillito h1 = new HiloSencillito();
		HiloSencillito h2 = new HiloSencillito();
		h1.setName("Hilo 1");
		h2.setName("Hilo 2");
		h1.start();
		h2.start();
		System.out.println("Holi");
	}

}
