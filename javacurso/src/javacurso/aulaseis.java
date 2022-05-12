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
import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class aulaseis {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aulaseis window = new aulaseis();
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
	public aulaseis() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\resolution.png"));
		
		JLabel lblNewLabel_1 = new JLabel("resolu\u00E7\u00E3o da tela:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblR = new JLabel("clique no bot\u00E3o!");
		lblR.setForeground(Color.GRAY);
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnR = new JButton("clique ");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit tk = Toolkit.getDefaultToolkit();
				Dimension d = tk.getScreenSize();
				lblR.setText(d.width+"x"+d.height);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblR)
								.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(170, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblR)
							.addGap(11)
							.addComponent(btnR, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addGap(2))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
