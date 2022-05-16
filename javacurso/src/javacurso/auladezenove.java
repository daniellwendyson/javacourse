package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class auladezenove {

	private JFrame frame;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					auladezenove window = new auladezenove();
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
	public auladezenove() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 261, 226);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("valor");
		lblNewLabel.setBounds(26, 28, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtValor = new JTextField();
		txtValor.setBounds(84, 25, 86, 20);
		frame.getContentPane().add(txtValor);
		txtValor.setColumns(10);
		
		
		JLabel lblResultado = new JLabel("<html>resultado<html>");
		lblResultado.setBounds(72, 95, 68, 20);
		frame.getContentPane().add(lblResultado);
		
		JButton btnVerificar = new JButton("verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v = Integer.parseInt(txtValor.getText());
				if (v%2==0) {
					lblResultado.setText("PAR!");
				}else {
					lblResultado.setText("IMPAR!");
				}
			}
		});
		btnVerificar.setBounds(51, 61, 89, 23);
		frame.getContentPane().add(btnVerificar);

	}
}
