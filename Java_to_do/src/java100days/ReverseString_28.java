package java100days;
//Day 28/100
// Program to reverse a string.
import java.util.*;
public class ReverseString_28 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println("using method:");
		System.out.println(method1(str));
		System.out.println("using while:");
		System.out.println(method2(str));
		
		
	}
	public static String method1(String str)
	{
		StringBuffer sbu=new StringBuffer (str);
		sbu.reverse();
		String rev=new String(sbu);
		return rev;
	}
	public static String method2(String str)
	{
		int start=0;
		int end=str.length()-1;
		String str1="";
		while(start<=end)
		{
			str1=str1+str.charAt(end);
			end--;
		}
		return str1;
	}
}
