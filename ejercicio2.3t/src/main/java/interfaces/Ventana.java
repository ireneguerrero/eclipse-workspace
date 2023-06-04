package interfaces;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import clases.Funciones;
import exceptions.GeneroVacioException;
import exceptions.NombreConNumerosException;
import exceptions.NombreVacioException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField datosNombre;
	private JRadioButton hombreRadioButton;
	private JRadioButton mujerRadioButton;
	private JRadioButton otroRadioButton;
	private JButton btnEntrar;
	private ButtonGroup grupoRadioButtons;

	public Ventana() {
		setBackground(new Color(224, 255, 255));
		// Configuración de la ventana principal
		setTitle("Black Clover");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(336, 443);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());

		// Creación de los componentes de la pantalla inicial
		JLabel tituloLabel = new JLabel("Black Clover");
		JLabel imagenLabel = new JLabel(new ImageIcon("./imagenes/gif.gif"));
		datosNombre = new JTextField(20);
		datosNombre.setBackground(new Color(221, 160, 221));
		hombreRadioButton = new JRadioButton("Hombre");
		hombreRadioButton.setBackground(new Color(221, 160, 221));
		mujerRadioButton = new JRadioButton("Mujer");
		mujerRadioButton.setBackground(new Color(221, 160, 221));
		otroRadioButton = new JRadioButton("Otro");
		otroRadioButton.setBackground(new Color(221, 160, 221));
		// Agrupar los RadioButtons para que solo se pueda seleccionar uno
		grupoRadioButtons = new ButtonGroup();
		grupoRadioButtons.add(hombreRadioButton);
		grupoRadioButtons.add(mujerRadioButton);
		grupoRadioButtons.add(otroRadioButton);
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(new Color(221, 160, 221));
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = datosNombre.getText();
				try {
			        validarNombre();
			        verificarSeleccionRadioButton(grupoRadioButtons);
			    } catch (NombreVacioException | GeneroVacioException e1) {
			    	e1.getMessage();
			    }
				
				if (usuario.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debes ingresar un nombre de usuario ", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if(grupoRadioButtons.getSelection() == null){
					JOptionPane.showMessageDialog(null, "Debes seleccionar una opción.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
			        Funciones.abrirSegundaPantalla();
			    }

				
			}
		});

		// Panel para el formulario de nombre y género
		JPanel formularioPanel = new JPanel();
		formularioPanel.setBackground(new Color(224, 255, 255));
		formularioPanel.setLayout(new GridLayout(3, 2));
		JLabel label = new JLabel("Nombre:");
		label.setBackground(new Color(224, 255, 255));
		formularioPanel.add(label);
		formularioPanel.add(datosNombre);
		JLabel label_1 = new JLabel("Género:");
		label_1.setBackground(new Color(224, 255, 255));
		formularioPanel.add(label_1);
		formularioPanel.add(hombreRadioButton);
		JLabel label_2 = new JLabel("");
		label_2.setBackground(new Color(224, 255, 255));
		formularioPanel.add(label_2);
		formularioPanel.add(mujerRadioButton);
		JLabel label_3 = new JLabel("");
		label_3.setBackground(new Color(224, 255, 255));
		formularioPanel.add(label_3);
		formularioPanel.add(otroRadioButton);

		// Panel para la imagen y el botón de entrar
		JPanel imagenPanel = new JPanel();
		imagenPanel.setLayout(new BorderLayout());
		imagenPanel.add(imagenLabel, BorderLayout.CENTER);
		imagenPanel.add(btnEntrar, BorderLayout.SOUTH);

		// Panel principal de la ventana
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.add(tituloLabel, BorderLayout.NORTH);
		panelPrincipal.add(imagenPanel, BorderLayout.CENTER);
		panelPrincipal.add(formularioPanel, BorderLayout.SOUTH);

		// Agregar el panel principal a la ventana
		getContentPane().add(panelPrincipal);

		// Mostrar la ventana principal
		setVisible(true);
	}

	private void validarNombre() throws NombreVacioException {
		String nombre = datosNombre.getText();
		if (nombre.matches(".*\\d.*")) {
			throw new NombreVacioException("Debes poner un nombre");
		}
	}

	public void verificarSeleccionRadioButton(ButtonGroup buttonGroup) throws GeneroVacioException {
		if (buttonGroup.getSelection() == null) {
			throw new GeneroVacioException("Debes seleccionar una opción.");
		}
	}
}
