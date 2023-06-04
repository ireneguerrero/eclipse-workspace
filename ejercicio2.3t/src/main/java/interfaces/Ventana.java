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
import exceptions.NombreVacioException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField datosNombre;
	private JRadioButton hombreRadioButton;
	private JRadioButton mujerRadioButton;
	private JRadioButton otroRadioButton;

	public Ventana() {
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
		hombreRadioButton = new JRadioButton("Hombre");
		mujerRadioButton = new JRadioButton("Mujer");
		otroRadioButton = new JRadioButton("Otro");
		final JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario = datosNombre.getText();
	            try {
	                validarNombre();
	            } catch (NombreVacioException e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            }
	             if (usuario.isEmpty()) {
	                 JOptionPane.showMessageDialog(null,"Debes ingresar un nombre de usuario ", "Error",
	                         JOptionPane.ERROR_MESSAGE);
	                } else {
	                    Funciones.abrirSegundaPantalla();
	                }
	             }
	        });


		// Agrupar los RadioButtons para que solo se pueda seleccionar uno
		ButtonGroup grupoRadioButtons = new ButtonGroup();
		grupoRadioButtons.add(hombreRadioButton);
		grupoRadioButtons.add(mujerRadioButton);
		grupoRadioButtons.add(otroRadioButton);

		// Panel para el formulario de nombre y género
		JPanel formularioPanel = new JPanel();
		formularioPanel.setLayout(new GridLayout(3, 2));
		formularioPanel.add(new JLabel("Nombre:"));
		formularioPanel.add(datosNombre);
		formularioPanel.add(new JLabel("Género:"));
		formularioPanel.add(hombreRadioButton);
		formularioPanel.add(new JLabel(""));
		formularioPanel.add(mujerRadioButton);
		formularioPanel.add(new JLabel(""));
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
			throw new NombreVacioException("El nombre no debe contener números");
		}
	}
}
