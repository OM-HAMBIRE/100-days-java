package java100days;
//Day 36/100
//Capitalize first and last letter of each word of a string
import java.util.*;
public class Capitalizefirstlast_letter_36 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		capt(str);
	}
	public static void capt(String str)
	{
		int start=0;
		int end=str.length()-1;
		char array[]=str.toCharArray();
		
		
			for(int i=0;i<str.length();i++)
			{
				if(array[start]>='a' && array[start]<='z')
				{
					array[start]=(char)(array[start]+'A'-'a');
				}
				else if(array[end]>='a' && array[end]<='z')
				{
					array[end]=(char)(array[end]+'A'-'a');
				}
				else if(array[i]==' ')
				 {
					 if(array[i-1]>='a' && array[i-1]<='z')
					 {
						 array[i-1]=(char)(array[i-1]+'A'-'a');
					 }
					 if(array[i+1]>='a' && array[i+1]<='z')
						{
							array[i+1]=(char)(array[i+1]+'A'-'a');
						}
				 }
				 
			}
		for(int i=0;i<str.length();i++)
		{
			System.out.print(array[i]);
		}
		 
	}
}
