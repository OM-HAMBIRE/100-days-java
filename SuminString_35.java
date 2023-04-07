//Day 35/100
//Count the sum of numbers in a string
import java.util.*;
public class SuminString_35 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println("Sum in string: "+sumString(str));
	}
	public static int sumString(String str)
	{
		char array[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(array[i]>='0' && array[i]<='9')
			{
				sum=sum+(int)(array[i]-'0');
				
			}
			
			
		}
		return sum;
	}
}