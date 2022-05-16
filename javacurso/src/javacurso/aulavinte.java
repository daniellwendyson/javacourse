package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aulavinte {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulavinte window = new aulavinte();
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
	public aulavinte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 392, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setBounds(89, 114, 22, 34);
		frame.getContentPane().add(lblB);
		
		
		JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtB.setBounds(143, 40, 38, 20);
		frame.getContentPane().add(txtB);
		

		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setBounds(173, 114, 33, 34);
		frame.getContentPane().add(lblC);
		
		JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtC.setBounds(217, 40, 38, 20);
		frame.getContentPane().add(txtC);
		
		JLabel lblNewLabel = new JLabel("x\u00B2+");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(111, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(191, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(265, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setBounds(137, 114, 24, 34);
		frame.getContentPane().add(lblA);
		
		JLabel lblNewLabel_6 = new JLabel("<html>&Delta =<html>");
		lblNewLabel_6.setBounds(66, 114, 21, 34);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u00B2 - 4 .");
		lblNewLabel_7.setBounds(105, 114, 29, 34);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(".");
		lblNewLabel_8.setBounds(159, 113, 6, 34);
		frame.getContentPane().add(lblNewLabel_8);
		
		JPanel panResultado = new JPanel();
		panResultado.setBounds(10, 179, 229, 71);
		frame.getContentPane().add(panResultado);
		panResultado.setLayout(null);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(Color.BLUE);
		lblDelta.setBounds(128, -8, 134, 52);
		panResultado.add(lblDelta);
		
		JLabel lblRaiz = new JLabel("0");
		lblRaiz.setForeground(Color.BLUE);
		lblRaiz.setBounds(128, 36, 99, 28);
		panResultado.add(lblRaiz);
		
		JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtA.setBounds(64, 40, 38, 20);
		frame.getContentPane().add(txtA);
		
		JButton btnCalc = new JButton("<html>calcular &Delta<html>");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				
				double d = Math.pow(b,2) - 4 * a * c;
				lblDelta.setText(String.format("%.1f", d));
				
				if (d<0) {
					lblRaiz.setText("<html>não existem raízes reais!<html>");
				}else {
					lblRaiz.setText("<html>existem raízes reais!<html>");
				}
				
				
				
				panResultado.setVisible(true);
			}
		});
		btnCalc.setBounds(67, 141, 111, 30);
		frame.getContentPane().add(btnCalc);
		
		
		JLabel lblNewLabel_3 = new JLabel("<html>valor de &Delta<html>");
		lblNewLabel_3.setBounds(10, 11, 87, 14);
		panResultado.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("tipo de ra\u00EDzes");
		lblNewLabel_5.setBounds(10, 36, 84, 14);
		panResultado.add(lblNewLabel_5);
		
		
		panResultado.setVisible(false);
		
	}
}
