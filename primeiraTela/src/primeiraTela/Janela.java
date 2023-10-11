package primeiraTela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textSobrenome;
	private JTextField textNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setForeground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHelloWorld = new JLabel("Hello World!");
		lblHelloWorld.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblHelloWorld.setForeground(new Color(30, 144, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblHelloWorld.setForeground(new Color(32, 178, 170));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "O foco está no JLabel");
			}
		});
		lblHelloWorld.setForeground(new Color(32, 178, 170));
		lblHelloWorld.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblHelloWorld.setBounds(156, 26, 121, 28);
		contentPane.add(lblHelloWorld);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBackground(new Color(255, 0, 0));
		btnFechar.setForeground(new Color(255, 228, 225));
		btnFechar.setFont(new Font("Noto Sans Light", Font.BOLD, 15));
		btnFechar.setBounds(298, 203, 89, 23);
		contentPane.add(btnFechar);
		
		textSobrenome = new JTextField();
		textSobrenome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textSobrenome.setBackground(new Color(240, 255, 240));
			}
			@Override
			public void focusLost(FocusEvent e) {
				textSobrenome.setBackground(new Color(255, 255, 255));
			}
		});
		
		textSobrenome.setFont(new Font("Noto Sans", Font.PLAIN, 15));
		textSobrenome.setColumns(10);
		textSobrenome.setBounds(204, 137, 146, 28);
		contentPane.add(textSobrenome);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Noto Sans", Font.BOLD, 15));
		lblNome.setBounds(141, 90, 57, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Noto Sans", Font.BOLD, 15));
		lblSobrenome.setBounds(100, 142, 98, 14);
		contentPane.add(lblSobrenome);
		
		textNome = new JTextField();
		textNome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textNome.setBackground(new Color(240, 255, 240));
			}
			@Override
			public void focusLost(FocusEvent e) {
				textNome.setBackground(new Color(255, 255, 255));
			}
		});
		textNome.setFont(new Font("Noto Sans", Font.PLAIN, 15));
		textNome.setColumns(10);
		textNome.setBounds(204, 85, 146, 28);
		contentPane.add(textNome);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pegar o texto digitado no JTextField (txtNome)
				String nome = textNome.getText();
				String sobrenome = textSobrenome.getText();
				// mostrar o nome digitado na tela usando JOpitionPane
				JOptionPane.showMessageDialog(null, "O nome digitado é: " + nome + " " + sobrenome);
			}
		});
		btnValidar.setForeground(new Color(240, 255, 240));
		btnValidar.setFont(new Font("Noto Sans Light", Font.BOLD, 15));
		btnValidar.setBackground(new Color(60, 179, 113));
		btnValidar.setBounds(188, 203, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textSobrenome.setText("");
			}
		});
		btnLimpar.setForeground(new Color(240, 255, 240));
		btnLimpar.setFont(new Font("Noto Sans Light", Font.BOLD, 15));
		btnLimpar.setBackground(Color.LIGHT_GRAY);
		btnLimpar.setBounds(81, 203, 89, 23);
		contentPane.add(btnLimpar);
	}
}
