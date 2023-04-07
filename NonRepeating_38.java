//day 38/100
//print Non-repeating characters in a string
import java.util.*;
public class NonRepeating_38 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		System.out.println("Non repeating charachters are:");
		method(str);
	}
	public static void method(String str)
	{
		
		
		int frequency[] = new int[256];
		 for (int i = 0; i < str.length (); i++)
			 frequency[str.charAt(i)]++;
		
		 for (int i = 0; i < 256; i++)
		 {
			 if (frequency[i] == 1)
			 System.out.print ((char) i + " ");
		}
	}
	
}