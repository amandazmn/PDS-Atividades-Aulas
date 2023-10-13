package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercicio2() {
		setTitle("Nome Completo");
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setForeground(Color.BLACK);
		txtNome.setBounds(205, 42, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtSobrenome = new JTextField();
		txtSobrenome.setForeground(Color.BLACK);
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(205, 96, 86, 20);
		contentPane.add(txtSobrenome);

		JLabel lblNomeCompleto = new JLabel("");
		lblNomeCompleto.setForeground(new Color(153, 255, 255));
		lblNomeCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCompleto.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 30));
		lblNomeCompleto.setBounds(0, 197, 434, 37);
		contentPane.add(lblNomeCompleto);

		JButton btnMostrar = new JButton("Mostrar nome");
		btnMostrar.setFont(new Font("Arial", Font.BOLD, 16));
		btnMostrar.setBackground(UIManager.getColor("Button.darkShadow"));
		btnMostrar.setForeground(new Color(0, 0, 0));
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				lblNomeCompleto.setText(nome + " " + sobrenome);

			}
		});
		btnMostrar.setBounds(130, 144, 148, 23);
		contentPane.add(btnMostrar);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(204, 255, 255));
		lblNome.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
		lblNome.setBounds(109, 41, 86, 17);
		contentPane.add(lblNome);

		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setForeground(new Color(204, 255, 255));
		lblSobrenome.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
		lblSobrenome.setBounds(67, 99, 128, 17);
		contentPane.add(lblSobrenome);


	}
}
