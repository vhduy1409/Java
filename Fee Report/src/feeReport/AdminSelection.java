package feeReport;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminSelection {
	
	public void adminSelection()
	{
		JFrame frame = new JFrame();
		JLabel adminSelection = new JLabel("Admin Selection");
		
		JButton addAccountantButton = new JButton("Add Accountant");
		JButton viewAccountantButton = new JButton("View Accountant");
		JButton logoutButton = new JButton("Log Out");
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(adminSelection);
		frame.add(addAccountantButton);
		frame.add(viewAccountantButton);
		frame.add(logoutButton);
		
		
		adminSelection.setBounds(200, 10, 100, 50);
		addAccountantButton.setBounds(25, 100, 200, 50);
		viewAccountantButton.setBounds(250, 100, 200, 50);
		logoutButton.setBounds(140, 180, 200, 50);
	
	}
}