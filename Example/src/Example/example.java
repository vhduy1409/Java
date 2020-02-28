package Example;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;
import java.util.Scanner;
import java.nio.charset.Charset;
import java.util.Random;
public class example {

	public static void main(String[] args)
	{
		/*
		int sum;
		int a;
		int b;
		int c = -5 + 8 *6;
		int d = (55+9) % 9;
		
		System.out.println("Hello");
		System.out.println("Alexandra Abramov");
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter a");
		a = input.nextInt();
		
		System.out.println("Please enter b");
		b = input.nextInt();
		
		
		sum = a + b;
		
		
		
		System.out.println(sum);
		
		System.out.println(c);
		System.out.println(d);
		*/
		/*
		 int a = -5 + 8 *6;
		 int b = (55+9) % 9;
		 int c = 20 + -3*5 /8;
		 int d = 5 + 15/3 *2 -8 % 3;
		 int e;
		 */
		 /*
		 Integer.toBinaryString(sum);
		 
		 System.out.println(Integer.toBinaryString(sum));
		 */
		 /*
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Please enter a number"); // example of input
		 e = input.nextInt();
		 
		 for(int i=0 ; i < 10 ;i++)
		 {	
			System.out.println(e + " x " + (i+1) + " = " + (e * (i+1))); example of math 
			
			
			
			
		 }
		 */
		 /*
		 	System.out.println("DD   U U  Y Y  ");
		 	System.out.println("D D  U U  YYY  ");
		 	System.out.println("D D  U U   Y  ");
		 	System.out.println("DD   UUU   Y  ");
		 */
		/*
		double cal = ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));
		double cal1 = 4.0 * (1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)); //double example 
		
		System.out.println(cal);
		System.out.println(cal1);
		*/
		/*
		double perimeter;
		double area;
		double radius = 7.5;
		
		
		perimeter = (2*radius) * Math.PI;
		
		area = Math.sqrt(radius) * Math.PI;
		
		System.out.println(perimeter);
		System.out.println(area);
		*/
		/*
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 1 number");
		double a = input.nextDouble();
		
		System.out.println("Please enter number 2");
		double b = input.nextDouble();
		
		System.out.println("Please enter number 3");
		double c = input.nextDouble();
		
		
		double average = (a + b + c)/3;
		
		double perimeter = a * b;
		double area = 2 * (a+b);
		
		System.out.println(average);
		
		System.out.println(perimeter);
		System.out.println(area);
		*/
		/*
			String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
			String p2 = "==============================================";
				for (int i = 0; i < 4; i++) 
				{
					System.out.println(p1);
				}
					System.out.println("* * * * * * ==================================");
						for (int i = 0; i < 6; i++) 
						{
							System.out.println(p2);
						}
	*/
		/*
		int a = 10;
		int b = 11;
		
		int product = a * b;
		int sum = a + b;
		System.out.println(Integer.toBinaryString(product));
		System.out.println(Integer.toBinaryString(sum));
		
		Scanner input = new Scanner(System.in);
		/*
		int c = input.nextInt();
		
		System.out.println(Integer.toBinaryString(c));
		
		System.out.println(Integer.toHexString(c));
		
		System.out.println(Integer.toOctalString(c));
		*/
		/*
		System.out.println("Please enter a binary number");
		String d = input.nextLine();
		
		System.out.println(Integer.parseInt(d,2));
		*/
		
		/*
		int[] hex = new int[1000];
		int i = 1, j=0, rem, dec=0 ,bin;
		
		System.out.println("Input the Binary number");
		bin = input.nextInt();
		
		while (bin>0)
		{
			rem = bin % 2;
			
			dec = dec + rem * i;
			i = i *2;
			bin = bin/10;
															// convert from binary to hexdecimal 
		}
		while (dec != 0)
		{
			hex[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		for (j = i - 1;j>=0;j--)
		{
			if(hex[j]>9)
			{
				System.out.println((char)(hex[j] + 55) + "\n");
			}
			else
			{
				System.out.println(hex[j] + "\n");
			}
			*/
		/*
			
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
	    System.out.println("Java Runtime Version: "+ System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: "+	System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+	System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+	System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+	System.getProperty("java.class.path")+"\n");
*/	 
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first integer");
		int F = sc.nextInt();
		
		int G = sc.nextInt();
		
		if(F == G)
		{
			System.out.printf("%d == %d", F,G);
		}
		if(F != G)
		{
			System.out.printf("%d != %d"+"\n", F,G);
			
		}
		if(F >= G)
		{
			System.out.printf("%d >= %d", F,G);
		}
		if(F <= G)
		{
			System.out.printf("%d <= %d", F,G);
		}
		*/
		/*
		Scanner in = new Scanner(System.in);
		
		int m, n;
		int sum = 0;
		System.out.println("Please enter an Integer");
		m = in.nextInt();
		
		while(m>0)
		{
			n=  m % 10;
			sum = sum + n;
			m = m/10;
		}
		System.out.println("The Sum of the digits is: " + sum); //need to ask ???
		*/
		/*
		double s;
		double area;
		double n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length of the hexagon");
		
		s = input.nextDouble();
		
		n = input.nextDouble();
		
		area = ((n * (Math.pow(s, 2)))/(4* (Math.tan(Math.PI/n))));
		
		System.out.println(area);
		*/
		/*
		double x1;
		double x2;
		double y1;
		double y2;
		
		double r = 6371.01;
		
		double d;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter latitude of coordinate");
		x1 = input.nextDouble();
		System.out.println("Please enter latitude of coordinate");	
		y1 = input.nextDouble();
		System.out.println("Please enter latitude of coordinate");		
		x2 = input.nextDouble();
		System.out.println("Please enter latitude of coordinate");	
		y2 = input.nextDouble();
		
		d = r * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2)* Math.cos(y1-y2));
		
		System.out.println(d + " km");
		
		*/
		/*
			Scanner in = new Scanner(System.in);
			
			
			System.out.println("Please enter a sentence");
			char[] letters = in.nextLine().toCharArray();
			
			System.out.print("Reserve string");
			
			for(int i = letters.length - 1; i >= 0; i--)
			{
				System.out.print(" " + letters[i]);
				
			}
		*/
		/*
		String sentence;
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a sencente");
		
		char[] sentences = in.nextLine().toCharArray();
		
		for(int i = 0; i < sentences.length; i++)
		{
			if(Character.isLetter(sentences[i]))
			{
			letter++;
			}else if(Character.isDigit(sentences[i]))
			{
				num++;
			}else if(Character.isSpaceChar(sentences[i]))
			{
				space++;
			}else 
			{
				other++;
			}
			
			System.out.println(sentences);
			System.out.println("letter " + letter);
			System.out.println("space " + space);
			System.out.println("number " + num);
			System.out.println("other " + other);
		 */
		/*
		int amount = 0;
		for(int i = 1; i <=  9; i++){
			for(int j = 1; j <= 9; j++){
				for(int k = 1; k <= 9; k++){
					if(k != i && k != j && i != j)
					{
						amount++;
						System.out.println(i + "" + j + "" + k);
					}
					if(k == i && k == j && i == j)
					{
						amount++;
						System.out.println(k + "" + j + "" + k);
					}
				}
			}
		}
		System.out.println("Total number of the three-digit-number is " + amount);			
			*/
		/*
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Console console = System.console();
		
		if(console == null)
		{
			System.out.println("No console: non- interative mode"); // need to ask
		}
		System.out.println("Please enter your username");
		String username = console.readLine();
		
		System.out.println("Please enter your password");
		char[] password = console.readPassword();
		
		String passport = console.readLine("Enter your %d (th) passport number", 2);
		*/
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int n = in.nextInt();
		
		System.out.printf("%d + %d%d + %d%d%d ", n ,n ,n ,n ,n);
	
	
	}
	
}

