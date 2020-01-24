package sandwich;

import java.util.*;

public class vector {
	
	Scanner in = new Scanner(System.in);
	
	Vector<String> vector = new Vector<String>(10);// create a vector class
	
	
	public void Vector()
	{
		
		
		
		vector.add(in.nextLine());// data in the class
		vector.add("Pepsi");
		vector.add("MoutainDell");
		vector.add("Monster");
		vector.add("Mirinda");
		vector.add("Water");
		vector.add("Lipton Tea");
		vector.add(1, "Dr.Pepper");//data and position in the class
		vector.add("Diet Coke");
		vector.add(3,"Sprite");
		
		System.out.println(vector);
		
	}
	
	public void removeVector(int x)//remove a vector
	{
		vector.remove(x);
		
	}
	
	public void ShowInfo()// output the vector
	{
		System.out.println(vector);
	}
	
	public void VectorAdd(String beverage)// add a vector
	{
		vector.add(beverage);
	}
}
