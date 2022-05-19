package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;

public class aulatrintaedois {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulatrintaedois window = new aulatrintaedois();
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
	public aulatrintaedois() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 512, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("in\u00EDcio");
		lblNewLabel.setBounds(10, 34, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("fim");
		lblNewLabel_1.setBounds(10, 72, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("passo");
		lblNewLabel_2.setBounds(10, 115, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblInicio = new JLabel("0");
		lblInicio.setBounds(276, 34, 46, 14);
		frame.getContentPane().add(lblInicio);
		
		JLabel lblFim = new JLabel("6");
		lblFim.setBounds(276, 72, 46, 14);
		frame.getContentPane().add(lblFim);
		
		JLabel lblPasso = new JLabel("1");
		lblPasso.setBounds(276, 115, 46, 14);
		frame.getContentPane().add(lblPasso);
		
		JList lstCont = new JList();
		lstCont.setBounds(300, 11, 189, 368);
		frame.getContentPane().add(lstCont);
		
		JSlider sliInicio = new JSlider();
		sliInicio.setMinimum(1);
		sliInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i = sliInicio.getValue();
				lblInicio.setText(Integer.toString(i));
			}
		});
		sliInicio.setValue(1);
		sliInicio.setMaximum(5);
		sliInicio.setBounds(66, 22, 200, 26);
		frame.getContentPane().add(sliInicio);
		
		JSlider sliFim = new JSlider();
		sliFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int f = sliFim.getValue();
				lblFim.setText(Integer.toString(f));
			}
		});
		sliFim.setMaximum(20);
		sliFim.setValue(6);
		sliFim.setMinimum(6);
		sliFim.setBounds(66, 60, 200, 26);
		frame.getContentPane().add(sliFim);
		
		JSlider sliPasso = new JSlider();
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int p = sliPasso.getValue();
				lblPasso.setText(Integer.toString(p));
			}
		});
		sliPasso.setValue(1);
		sliPasso.setMaximum(4);
		sliPasso.setMinimum(1);
		sliPasso.setBounds(66, 103, 200, 26);
		frame.getContentPane().add(sliPasso);
		
		
		JButton btnCont = new JButton("contar");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = sliInicio.getValue();
				int f = sliFim.getValue();
				int p = sliPasso.getValue();
				
				DefaultListModel lista = new DefaultListModel();
				
				for (int c = i; c <= f; c+= p) {
					lista.addElement(c);
				}
				
				lstCont.setModel(lista);
			}
		});
		btnCont.setBounds(114, 153, 89, 23);
		frame.getContentPane().add(btnCont);
	}
}
