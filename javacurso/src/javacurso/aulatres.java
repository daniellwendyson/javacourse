package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aulatres {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulatres window = new aulatres();
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
	public aulatres() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 395, 257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMensagem = new JLabel("aqui vai aparecer a mensagem :)");
		lblMensagem.setForeground(new Color(255, 255, 0));
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblMensagem, BorderLayout.NORTH);
		
		JButton btnClique = new JButton("clique em mim!");
		btnClique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("olá, mundo!");
			}
		});
		btnClique.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClique.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(btnClique, BorderLayout.CENTER);
	}

}
