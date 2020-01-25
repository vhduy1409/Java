package feeReport;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddAccountant {
	public void addAccountant()
	{
		JFrame frame = new JFrame();
		JLabel addAccountantLabel = new JLabel("Add Accountant");
		JLabel nameLabel = new JLabel("Name");
		JLabel passwordLabel = new JLabel("Password");
		JLabel emailLabel = new JLabel("Email");
		JLabel contactLabel = new JLabel("Contact No");
		
		JTextField nameTextField = new JTextField();
		JTextField passwordTextField = new JTextField();
		JTextField emailTextField = new JTextField();
		JTextField contactTextField = new JTextField();
		
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(addAccountantLabel);
		frame.add(nameLabel);
		frame.add(passwordLabel);
		frame.add(emailLabel);
		frame.add(contactLabel);
		frame.add(nameTextField);
		frame.add(passwordTextField);
		frame.add(emailTextField);
		frame.add(contactTextField);
				
		addAccountantLabel.setBounds(180, 5, 100, 50);
		nameLabel.setBounds(15, 50, 100, 50);
		passwordLabel.setBounds(15, 125, 100, 50);
		emailLabel.setBounds(15, 200, 100, 50);
		contactLabel.setBounds(15, 275, 100, 50);
		nameTextField.setBounds(100, 50, 200, 50);
		passwordTextField.setBounds(100, 125, 200, 50);
		emailTextField.setBounds(100, 200, 200 , 50);
		contactTextField.setBounds(100, 275, 200 ,50);

	}
}
