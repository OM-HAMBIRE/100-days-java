// day 64/100

import java.util.Scanner;

public class BinaryString_64 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			
			String str=sc.next();
			boolean str1=str.contains("010");
			boolean str2=str.contains("101");
			if(str1==true || str2==true)
				System.out.println("Good");
			else
				System.out.println("Bad");
		}
	}
}