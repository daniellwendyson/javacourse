package javacurso;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JFrame;

public class aulavinteenove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulavinteenove window = new aulavinteenove();
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
	public aulavinteenove() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
		
		int n, s=0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>informe um número: <br><em>(valor 0 interrompe)</em><html>"));
			s += n;
		}while (n != 0);
		JOptionPane.showMessageDialog(null, "<html>resultado final <hr>" + 
				"<br>somatório vale " + s + "<html>");
		
		
		// JOptionPane.showMessageDialog(null, "você digitou o valor: "+n);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
