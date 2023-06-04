package main;

import javax.swing.SwingUtilities;

import interfaces.Ventana;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ventana v=new Ventana();
            }
        });

	}

}
