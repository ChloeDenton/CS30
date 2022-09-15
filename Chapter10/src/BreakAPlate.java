/*

Program: BreakAPlate.java          Last Date of this Revision: September , 2022

Purpose: game of probability, break all three plates for the first prize, break two plates for the consolation prize

Author: Chloe Denton 
School: CHHS
Course: Computer Programming 30
 

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;

public class BreakAPlate implements ActionListener{

	static final String FIRST_PRIZE = "tiger plush";
	static final String CONSOLATION_PRIZE = "sticker";
	JFrame frame;
	JButton playButton;
	JLabel plates, prizes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon platesPic = new ImageIcon("src/plates.gif");
		
		ImageIcon p2Broke = new ImageIcon("src/plates_two_broken.gif");
		
		ImageIcon pABroke = new ImageIcon("src/plates_all_broken.gif");
		
		ImageIcon sticker = new ImageIcon("src/sticker.gif");
		
		ImageIcon tiger_plush = new ImageIcon("src/tiger_plush.gif");
		
		// ImageIcon placeholder = new ImageIcon("src/placeholder.gif");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		playButton = new JButton("Play");
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		playButton.setBounds(174, 120, 89, 23);
		frame.getContentPane().add(playButton);
		
		plates = new JLabel(platesPic);
		plates.setHorizontalAlignment(SwingConstants.CENTER);
		plates.setBounds(10, 11, 414, 98);
		frame.getContentPane().add(plates);
		
		prizes = new JLabel();
		prizes.setBounds(10, 164, 414, 121);
		frame.getContentPane().add(prizes);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
