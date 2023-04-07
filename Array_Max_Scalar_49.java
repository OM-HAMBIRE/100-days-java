import java.util.Scanner;

// day 49/100
// Scalar product
public class Array_Max_Scalar_49 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array :");
		int n1=sc.nextInt();
		System.out.println("Enter the size of second array :");
		int n2=sc.nextInt();
		System.out.println("Enter elements of first array :");
		int a1[]=new int [n1];
		for (int i = 0; i < n1; i++) 
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second  array :");
		int a2[]=new int [n2];
		for (int i = 0; i < n2; i++) 
		{
			a2[i]=sc.nextInt();
		}
		Scalar(a1, n1, a2, n2);
		
	}
	
	public static void Scalar(int a1[],int n1,int a2[],int n2)
	{
		int temp;
		int temp1;
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(a1[i]<a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++)
			{
				if(a2[i]>a2[j])
				{
					temp1=a2[i];
					a2[i]=a2[j];
					a2[j]=temp1;
				}
			}
		}
		
		int sum=0;
		for (int i = 0; i < a2.length; i++) 
		{
			sum+=a1[i]*a2[i];
			
		}
		System.out.println(sum);
	}
}