package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class vinteesete {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vinteesete window = new vinteesete();
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
	public vinteesete() {
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
		
		
		JLabel lblFrase = new JLabel("");
		lblFrase.setBounds(51, 84, 312, 97);
		frame.getContentPane().add(lblFrase);
		
		JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int num = Integer.parseInt(txtN.getValue().toString());
		        int i = 0; // Inicializa o índice com zero
		        int r = 1; 
		        String frase = num + "!= "; // Todos os indíces ex: 3 2 1
		        String mult = " X "; // Inclui o x entre os Índices
		    
		        if(num == 0)  { // Número sendo zero teremos != 1
		            frase += 1;
		        }
		        while(i < num) {           
		            r += (i*r);   // Encontra o fatorial
		            frase += (num - i)+mult; // Todos os números que levam ao fatorial
		            i++;
		        }
		        
		        lblFrase.setText(frase);
		        lblFat.setText(Integer.toString(r));
			}
		});
		txtN.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		txtN.setBounds(92, 39, 39, 20);
		frame.getContentPane().add(txtN);

		

	}
}
