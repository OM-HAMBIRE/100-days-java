// day 51/100
// sort the array
import java.util.*;
public class Array_Sort_51 
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
		System.out.println("sorting the array: ");
		sort(a, n);
		
	
	}	
	public static void sort(int a[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	for (int i = 0; i < n; i++) {
		System.out.println(a[i]);
	}
		
		
	}
	
}