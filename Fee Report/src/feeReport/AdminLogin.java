package feeReport;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdminLogin {
	
	public void adminLogin()
	{
		JFrame frame = new JFrame("Admin Login");
		JLabel adminLogin = new JLabel("Admin Login");
		JLabel name = new JLabel("Name");
		JLabel password = new JLabel("Password");
		
		JTextField nameTextField = new JTextField();
		JTextField passTextField = new JTextField();
		
		JButton loginButton = new JButton("login");
		
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(adminLogin);
		frame.add(name);
		frame.add(password);
		frame.add(nameTextField);
		frame.add(passTextField);
		frame.add(loginButton);
		
		
		adminLogin.setBounds(200, 10, 100, 50);
		name.setBounds(25, 100, 100, 50);
		password.setBounds(25, 200, 200, 50);
		nameTextField.setBounds(100, 100, 200, 50);
		passTextField.setBounds(100, 200 , 200, 50);
		loginButton.setBounds(200, 300, 100, 50);


	
	}
}
