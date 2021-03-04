package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;

public class UI extends JFrame {

	private JPanel contentPane;
	protected JTextField txtInicial;
	protected JLabel lblNombre;


	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Elegidor nombre para mi bebe");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("letra");
		lblNewLabel_1.setBounds(25, 31, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtInicial = new JTextField();
		txtInicial.setBounds(64, 28, 86, 20);
		panel.add(txtInicial);
		txtInicial.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("nombre sugerido");
		lblNewLabel_2.setBounds(25, 134, 86, 14);
		panel.add(lblNewLabel_2);
		
		lblNombre = new JLabel(" ");
		lblNombre.setBounds(184, 134, 215, 14);
		panel.add(lblNombre);
	}
}
