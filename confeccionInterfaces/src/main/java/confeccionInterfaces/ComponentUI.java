package confeccionInterfaces;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComponentUI extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Botón personalizado");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		frame.getContentPane().add(panel);

		JButton button = new JButton("Botón personalizado");
		button.setBackground(Color.MAGENTA);
		button.setForeground(Color.WHITE);

		button.setBounds(50, 50, 200, 30);

		frame.setLocation(600, 300);
		frame.setSize(300, 200);

		panel.add(button);
		frame.setVisible(true);
	}
}
