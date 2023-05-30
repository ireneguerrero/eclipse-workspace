package auxiliares.interfaz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import interfaces.PantallaRegistro;

public class BotonAzul extends JButton {

	public BotonAzul(String text) {
		super(text);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(200, 200, 240));
				setForeground(new Color(0, 0, 50));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(74, 146, 176));
				setForeground(new Color(175, 238, 238));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		this.setBackground(new Color(74, 146, 176));
		this.setForeground(new Color(175, 238, 238));
		this.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
	}

}
