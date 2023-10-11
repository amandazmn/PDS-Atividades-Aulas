package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura (F):");
		lblTemperatura.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTemperatura.setBounds(39, 82, 184, 33);
		contentPane.add(lblTemperatura);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setFont(new Font("Noto Sans", Font.PLAIN, 20));
		txtTemperatura.setBounds(229, 82, 134, 30);
		contentPane.add(txtTemperatura);
		txtTemperatura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pegar a temperatura digitada no componente de texto
				String temperaturaDigitada = txtTemperatura.getText();
				// convereter temperatura de string para float
				float temperaturaF = Float.valueOf(temperaturaDigitada);
				// criar objeto da classe ConsersaoFtoC
				ConversaoTemperatura tempConvertida = new ConversaoTemperatura();
				// chamar metodo de conversao
				float temperatura = tempConvertida.convereterFtoC(temperaturaF);
				// mostrar temperatura convertida
				JOptionPane.showMessageDialog(null, "Temperatura convertida: " + String.format("%.2f", temperatura) + "C°");
			}
		});
		btnCalcular.setBackground(UIManager.getColor("Button.darkShadow"));
		btnCalcular.setFont(new Font("Arial", Font.BOLD, 15));
		btnCalcular.setBounds(163, 168, 120, 30);
		contentPane.add(btnCalcular);
	}

}
