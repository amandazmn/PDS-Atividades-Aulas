package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Preco;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuilo;
	private JTextField txtPeso;
	private JLabel lblPreco;
	private JLabel lblPeso;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setTitle("Calcular valor do prato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 248, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtQuilo = new JTextField();
		txtQuilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtQuilo.setBounds(226, 81, 86, 25);
		contentPane.add(txtQuilo);
		txtQuilo.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPeso.setText("");
		txtPeso.setBounds(226, 138, 86, 25);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso.getText();
				float precoQuilo = Float.valueOf(txtQuilo.getText());
				float peso = Float.valueOf(txtPeso.getText());
				Preco p = new Preco();
				float preco = p.calcularPreco(precoQuilo, peso);
				JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + String.format("%.2f", preco));
			}	
		});
		btnCalcular.setBounds(157, 204, 125, 31);
		contentPane.add(btnCalcular);
		
		lblPreco = new JLabel("Preço");
		lblPreco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreco.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPreco.setBounds(82, 82, 134, 25);
		contentPane.add(lblPreco);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblPeso.setBounds(82, 138, 134, 25);
		contentPane.add(lblPeso);
		
		lblNewLabel = new JLabel("CALCULAR VALOR DO PRATO");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 22));
		lblNewLabel.setBounds(82, 29, 313, 25);
		contentPane.add(lblNewLabel);
	}

}
