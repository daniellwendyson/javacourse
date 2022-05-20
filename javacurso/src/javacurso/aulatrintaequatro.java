package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class aulatrintaequatro {
	
	int vetor[] = new int[5];
	DefaultListModel lista = new DefaultListModel();
	int selecionado = 0;
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulatrintaequatro window = new aulatrintaequatro();
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
	public aulatrintaequatro() {
		initialize();
		for(int c=0; c<vetor.length; c++) {
			lista.addElement(vetor[c]);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(10, 11, 52, 20);
		frame.getContentPane().add(txtNum);
		
		JButton btnAdd = new JButton("adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
				lista.removeAllElements();
				for(int c=0; c<vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnAdd.setBounds(72, 10, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = 0;
				lista.removeAllElements();
				for(int c=0; c<vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnRemove.setBounds(72, 44, 89, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnOrdem = new JButton("ordenar");
		btnOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vetor);
				lista.removeAllElements();
				for(int c=0; c<vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnOrdem.setBounds(72, 78, 89, 23);
		frame.getContentPane().add(btnOrdem);
		
		JLabel lblNewLabel = new JLabel("vetor");
		lblNewLabel.setBounds(267, 14, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSelecionado = new JLabel("[0]");
		lblSelecionado.setBounds(309, 14, 46, 14);
		frame.getContentPane().add(lblSelecionado);
		
		JList lstVetor = new JList();
		lstVetor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecionado = lstVetor.getSelectedIndex();
				lblSelecionado.setText("["+selecionado+"]");
			}
		});
		lstVetor.setBounds(194, 47, 230, 318);
		frame.getContentPane().add(lstVetor);
		lstVetor.setModel(lista);
	}

}
