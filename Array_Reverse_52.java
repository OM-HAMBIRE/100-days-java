// day 52/100
//  reverse the array
import java.util.*;
public class Array_Reverse_52 
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
		System.out.println("Reverse the array:");
		reverse(a, n);
	}
	public static void reverse(int a[],int n)
	{
		for (int i = n-1; i >= 0; i--) 
		{
			System.out.println(a[i]);
		}
	}
	
}