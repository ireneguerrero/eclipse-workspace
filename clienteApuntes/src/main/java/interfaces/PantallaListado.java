package interfaces;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import auxiliares.interfaz.BotonAzul;
import auxiliares.interfaz.BotonRojo;

import javax.swing.BoxLayout;

public class PantallaListado extends PanelMadre {
	private Ventana ventana;

	public PantallaListado(Ventana v) {
		this.ventana = v;
		setLayout(new BorderLayout(0, 0));

		JLabel labelBienvenido = new JLabel("Bienveni@" + ventana.clienteLogado.getNombre());
		add(labelBienvenido, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		BotonAzul btnNewButton_3 = new BotonAzul("New button");
		panel.add(btnNewButton_3);
		
		BotonAzul btnNewButton_2 = new BotonAzul("New button");
		panel.add(btnNewButton_2);
		
		BotonRojo btnNewButton_1 = new BotonRojo("New button");
		panel.add(btnNewButton_1);
		
		BotonRojo btnNewButton = new BotonRojo("New button");
		panel.add(btnNewButton);
		
		JScrollPane lista = new JScrollPane();
		add(lista, BorderLayout.CENTER);
		
		JPanel contenedorElementos = new JPanel();
		lista.setViewportView(contenedorElementos);
		contenedorElementos.setLayout(new BoxLayout(contenedorElementos, BoxLayout.Y_AXIS));
		
		for(byte i=0;i<100;i++) {
			contenedorElementos.add(new ElementoListaUsuario(ventana,ventana.clienteLogado));
		}
	}

}
