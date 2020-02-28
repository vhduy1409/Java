package database;

import java.util.Scanner;

public class student
{
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses;
	private double tuitationBalance = 0;
	private static double costOfCourse = 600;

	public static int id = 1000;
	
	public student()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName = in.nextLine();
		
		
		System.out.println("Entry Your last name");
		this.lastName = in.nextLine();
		
		System.out.println("Enter your year: \n1 Freshmen\n2 Sophmore\n3 Junior\n4 Senior" );
		this.year = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + year);
		
		
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + year + " " + studentID);
		 
	}
	private void setStudentID()
	{
		id++;
		this.studentID = year + "" + id;
	}
	
	public void enroll()
	{
		do
		{
		System.out.println("Please enter the course to enroll: ");
		Scanner in = new Scanner(System.in);
		
		String course = in.nextLine();
		if(!course.equals("Q") || !course.equals("q"))
		{
			courses = courses + "\n" + course;
			
			tuitationBalance = tuitationBalance + costOfCourse;
		}else
		{
			break;
		}
		}while (1 != 0);
		
		
		System.out.println("Enrolled in: " + courses);
		System.out.println("Total tuition balance: " + tuitationBalance);

	}
	
	public void viewBalance()
	{
		System.out.println("Your balance is: $" + tuitationBalance);
	}
	
	
	public void paytuitation()
	{
		viewBalance();
		System.out.println("Enter your payment");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitationBalance = tuitationBalance - payment;
		System.out.println("Thanks you for the payment " + payment);
		viewBalance();
	}
	
	
	public String showInfo()
	{
		return "Name " + firstName + " " + lastName + "\nCourse Enrolled: " + courses + "\nBalance $" + tuitationBalance + "\nStudent ID: " + studentID + "\nGrade Level: " + year;
	}
}
