package sandwich;

import javax.swing.JOptionPane;

public class Order {
	public void orderNumber()
	{
	String orderNumber =  JOptionPane.showInputDialog(null, "Enter your order ", "Get Order Number", JOptionPane.INFORMATION_MESSAGE );
	
	System.out.println(orderNumber);
	}
	public void beverageType()
	{
	String[] choices = {"Coke", "Sprite", "RootBeer"};
	
	String BeverageType =  (String) JOptionPane.showInputDialog(null, "Choose one ", "Beverage Type", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
	
	System.out.println(BeverageType);
	}
	
	public void rollType()
	{
	String[] choices1 = {"Wholemeal ", "Multigrain and kibbled ", "Rye "};
	
	String rollType =  (String) JOptionPane.showInputDialog(null, "Choose one ", "Roll Type", JOptionPane.QUESTION_MESSAGE, null, choices1, choices1[1]);
	
	System.out.println(rollType);
	}
	
	public void meatTypes()
	{
	String[] choices2 = {"Chicken", "Beef", "Pork", "Fish", "Shrimp"};
	
	String meatType =  (String) JOptionPane.showInputDialog(null, "Choose one ", "Roll Type", JOptionPane.QUESTION_MESSAGE, null, choices2, choices2[1]);
	
	System.out.println(meatType);
	}
	
	public void size()
	{
	String[] choices3 = {"Large", "Medium", "Small"};
	
	String size =  (String) JOptionPane.showInputDialog(null, "Choose one ", "Roll Type", JOptionPane.QUESTION_MESSAGE, null, choices3, choices3[1]);
	
	System.out.println(size);
	}
	
}
