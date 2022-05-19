package javacurso;

import java.awt.EventQueue;

import javax.swing.JOptionPane;


import javax.swing.JFrame;

public class aulatrinta {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulatrinta window = new aulatrinta();
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
	public aulatrinta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 /* 
        Algumas variáveis, como "conta" e "par", foram definidas como -1 porque o 0 da interrupção estava sendo contabilizado.
       */
        float n, s=0, conta=-1, par=-1, impar=0, maisdecem=0, media=0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um número: <br><em>(0 interrompe)</html>"));
        s += n;
        conta++;    
        if (n%2==0){
           par++; 
        } else {
            impar++;
        }
        if (n>=100){
            maisdecem++;
        }
        
        } while (n!=0);
        media = s/conta;
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + "Total de valores: "+ conta
        + "<br>Total de pares: "+par+"<br>Total de ímpares: "+impar+"<br>Acima de 100: "+maisdecem+
                "<br>Soma dos valores: " + s + "<br>Média dos valores: "+media);
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
