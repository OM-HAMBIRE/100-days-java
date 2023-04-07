// Day 46/100
//Sum of elements in array
import java.util.*;
public class Array_Sum_46 
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
		System.out.println("Sum of array is:  "+sum(a, n));
	}
	public static int sum(int a[],int n)
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
