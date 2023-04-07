// day 50/100
// sum of positive square elements in the array.
import java.util.*;
public class Array_SumOfSquares_50 
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
		
		System.out.println(remove(a, n));
	}
	
	public static long remove(int a[],int n)
	{
		
		 long sum = 0;
		 for(int i = 0 ; i<n ; i++)
		 {
			 sum = sum + a[i]*a[i];
		 }
		 return sum;
		
			
	}
	
	
}
