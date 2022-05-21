package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class aulatrintaesete {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulatrintaesete window = new aulatrintaesete();
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
	public aulatrintaesete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 399, 185);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFormula = new JLabel("f\u00F3rmula");
		lblFormula.setBounds(10, 55, 251, 14);
		frame.getContentPane().add(lblFormula);
		
		JLabel lblResultado = new JLabel("resultado");
		lblResultado.setBounds(222, 55, 89, 14);
		frame.getContentPane().add(lblResultado);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setModel(new SpinnerNumberModel(0, null, 10, 1));
		txtNum.setBounds(10, 11, 58, 20);
		frame.getContentPane().add(txtNum);
		
		JButton btnNewButton = new JButton("!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getValue().toString());
				aulatrintaeseis2 f = new aulatrintaeseis2();
				f.setValor(n);
				lblFormula.setText(f.getFormula());
				lblResultado.setText(Integer.toString(f.getFatorial()));
				
			}
		});
		btnNewButton.setBounds(78, 10, 89, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
