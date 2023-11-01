package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Retangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaRetangulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaRetangulo frame = new JanelaRetangulo();
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
	public JanelaRetangulo() {
		setTitle("Retangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 283);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblBase = new JLabel("Base");
		
		JLabel lblAltura = new JLabel("Altura");
		
		txtBase = new JTextField();
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);
		
		JLabel lblResultado = new JLabel(" ");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float base = Float.valueOf(txtBase.getText());
				float altura = Float.valueOf(txtAltura.getText());
				Retangulo r = new Retangulo();
				if(rdbtnArea.isSelected()) {
					float area = r.calcularArea(base, altura);
					lblResultado.setText(String.format("%.2f", area));
				}
				if(rdbtnPerimetro.isSelected()) {
					float perimetro = r.calcularPerimetro(base, altura);
					lblResultado.setText(String.format("%.2f", perimetro));
				}
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
				lblResultado.setText("");
				buttonGroup.clearSelection();
			}
		});
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResultado)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnCalcular, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnLimpar, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
							.addGap(14)
							.addComponent(btnFechar, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
							.addGap(54))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtBase, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(txtAltura, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(91, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblBase)
							.addGap(117)
							.addComponent(lblAltura)
							.addGap(148))))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addComponent(rdbtnArea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(60)
					.addComponent(rdbtnPerimetro, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
					.addGap(101))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBase)
						.addComponent(lblAltura))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtAltura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnArea)
						.addComponent(rdbtnPerimetro))
					.addGap(13)
					.addComponent(lblResultado)
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnFechar)
							.addComponent(btnLimpar))
						.addComponent(btnCalcular))
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
