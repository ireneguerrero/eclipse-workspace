package marquesina;

public class Marquesina {

	public static void main(String[] args) {

		String mensaje = "Mira cómo mola esto, ¡una marquesina!";
		char[] marquesina = new char[10];
		int posicion = 0;

		for (int i = 0; i < mensaje.length() - 1; i++) {
			if (i < marquesina.length) {
				posicion = (marquesina.length - i) - 1;
				for (int j = 0; j <= i; j++) {
					marquesina[posicion++] = mensaje.charAt(j);
				}
			} else {
				posicion = 0;
				for (int j = (i - marquesina.length) + 1; j <= i; j++) {
					marquesina[posicion++] = mensaje.charAt(j);
				}
			}
			System.out.println(marquesina);
		}
	}
}