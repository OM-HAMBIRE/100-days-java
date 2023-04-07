//Day 66/100
import java.util.Scanner;
public class Palindromic_SubStrings_66 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int count=0;
			String str=sc.next();
			String str1=sc.next();
			for (int i = 0; i < str.length(); i++) 
			{	
				for (int j = 0; j < str1.length(); j++) 
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
						break;
					}
				}
				
				if(count==1)
					break;
				
			}
			if(count==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
		}
	}
}