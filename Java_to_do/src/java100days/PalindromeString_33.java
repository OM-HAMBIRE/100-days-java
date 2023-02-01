package java100days;
//Day 33/100
//String is a palindrome or not
import java.util.*;
public class PalindromeString_33 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println(pali( str));
	}
	public static boolean pali(String str)
	{
		boolean isPali=true;
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if(str.charAt(end)==str.charAt(start) )
			{
				isPali=true;
			}
			else
				isPali=false;
		start++;
		end--;
		}
		if(isPali==true)
				return true;
		else
				return false;
	}
}
