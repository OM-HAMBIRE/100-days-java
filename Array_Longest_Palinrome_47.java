// day 47/100
// longest palindrome in an array
import java.util.*;
public class Array_Longest_Palinrome_47 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of  array :");
		int n=sc.nextInt();
		System.out.println("Enter elements of array :");
		int a[]=new int [n];
		for (int i = 0; i < n; i++) 
		{
			a[i]=sc.nextInt();
		}
		int larger=longest(a, n);
		if(larger==-1)
		{
			System.out.println("No Palindrome present");
		}
		else
			System.out.println("Longest Palindrome in array is: "+larger);
	}
	public static boolean isPalindrome(int n)
	{
		int temp=n;
		int digit=0;
		int rev=0;
		while(temp>0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp/=10;
		}
		if(rev==n)
			return true;
		else
			return false;
	}
	
	public static int longest(int a[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=n-1;i>=0;i--)
		{
			if(isPalindrome(a[i]))
				return a[i];
			
				
		}
		return -1;
	}
	
}
