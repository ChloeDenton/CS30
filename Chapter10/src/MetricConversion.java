/*

Program: MetricConversion.java          Last Date of this Revision: September 14, 2022

Purpose: show the formulas for a type of conversion the user selects

Author: Chloe Denton 
School: CHHS
Course: Computer Programming 30
 

*/

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MetricConversion implements ActionListener {

	private JFrame frame;
	JComboBox conTypes;
	JLabel compRes;

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
		
		String[] conString = {"inches to centimeters", "feet to meters", 
				"gallons to liters", "pounds to kilograms"};
		
		JLabel promptUser = new JLabel("Select a conversion type:");
		promptUser.setHorizontalAlignment(SwingConstants.CENTER);
		promptUser.setBounds(128, 36, 186, 25);
		frame.getContentPane().add(promptUser);
		
		compRes = new JLabel("1 inch = 2.54 centimeters");
		compRes.setHorizontalAlignment(SwingConstants.CENTER);
		compRes.setBounds(128, 131, 186, 25);
		frame.getContentPane().add(compRes);
		
		conTypes = new JComboBox(conString);
		conTypes.setBounds(128, 72, 186, 35);
		frame.getContentPane().add(conTypes);
		conTypes.setSelectedIndex(0);
		conTypes.addActionListener(this);
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		JComboBox comboBox = (JComboBox)event.getSource();
		String conString = (String)comboBox.getSelectedItem();
		
		if (conString == "inches to centimeters") {
			compRes.setText("1 inch = 2.54 centimeters");
			
		} else if (conString == "feet to meters") {
			compRes.setText("1 foot = 0.3048 meters");
			
		} else if (conString == "gallons to liters") {
			compRes.setText("1 gallon = 4.5461 liters");
			
		} else if (conString == "pounds to kilograms") {
			compRes.setText("1 pound = 0.4536 kilograms");
		}
		
	}
}
