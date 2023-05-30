package auxiliares.interfaz;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BotonRojo extends BotonAzul {

	public BotonRojo(String text) {
		super(text);
		this.setBackground(new Color(70, 0, 0));
		this.setForeground(new Color(240, 200, 200));

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(new Color(240, 0, 0));
				setForeground(new Color(70, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(new Color(70, 0, 0));
				setForeground(new Color(240, 200, 200));
			}
		});
	}

}
