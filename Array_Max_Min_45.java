// day 45/100
// Check max no and min no in array
import java.util.*;
public class Array_Max_Min_45 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		System.out.println("enter the elements of array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		max1(a, n);	
	}
	
	public static void max1(int a[],int n)
	{
		int large=a[0];
		int small=a[0];
		//time complexity O(n)
		for (int i = 1; i <  n; i++) 
		{
			if(a[i] > large)
			{
				large=a[i];
			}
			if(a[i] < small)
			{
				small=a[i];
			}
			
		}
		System.out.println("Smallest Number : " +small);
		System.out.println("Largest Number : " +large);
	
	
	}
}
