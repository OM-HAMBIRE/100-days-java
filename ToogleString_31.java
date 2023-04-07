//Day 31/100 
// Toggle each character in a string
import java.util.*;
public class ToogleString_31 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str1=sc.nextLine();
		method(str1);
		
	}
	public static void method(String str1)
	{
		
		char array[]=str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			if(array[i]>='A'&& array[i]<='Z')
			{
				array[i]=(char)(array[i]+ 'a'-'A');
			}
			else if(array[i]>='a'&& array[i]<='z')
			{
				array[i]=(char)(array[i]+'A'-'a');
			}
			
		}
		
		for(int i=0;i<str1.length();i++)
		{
			System.out.print(array[i]);
		}
	}
}