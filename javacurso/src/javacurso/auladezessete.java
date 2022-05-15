package javacurso;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class auladezessete {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					auladezessete window = new auladezessete();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public auladezessete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(237, 105, 102, 161);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\akinator1defidk0.png"));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFrase = new JLabel("FRASE");
		lblFrase.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrase.setBounds(129, 30, 94, 77);
		frame.getContentPane().add(lblFrase);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(97, 11, 150, 150);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Icon_Bubble.png"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("valor");
		lblNewLabel_3.setBounds(38, 205, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSpinner txtVal = new JSpinner();
		txtVal.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		txtVal.setBounds(89, 202, 38, 20);
		frame.getContentPane().add(txtVal);
		
		JButton btnPalpite = new JButton("palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 1 + Math.random() * (6-1);
				int valor = (int) n;
				
				int num = Integer.parseInt(txtVal.getValue().toString());
				
				String f1 = "<html>ACERTOU!<html>";
				String f2 = "<html>ERROU! eu pensei no valor "+valor+"<html>";
				
				String res = (valor == num)?f1:f2;
				
				lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 16));
				
				lblFrase.setText(res);
			}
		});
		btnPalpite.setBounds(38, 230, 89, 23);
		frame.getContentPane().add(btnPalpite);
		
		lblFrase.setText("<html>vou pensar em um valor entre <strong>1 e 5<strong>. tente advinhar!<html>");
	}
}
