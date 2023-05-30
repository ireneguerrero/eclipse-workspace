package interfaces;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import clases.Cliente;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;

public class ElementoListaUsuario extends JPanel {
	Ventana ventana;
	Cliente usuarioActual;

	public ElementoListaUsuario(Ventana v, Cliente c) {
		this.ventana = v;
		this.usuarioActual = c;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 108, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel labelEmail = new JLabel(usuarioActual.getEmail());
		labelEmail.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		GridBagConstraints gbc_labelEmail = new GridBagConstraints();
		gbc_labelEmail.gridwidth = 3;
		gbc_labelEmail.insets = new Insets(0, 0, 5, 5);
		gbc_labelEmail.gridx = 0;
		gbc_labelEmail.gridy = 0;
		add(labelEmail, gbc_labelEmail);

		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridheight = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 0;
		add(btnNewButton, gbc_btnNewButton);

		JLabel labelNombre = new JLabel(usuarioActual.getNombre());
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.gridwidth = 3;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 0;
		gbc_labelNombre.gridy = 1;
		add(labelNombre, gbc_labelNombre);

		JLabel labelTelefono = new JLabel("" + usuarioActual.getTelefono());
		GridBagConstraints gbc_labelTelefono = new GridBagConstraints();
		gbc_labelTelefono.gridwidth = 3;
		gbc_labelTelefono.insets = new Insets(0, 0, 0, 5);
		gbc_labelTelefono.gridx = 0;
		gbc_labelTelefono.gridy = 2;
		add(labelTelefono, gbc_labelTelefono);
		ventana = v;
		usuarioActual = c;
		
//		ArrayList<Capitulo> capitulos=new ArrayList<Capitulo>();
//		capitulos.add(new Capitulo("assd",2 ...));
//		capitulos.add(new Capitulo("assd",2 ...));
//		capitulos.add(new Capitulo("assd",2 ...));
//		capitulos.add(new Capitulo("assd",2 ...));
//		
//		for(short i=0;i<capitulos.size();i++) {
//			contenedorElementos.add(new ElementoListaCapitulo(ventana,capitulos.get(i)));
//		}
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				JOptionPane.showMessageDialog(ventana, usuarioActual.getEmail(), usuarioActual.getNombre(), JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
//		JScrollPane lista = new JScrollPane();
//        add(lista, BorderLayout.CENTER);
//
//        JPanel contenedorElementos=new JPanel();
//        lista.setViewportView(contenedorElementos);
//        contenedorElementos.setLayout(new BoxLayout(contenedorElementos));
//try {
//            ArrayList<Cliente> clientes=Cliente.getTodos();
//            for(short i=0;i<clientes.size();i++) {
//                contenedorElementos.add(
//                    new ElementoListaUsuario(ventana.clientes.get(i));
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
		
	}

}
