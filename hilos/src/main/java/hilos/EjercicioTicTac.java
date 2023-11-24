package hilos;

public class EjercicioTicTac extends Thread {
	public void run() {
		if (getName().equals("Hilo tic")) {
			while (true) {

				System.out.println("-tic-");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			while (true) {
				System.out.println("-tac-");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		EjercicioTicTac h1 = new EjercicioTicTac();
		EjercicioTicTac h2 = new EjercicioTicTac();

		h1.setName("Hilo tic");
		h2.setName("Hilo tac");

		h1.start();
		h2.start();

	}

}
