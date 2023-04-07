import java.util.Scanner;
// Day 70/100
public class Array_Rotate_70 
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
		rotate(a, n);
	}
	public static void rotate(int a[],int n)
	
	{
		int last=a[n-1];
		for (int i = n-1; i >0; i--) 
		{
			a[i]=a[i-1];
			
		}
		a[0]=last;
		
		for (int i = 0; i <n; i++) 
		{
			
			System.out.print(a[i]);
		}
	}
}