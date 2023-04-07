import java.util.Scanner;

//Day 53/100
//find maximum product subarray
public class Array_MaxProduct_53 
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
		
		System.out.println("maxmium product of non contiguous subarray"+max_product(a, n));
		System.out.println("maxmium product of  contiguous subarray"+max_product1(a, n));
		
		
		
	}
	
	
	public static int max_product(int a[],int n)
	{
		
		int ans=a[0];
		int max=ans;
		int min=ans;
		
		for (int i = 1; i < n; i++) 
		{
				if(a[i]<0)
				{
				min=min+max-(max=min);
				}
				max=Math.max(max*a[i], a[i]);
				min=Math.min(max*a[i], a[i]);
				ans=Math.max(ans, max);
				
			}
			return ans;
	}

	
	
	
	public static int max_product1(int a[],int n)
	{
		int max1=1;
		int min1=1;
		int ans1=1;
		for (int i = 0; i < n; i++) 
		{
			if(a[i]>0)
			{
				max1*=a[i];
				min1=Math.min(min1*a[i], 1);
			}
			else if(a[i]==0)
			{
				max1=min1=1;
			}
			else
			{
				min1=min1+max1-(max1=min1);
				max1=Math.max(max1*a[i], 1);
				min1*=a[i];
			}
			ans1=Math.max(ans1, max1);
		}
		return ans1;
	}
	}