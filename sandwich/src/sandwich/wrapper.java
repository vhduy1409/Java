package sandwich;

public class wrapper {
	public void WrapperAutoBoxing()
	{
		Double g = 15.5;// declare Double Object to double data type
		Integer i = 15;// declare Integer Object to int data type
		
		Double z = g + i;// declare Double Object to double data type;
		
		System.out.println(z);
	}
	
	public void WrapperUnBoxing()
	{
		int x = Integer.valueOf("15"); //declare a int to Object Integer
		
		double y = Double.parseDouble("25.5"); // declare a double to Object Double
		
		Integer z = 25;
		
		
		
		
		System.out.println(x < y);
		
		System.out.println(z == y);
	}
	
	
	
}
