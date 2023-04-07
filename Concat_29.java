//Day 29/100
//Program to concatenate a string.
import java.util.*;
public class Concat_29 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String 1:");
		String str1=sc.nextLine();
		System.out.println("enter the string 2:");
		String str2=sc.nextLine();
		//Approach 1:-
		System.out.println(concat(str1,str2));
		//Approach 2:-
		System.out.println(Method1(str1,str2));
		//Approach 3:-
		
	}
	public static String concat(String str1,String str2)
	{	System.out.println("With + operator:");
		String str3=str1+str2;
		return str3;
	}
	public static StringBuffer Method1(String str1,String str2)
	{
		System.out.println("with String Buffer");
		StringBuffer sbu1=new StringBuffer(str1);
		StringBuffer sbu2=new StringBuffer(str2);
		StringBuffer sbu=sbu1.append(sbu2);
		return sbu;
	}
	public static String Method2(String str1,String str2)
	{
		
		System.out.println("With String:");
		String str3=str1.concat(str2);
		return str3;
	}
	
}