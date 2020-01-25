package feeReport;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FeeReportMain {
	public void Window()
	{
		JFrame frame = new JFrame();
		JButton adminLoginButton = new JButton("Admin Login");
		JButton accountantLoginButton = new JButton("Account Login");

		JLabel feeReport = new JLabel("Fee Report");
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(adminLoginButton);
		
		frame.add(accountantLoginButton);
		
		frame.add(feeReport);

		Dimension size = feeReport.getPreferredSize();
		
		feeReport.setBounds(200, 10, 150, 50);
		
		adminLoginButton.setBounds(150, 100, 150, 50);
		
		accountantLoginButton.setBounds(150, 200, 150, 50);
		
	}
}
