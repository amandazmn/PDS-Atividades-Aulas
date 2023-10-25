package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Retangulo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class Exercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setTitle("Calcular Retângulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(128, 64, 65, 19);
		lblBase.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBase.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(128, 97, 65, 19);
		lblAltura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAltura.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		contentPane.add(lblAltura);
		
		txtBase = new JTextField();
		txtBase.setBounds(203, 66, 86, 20);
		txtBase.setFont(new Font("Arial", Font.PLAIN, 18));
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(203, 99, 86, 20);
		txtAltura.setFont(new Font("Arial", Font.PLAIN, 18));
		txtAltura.setColumns(10);
		contentPane.add(txtAltura);
		
		JLabel lblResultPerimetro = new JLabel("");
		lblResultPerimetro.setVerticalAlignment(SwingConstants.TOP);
		lblResultPerimetro.setBounds(157, 197, 58, 30);
		lblResultPerimetro.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		contentPane.add(lblResultPerimetro);
		
		JLabel lblResultArea = new JLabel("");
		lblResultArea.setVerticalAlignment(SwingConstants.TOP);
		lblResultArea.setBounds(287, 197, 58, 30);
		lblResultArea.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		contentPane.add(lblResultArea);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBackground(UIManager.getColor("Button.shadow"));
		btnCalcular.setBounds(157, 146, 118, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float base = Float.valueOf(txtBase.getText());
				Float altura = Float.valueOf(txtAltura.getText()); 
				Retangulo retangulo = new Retangulo();
				Float perimetro = retangulo.calcularPerimetro(base, altura);
				Float area = retangulo.calcularArea(base, altura);
				lblResultPerimetro.setText(String.format("%.2f", perimetro));
				lblResultArea.setText(String.format("%.2f", area));
		}
		});
		contentPane.add(btnCalcular);
		
		JLabel lblPerimetro = new JLabel("Perímetro: ");
		lblPerimetro.setBounds(56, 197, 105, 23);
		lblPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetro.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		contentPane.add(lblPerimetro);
		
		JLabel lblArea = new JLabel("Área: ");
		lblArea.setBounds(224, 197, 65, 23);
		lblArea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblArea.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		contentPane.add(lblArea);
		
		JLabel lblCalculadora = new JLabel("CALCULADORA");
		lblCalculadora.setVerticalAlignment(SwingConstants.TOP);
		lblCalculadora.setFont(new Font("Perpetua Titling MT", Font.BOLD, 24));
		lblCalculadora.setBounds(116, 30, 220, 27);
		contentPane.add(lblCalculadora);
		
		
	}
}
