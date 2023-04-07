//day 54/100
//  Two arrays are said to be disjoint 
import java.util.*;
public class Array_Disjoint_54
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
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(same(a1, n1, a2, n2))
		{
			System.out.println("Disjoint");
			
		}
		else
		{
			System.out.println("Same");
		}
	}
	
	public static boolean same(int a1[],int n1,int a2[],int n2)
	{
		boolean isSame=true;
		
		for (int i = 0; i < n1 ; i++) 
		{
			for (int j = 0; j < n2; j++)
			{
				
			
				if(a1[i]==a2[j])
					isSame=false;
				
			}
			if(isSame==false)
			{
				break;
			}
		}
		return isSame;
	}
}