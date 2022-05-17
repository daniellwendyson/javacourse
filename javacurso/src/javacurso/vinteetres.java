package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class vinteetres {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vinteetres window = new vinteetres();
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
	public vinteetres() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("0");
		lblA.setBounds(232, 34, 46, 14);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("0");
		lblB.setBounds(231, 73, 46, 14);
		frame.getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("0");
		lblC.setBounds(233, 105, 46, 14);
		frame.getContentPane().add(lblC);
		
		JLabel lblNewLabel = new JLabel("segmento a");
		lblNewLabel.setBounds(10, 30, 63, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("segmento b");
		lblNewLabel_1.setBounds(11, 70, 66, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("segmento c");
		lblNewLabel_2.setBounds(10, 107, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSlider sliA = new JSlider();
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
		});
		sliA.setValue(0);
		sliA.setMaximum(20);
		sliA.setBounds(88, 31, 134, 26);
		frame.getContentPane().add(sliA);
		
		JSlider sliB = new JSlider();
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		sliB.setValue(0);
		sliB.setMaximum(20);
		sliB.setBounds(88, 66, 134, 26);
		frame.getContentPane().add(sliB);
		
		JSlider sliC = new JSlider();
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		sliC.setMaximum(20);
		sliC.setBounds(88, 101, 134, 26);
		frame.getContentPane().add(sliC);
		
		
		JPanel panResposta = new JPanel();
		panResposta.setBounds(8, 174, 358, 111);
		frame.getContentPane().add(panResposta);
		panResposta.setLayout(null);
		
		JLabel lblStatus = new JLabel("forma ou n\u00E3o?");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(4, 23, 353, 14);
		panResposta.add(lblStatus);
		
		JLabel lblTipos = new JLabel("tipo de tri\u00E2ngulo");
		lblTipos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipos.setBounds(5, 48, 352, 25);
		panResposta.add(lblTipos);
		
		JButton btnVerificar = new JButton("verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = sliA.getValue();
				int b = sliB.getValue();
				int c = sliC.getValue();
				if (a<b+c && b<a+c && c<a+b) {
					lblStatus.setText("formam um triângulo!");
					if (a==b && b==c) {
						lblTipos.setText("equilátero");
					}else if (a!=b && b!=c && a!=c) {
						lblTipos.setText("escaleno");
					}else {
						lblTipos.setText("isósceles");
					}
				}else {
					lblStatus.setText("não formam um triângulo!");
					lblTipos.setText("-------");
				}
				panResposta.setVisible(true);
			}
		});
		btnVerificar.setBounds(86, 141, 89, 23);
		frame.getContentPane().add(btnVerificar);
		
		
		panResposta.setVisible(false);
	}
}
