//Day 34/100
// Remove brackets from an algebraic expression
import java.util.*;
public class RemoveBrackets_34 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the algebraic expression:");
		String  str=sc.nextLine();
		System.out.println("Brackets removed from algebracic expression:");
		Remove(str);
	}
	public static void Remove(String str)
	{
		char array[]=str.toCharArray();
		char brac;
		char not_brac;
		for(int i=0;i<str.length();i++)
		{
			if(array[i]=='('|| array[i]==')')
			{
				brac=array[i];
			}
			else
			{
				not_brac=array[i];
				System.out.print(not_brac);
			}
		}
	}
}