package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class vinteeseis {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vinteeseis window = new vinteeseis();
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
	public vinteeseis() {
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
		
		JLabel lblNewLabel = new JLabel("! =");
		lblNewLabel.setBounds(141, 42, 23, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFat = new JLabel("1");
		lblFat.setForeground(Color.RED);
		lblFat.setBounds(174, 42, 250, 14);
		frame.getContentPane().add(lblFat);
		
		JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int n = Integer.parseInt(txtN.getValue().toString());
				int f = 1;
				int c = n;
				
				while (c>=1) {
					f *= c;
					c--;
				}
				
				lblFat.setText(Integer.toString(f));
			}
		});
		txtN.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		txtN.setBounds(92, 39, 39, 20);
		frame.getContentPane().add(txtN);
		

	}
}
