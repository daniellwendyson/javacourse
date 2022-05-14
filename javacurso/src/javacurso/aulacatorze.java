package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class aulacatorze {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulacatorze window = new aulacatorze();
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
	public aulacatorze() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_2 = new JLabel("resto da divis\u00E3o por 2");
		
		JLabel lblNewLabel_3 = new JLabel("elevado ao cubo");
		
		JLabel lblNewLabel_4 = new JLabel("raiz quadrada");
		
		JLabel lblNewLabel_5 = new JLabel("raiz c\u00FAbica");
		
		JLabel lblNewLabel_6 = new JLabel("valor absoluto");

		JLabel lblCubo = new JLabel("0");
		lblCubo.setForeground(Color.BLUE);
		lblCubo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblRaizQ = new JLabel("0");
		lblRaizQ.setForeground(Color.BLUE);
		lblRaizQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblRaizC = new JLabel("0");
		lblRaizC.setForeground(Color.BLUE);
		lblRaizC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setForeground(Color.BLUE);
		lblAbs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblResto = new JLabel("0");
		lblResto.setForeground(Color.BLUE);
		lblResto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("digite um valor: ");
		
		JSpinner txtNum = new JSpinner();
		txtNum.setModel(new SpinnerNumberModel(1, -50, 50, 1));
		
		JPanel panCalc = new JPanel();
		panCalc.setVisible(false);
		
		JButton btnCalc = new JButton("calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());
				
				// resto da div por 2
				int r = num % 2;
				lblResto.setText(Integer.toString(r));
				
				// elevado ao cubo
				double c = Math.pow(num, 3);
				lblCubo.setText(Double.toString(c));
				
				// raiz quadrada
				double rq = Math.sqrt(num);
				lblRaizQ.setText(String.format("%.2f",rq));
				
				// raiz cúbica
				double rc = Math.cbrt(num);
				lblRaizC.setText(String.format("%.2f",rc));
				
				// valor absoluto
				int abs = Math.abs(num);
				lblAbs.setText(Integer.toString(abs));
				
				panCalc.setVisible(true);
			}
		});
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(275, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(117)
					.addComponent(btnCalc)
					.addContainerGap(228, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panCalc, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCalc)
					.addGap(18)
					.addComponent(panCalc, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		
		
		GroupLayout gl_panCalc = new GroupLayout(panCalc);
		gl_panCalc.setHorizontalGroup(
			gl_panCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panCalc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panCalc.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(lblResto))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(lblCubo))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(lblRaizQ))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(lblRaizC))
						.addGroup(gl_panCalc.createSequentialGroup()
							.addComponent(lblNewLabel_6)
							.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
							.addComponent(lblAbs)))
					.addContainerGap())
		);
		gl_panCalc.setVerticalGroup(
			gl_panCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panCalc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblResto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblCubo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblRaizQ))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblRaizC))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(lblAbs))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		panCalc.setLayout(gl_panCalc);
		frame.getContentPane().setLayout(groupLayout);
	}
}
