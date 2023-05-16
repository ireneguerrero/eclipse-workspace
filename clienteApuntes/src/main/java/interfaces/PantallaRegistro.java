package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaRegistro extends JPanel {
	private Ventana ventana;
	private JButton botonRegistrar;
	private JTextField campoNombre;
	private JLabel labelNombre;
	private JLabel labelEmail;
	private JLabel labelTitulo;
	private JTextField campoEmail;
	private JLabel labelTelefono;
	private JTextField campoTelefono;
	private JLabel labelContraseña;
	private JPasswordField campoContraseña;
	private JLabel labeslGenero;
	private JRadioButton radioHombre;
	private JRadioButton radioMujer;
	private JRadioButton radioOtro;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton botonAtras;
	private JButton botonLimpiar;

	public PantallaRegistro(Ventana v) {
		this.ventana = v;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 71, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{57, 0, 29, 32, 45, 43, 21, 39, 24, -18, 16, 0, 27, 40, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		labelTitulo = new JLabel("Regístrate");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 42));
		GridBagConstraints gbc_labelTitulo = new GridBagConstraints();
		gbc_labelTitulo.gridheight = 2;
		gbc_labelTitulo.gridwidth = 3;
		gbc_labelTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_labelTitulo.gridx = 1;
		gbc_labelTitulo.gridy = 0;
		add(labelTitulo, gbc_labelTitulo);
		
		labelEmail = new JLabel("Email");
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.fill = GridBagConstraints.VERTICAL;
		gbc_labelEmail.anchor = GridBagConstraints.WEST;
		gbc_labelEmail.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmail.gridx = 1;
		gbc_labelEmail.gridy = 2;
		add(labelEmail, gbc_labelEmail);
		
		campoEmail = new JTextField();
		campoEmail.setColumns(10);
		GridBagConstraints gbc_campoEmail = new GridBagConstraints();
		gbc_campoEmail.gridwidth = 2;
		gbc_campoEmail.insets = new Insets(0, 0, 5, 5);
		gbc_campoEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoEmail.gridx = 2;
		gbc_campoEmail.gridy = 2;
		add(campoEmail, gbc_campoEmail);
		
		labelNombre = new JLabel("Nombre");
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.fill = GridBagConstraints.VERTICAL;
		gbc_labelNombre.anchor = GridBagConstraints.WEST;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 3;
		add(labelNombre, gbc_labelNombre);
		
		campoNombre = new JTextField();
		GridBagConstraints gbc_campoNombre = new GridBagConstraints();
		gbc_campoNombre.gridwidth = 2;
		gbc_campoNombre.insets = new Insets(0, 0, 5, 5);
		gbc_campoNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoNombre.gridx = 2;
		gbc_campoNombre.gridy = 3;
		add(campoNombre, gbc_campoNombre);
		campoNombre.setColumns(10);
		
		labelTelefono = new JLabel("Teléfono");
		GridBagConstraints gbc_labelTelefono = new GridBagConstraints();
		gbc_labelTelefono.anchor = GridBagConstraints.WEST;
		gbc_labelTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_labelTelefono.gridx = 1;
		gbc_labelTelefono.gridy = 4;
		add(labelTelefono, gbc_labelTelefono);
		
		campoTelefono = new JTextField();
		GridBagConstraints gbc_campoTelefono = new GridBagConstraints();
		gbc_campoTelefono.gridwidth = 2;
		gbc_campoTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_campoTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoTelefono.gridx = 2;
		gbc_campoTelefono.gridy = 4;
		add(campoTelefono, gbc_campoTelefono);
		campoTelefono.setColumns(10);
		
		labelContraseña = new JLabel("Contraseña");
		GridBagConstraints gbc_labelContraseña = new GridBagConstraints();
		gbc_labelContraseña.anchor = GridBagConstraints.WEST;
		gbc_labelContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_labelContraseña.gridx = 1;
		gbc_labelContraseña.gridy = 5;
		add(labelContraseña, gbc_labelContraseña);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setText("");
		GridBagConstraints gbc_campoContraseña = new GridBagConstraints();
		gbc_campoContraseña.gridwidth = 2;
		gbc_campoContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_campoContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContraseña.gridx = 2;
		gbc_campoContraseña.gridy = 5;
		add(campoContraseña, gbc_campoContraseña);
		
		labeslGenero = new JLabel("Género");
		GridBagConstraints gbc_labeslGenero = new GridBagConstraints();
		gbc_labeslGenero.gridwidth = 3;
		gbc_labeslGenero.insets = new Insets(0, 0, 5, 5);
		gbc_labeslGenero.gridx = 1;
		gbc_labeslGenero.gridy = 6;
		add(labeslGenero, gbc_labeslGenero);
		
		radioHombre = new JRadioButton("Hombre");
		buttonGroup.add(radioHombre);
		GridBagConstraints gbc_radioHombre = new GridBagConstraints();
		gbc_radioHombre.insets = new Insets(0, 0, 5, 5);
		gbc_radioHombre.gridx = 1;
		gbc_radioHombre.gridy = 7;
		add(radioHombre, gbc_radioHombre);
		
		radioMujer = new JRadioButton("Mujer");
		buttonGroup.add(radioMujer);
		GridBagConstraints gbc_radioMujer = new GridBagConstraints();
		gbc_radioMujer.insets = new Insets(0, 0, 5, 5);
		gbc_radioMujer.gridx = 2;
		gbc_radioMujer.gridy = 7;
		add(radioMujer, gbc_radioMujer);
		
		radioOtro = new JRadioButton("Otro");
		buttonGroup.add(radioOtro);
		GridBagConstraints gbc_radioOtro = new GridBagConstraints();
		gbc_radioOtro.insets = new Insets(0, 0, 5, 5);
		gbc_radioOtro.gridx = 3;
		gbc_radioOtro.gridy = 7;
		add(radioOtro, gbc_radioOtro);
		
		botonLimpiar = new JButton("Limpiar formulario");
		botonLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		botonRegistrar = new JButton("Regístrate");
		botonRegistrar.setBackground(new Color(0, 0, 102));
		botonRegistrar.setFont(new Font("Arial", Font.ITALIC, 18));
		botonRegistrar.setForeground(Color.WHITE);
		botonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_botonRegistrar = new GridBagConstraints();
		gbc_botonRegistrar.gridwidth = 3;
		gbc_botonRegistrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonRegistrar.insets = new Insets(0, 0, 5, 5);
		gbc_botonRegistrar.gridx = 1;
		gbc_botonRegistrar.gridy = 9;
		add(botonRegistrar, gbc_botonRegistrar);
		GridBagConstraints gbc_botonLimpiar = new GridBagConstraints();
		gbc_botonLimpiar.fill = GridBagConstraints.HORIZONTAL;
		gbc_botonLimpiar.gridwidth = 3;
		gbc_botonLimpiar.insets = new Insets(0, 0, 5, 5);
		gbc_botonLimpiar.gridx = 1;
		gbc_botonLimpiar.gridy = 10;
		add(botonLimpiar, gbc_botonLimpiar);
		
		botonAtras = new JButton("Cancelar");
		botonAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLogin.class);
			}
		});
		GridBagConstraints gbc_botonAtras = new GridBagConstraints();
		gbc_botonAtras.fill = GridBagConstraints.BOTH;
		gbc_botonAtras.insets = new Insets(0, 0, 5, 5);
		gbc_botonAtras.gridx = 2;
		gbc_botonAtras.gridy = 12;
		add(botonAtras, gbc_botonAtras);
	}
}
