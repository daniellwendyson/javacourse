package javacurso;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class aulaquatro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulaquatro window = new aulaquatro();
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
	public aulaquatro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 185);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\calendario.jpeg"));
		
		JLabel lblNewLabel_1 = new JLabel("data e horas atuais");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblH = new JLabel("clique no bot\u00E3o!");
		lblH.setForeground(Color.GRAY);
		lblH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnH = new JButton("clique ");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				lblH.setText(relogio.toString());
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addComponent(lblH))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(193, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(11)
							.addComponent(lblH)
							.addGap(3)
							.addComponent(btnH, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel))
					.addContainerGap(199, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
