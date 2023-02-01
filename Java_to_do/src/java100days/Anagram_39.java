package java100days;
//Day 39/100
//Check two strings are anagram or not
import java.util.*;
public class Anagram_39 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st string:");
		String str1=sc.nextLine();
		System.out.println("enter the 2ndst string:");
		String str2=sc.nextLine();
		System.out.println(anagram(str1, str2));
		
	}
	public static boolean anagram(String str1,String str2)
	{
		int ch[]=new int[256];
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2)
		{
			return false;
		}
		for(int i=0;i<len1;i++)
		{
			ch[str1.charAt(i)]++;
			ch[str2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
		{
			if(ch[i]==0)
			{
				return true;
			}
		}
		return false;
	}
}
