package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class PantallaRegistro extends JPanel {
	private Ventana ventana;

	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setBounds(214, 135, 200, 50);
		add(lblNewLabel);
	}

}
