/*

Program: MetricConversion.java          Last Date of this Revision: September 13, 2022

Purpose: show the formulas for a type of conversion the user selects

Author: Chloe Denton 
School: CHHS
Course: Computer Programming 30
 

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MetricConversion {

	private JFrame frame;
	public JComboBox conTypes;
	
	// JComboBox conTypes = (JComboBox)event.getSource();
	String itemName = (String)conTypes.getSelectedItem();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] conversions = {"inches to centimeters", "feet to meters", 
				"gallons to liters", "pounds to kilograms"};
		
		conTypes = new JComboBox(conversions);
		conTypes.setBounds(128, 71, 186, 34);
		frame.getContentPane().add(conTypes);
		conTypes.setSelectedIndex(0);
		// conTypes.addActionListener(this);
		
		JLabel promptUser = new JLabel("Select a conversion type:");
		promptUser.setHorizontalAlignment(SwingConstants.CENTER);
		promptUser.setBounds(128, 36, 186, 25);
		frame.getContentPane().add(promptUser);
		
		JLabel compRes = new JLabel("");
		compRes.setHorizontalAlignment(SwingConstants.CENTER);
		compRes.setBounds(128, 131, 186, 25);
		frame.getContentPane().add(compRes);
		
		if (conTypes == "inches to centimeters") {
			
		}
		
	}
}
