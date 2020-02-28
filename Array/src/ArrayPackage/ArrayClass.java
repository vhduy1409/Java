package ArrayPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ArrayClass {
	public static void main(String[] args){
		
		
		
		try {
			URL url = new URL("http://gamek.vn");
			Scanner in = new Scanner(url.openStream());
			
			while(in.hasNext())
			{
				System.out.println(in.nextLine());
			}
			
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
