package sandwich;

import javax.swing.JOptionPane;

public class customer {
	
	public void getName()
	{
	String name = JOptionPane.showInputDialog(null, "Enter your name ", "Get Name", JOptionPane.INFORMATION_MESSAGE );
	
	System.out.println(name);		
	}
	
	public void getPhoneNumber()
	{
	String number = JOptionPane.showInputDialog(null, "Enter your number ", "Get Phone Number" , JOptionPane.INFORMATION_MESSAGE);
	
	System.out.println(number);
	}
	
}
