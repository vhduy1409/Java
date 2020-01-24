package com.revature.www;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		HelloWorld s = new HelloWord();
		s.thing = "Hello";
		
		HelloWorld.otherThing = "Hello"; 
		
		s.newWord();
		
		
		}
	
	
	public String thing = "thing";
	public static String otherThing = "other thing";

	
	public HelloWorld()
	{
		super();
	}
	
	
	public void newWord()
	{
		System.out.println("Hello");
		
	}
}
