package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aulavinteeum {

	private JFrame frame;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulavinteeum window = new aulavinteeum();
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
	public aulavinteeum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 228, 225);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ano nasc:");
		lblNewLabel.setBounds(20, 11, 58, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(83, 8, 86, 20);
		frame.getContentPane().add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblR = new JLabel("resultado");
		lblR.setBounds(57, 115, 123, 30);
		frame.getContentPane().add(lblR);
		

		JLabel lblNewLabel_1 = new JLabel("idade:");
		lblNewLabel_1.setBounds(10, 161, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setBounds(83, 161, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		JButton btnVoto = new JButton("posso votar?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtAno.getText());
				int i = 2022 - a;
				if (i < 16) {
					lblR.setText("não vota!");
				} else if ((i>=16 && i<18) || (i>70)) {
					lblR.setText("voto opcional!");
				} else {
					lblR.setText("voto obrigatório!");
				}
				lblIdade.setText(Integer.toString(i));
			}
		});
		btnVoto.setBounds(30, 39, 114, 49);
		frame.getContentPane().add(btnVoto);
	
	}
}
