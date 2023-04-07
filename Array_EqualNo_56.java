// Day 56/100
//  find whether the numbers of an array be made equal
import java.util.*;
public class Array_EqualNo_56 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		System.out.println("Enter elements of array :");
		int a[]=new int [n];
		for (int i = 0; i < n; i++) 
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(makeequal(a, n));
	}
	
	public static boolean makeequal(int a[],int n)
	{
		
		for (int i = 0; i < n; i++) 
		{
			while(a[i]%2==0)
			{
				a[i]/=2;
			}
			while(a[i]%3==0)
			{
				a[i]/=3;
			}
			if(a[i]!=a[0])
				return false;
			
		}
		return true;
	}
}