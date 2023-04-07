// day 48/100
// remove duplicate elements in an array
import java.util.*;
public class Array_RemoveDuplicate_48 
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
		Arrays.sort(a);
	remove(a, n);
	}
	
	public static void remove(int a[],int n)
	{
		int temp[]=new int[n]; 
		int j=0;
		for(int i =0;i<n-1;i++)
		{
			
				if(a[i]!=a[i+1])
				{
					temp[j++]=a[i];
				}
				
		}
		temp[j++]=a[n-1];
		System.out.println("After Removing duplicate elements fro array: ");
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i]+" ");
		}
		
			
	}
	
	
}