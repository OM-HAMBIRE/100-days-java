//Day 30/100
//Length of the string without using strlen() function
import java.util.*;
public class StringLength_30 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=sc.nextLine();
		System.out.println(method1(str));
		
	}
	public static int method1(String str)
	{
		
		char array[]=str.toCharArray();
		int count=0;
		for(char ch:array)
		{
			count++;
		}
		return count;
	}
}