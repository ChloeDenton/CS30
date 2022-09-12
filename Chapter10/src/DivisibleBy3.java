/*

Program: DivisibleBy3.java          Last Date of this Revision: September 12, 2022

Purpose: 

Author: Chloe Denton 
School: CHHS
Course: Computer Programming 30
 

*/

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 extends JFrame {

	private JPanel contentPane;
	static JTextField userResponse;
	public JButton checkBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 frame = new DivisibleBy3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DivisibleBy3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// prompt user for integer 
		JLabel pomptUser = new JLabel("Enter an integer:");
		pomptUser.setHorizontalAlignment(SwingConstants.CENTER);
		pomptUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pomptUser.setBounds(90, 61, 131, 32);
		contentPane.add(pomptUser);
		
		
		// collects and stores users response
		userResponse = new JTextField();
		userResponse.setBounds(217, 69, 115, 20);
		contentPane.add(userResponse);
		userResponse.setColumns(10);
		
		String userRes = userResponse.getText();
		int promptRes = Integer.valueOf(userRes);
		
		
		// runs users response through checking code 
		checkBtn = new JButton("Check");
		checkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		checkBtn.setBounds(175, 99, 89, 23);
		contentPane.add(checkBtn);
		
		
		// prints results 
		JLabel compRes = new JLabel(" ");
		compRes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		compRes.setHorizontalAlignment(SwingConstants.CENTER);
		compRes.setBounds(90, 133, 242, 32);
		contentPane.add(compRes);
		
		
	}
	
	public void checkNum() {
		
	}
}

/* Screen Dump

Paste the output of your code here
 
 */