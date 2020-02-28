package database;

import java.util.Scanner;

public class studentDatabase
{
	public static void main(String[] args)
	{
		System.out.println("Enter number of new students to enroll");
		
		Scanner in = new Scanner(System.in);
		int numNewStu = in.nextInt();
		
		student[] students = new student[numNewStu];
		
		for(int i = 0; i < numNewStu; i++)
		{
			students[i] = new student();
			students[i].enroll();
			students[i].paytuitation();
			System.out.println(students[i].showInfo());
			
			
		}
		
		System.out.println(students[5].showInfo());
	}
}