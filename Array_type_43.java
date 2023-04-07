import java.util.Scanner;

// Day 43/100
//find the array type
public class Array_type_43 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array :");
		int n=sc.nextInt();
		System.out.println("Enter elements of array :");
		int a[]=new int [n];
		for (int i = 0; i < n; i++) 
		{
			a[i]=sc.nextInt();
		}
		isType(a, n);
	}
	public static void isType(int a[],int n)
	{
		int odd=0,even=0;
		for (int i = 0; i < n; i++) 
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		if(even==n)
		{
			System.out.println("Even");
		}
		else if(odd==n)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Mixed");
		}
	}
}