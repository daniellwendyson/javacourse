package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vinteecinco {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vinteecinco window = new vinteecinco();
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
	public vinteecinco() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("contagem");
		lblNewLabel.setBounds(24, 42, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContagem = new JLabel("");
		lblContagem.setBounds(86, 42, 211, 14);
		frame.getContentPane().add(lblContagem);
		
		JButton btnContar = new JButton("contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc = 1;
				String contagem = "";
				while (cc<=10) {
					contagem += cc + " ";
					cc++;
				}
				lblContagem.setText(contagem);
			}
		});
		btnContar.setBounds(169, 166, 89, 23);
		frame.getContentPane().add(btnContar);
	}
}
