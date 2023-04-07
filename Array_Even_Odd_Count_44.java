import java.util.Scanner;

// Day 44/100
// number of even and odd elements in an array
public class Array_Even_Odd_Count_44 
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
		
		
			System.out.println("Number of even elements :"+ even);
			System.out.println("Number of odd elements : "+odd);
		
	
		
			
		
	}
}