package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculadora;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCalculadora frame = new JanelaCalculadora();
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
	public JanelaCalculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblPrimeiroNumero = new JLabel("Primeiro Número Inteiro:");
		
		JLabel lblSegundoNumero = new JLabel("Segundo Número Inteiro:");
		
		JLabel lblResultado = new JLabel("");
		
		txtNumero1 = new JTextField();
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setText("");
		txtNumero2.setColumns(10);
		
		JRadioButton rdbtnSomar = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnSomar);
		
		JRadioButton rdbtnSubtrair = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtrair);
		
		JRadioButton rdbtnMultiplicar = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMultiplicar);
		
		JRadioButton rdbtnDividir = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDividir);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora c = new Calculadora(Integer.valueOf(txtNumero1.getText()), Integer.valueOf(txtNumero2.getText()));
				if(rdbtnSomar.isSelected()) {
					lblResultado.setText("Resultado: " + String.valueOf(c.somar(c)));
				}
				if(rdbtnSubtrair.isSelected()) {
					lblResultado.setText("Resultado: " + String.valueOf(c.subtrair(c)));
				}
				if(rdbtnMultiplicar.isSelected()) {
					lblResultado.setText("Resultado: " + String.valueOf(c.multiplicar(c)));
				}
				if(rdbtnDividir.isSelected()) {
					lblResultado.setText("Resultado: " + String.valueOf(c.dividir(c)));
				}
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnDividir)
								.addComponent(rdbtnMultiplicar)
								.addComponent(rdbtnSubtrair)
								.addComponent(rdbtnSomar)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPrimeiroNumero, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
										.addComponent(lblSegundoNumero, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNumero2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNumero1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(118)
							.addComponent(btnCalcular)
							.addGap(26)
							.addComponent(lblResultado)))
					.addGap(108))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrimeiroNumero)
						.addComponent(txtNumero1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSegundoNumero)
						.addComponent(txtNumero2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnSomar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnSubtrair)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnMultiplicar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnDividir)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCalcular)
						.addComponent(lblResultado))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
