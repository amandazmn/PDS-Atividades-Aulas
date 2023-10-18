package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Gasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtPagamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3_1 frame = new Exercicio3_1();
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
	public Exercicio3_1() {
		setTitle("Calcular Gasolina");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreco = new JLabel("Preço Gasolina");
		lblPreco.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblPreco.setBounds(76, 66, 153, 24);
		contentPane.add(lblPreco);
		
		JLabel lblPagamento = new JLabel("Pagamento");
		lblPagamento.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblPagamento.setBounds(76, 119, 153, 24);
		contentPane.add(lblPagamento);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Arial", Font.PLAIN, 18));
		txtPreco.setBounds(239, 71, 86, 20);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		txtPagamento = new JTextField();
		txtPagamento.setFont(new Font("Arial", Font.PLAIN, 18));
		txtPagamento.setColumns(10);
		txtPagamento.setBounds(239, 124, 86, 20);
		contentPane.add(txtPagamento);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String precoStr = txtPreco.getText();
				Float preco = Float.valueOf(precoStr);
				String pagamentoStr = txtPagamento.getText();
				Float pagamento = Float.valueOf(pagamentoStr);
				Gasolina gasolina = new Gasolina();
				Float litros = gasolina.calcularLitros(preco, pagamento);
				JOptionPane.showMessageDialog(null, "É possível comprar " + String.format("%.2f", litros) + " litros de gasolina");
			}
		});
		btnCalcular.setBounds(169, 169, 89, 23);
		contentPane.add(btnCalcular);
	}

}
