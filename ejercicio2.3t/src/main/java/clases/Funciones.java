package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;

public class Funciones {
	public static void abrirSegundaPantalla() {
		JFrame segundaVentana = new JFrame("Lista de Capítulos");
		segundaVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		segundaVentana.setBackground(new Color(224, 255, 255));
		segundaVentana.setSize(600, 400);
		segundaVentana.setLocationRelativeTo(null);

		Capitulo[] capitulos = { new Capitulo("Capítulo 1", "Asta Y Yuno", "./imagenes/cap1.png"),
				new Capitulo("Capítulo 2", "El Juramento del Muchacho", "./imagenes/cap2.png"),
				new Capitulo("Capítulo 3", "¡Hacia la Capital del Reino del Trébol!", "./imagenes/cap3.png"),
				new Capitulo("Capítulo 4", "El Examen de Caballería", "./imagenes/cap4.png"),
				new Capitulo("Capítulo 5", "El Camino Hacia Ser Rey Mago", "./imagenes/cap5.png"),
				new Capitulo("Capítulo 6", "Los Toro Negro", "./imagenes/cap6.png"),
				new Capitulo("Capítulo 7", "La Otra Novata", "./imagenes/cap7.png"),
				new Capitulo("Capítulo 8", "¡Vamos! ¡Vamos! La Primera Misión", "./imagenes/cap8.png"),
				new Capitulo("Capítulo 9", "Bestias", "./imagenes/cap9.png"),
				new Capitulo("Capítulo 10", "Los Que Protegen", "./imagenes/cap10.png") };

		final JList<Capitulo> listaCapitulos = new JList<Capitulo>(capitulos);
		listaCapitulos.setCellRenderer(new ListCellRenderer<Capitulo>() {
			public Component getListCellRendererComponent(JList<? extends Capitulo> list, Capitulo value, int index,
					boolean isSelected, boolean cellHasFocus) {
				JPanel panel = new JPanel(new BorderLayout());
				JLabel labelTitulo = new JLabel(value.getTitulo());
				JLabel labelImagen = new JLabel();
				Image imagenRedimensionada = value.getImagen().getImage().getScaledInstance(250, 150, Image.SCALE_SMOOTH);
				labelImagen.setIcon(new ImageIcon(imagenRedimensionada));
				panel.add(labelTitulo, BorderLayout.CENTER);
				panel.add(labelImagen, BorderLayout.EAST);
				if (isSelected) {
					panel.setBackground(list.getSelectionBackground());
					panel.setForeground(list.getSelectionForeground());
				} else {
					panel.setBackground(list.getBackground());
					panel.setForeground(list.getForeground());
				}
				return panel;
			}
		});

		JPanel panelPrincipal = new JPanel(new BorderLayout());
		JPanel panelLista = new JPanel(new BorderLayout());
		panelLista.add(new JScrollPane(listaCapitulos), BorderLayout.CENTER);

		JPanel panelBotones = new JPanel();
		JButton verDetalleButton = new JButton("Ver en detalle");
		verDetalleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Capitulo capituloSeleccionado = listaCapitulos.getSelectedValue();
				if (capituloSeleccionado != null) {
					mostrarVentanaEmergente(capituloSeleccionado.getTitulo(), capituloSeleccionado.getDescripcion(),
							capituloSeleccionado.getImagen());
				}
			}
		});
		panelBotones.add(verDetalleButton);
		panelPrincipal.add(panelLista, BorderLayout.CENTER);
		panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
		segundaVentana.add(panelPrincipal);
		segundaVentana.setVisible(true);
	}

	private static void mostrarVentanaEmergente(String titulo, String descripcion, ImageIcon imagen) {
		JDialog ventanaEmergente = new JDialog();
		ventanaEmergente.setTitle("Detalles del Capítulo");
		ventanaEmergente.setSize(400, 300);
		ventanaEmergente.setLocationRelativeTo(null);

		JLabel tituloLabel = new JLabel(titulo);
		JLabel descripcionLabel = new JLabel(descripcion);
		JLabel imagenLabel = new JLabel();

		// Convertir la imagen a escala de grises
		BufferedImage bufferedImage = new BufferedImage(imagen.getIconWidth(), imagen.getIconHeight(),
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = bufferedImage.createGraphics();
		imagen.paintIcon(null, g, 0, 0);
		g.dispose();

		BufferedImage imagenEscalaGrises = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),
				BufferedImage.TYPE_BYTE_GRAY);
		ColorConvertOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
		op.filter(bufferedImage, imagenEscalaGrises);

		ImageIcon imagenGris = new ImageIcon(imagenEscalaGrises.getScaledInstance(250, 150, Image.SCALE_SMOOTH));
		imagenLabel.setIcon(imagenGris);

		// Crear el botón para abrir la URL
		JButton botonURL = new JButton("Ver serie completa");
		botonURL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www3.animeflv.net/anime/black-clover-tv"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.add(tituloLabel, BorderLayout.NORTH);
		panelPrincipal.add(descripcionLabel, BorderLayout.CENTER);
		panelPrincipal.add(imagenLabel, BorderLayout.WEST);
		panelPrincipal.add(botonURL, BorderLayout.SOUTH); // Agregar el botón al panel

		ventanaEmergente.add(panelPrincipal);
		ventanaEmergente.setVisible(true);
	}
}
