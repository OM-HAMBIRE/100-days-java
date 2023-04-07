//Day 32/100
//Remove vowels from a string
import java.util.*;
public class RemoveVowels_32 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		Vowels(str);
	}
	public static void Vowels(String str)
	{
		char array []=str.toCharArray();
		char ch;
		char ch1;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]=='a'|| array[i]=='e' || array[i]=='i'|| array[i]=='o' || array[i]=='u' ||
			array[i]=='A'|| array[i]=='E' || array[i]=='I'|| array[i]=='O' || array[i]=='U' )
			{
				ch=array[i];
		
			}
			else
			{
				ch1=array[i];
				System.out.print(ch1);
			}
		}
		
}
}